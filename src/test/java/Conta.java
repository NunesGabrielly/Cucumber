import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {

	/** 
	 * Declarando a variável responsável por receber o saldo da conta do cliente
	 */
	int saldoCliente;
	/** 
	 * Declarando a variável responsável por receber o valor do saque do cliente
	 */
	int valorSaque;
	/** 
	 * Declarando a variável responsável por validar se o cliente é especial
	 */
	boolean cEspecial = false;
	/** 
	 * Declarando a variável responsável por validar se o cliente é comum
	 */
	boolean cComum = false;
	
	/* 
	 * Iniciando o primeiro caso teste (cenário) com o cliente sendo especial
	 * 
	 * @param valor1 é referente ao saldo atual do cliente especial,
	 * Neste primeiro momento é esperado que o valor do saldo informado seja -200 e que o tipo de cliente seja o especial.
	 */
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int valor1) {
		this.cEspecial = true;
		this.saldoCliente = valor1;
		
		if(!this.cEspecial || this.saldoCliente != valor1) {
			throw new PendingException();
		}
	}
	/*
	 * @param valor2 é referente ao valor de saque que irá ser efetuado pelo cliente do tipo especial,
	 * Neste segundo momento é esperado que o valor informado para realizar o saque seja de 100 reais e que o tipo de cliente ainda seja o especial.
	 */	
	@When("for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(int valor2) {
		this.valorSaque = valor2;
		if(this.valorSaque != valor2) {
			throw new PendingException();
		}
	}
	/*
	 * @param valor3 é referente ao valor do saldo atual na conta do cliente  do tipo especial o saque realizado pelo cliente
	 * Neste terceiro momento é esperado que o valor de saldo seja de -300 reais e que o tipo de cliente ainda seja o especial.
	 */
	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int valor3) {
		if(this.saldoCliente - this.valorSaque != valor3) {
			throw new PendingException();
		}
			
	}
	
	
/*********************************************************************************************************************************************/
	
	/* 
	 * Iniciando o segundo caso teste (cenário) com o cliente sendo especial
	 * 
	 * @param valor4 é referente ao saldo atual do cliente comum,
	 * Neste primeiro momento é esperado que o valor do saldo informado seja -300 e que o tipo de cliente seja o comum.
	 */
	@Given("um cliente comum com saldo atual de (\\d+) reais$")
	public void um_cliente_comum_com_saldo_atual_de_reais(int valor4) {
		this.valorSaque = valor4;
		this.cComum = true;
		if(this.valorSaque != valor4 || !this.cComum) {
			throw new PendingException();
		}
	}
	/*
	 * @param valor5 é referente ao valor de saque que irá ser efetuado pelo cliente do tipo especial,
	 * Neste segundo momento é esperado que o valor informado para realizar o saque seja de 100 reais e que o tipo de cliente ainda seja o especial.
	 */	
	@When("^solicitar um saque de (\\d+) reais$")
	public void solicitar_um_saque_de_reais(int valor5) {
		this.valorSaque = valor5;
		if(this.valorSaque != valor5) {
			throw new PendingException();
		}
	}
	/*
	 * Neste momento é esperado que o cliente seja do tipo normal por isso não será possível efetuar o saque, pois o saldo do cliente será negativo e
	 * retornará aseguinte mensagem de "Saque indisponivel... Saldo Insuficiente"
	 */	
	@Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		if(!this.cComum) {
			throw new PendingException();			
		} else {
			System.out.println("Saque indisponivel... Saldo Insuficiente");
		}
	}
}
