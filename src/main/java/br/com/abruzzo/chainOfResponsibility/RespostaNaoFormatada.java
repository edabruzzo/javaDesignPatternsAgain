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
public class RespostaNaoFormatada implements Resposta{

    @Override
    public void responde(Requisicao requisicao) {
        
            System.out.println("Titular: "+requisicao.getConta().getTitular());
    }
}
