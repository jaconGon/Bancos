package banco.dominio;

public class Conta {
    protected double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double amount){
        if(amount <= saldo){
            saldo = saldo - amount;
            return true;
        }else{
            return false;
        }

    }
















}
