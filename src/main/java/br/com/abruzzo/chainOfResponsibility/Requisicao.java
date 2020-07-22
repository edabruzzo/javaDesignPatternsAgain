/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.abruzzo.chainOfResponsibility;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 22 de jul. de 2020
 */
public class Requisicao {
    
    private Formato formato;
    private Conta conta;

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public Conta getConta() {

       return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
    
    
    
    
    

}
