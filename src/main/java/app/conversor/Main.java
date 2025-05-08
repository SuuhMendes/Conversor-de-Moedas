package app.conversor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao conversor de moeda");
        System.out.println("Antes de prosseguir, digite a sua chave key:");
        String chave_key=scanner.nextLine();

        String menu = """
                    Escolha a opção que voce deseja a conversão:
                    1-Dólar >>>> Peso Argentino
                    2-Peso Argentino >>>> Dólar
                    3-Dólar >>>> Real Brasileiro
                    4-Real Brasileiro >>>> Dólar
                    5-Dólar >>>> Peso Colombiano
                    6-Libra  >>>> Dólar
                    7-Iene Japonês >>>> Real Brasileiro
                    8-Real Brasileiro >>>> Iene Japonês
                    9-SAIR
                """;

      //  String chave_key="18729af99782b68cc48aedf0";//

        boolean prosseguir = true;

        while (prosseguir) {
            int opcao;
            System.out.println(menu);
            opcao = scanner.nextInt();
            String origem = "";
            String destino = "";

            switch (opcao) {
                case 1:
                    origem = "USD";
                    destino = "ARS";
                    break;
                case 2:
                    origem = "ARS";
                    destino = "USD";
                    break;
                case 3:
                    origem = "USD";
                    destino = "BRL";
                    break;
                case 4:
                    origem = "BRL";
                    destino = "USD";
                    break;
                case 5:
                    origem = "USD";
                    destino = "COP";
                    break;

                case 6:
                    origem = "GBP";
                    destino = "USD";
                    break;
                case 7:
                    origem = "JPY";
                    destino = "BRL";
                    break;
                case 8:
                    origem = "BRL";
                    destino = "JPY";
                    break;
                case 9:
                    prosseguir = false;
                    System.out.println("Voce optou por sair.\n Até logo!");
                    break;
                default:
                    System.out.println("escolha somente uma opção valida");
                    continue;
            }
            if (prosseguir == true) {
                System.out.println(" Agora digite o valor a ser convertido:");
                 String valorStr= scanner.next().replace(",",".");
                double valor = Double.parseDouble(valorStr);

                Conversor conversor = new Conversor();
                Moeda moeda = new Moeda();
                moeda = conversor.converter(origem, destino, valor,chave_key);
                if (moeda==null) {
                    System.out.println("Não foi possivel relaizar a conversão!");
                    break;
                }
                else{
                    double resultado = (double) moeda.getConversion_result();
                    var resultadoFormatado = String.format("%.2f", resultado);

                    System.out.println("O Valor de " + valor + " [" + origem + "] " + "Corresponde ao valor de " + resultadoFormatado + " [" + destino + "]");
                };
            };
            };
        }

    }

