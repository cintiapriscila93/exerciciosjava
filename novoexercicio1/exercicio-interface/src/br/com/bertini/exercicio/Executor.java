package br.com.bertini.exercicio;

import br.com.bertini.exercicio.dominio.CalculoBonus;
import br.com.bertini.exercicio.dominio.Estagiario;
import br.com.bertini.exercicio.dominio.Gerente;
import br.com.bertini.exercicio.dominio.Programador;
import br.com.bertini.exercicio.servico.CalculaBonusServico;

public class Executor {

	public static void main(String[] args) {
		CalculoBonus calculobonusestagiario = new Estagiario("Cintia", 27, 2000.0);
		CalculaBonusServico bonusEstagiario = new CalculaBonusServico();
		bonusEstagiario.imprimeBonus(calculobonusestagiario);
		CalculoBonus calculobonusgerente = new Gerente("Ana", 35, 15000.0);
        CalculaBonusServico bonusGerente = new CalculaBonusServico();
        bonusGerente.imprimeBonus(calculobonusgerente);
		CalculoBonus calculobonusprogramador = new Programador("Matheus", 28, 10000.0);
		CalculaBonusServico bonusProgramador = new CalculaBonusServico();
		bonusProgramador.imprimeBonus(calculobonusprogramador);
	}
}
