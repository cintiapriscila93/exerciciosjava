package br.com.bertini.exercicio.dominio;

public class Gerente extends Funcionario implements CalculoBonus{

	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculoBonus() {
		return salario * 3;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}

}
