package banco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(double saldo){
        this(saldo,0.0);
    }

    public ContaCorrente(double saldo, double chequeEspecial) {
        super(saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= chequeEspecial + saldo){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
