package banco;

import java.util.ArrayList;

public class Banco {
    /*
     * Uma lista dessa forma nao tem tipo especifico
     * ou seja qualquer tipo de onjeto entraria na lista
     * e possivelmente lixos de memória
     * Usando uma condicional se voce ler um array
     * de objetos voce poderia comparar os objetos na lista
     * como sendo de uma instancia X e assim
     * selecionando oque for necessario
     * BAD IDEA!!!!!!!!
    */
    // private ArrayList clientes = new Arraylist()

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }
    public ArrayList<Cliente> getCliente(String nome, String sobrenome) {
        ArrayList<Cliente> result = new ArrayList<>();
        for(Cliente alvo : clientes) {
            if (alvo.getNome() == nome && alvo.getSobrenome() == sobrenome) {
                result.add((alvo));
            }
        }
        return result;
    }

    public int getNumeroDeClientes() {
        return clientes.size();
    }
}
