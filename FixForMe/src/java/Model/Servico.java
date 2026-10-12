/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johnny-maia-fernandes
 */
public class Servico {

    private Integer idContratante;
    private Integer idPrestador;
    private Integer local;
    private String descricao;
    private Float notaContratante;
    private Float notaPrestados;
    private String avaliacaoContratante;
    private String avaliacaoPrestador;

    public Integer getIdContratante() {
        return idContratante;
    }

    public void setIdContratante(Integer idContratante) {
        this.idContratante = idContratante;
    }

    public Integer getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Integer idPrestador) {
        this.idPrestador = idPrestador;
    }

    public Integer getLocal() {
        return local;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getNotaContratante() {
        return notaContratante;
    }

    public void setNotaContratante(Float notaContratante) {
        this.notaContratante = notaContratante;
    }

    public Float getNotaPrestados() {
        return notaPrestados;
    }

    public void setNotaPrestados(Float notaPrestados) {
        this.notaPrestados = notaPrestados;
    }

    public String getAvaliacaoContratante() {
        return avaliacaoContratante;
    }

    public void setAvaliacaoContratante(String avaliacaoContratante) {
        this.avaliacaoContratante = avaliacaoContratante;
    }

    public String getAvaliacaoPrestador() {
        return avaliacaoPrestador;
    }

    public void setAvaliacaoPrestador(String avaliacaoPrestador) {
        this.avaliacaoPrestador = avaliacaoPrestador;
    }
}