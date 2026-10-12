/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johnny-maia-fernandes
 */
public class Plano {

    private Integer id;
    private String nome;
    private Float valor;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}