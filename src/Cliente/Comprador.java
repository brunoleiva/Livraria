package Cliente;

import java.util.Date;

public class Comprador {
    private String Nome;
    private String RG;
    private String CPF;
    private Date dataNascimento;

    public Comprador(String nome, String RG, String CPF, Date dataNascimento) {
        Nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public Comprador(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
