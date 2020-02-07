package br.com.bertini.exercicio.dominio;

public class Estagiario extends Funcionario implements CalculoBonus {

	public Estagiario(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculoBonus() {
		return salario * 0.5;
		
	}

	@Override
	public String toString() {
		return "Estagiario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}

}
