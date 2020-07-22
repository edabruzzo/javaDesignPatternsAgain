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
public class DescontoMaisCincoItens implements Desconto{

    Desconto proximoDesconto;

    public DescontoMaisCincoItens(Desconto desconto) {
        this.proximoDesconto = desconto;
    }

    @Override
    public double calcula(Orcamento orcamento) {

            if(orcamento.totalItens() > 5)
                return orcamento.getValorTotal() * 0.1;
            else
                return this.proximoDesconto.calcula(orcamento);
    }

}
