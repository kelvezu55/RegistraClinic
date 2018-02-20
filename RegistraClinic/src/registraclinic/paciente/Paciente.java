/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Paulo
 */
@Entity
public class Paciente {
    
    @Id
    @GeneratedValue
    private int idPaciente;
    private int numeroProntuarioPaciente; //Seria a mesma coisa do ID???
    private String nomePaciente;
    private String rgPaciente;
    private String cpfPaciente;
    private int idadePaciente;
    private Date dataNascimentoPaciente;
    private String sexoPaciente;
    private String enderecoPaciente;
    private String telefonePaciente;
    private String nomeResponsavelPaciente;
    private String telefoneResponsavelPaciente;
    private Date dataCadastroPaciente;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNumeroProntuarioPaciente() {
        return numeroProntuarioPaciente;
    }

    public void setNumeroProntuarioPaciente(int numeroProntuarioPaciente) {
        this.numeroProntuarioPaciente = numeroProntuarioPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public int getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(int idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public Date getDataNascimentoPaciente() {
        return dataNascimentoPaciente;
    }

    public void setDataNascimentoPaciente(Date dataNascimentoPaciente) {
        this.dataNascimentoPaciente = dataNascimentoPaciente;
    }
    
    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getNomeResponsavelPaciente() {
        return nomeResponsavelPaciente;
    }

    public void setNomeResponsavelPaciente(String nomeResponsavelPaciente) {
        this.nomeResponsavelPaciente = nomeResponsavelPaciente;
    }

    public String getTelefoneResponsavelPaciente() {
        return telefoneResponsavelPaciente;
    }

    public void setTelefoneResponsavelPaciente(String telefoneResponsavelPaciente) {
        this.telefoneResponsavelPaciente = telefoneResponsavelPaciente;
    }

    public Date getDataCadastroPaciente() {
        return dataCadastroPaciente;
    }

    public void setDataCadastroPaciente(Date dataCadastroPaciente) {
        this.dataCadastroPaciente = dataCadastroPaciente;
    }
        
    
}
