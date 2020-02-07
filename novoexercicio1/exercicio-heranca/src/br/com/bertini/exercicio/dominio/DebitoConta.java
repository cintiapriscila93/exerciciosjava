package br.com.bertini.exercicio.dominio;

public class DebitoConta extends FormaPagamento {
	
	private String CodigoBanco;
	private String numeroConta;
	private String numeroAgencia;
	
	public DebitoConta(Double valor, String codigoBanco, String numeroConta, String numeroAgencia) {
		super(valor);
		CodigoBanco = codigoBanco;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
	}
	public String getCodigoBanco() {
		return CodigoBanco;
	}
	public void setCodigoBanco(String codigoBanco) {
		CodigoBanco = codigoBanco;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	@Override
	public String toString() {
		return "DebitoConta [CodigoBanco=" + CodigoBanco + ", numeroConta=" + numeroConta + ", numeroAgencia="
				+ numeroAgencia + ", valor=" + valor + "]";
	}
	


}
