/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.abruzzo.chainOfResponsibility;

import java.util.List;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 22 de jul. de 2020
 */
public class DescontoLapisCaneta implements Desconto {

    Desconto proximo_desconto;

    public DescontoLapisCaneta(Desconto desconto) {
        this.proximo_desconto = desconto;
    }
    
    
    
    @Override
    public double calcula(Orcamento orcamento) {
    
        List<Item> listaItens = orcamento.getListaItens();
        double desconto = 0;
        
        for(Item item : listaItens){
            
            if(item.getNome().contains("LÁPIS") || item.getNome().contains("CANETA"))
                desconto = orcamento.getValorTotal() * 0.005;
            else
                desconto = this.proximo_desconto.calcula(orcamento);
                
                }

        return desconto;
    }

    
    
    
    
}
