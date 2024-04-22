import java.util.Scanner;

public class verificarbanco {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        Scanner dinheiro = new Scanner(System.in);
        int botoes = 0;

        Boolean Cliente = true;
        String NomeDoUsuario = "Hendreu";
        String TipoDeConta = "Saque";
        double DinheiroNaConta = 50;
        double Receber = 0;
        double Transferencia = 0;

        while (Cliente = true && botoes !=4){
            System.out.println(
            " -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" +
            "\nNome:" + NomeDoUsuario+
            "\nTipo de Conta:" + TipoDeConta +
            "\nDinheiro na conta:" + DinheiroNaConta +
            "\n -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" +
            "\n\n 1.Verificar saldo da conta" +
            "\n 2.Receber Valor" +
            "\n 3.Transferir Valor" +
            "\n 4.Extrato bancario"
            );

            botoes =  dados.nextInt();

         if (botoes == 1) {
                System.out.println("Saldo da conta:" + DinheiroNaConta);
        } else if (botoes == 2){
                System.out.println("Valor a se receber");
                Receber = dinheiro.nextDouble();
                DinheiroNaConta += Receber;
                System.out.println("Seu novo saldo é de:"+ DinheiroNaConta);

        } else if (botoes == 3){
                System.out.println("Valor a se transferir");
                Transferencia = dinheiro.nextDouble();
                    if (DinheiroNaConta < Transferencia ){
                        System.out.println("O valor precisa ser positivo para efetuar a Transação");
                    } else {
                        Transferencia = dinheiro.nextDouble();
                        DinheiroNaConta -= Transferencia;
                        System.out.println("Seu novo saldo é de:"+ DinheiroNaConta);
                }
        } else{
                System.out.println("Obrigado por sua operação");

                }
            }
        }
    }
    /* switch (botoes){
            case 1: System.out.println("Saldo da conta:" + DinheiroNaConta); break;

            case 2:System.out.println("Valor a se receber");
                Receber = dinheiro.nextDouble();
                DinheiroNaConta += Receber;
                System.out.println("Seu novo saldo é de:"+ DinheiroNaConta); break;
            case 3:System.out.println("Valor a se transferir");
                Transferencia = dinheiro.nextDouble();
                DinheiroNaConta -= Transferencia;
                System.out.println("Seu novo saldo é de:"+ DinheiroNaConta); break;
            case 4: System.out.println("Obrigado por sua operação"); break;
            */