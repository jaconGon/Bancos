package banco.dominio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private ArrayList<Conta> contas = new ArrayList<>();


    Cliente(String nome,String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public  ArrayList<Conta> getContas(){
        return contas;
    }


    public Conta getConta(Integer id){
        return contas.get(id);
    }

    public int getNumeroDeContas(){
        return contas.size();
    }

}
