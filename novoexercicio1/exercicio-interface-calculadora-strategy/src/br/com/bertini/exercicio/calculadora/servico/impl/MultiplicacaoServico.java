package br.com.bertini.exercicio.calculadora.servico.impl;

import br.com.bertini.exercicio.calculadora.dominio.Calculo;

public class MultiplicacaoServico implements Calculo {

	@Override
	public Double calculo(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

}
