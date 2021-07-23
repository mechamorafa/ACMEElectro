import java.util.Scanner;
public class ACMEEletro {


    public void inicializa(){

    }
    public static void executa(){
       Scanner in = new Scanner(System.in);
       int opcaoMenu;

        do{
            System.out.println("\tAcervo:");
            System.out.println("1. Cadastrar Eletrônico");
            System.out.println("2. Mostrar todas as informações do estoque");
            System.out.println("3. Pesquisar eletrônico por nome");
            System.out.println("4. Calcular preço");
            System.out.println("0. Sair");
            System.out.println("Opcao:");
            opcaoMenu = in.nextInt();

            switch(opcaoMenu){
                case 0:
                    System.out.println("Programa encerrado! Até mais! ;)");
                    break;
                case 1:
                    System.out.println("CADASTRAR ELETRÔNICO");
                    break;

                case 2:
                    System.out.println("MOSTRAR TODAS AS INFORMAÇÕES DO ESTOQUE");
                    break;

                case 3:
                    System.out.println("PESQUISAR ELETRONICO POR NOME");
                    break;

                case 4:
                    System.out.println("CALCULAR PRECO");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcaoMenu != 0);
    }
}
