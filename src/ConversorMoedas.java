

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        Scanner valorParaSerConvertido = new Scanner(System.in);
        ConversorAPI conversor = new ConversorAPI();
        double valorParaConverter =0;
        int opcao =0;
        String menu = """
                
                ***************************************************
                Seja bem vindo ao conversor de moedas
                
                1) Dólar           ==> Peso Argentino 
                2) Peso Argentino  ==> Dólar   
                3) Dólar           ==> Real Brasileiro 
                4) Real Brasileiro ==> Dólar 
                5) Dólar           ==> Dólar Canadense 
                6) Euro            ==> Dólar 
                7) sair 
                ***************************************************
                
                """;

        while (opcao != 7) {
            System.out.println(menu);
            System.out.println("Escolha uma das opções de conversão .: ");
            opcao = leitura.nextInt();
            if (opcao >= 1 && opcao <= 6) {
                System.out.println("Informe o valor a ser convertido .: ");
                valorParaConverter = valorParaSerConvertido.nextDouble();
            }

            if (opcao == 1) {
                DadosConvertido resultado = conversor.BuscaValor("USD", "ARS", valorParaConverter);
                exibirResultadoConversao(resultado);
            } else if (opcao == 2) {
                DadosConvertido resultado = conversor.BuscaValor("ARS", "USD", valorParaConverter);
                exibirResultadoConversao(resultado);
            } else if (opcao == 3) {
                DadosConvertido resultado = conversor.BuscaValor("USD", "BRL", valorParaConverter);
                exibirResultadoConversao(resultado);
            } else if (opcao == 4) {
                DadosConvertido resultado = conversor.BuscaValor("BRL", "USD", valorParaConverter);
                exibirResultadoConversao(resultado);
            } else if (opcao == 5) {
                DadosConvertido resultado = conversor.BuscaValor("USD", "CAD", valorParaConverter);
                exibirResultadoConversao(resultado);
            } else if (opcao == 6) {
                DadosConvertido resultado = conversor.BuscaValor("EUR", "USD", valorParaConverter);
                exibirResultadoConversao(resultado);
            } else if (opcao == 7) {
                System.out.println("Finalizando o Conversor !!!");
                System.exit(0);
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }
<<<<<<< HEAD
}
// Função para exibir os resultados de conversão
public static void exibirResultadoConversao(DadosConvertido resultado) {
    if (resultado != null) {
        System.out.println("Moeda de origem: " + resultado.getBase_code());
        System.out.println("Moeda de destino: " + resultado.getTarget_code());
        System.out.println("Taxa de câmbio (" + resultado.getBase_code() + " para " + resultado.getTarget_code() + "): "+ resultado.getConversion_rate());

        System.out.printf("Resultado da conversão: "+" %.2f%n",resultado.getConversion_result());

        // Exibe a cotação inversa (quanto 1 EUR vale em USD)
        double valorDacotacao = 1 / resultado.getConversion_rate();
        System.out.printf("Cotação atual de 1 "+ resultado.getTarget_code()+" é igual a "+resultado.getBase_code() +": %.4f%n", valorDacotacao);
    } else {
        System.out.println("Falha ao buscar o valor da conversão.");
    }
}
=======
    }
    // Função para exibir os resultados de conversão
    public static void exibirResultadoConversao(DadosConvertido resultado) {
        if (resultado != null) {
            System.out.println("Moeda de origem: " + resultado.getBase_code());
            System.out.println("Moeda de destino: " + resultado.getTarget_code());
            System.out.println("Taxa de câmbio (" + resultado.getBase_code() + " para " + resultado.getTarget_code() + "): "+ resultado.getConversion_rate());

            System.out.printf("Resultado da conversão: "+" %.2f%n",resultado.getConversion_result());

            // Exibe a cotação inversa (quanto 1 EUR vale em USD)
            double valorDacotacao = 1 / resultado.getConversion_rate();
            System.out.printf("Cotação atual de 1 "+ resultado.getTarget_code()+" é igual a "+resultado.getBase_code() +": %.4f%n", valorDacotacao);
        } else {
            System.out.println("Falha ao buscar o valor da conversão.");
        }
    }
>>>>>>> e001389 (Adicionando pasta assets ao projeto)
}