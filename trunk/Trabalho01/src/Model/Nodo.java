/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author saddam
 */
public class Nodo {

    private String nome;
    private double custo;
    private String estado;

    public Nodo(String nome, double custo, String estado) {
        this.setNome(nome);
        this.setCusto(custo);
        this.setEstado(estado);
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
