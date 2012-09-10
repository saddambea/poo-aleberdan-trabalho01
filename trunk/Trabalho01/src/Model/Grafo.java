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

    //private ArrayList<Aresta> arestasLidas = new ArrayList();

    public Grafo(String nome, int id) {
        this.setNome(nome);
        this.setIdGrafo(id);
    }

    public void addAresta(Aresta novaAresta) {
        //Aresta aresta = new Aresta(origem, destino, nomeAresta, valorAresta);
        if(novaAresta != null)
            this.getListaAresta().add(novaAresta);
        //return aresta;
    }

    public void addNodo(Nodo novoNodo) {
        //cria o nó
        //Nodo no = new Nodo(nomeNo, valorNo, tipo);        
        //adiciona na lista
        if(novoNodo != null)
            this.getListaNodo().add(novoNodo);
        //return no;
    }

    public void addArestaLida() {

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
    
    public boolean possuiAresta() {
        if(this.getListaAresta().isEmpty())
            return false;
        return true;
    }

    /**
     * @return the listaNodo
     */
    public ArrayList<Nodo> getListaNodo() {
        return listaNodo;
    }

    /**
     * @return the listaAresta
     */
    public ArrayList<Aresta> getListaAresta() {
        return listaAresta;
    }

    public boolean noTemLigacao(Nodo no) {
        for(Aresta aresta : listaAresta) {
            if(aresta.getNodoInicial().equals(no))
                return true;
        }
        
        return false;
    }
}
