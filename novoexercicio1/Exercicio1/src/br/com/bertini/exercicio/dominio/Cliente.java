package br.com.bertini.exercicio.dominio;

public class Cliente {

	private String nome;
	private Integer idade;
	private String profissao;
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getProfissao()=" + getProfissao() + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
