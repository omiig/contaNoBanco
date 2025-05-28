import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipoDeConta = "Corrente";

        System.out.println("Digite seu nome: ");
        String nome =  sc.nextLine();

        System.out.println("Digite seu saldo inicial: ");
        double saldo =  sc.nextDouble();

        System.out.println("""
                *****************************************
                        Dados iniciais do Cliente
                *****************************************
                Nome :              %s
                Tipo de Conta :     %s
                Saldo Inicial:      R$%.2f
                
                *****************************************
                """.formatted(nome, tipoDeConta, saldo));

        System.out.println("""
                Operações do Cliente:
                
                1 -> Consultar saldos
                2 -> Receber valor
                3 -> Tranferir valor
                4 -> Sair
                
                Digite a opção desejada:
                """);

        int respostas  = sc.nextInt();
        while (respostas != 4) {
            if (respostas < 1 || respostas > 4) {
                System.out.println("Operação não reconhecida. Tente novamente.");
                respostas = sc.nextInt();
                continue;
            } else {
                switch (respostas) {
                    case 1:
                        System.out.println("Seu saldo atual: R$%.2f ".formatted(saldo));
                        System.out.println("""
                            Operações do Cliente:
                            
                            1 -> Consultar saldos
                            2 -> Receber valor
                            3 -> Tranferir valor
                            4 -> Sair
                            
                            Digite a opção desejada:
                        """);
                        respostas = sc.nextInt();
                        continue;

                        case 2:
                            System.out.println("Quanto você irá receber? ");
                            saldo += sc.nextDouble();
                            System.out.println("\nSaldo Atual: R$%.2f ".formatted(saldo));

                            System.out.println("""
                                Operações do Cliente:
                                
                                1 -> Consultar saldos
                                2 -> Receber valor
                                3 -> Tranferir valor
                                4 -> Sair
                                
                                Digite a opção desejada:
                            """);
                            respostas = sc.nextInt();
                            continue;

                        case 3:
                            System.out.println("Quanto você quer tranferir? ");
                            double valor = sc.nextDouble();
                            while (valor > saldo) {
                                System.out.println("Você não tem saldo suficiente para tranferir. Digite outro valor");
                                valor = sc.nextDouble();
                            }
                            saldo -= valor;
                            System.out.println("\nSaldo Atual: R$%.2f ".formatted(saldo));
                            System.out.println("""
                                Operações do Cliente:
                                
                                1 -> Consultar saldos
                                2 -> Receber valor
                                3 -> Tranferir valor
                                4 -> Sair
                                
                                Digite a opção desejada:
                            """);
                            respostas = sc.nextInt();
                            continue;

                            default:
                                System.out.println("Operção não reconhecida. Tente novamente.");
                                respostas = sc.nextInt();
                                continue;

                }

            }
        }
    }
}