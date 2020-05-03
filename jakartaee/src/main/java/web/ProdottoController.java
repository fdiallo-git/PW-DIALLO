/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import Prodotti.Prodotto;
import Prodotti.ProdottoStore;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Fatimatou Diallo
 */
@Named("prodController")
@RequestScoped
public class ProdottoController {
    @Inject
    private ProdottoStore store;
    public ProdottoController(){
        System.out.println("nuova istanza di ProdottoController......");
    }
    @PostConstruct
    public void init(){
        System.out.println("inut() ProdottoController...");
    }
    @PreDestroy
    public void ending(){
        System.out.println("ending() ProdottoController");
    }
    public List<Prodotto> allProdotti(){
        return store.allProdotti();
        
    }
}
