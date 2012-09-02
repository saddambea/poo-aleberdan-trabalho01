/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Model.Grafo;
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
        Grafo grafo = new Grafo(nome);
        this.setId(this.getId() + 1);
        
        listaGrafos.put(this.getId(), grafo);
        
        //retorno o ID do grafo criado para colocar no combobox da interface
        return grafo;
    }
    
    public void adicionaAresta(){
        
    }
    
    public void adicionaNo(){
        
    }
    
    /*public void addGrafo(String Nome) {
    //    Grafo novoGrafo = adiasdiasn
    //    adiciona arraylist
    } */

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
