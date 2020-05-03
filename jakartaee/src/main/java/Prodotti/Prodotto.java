/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prodotti;

/**
 *
 * @author Fatimatou Diallo
 */
public class Prodotto {

    private Long id;
    private String nome;
    private String descrizione;
    private Long prezzo;

    public Prodotto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    Prodotto(long l) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
