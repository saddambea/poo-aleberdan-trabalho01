/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Model.Aresta;
import Model.Grafo;
import Model.Nodo;
import java.util.HashMap;

/**
 *
 * @author Bernardo
 */
public class Controle {
    
    private HashMap<Integer,Grafo> listaGrafos = new HashMap();
    private int id = -1;
    //private Grafo grafo;
    
    public Controle(){
        
    }    
    
    public Grafo criaGrafo(String nome) {
        
        this.setId(this.getId() + 1);
        
        Grafo grafo = new Grafo(nome, this.getId());
        
        getListaGrafos().put(grafo.getIdGrafo(), grafo);
        
        //retorno o ID do grafo criado para colocar no combobox da interface
        return grafo;
    }
    
    public void adicionaAresta(String nomeAresta, double valorAresta, Nodo origem, Nodo destino, int idGrafo){        
        Grafo grafoAtual = getListaGrafos().get(idGrafo);
        getListaGrafos().remove(idGrafo);
        
        //crio a aresta
        Aresta novaAresta = new Aresta(origem, destino, nomeAresta, valorAresta);

        //adiciono ela no grafo
        grafoAtual.addAresta(novaAresta);        
        
        getListaGrafos().put(idGrafo, grafoAtual);
    }
    
    public Nodo adicionaNo(String nomeNo, double valorNo, String tipo, int idGrafo){
        //pego o grafo selecionado
        Grafo grafoAtual = getListaGrafos().get(idGrafo);
        //removo do hashmao
        getListaGrafos().remove(idGrafo);
        
        //crio o nó        
        Nodo novoNodo = new Nodo(nomeNo, valorNo, tipo);
        
        //adiciona na lista
        grafoAtual.addNodo(novoNodo);
        
        //e coloco ele de volta na lista        
        getListaGrafos().put(idGrafo, grafoAtual);
        
        return novoNodo;
    }
        
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the listaGrafos
     */
    public boolean grafoTemAresta(Grafo grafoSelecionado) {
        if(grafoSelecionado.possuiAresta())
            return true;
        return false;
    }

    /**
     * @return the listaGrafos
     */
    public HashMap<Integer,Grafo> getListaGrafos() {
        return listaGrafos;
    }

    //Método que calcula o custo total e devolve a mensagem
    public String Calcular(Grafo grafoSelecionado) {
       double somaTotal;
       //busca a lista de nós
        
        
        
        
        return "";
    }


}
