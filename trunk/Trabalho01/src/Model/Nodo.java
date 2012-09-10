/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Bernardo
 */
public class Nodo {

    private String nome;
    private double custo;
    private String tipo;

    public Nodo(String nome, double custo, String tipo) {
        this.setNome(nome);
        this.setCusto(custo);
        this.setTipo(tipo);
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
