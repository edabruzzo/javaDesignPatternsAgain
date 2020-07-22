/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.abruzzo.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 22 de jul. de 2020
 */
public class Orcamento {
    
   private List<Item> listaItens;

    public Orcamento() {
        listaItens = new ArrayList<Item>();
    }
   
   

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public void adicionaItem(Item item) {
    
        listaItens.add(item);
    }
   
    public int totalItens(){
        
        return listaItens.size();
    }

    public double getValorTotal() {

        double total = 0;
        
        for(Item item : listaItens){
            
            total += item.getValor();
        }
        
        return total;
    
    }
   
   
    
   

}
