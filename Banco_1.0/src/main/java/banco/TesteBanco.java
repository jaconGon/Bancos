package banco;

public class TesteBanco {
    public static void main(String[] args) {
       Banco banco = new Banco();

       System.out.println("--------------- CRIAÇÃO DE CONTAS BANCÁRIAS ---------------");
       Cliente jacon = new Cliente("Leonardo","jacon");
       Conta contaJacon = new ContaPoupanca(50000,0.03);
       jacon.adicionarConta(contaJacon);
       banco.adicionarCliente(jacon);
       System.out.println("Cliente ["+banco.getNumeroDeClientes()+ "] :"+jacon.getNome() + " " + jacon.getSobrenome()+". Saldo R$:" +jacon.getConta(0).getSaldo()  +". Conta pupança com taxa de rendimento de: "+ ((ContaPoupanca)contaJacon).getTaxaRendimento());

       Cliente nicole = new Cliente("Nicole","Lima");
       ContaCorrente contaNicole = new ContaCorrente(45000,30000);
       nicole.adicionarConta(contaNicole);
       banco.adicionarCliente(nicole);
       System.out.println("Cliente ["+banco.getNumeroDeClientes()+ "] :"+nicole.getNome() + " " + nicole.getSobrenome()+". Saldo R$:" +nicole.getConta(0).getSaldo()  +". Conta corrente com cheque especial de: "+ contaNicole.getChequeEspecial());

       Cliente mavi = new Cliente("Maria Vitoria","Muzzo");
       Conta contaMavi = contaJacon;
       mavi.adicionarConta(contaMavi);
       banco.adicionarCliente(mavi);
       System.out.println("Cliente ["+banco.getNumeroDeClientes()+ "] :"+mavi.getNome() + " " + mavi.getSobrenome()+" Entrou como parceira de jacon em sua conta com saldo de R$:" +contaMavi.getSaldo()  +". Conta pupança com taxa de rendimento de: "+ ((ContaPoupanca)contaMavi).getTaxaRendimento());


       System.out.println("--------------- RELATÓRIO DE TRANSAÇÕES ---------------");

       System.out.println("Recuperando o cliente " + jacon.getNome() + " " + jacon.getSobrenome());
       System.out.println("Sacando R$ 1.200,00: " + contaJacon.sacar(1200));
       System.out.println("Depositando R$ 8.525,00,00: " + contaJacon.depositar(8525));
       System.out.println("Sacando R$ 12.800,00: " + contaJacon.sacar(12800));
       System.out.println("Sacando R$ 50.000,00: " + contaJacon.sacar(50000));
       System.out.println("Cliente ["+jacon.getNome() + " " + jacon.getSobrenome()+"] tem o saldo de R$ "+contaJacon.getSaldo());

       System.out.println();

       System.out.println("Recuperando o cliente " + nicole.getNome() + " " + nicole.getSobrenome());
       System.out.println("Sacando R$ 12.500,00: " + contaNicole.sacar(12500));
       System.out.println("Sacando R$ 18.500,00: " + contaNicole.sacar(18500));
       System.out.println("Depositando R$ 3.500,00: " + contaNicole.depositar(3500));
       System.out.println("Sacando R$ 17.000,00: " + contaNicole.sacar(17000));
       System.out.println("Sacando R$ 25.000,00: " + contaNicole.sacar(25000));
       System.out.println("Cliente ["+nicole.getNome() + " " + nicole.getSobrenome()+"] tem o saldo de R$ "+contaNicole.getSaldo());

       System.out.println();

       System.out.println("Recuperando o cliente " + mavi.getNome() + " " + mavi.getSobrenome());
       System.out.println("Sacando R$ 1.200,00: " + contaMavi.sacar(1200));
       System.out.println("Depositando R$ 8.525,00,00: " + contaMavi.depositar(8525));
       System.out.println("Sacando R$ 12.800,00: " + contaMavi.sacar(12800));
       System.out.println("Sacando R$ 50.000,00: " + contaMavi.sacar(50000));
       System.out.println("Cliente ["+mavi.getNome() + " " + mavi.getSobrenome()+"] tem o saldo de R$ "+contaMavi.getSaldo());


    }
}
