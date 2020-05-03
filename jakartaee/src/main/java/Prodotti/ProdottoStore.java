/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prodotti;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Fatimatou Diallo
 */
@ApplicationScoped

public class ProdottoStore {

    private List<Prodotto> prodotti;

    public ProdottoStore() {
        System.out.println("nuovo istanza di store.....");
    }

    @PostConstruct
    public void init() {
        System.out.println("init store().....");
        this.prodotti = Stream.of(new Prodotto(1l, "pasta"), new Prodotto(2l, "riso")).collect(Collectors.toList());

    }
@PreDestroy
public void ening(){
    System.out.println("ending()......Store");
}

public List<Prodotto> allProdotti(){
        return prodotti;
    
}
}
