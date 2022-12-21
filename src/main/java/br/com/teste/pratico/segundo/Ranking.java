package br.com.teste.pratico.segundo;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {

        //declaração de scanner para leitura de dados
        Scanner leia = new Scanner(System.in);

        String empresa, pagamentoRealizado;
        int empresaA, empresaB, empresaC, empresaF, empresaI;
        double mediaA, mediaB, mediaC, mediaF, mediaI, pagamento, totalA, totalB, totalC, totalF, totalI;

        //inicialização das variaveis
        empresaA = 0;
        empresaB = 0;
        empresaC = 0;
        empresaF = 0;
        empresaI = 0;
        mediaA = 0;
        mediaB = 0;
        mediaC = 0;
        mediaF = 0;
        mediaI = 0;
        totalA = 0;
        totalB = 0;
        totalC = 0;
        totalF = 0;
        totalI = 0;

        System.out.println("\nOlá, seja muito bem-vindo !!");

        //sistema em looping para captação de valores
        do {
            System.out.println("\nDigite Sair para fechar o programa! \n");

            System.out.println("Digite a Empresa: ");
            empresa = leia.nextLine();

            switch (empresa.toUpperCase()) {
                case "A" -> {
                    System.out.println("\nPagamento Efetuado?\n1- Sim\n2- Não");
                    pagamentoRealizado = leia.nextLine();

                    if (pagamentoRealizado.equals("1")) {
                        System.out.println("\nQual valor? ");
                        pagamento = leia.nextDouble();
                        leia.nextLine();

                        totalA += pagamento;
                        empresaA += 1;
                    } else if (pagamentoRealizado.equals("2")) {
                        System.out.println("");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                case "B" -> {
                    System.out.println("\nPagamento Efetuado?\n1- Sim\n2- Não");
                    pagamentoRealizado = leia.nextLine();

                    if (pagamentoRealizado.equals("1")) {
                        System.out.println("\nQual valor? ");
                        pagamento = leia.nextDouble();
                        leia.nextLine();

                        totalB += pagamento;
                        empresaB += 1;
                    } else if (pagamentoRealizado.equals("2")) {
                        System.out.println("");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                case "C" -> {
                    System.out.println("\nPagamento Efetuado?\n1- Sim\n2- Não");
                    pagamentoRealizado = leia.nextLine();

                    if (pagamentoRealizado.equals("1")) {
                        System.out.println("\nQual valor? ");
                        pagamento = leia.nextDouble();
                        leia.nextLine();

                        totalC += pagamento;
                        empresaC += 1;
                    } else if (pagamentoRealizado.equals("2")) {
                        System.out.println("");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                case "F" -> {
                    System.out.println("\nPagamento Efetuado?\n1- Sim\n2- Não");
                    pagamentoRealizado = leia.nextLine();

                    if (pagamentoRealizado.equals("1")) {
                        System.out.println("\nQual valor? ");
                        pagamento = leia.nextDouble();
                        leia.nextLine();

                        totalF += pagamento;
                        empresaF += 1;
                    } else if (pagamentoRealizado.equals("2")) {
                        System.out.println("");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                case "I" -> {
                    System.out.println("\nPagamento Efetuado?\n1- Sim\n2- Não");
                    pagamentoRealizado = leia.nextLine();

                    if (pagamentoRealizado.equals("1")) {
                        System.out.println("\nQual valor? ");
                        pagamento = leia.nextDouble();
                        leia.nextLine();

                        totalI += pagamento;
                        empresaI += 1;
                    } else if (pagamentoRealizado.equals("2")) {
                        System.out.println("");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                case "SAIR" -> {
                }
                default -> {
                    System.err.println("Opção inválida");
                }
            }

        } while (!empresa.equalsIgnoreCase("Sair"));

        if (empresaA != 0) {
            mediaA = totalA / empresaA;
        }

        if (empresaB != 0) {
            mediaB = totalB / empresaB;
        }

        if (empresaC != 0) {
            mediaC = totalC / empresaC;
        }

        if (empresaF != 0) {
            mediaF = totalF / empresaF;
        }

        if (empresaI != 0) {
            mediaI = totalI / empresaI;
        }

        //Exibição das médias
        System.out.println("\nRelatórios - média de pagamentos!\n" +
                "\nMedia da empresa A: " + mediaA + "\n" +
                "Media da empresa B: " + mediaB + "\n" +
                "Media da empresa C: " + mediaC + "\n" +
                "Media da empresa F: " + mediaF +  "\n" +
                "Media da empresa I: " + mediaI);

        //hashMap para definição do Ranking
        Map<String,Double> ranking = new HashMap<>();
        ranking.put("Empresa A: Total pago", totalA);
        ranking.put("Empresa B: Total pago", totalB);
        ranking.put("Empresa C: Total pago", totalC);
        ranking.put("Empresa F: Total pago", totalF);
        ranking.put("Empresa I: Total pago", totalI);

        //Ordenação do Ranking
        System.out.println("\nRanking das empresas:\n");
        ranking.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
    }
}
