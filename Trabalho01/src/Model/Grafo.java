/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author saddam
 */
public class Grafo {

    private int idGrafo;
    private String nome;
    private ArrayList<Nodo> listaNodo = new ArrayList();
    private ArrayList<Aresta> listaAresta = new ArrayList();

    private ArrayList<Aresta> arestasLidas = new ArrayList();

    public Grafo(String nome) {
        this.nome = nome;
    }

    public void addAresta() {

    }

    public void addNodo() {
        
    }

    public void addArestaLida() {

    }

    public ArrayList<Aresta> getArestasNodo(Nodo no) {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return this.getNome(); 
    }
}
