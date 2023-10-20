package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    // Iniciando atributos
	
	@Id	// Ele serve para dizer que é o identificador |Precisou fazer o import 
	@GeneratedValue(strategy =  GenerationType.IDENTITY) //"Dizer que é gerado automaticamente" as 7:11 como estrategia
	private Long id;
	
	@Column(unique = true) //Aqui esta falando que o numero da conta é unico em 7:23
	private String number;
	
	private String agency;
	
	@Column(scale = 13, precision = 2)//é a precisão  11 inteiros de uma escala de 13 com precisão de dois em 8:00
	private BigDecimal balance;
	
	@Column(name = "additional_limit", scale = 13, precision = 2)//é a precisão  11 inteiros de uma escala de 13 com precisão de dois em 8:00
	//Foi adicopna o name em 13:54 porque limit pode ser uma palavra reservada
	private BigDecimal limit;
	
	
	//Encapsulamento com getter and setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

}
