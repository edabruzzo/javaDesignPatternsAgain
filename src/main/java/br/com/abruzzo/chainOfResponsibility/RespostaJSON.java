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
public class RespostaJSON implements Resposta{

    private Resposta proximaResposta;

    public RespostaJSON(Resposta proximaResposta) {
        this.proximaResposta = proximaResposta;
    }
    
    

    @Override
    public void responde(Requisicao requisicao) {

        if(requisicao.getFormato() == Formato.JSON){
            System.out.println("Resposta em JSON");
            System.out.println("{"+requisicao.getConta().getTitular()+"}");
        }
        
        else
            this.proximaResposta.responde(requisicao);

    }

}
