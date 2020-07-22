/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.abruzzo.designpatterns;

import br.com.abruzzo.chainOfResponsibility.DescontoLapisCaneta;
import br.com.abruzzo.chainOfResponsibility.DescontoMaisCincoItens;
import br.com.abruzzo.chainOfResponsibility.DescontoValorMaior500;
import br.com.abruzzo.chainOfResponsibility.Item;
import br.com.abruzzo.chainOfResponsibility.SemDescontoFimCorrente;
import br.com.abruzzo.strategy.CalculadorImpostos;
import br.com.abruzzo.strategy.ICMS;
import br.com.abruzzo.strategy.ISS;
import br.com.abruzzo.strategy.Orcamento;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 19 de jul. de 2020
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
        //testaStrategy();
        testaChainOfResponsibility();
        

    }

    private static void testaStrategy() {

        Orcamento orcamento = new Orcamento(500);        
        CalculadorImpostos.calculaImposto(orcamento, new ISS());
        CalculadorImpostos.calculaImposto(orcamento, new ICMS());

    }

    private static void testaChainOfResponsibility() {
    
        
        
        br.com.abruzzo.chainOfResponsibility.Orcamento orcamento = new br.com.abruzzo.chainOfResponsibility.Orcamento();
        orcamento.adicionaItem(new Item(501));
        
        DescontoMaisCincoItens cadeiaResponsabilidade = new DescontoMaisCincoItens(
                                                                new DescontoValorMaior500(
                                                                        new DescontoLapisCaneta(
                                                                            new SemDescontoFimCorrente())));
    
        double descontoCalculado = cadeiaResponsabilidade.calcula(orcamento);
        System.out.println("Desconto calculado =  "+ descontoCalculado);
        
    
    }

}
