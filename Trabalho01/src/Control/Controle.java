/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Model.Grafo;
import Model.Nodo;
import java.util.HashMap;

/**
 *
 * @author saddam
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
        
        listaGrafos.put(grafo.getIdGrafo(), grafo);
        
        //retorno o ID do grafo criado para colocar no combobox da interface
        return grafo;
    }
    
    public void adicionaAresta(String nomeAresta, double valorAresta, Nodo origem, Nodo destino, int idGrafo){        
        Grafo grafoAtual = listaGrafos.get(idGrafo);
        listaGrafos.remove(idGrafo);
        grafoAtual.addAresta(origem, destino, nomeAresta, valorAresta);
        listaGrafos.put(idGrafo, grafoAtual);
    }
    
    public void adicionaNo(String nomeNo, double valorNo, String tipo, int idGrafo){
        //pego o grafo selecionado
        Grafo grafoAtual = listaGrafos.get(idGrafo);
        //removo do hashmao
        listaGrafos.remove(idGrafo);
        //adiciono o nó
        grafoAtual.addNodo(nomeNo, valorNo, tipo);
        //e coloco ele de volta na lista        
        listaGrafos.put(idGrafo, grafoAtual);
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


}
