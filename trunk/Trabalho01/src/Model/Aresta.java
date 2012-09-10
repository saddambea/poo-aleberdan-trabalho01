/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Bernardo
 */
public class Aresta {

    private Nodo nodoInicial;
    private Nodo nodoFinal;
    private String nome;
    private double custo;

    public Aresta(Nodo nodoInicial, Nodo nodoFinal, String nome, double custo) {
        this.setNodoInicial(nodoInicial);
        this.setNodoFinal(nodoFinal);
        this.setNome(nome);
        this.setCusto(custo);
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Nodo getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(Nodo nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    public Nodo getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }

}
