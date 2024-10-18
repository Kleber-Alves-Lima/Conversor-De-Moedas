<<<<<<< HEAD
=======

>>>>>>> e001389 (Adicionando pasta assets ao projeto)
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

    public String getBase_code() {
        return moedaBase;
    }

    public String getTarget_code() {
        return moedaParaConverter;
    }

    public double getConversion_rate() {
        return taxaConversao;
    }

    public double getConversion_result() {
        return valorParaConverter * taxaConversao;
    }

    public void setValorParaConverter(double valorParaConverter) {
        this.valorParaConverter = valorParaConverter;
        this.resultadoConversao = getConversion_result();
    }

    @Override
    public String toString() {
        return "Moeda de origem: " + moedaBase +
                "\nMoeda de destino: " + moedaParaConverter +
                "\nTaxa de câmbio: " + taxaConversao +
                "\nResultado da conversão: " + resultadoConversao;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> e001389 (Adicionando pasta assets ao projeto)
