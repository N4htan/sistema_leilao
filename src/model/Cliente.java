package model;

import operacao.Lance;

public class Cliente {
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    //private operacao.Leilao leilao;
    private Lance lances;
    //private Integer numLeilao;

    public Cliente(String email, String nome, String senha, String cpf) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        //this.numLeilao = numLeilao;
        //this.lances = lances;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "\nNome:"+ this.nome + ",Email:"+this.email + ", CPF: " + this.cpf+ ", Lance:" +this.lances;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	/*public operacao.Leilao getLeilao() {
		return leilao;
	}
	public void setLeilao(operacao.Leilao leilao) {
		this.leilao = leilao;
	}

	public String getLances() {
		return lances;
	}
	public void setLances(String lances) {
		this.lances = lances;
	}*/



}
