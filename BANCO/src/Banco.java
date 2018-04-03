
public class Banco {
 
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        System.out.println("O saldo inicial da conta 1 e: " + c1.saldo());
        System.out.println("O saldo inicial da conta 2 e: " + c2.saldo());
        c1.deposita(200);
        c2.deposita(300);
        System.out.println("O saldo atual da conta 1 e: " + c1.saldo());
        System.out.println("O saldo atual da conta 2 e: " + c2.saldo());
        if (    c1.saca(100)){
            System.out.println("Aqui esta seu dinheiro! Saldo atual "
                    + "da conta: " + c1.saldo());
        }
        else    {
            System.out.println("Saldo insuficiente! Saldo atual "
                    + "da conta: " + c1.saldo());
        }
        if (    c2.saca(500)){
            System.out.println("Aqui esta seu dinheiro! Saldo atual "
                    + "da conta: " + c2.saldo());
        }
        else    {
            System.out.println("Saldo insuficiente! Saldo atual "
                    + "da conta: " + c2.saldo());
        } 
        c1.transfere(c2,100);
        System.out.println("Transferiu! Saldo atual "
                + "da conta: " + c1.saldo()); 
        System.out.println("Recebeu! Saldo atual "
                + "da conta: " + c2.saldo());
         
    }
}
