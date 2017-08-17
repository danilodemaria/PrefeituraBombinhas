/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Administração
 */
public class Aluno {

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    private int codigo;
    private String dataCadastro;
    private String dataNascimento;
    private String nome;
    private String cpf;
    private String rg;
    private String orgaoExpedidor;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String municipio;
    private String estado;
    private String cep;
    private String email;
    private String telefoneFixo;
    private String telefoneMovel;
    private String instituicao;
    private String curso;
    private String periodo;
    private boolean segunda;
    private boolean terca;
    private boolean quarta;
    private boolean quinta;
    private boolean sexta;
    private boolean sabado;
    private boolean ativo;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataCadastro
     */
    public String getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the orgaoExpedidor
     */
    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    /**
     * @param orgaoExpedidor the orgaoExpedidor to set
     */
    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefoneFixo
     */
    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    /**
     * @param telefoneFixo the telefoneFixo to set
     */
    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    /**
     * @return the telefoneMovel
     */
    public String getTelefoneMovel() {
        return telefoneMovel;
    }

    /**
     * @param telefoneMovel the telefoneMovel to set
     */
    public void setTelefoneMovel(String telefoneMovel) {
        this.telefoneMovel = telefoneMovel;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the segunda
     */
    public boolean isSegunda() {
        return segunda;
    }

    /**
     * @param segunda the segunda to set
     */
    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }

    /**
     * @return the terca
     */
    public boolean isTerca() {
        return terca;
    }

    /**
     * @param terca the terca to set
     */
    public void setTerca(boolean terca) {
        this.terca = terca;
    }

    /**
     * @return the quarta
     */
    public boolean isQuarta() {
        return quarta;
    }

    /**
     * @param quarta the quarta to set
     */
    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }

    /**
     * @return the quinta
     */
    public boolean isQuinta() {
        return quinta;
    }

    /**
     * @param quinta the quinta to set
     */
    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }

    /**
     * @return the sexta
     */
    public boolean isSexta() {
        return sexta;
    }

    /**
     * @param sexta the sexta to set
     */
    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }

    /**
     * @return the sabado
     */
    public boolean isSabado() {
        return sabado;
    }

    /**
     * @param sabado the sabado to set
     */
    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

}
