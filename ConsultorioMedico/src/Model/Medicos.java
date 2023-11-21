package Model;

import Controller.ControleMedicos;
import Controller.ControleSecretaria;

public class Medicos extends Administrador {
 
    private int CRM, id_medico; 
    private ControleMedicos controleMedicos;
    private ControleSecretaria controleSecretaria;

    public Medicos(String nome, String senha) {
        super(nome, senha);
    }

    /**
     * @return the CRM
     */
    public int getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the id_medico
     */
    public int getId_medico() {
        return id_medico;
    }

    /**
     * @param id_medico the id_medico to set
     */
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    /**
     * @return the controleMedicos
     */
    public ControleMedicos getControleMedicos() {
        return controleMedicos;
    }

    /**
     * @param controleMedicos the controleMedicos to set
     */
    public void setControleMedicos(ControleMedicos controleMedicos) {
        this.controleMedicos = controleMedicos;
    }
	 
}
 
