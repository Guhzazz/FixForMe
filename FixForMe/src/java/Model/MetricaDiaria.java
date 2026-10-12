/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johnny-maia-fernandes
 */
import java.time.LocalDate;

public class MetricaDiaria {

    private Integer id;
    private Integer idPrestador;
    private Integer visualizacoes;
    private Integer acessos;
    private LocalDate dia;

    public Integer getId() {
        return id;
    }

    public Integer getIdPrestador() {
        return idPrestador;
    }

    public Integer getVisualizacoes() {
        return visualizacoes;
    }

    public Integer getAcessos() {
        return acessos;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdPrestador(Integer idPrestador) {
        this.idPrestador = idPrestador;
    }

    public void setVisualizacoes(Integer visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public void setAcessos(Integer acessos) {
        this.acessos = acessos;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
}