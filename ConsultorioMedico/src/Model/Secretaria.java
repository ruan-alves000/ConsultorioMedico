package Model;
import Controller.ControleSecretaria;
public class Secretaria extends Administrador {
    private int id_secretaria;
    private String telefone, nome, sexo, RG, CPF, endereco;
    private ControleSecretaria controleSecretaria;

    public Secretaria(String nome, String senha) {
        super(nome, senha);
    }

    /**
     * @return the id_secretaria
     */
    public int getId_secretaria() {
        return id_secretaria;
    }

    /**
     * @param id_secretaria the id_secretaria to set
     */
    public void setId_secretaria(int id_secretaria) {
        this.id_secretaria = id_secretaria;
    }

    /**
     * @return the telefone
     */
    @Override
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the nome
     */
    @Override
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
	 
}
 
