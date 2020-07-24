/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.abruzzo.strategy;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 19 de jul. de 2020
 */
public class ICMS extends Imposto{

    public ICMS() {
    }

    public ICMS(Imposto impostoDecorator) {
        super(impostoDecorator);
    }

   
    public double calcular(Orcamento orcamento, double aliquota) {
        return super.calcular(orcamento, 0.1);
    }

}
