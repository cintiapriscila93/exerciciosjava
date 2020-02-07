package br.com.bertini.exercicio.dominio;

import java.time.LocalDate;

public class Boleto extends FormaPagamento {
	
	private String CodigoDigitavel;
	private LocalDate Vencimento;
	
	
	public Boleto(Double valor, String codigoDigitavel, LocalDate vencimento) {
		super(valor);
		CodigoDigitavel = codigoDigitavel;
		Vencimento = vencimento;
	}
	public String getCodigoDigitavel() {
		return CodigoDigitavel;
	}
	public void setCodigoDigitavel(String codigoDigitavel) {
		CodigoDigitavel = codigoDigitavel;
	}
	public LocalDate getVencimento() {
		return Vencimento;
	}
	public void setVencimento(LocalDate vencimento) {
		Vencimento = vencimento;
	}
	@Override
	public String toString() {
		return "Boleto [CodigoDigitavel=" + CodigoDigitavel + ", Vencimento=" + Vencimento + ", valor=" + valor + "]";
	}

}
