import java.util.*;

public class SistemaPagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double SALARIO_BASE = 2000.0;
        String nome;
        int matricula, qtdPecas;
        double venda, percentual, valorPeca;

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("--- MENU CADASTRO DE FUNCIONÁRIO ---");
        System.out.println("Opções:");
        System.out.println("1) Cadastrar funcionário padrão \n2) Cadastrar funcionário comissionado \n3) Cadastrar funcionário de produção \n4) Mostrar folha de pagamento \n0) Encerrar programa");
        int opcao;
        do {
            System.out.println("Digite a opção (0-4): ");
            opcao = sc.nextInt();
            sc.nextLine(); //Limpar o buffer é importante né

            int qtd;

            switch(opcao) {
                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                case 1:
                    System.out.println("--- Cadastro de funcionário padrão ---");
                    System.out.println("Quantidade de funcionários que deseja cadastrar: ");
                    qtd = sc.nextInt();
                    for(int i = 0; i < qtd; i++){
                        System.out.println("Nome: ");
                        nome = sc.nextLine();
                        System.out.println("Matrícula: ");
                        matricula = sc.nextInt();
                        Padrao fp = new Padrao(nome, matricula, SALARIO_BASE);
                        funcionarios.add(fp);
                    }
            
                    break;

                case 2:
                    System.out.println("--- Cadastro de funcionário comissionado ---");
                    System.out.println("Quantidade de funcionários que deseja cadastrar: ");
                    qtd = sc.nextInt();
                    for(int i = 0; i < qtd; i++){
                        System.out.println("Nome: ");
                        nome = sc.nextLine();
                        System.out.println("Matrícula: ");
                        matricula = sc.nextInt();
                        System.out.println("Vendas do mês: ");
                        venda = sc.nextDouble();
                        System.out.println("Percentual: ");
                        percentual = sc.nextDouble();
                        Comissionado fc = new Comissionado(nome, matricula, SALARIO_BASE, vendas, percentual);
                        funcionarios.add(fc);
                    }
                break;

                case 3:
                    System.out.println("--- Cadastro funcionário produção ---");
                    System.out.println("Quantidade de funcionários que deseja cadastrar: ");
                    qtd = sc.nextInt();
                    for(int i = 0; i < qtd; i++){
                        System.out.println("Nome: ");
                        nome = sc.nextLine();
                        System.out.println("Matrícula: ");
                        matricula = sc.nextInt();
                        System.out.println("Quantidade de peças produzidas no mês: ");
                        qtdPecas = sc.nextInt();
                        System.out.println("Valor por peça: ");
                        valorPeca = sc.nextDouble();
                        Producao fpd = new Producao(nome, matricula, SALARIO_BASE, qtdPecas, valorPeca);
                        funcionarios.add(fpd);
                    }
                    break;

                case 4:
                    System.out.println("--- FUNCIONÁRIOS / FOLHA DE PAGAMENTO ---");
                    System.out.println("Quantidade de funcionários cadastrados: " + funcionarios.size());
                    for(Funcionario f: funcionarios){
                        f.exibirDados();
                    }

                    break;

                default: //Para caso o usuário digite algum número diferente de 0, 1, 2, 3 ou 4
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 0); //Enquanto a opção for diferente de zero

        sc.close();
    }
}