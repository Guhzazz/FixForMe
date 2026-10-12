import java.time.LocalDate;

public class Contratante {
    
    private Integer id;
    private String nome;
    private String senha;
    private String email;
    private String telefone;
    private Float notaContratante;
    private LocalDate dataCriacao;
    private String descricao;
    private Integer servicosContratados;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Float getNotaContratante() {
        return notaContratante;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getServicosContratados() {
        return servicosContratados;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNotaContratante(Float notaContratante) {
        this.notaContratante = notaContratante;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setServicosContratados(Integer servicosContratados) {
        this.servicosContratados = servicosContratados;
    }
}