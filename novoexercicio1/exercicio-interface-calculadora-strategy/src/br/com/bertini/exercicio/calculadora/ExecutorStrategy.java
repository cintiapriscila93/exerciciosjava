package br.com.bertini.exercicio.calculadora;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

import br.com.bertini.exercicio.calculadora.dominio.Calculo;
import br.com.bertini.exercicio.calculadora.dominio.TipoCalculo;
import br.com.bertini.exercicio.calculadora.servico.impl.DivisaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.MultiplicacaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SomaServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SubtracaoServico;

public class ExecutorStrategy {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Escolha a opera��o: 1 - Soma || 2 - Subtra��o || 3 - Multiplica��o || 4 - Divis�o");
			int operacao = entrada.nextInt();

			System.out.println("Primeiro valor: ");
			Double valor1 = entrada.nextDouble();

			System.out.println("Segundo valor: ");
			Double valor2 = entrada.nextDouble();

			Calculo calculoOperacao = null;
             
			Optional<TipoCalculo> tipoCalculo = Arrays.asList(TipoCalculo.values()).stream()
					.filter(f -> f.getTipoOperacao.intValue() == operacao).findFirst();
			
			calculoOperacao = tipoCalculo.get().obterTipoCalculo();
			
			System.out.println("Resultado: " + calculoOperacao.calculo(valor1, valor2));

		}

	}

}
