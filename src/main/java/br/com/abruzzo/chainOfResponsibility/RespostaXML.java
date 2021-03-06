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
public class RespostaXML implements Resposta {

    private Resposta proximaResposta;

    public RespostaXML(Resposta proximaResposta) {
        this.proximaResposta = proximaResposta;
    }

    @Override
    public void responde(Requisicao requisicao) {

        if (requisicao.getFormato() == Formato.XML) {
            System.out.println("Resposta em XML");
            System.out.println("<titular>" + requisicao.getConta().getTitular() + "</titular>");
        } else {
            this.proximaResposta.responde(requisicao);
        }
    }

}
