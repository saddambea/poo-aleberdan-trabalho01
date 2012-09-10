/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author Bernardo
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

    public void addAresta(Aresta novaAresta) {
        //Aresta aresta = new Aresta(origem, destino, nomeAresta, valorAresta);
        if(novaAresta != null)
            this.listaAresta.add(novaAresta);
        //return aresta;
    }

    public void addNodo(Nodo novoNodo) {
        //cria o nó
        //Nodo no = new Nodo(nomeNo, valorNo, tipo);        
        //adiciona na lista
        if(novoNodo != null)
            this.listaNodo.add(novoNodo);
        //return no;
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
