
public class ConversorAPI {
    private String apiKey = "61f30b0b8cb424e32e56afd2";

    public DadosConvertido BuscaValor(String moedaBase, String moedaParaConverter, double valor) {
        // URL da API para buscar a taxa de conversão (substitua pela sua chave)
        String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaBase + "/" + moedaParaConverter;

        // Inicializa a resposta da API
        DadosConvertido dadosConvertido = null;

        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            String status = jsonobj.get("result").getAsString();
            if (status.equals("success")) {
                double taxaConversao = jsonobj.get("conversion_rate").getAsDouble();
                dadosConvertido = new DadosConvertido(moedaBase, moedaParaConverter, taxaConversao);
                dadosConvertido.setValorParaConverter(valor);
            } else {
                System.out.println("Erro na conversão: " + status);
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro ao acessar a API", e);
        }

        return dadosConvertido;
    }
}
