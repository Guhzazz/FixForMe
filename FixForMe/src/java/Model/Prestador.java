public class Prestador extends Contratante {

    private Integer idContratante;
    private String cpf;
    private Integer local;
    private Boolean ativo;
    private Float notaPrestador;
    private Integer servicosPrestados;
    private Integer idPlano;

    public Integer getIdContratante() {
        return idContratante;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getLocal() {
        return local;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Float getNotaPrestador() {
        return notaPrestador;
    }

    public Integer getServicosPrestados() {
        return servicosPrestados;
    }

    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdContratante(Integer idContratante) {
        this.idContratante = idContratante;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setNotaPrestador(Float notaPrestador) {
        this.notaPrestador = notaPrestador;
    }

    public void setServicosPrestados(Integer servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }
}