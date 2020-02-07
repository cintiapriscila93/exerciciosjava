package br.com.bertini.exercicio.calculadora;

import br.com.bertini.exercicio.calculadora.dominio.Calculo;
import br.com.bertini.exercicio.calculadora.servico.impl.DivisaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.MultiplicacaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SomaServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SubtracaoServico;

public class ExecutorSimples {

	public static void main(String[] args) {
		
		Calculo soma = new SomaServico();
		System.out.println(soma.calculo(100.00, 100.00));
		Calculo multiplicacao = new MultiplicacaoServico();
		System.out.println(multiplicacao.calculo(50.5, 10.6));
		Calculo divisao = new DivisaoServico();
		System.out.println(divisao.calculo(200.4, 100.5));
		Calculo subtracao = new SubtracaoServico();
		System.out.println(subtracao.calculo(215.4, 100.9));
	}
}


