/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decorator;

import br.com.abruzzo.chainOfResponsibility.Conta;
import java.util.List;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 23 de jul. de 2020
 */
public interface Filtro {
    
 List<Conta> listaContasFiltradas(List<Conta> listaContasAnalise);

}
