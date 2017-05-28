package com.example.luizfilipe.classe_contato_teste;

import java.util.Date;

/**
 * Created by Luiz Filipe on 5/28/2017.
 */

public class Cliente {
    private long id;
    private String Nome;
    private String telefone;
    private String tipotelefone;
    private String endereco;
    private String tipoendereco;
    private String email;
    private String tipoemail;
    private Date aniversario;
    private String emprego;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipotelefone() {
        return tipotelefone;
    }

    public void setTipotelefone(String tipotelefone) {
        this.tipotelefone = tipotelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoendereco() {
        return tipoendereco;
    }

    public void setTipoendereco(String tipoendereco) {
        this.tipoendereco = tipoendereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoemail() {
        return tipoemail;
    }

    public void setTipoemail(String tipoemail) {
        this.tipoemail = tipoemail;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }
}
