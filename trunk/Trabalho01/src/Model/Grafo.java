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

    public Grafo(String nome, int id) {
        this.setNome(nome);
        this.setIdGrafo(id);
    }

    public Aresta addAresta(Nodo origem, Nodo destino, String nomeAresta, double valorAresta) {
        Aresta aresta = new Aresta(origem, destino, nomeAresta, valorAresta);
        this.listaAresta.add(aresta);
        return aresta;
    }

    public Nodo addNodo(String nomeNo, double valorNo, String tipo) {
        //cria o nó
        Nodo no = new Nodo(nomeNo, valorNo, tipo);
        
        //adiciona na lista
        this.listaNodo.add(no);
        return no;
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

    /**
     * @return the idGrafo
     */
    public int getIdGrafo() {
        return idGrafo;
    }

    /**
     * @param idGrafo the idGrafo to set
     */
    public void setIdGrafo(int idGrafo) {
        this.idGrafo = idGrafo;
    }
}
