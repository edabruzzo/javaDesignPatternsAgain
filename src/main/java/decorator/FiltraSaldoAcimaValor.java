/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decorator;

import br.com.abruzzo.chainOfResponsibility.Conta;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Emmanuel de Oliveira D'Abruzzo
 * @data 23 de jul. de 2020
 */
public class FiltraSaldoAcimaValor implements Filtro {

    @Override
    public List<Conta> listaContasFiltradas(List<Conta> listaContasAnalise) {

        //https://www.baeldung.com/java-stream-filter-lambda        
        return listaContasAnalise
                .stream()
                .filter(c -> c.getSaldo() > 500000 
                            || c.getDataAbertura().getDay() == new Date().getDay()
                            || c.getSaldo() < 100 )
                .collect(Collectors.toList());
 

    }

}
