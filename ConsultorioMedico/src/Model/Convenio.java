package Model;

import Controller.ControleSecretaria;

public class Convenio {
    private int id_convenio; 
    private String nome_convenio; 
    private String telefone_convenio; 
    private String endereco_convenio; 
    private String CNPJ; 
    private String planos_convenio; 
    private ControleSecretaria controleSecretaria;

    /**
     * @return the id_convenio
     */
    public int getId_convenio() {
        return id_convenio;
    }

    /**
     * @param id_convenio the id_convenio to set
     */
    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    /**
     * @return the nome_convenio
     */
    public String getNome_convenio() {
        return nome_convenio;
    }

    /**
     * @param nome_convenio the nome_convenio to set
     */
    public void setNome_convenio(String nome_convenio) {
        this.nome_convenio = nome_convenio;
    }

    /**
     * @return the telefone_convenio
     */
    public String getTelefone_convenio() {
        return telefone_convenio;
    }

    /**
     * @param telefone_convenio the telefone_convenio to set
     */
    public void setTelefone_convenio(String telefone_convenio) {
        this.telefone_convenio = telefone_convenio;
    }

    /**
     * @return the endereco_convenio
     */
    public String getEndereco_convenio() {
        return endereco_convenio;
    }

    /**
     * @param endereco_convenio the endereco_convenio to set
     */
    public void setEndereco_convenio(String endereco_convenio) {
        this.endereco_convenio = endereco_convenio;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the planos_convenio
     */
    public String getPlanos_convenio() {
        return planos_convenio;
    }

    /**
     * @param planos_convenio the planos_convenio to set
     */
    public void setPlanos_convenio(String planos_convenio) {
        this.planos_convenio = planos_convenio;
    }
	 
}
 
