public class DadosConvertido {
    private String moedaBase;
    private String moedaParaConverter;
    private double taxaConversao;
    private double valorParaConverter;
    private double resultadoConversao;

    public DadosConvertido(String moedaBase, String moedaParaConverter, double taxaConversao) {
        this.moedaBase = moedaBase;
        this.moedaParaConverter = moedaParaConverter;
        this.taxaConversao = taxaConversao;
    }

    // Adicione os métodos getters e setters conforme necessário
    public String getBase_code() {
        return moedaBase;
    }

    public String getTarget_code() {
        return moedaParaConverter;
    }

    public double getConversion_rate() {
        return taxaConversao;
    }

    public void setValorParaConverter(double valor) {
        this.valorParaConverter = valor;
        this.resultadoConversao = valor * taxaConversao;
    }

    public double getConversion_result() {
        return resultadoConversao;
    }
}
