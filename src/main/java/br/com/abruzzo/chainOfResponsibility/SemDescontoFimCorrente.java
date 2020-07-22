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
public class SemDescontoFimCorrente implements Desconto{

    @Override
    public double calcula(Orcamento orcamento) {
        
        return 0;

    }

}
