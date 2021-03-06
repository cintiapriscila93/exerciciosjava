package br.com.bertini.exerc�cio;

import java.time.LocalDate;
import java.time.Month;

import br.com.bertini.exercicio.dominio.Boleto;
import br.com.bertini.exercicio.dominio.CartaoCredito;
import br.com.bertini.exercicio.dominio.DebitoConta;

public class Executor {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2020, Month.FEBRUARY, 24);
		Boleto boleto = new Boleto(100.50, "00341.11111.22222.33333.77777.4444.1",data);
		System.out.println(boleto);
		CartaoCredito cartaoCredito = new CartaoCredito(200.00, "12345678910", "01/2025", "Pedro Luis");
		System.out.println(cartaoCredito);
		DebitoConta debitoConta = new DebitoConta(300.00, "341", "010107877-55", "8784");
		System.out.println(debitoConta);

	}

}
