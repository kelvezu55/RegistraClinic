/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.paciente;

/**
 *
 * @author Paulo
 */
public class Paciente {
    
    private int idPaciente;
    private String nomePaciente;
    private String rgPaciente;
    private String cpfPaciente;
    private String dataNascimentoPaciente;
    private String enderecoPaciente;
    private String telefonePaciente;
    private String nomeResponsavelPaciente; //NOVA CLASSE??? SERIA UMA CLASSE "RESPONSAVEL"??
    private String telefoneResponsavelPaciente;
    private String dataCadastroPaciente;
    private boolean urgenciaPaciente;
    private int numeroProntuarioPaciente; //ESSE NÚMERO VIRIA DE UMA CLASSE PRONTUÁRIO??

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getDataNascimentoPaciente() {
        return dataNascimentoPaciente;
    }

    public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
        this.dataNascimentoPaciente = dataNascimentoPaciente;
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

    public String getDataCadastroPaciente() {
        return dataCadastroPaciente;
    }

    public void setDataCadastroPaciente(String dataCadastroPaciente) {
        this.dataCadastroPaciente = dataCadastroPaciente;
    }

    public boolean isUrgenciaPaciente() {
        return urgenciaPaciente;
    }

    public void setUrgenciaPaciente(boolean urgenciaPaciente) {
        this.urgenciaPaciente = urgenciaPaciente;
    }

    public int getNumeroProntuarioPaciente() {
        return numeroProntuarioPaciente;
    }

    public void setNumeroProntuarioPaciente(int numeroProntuarioPaciente) {
        this.numeroProntuarioPaciente = numeroProntuarioPaciente;
    }
    
    
}
