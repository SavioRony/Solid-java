package rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private String empresa;
    private DadosPessoais dadosPessoais;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario,String empresa) {
        this.empresa = empresa;
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
