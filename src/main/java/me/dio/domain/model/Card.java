package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    //Atributos
	@Id	// Ele serve para dizer que é o identificador |Precisou fazer o import 
	@GeneratedValue(strategy =  GenerationType.IDENTITY) //"Dizer que é gerado automaticamente" as 10:04 como estrategia
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "additional_limit", scale = 13, precision = 2)//é a precisão  11 inteiros de uma escala de 13 com precisão de dois em 8:00
	//Foi adicopna o name em 13:54 porque limit pode ser uma palavra reservada
	private BigDecimal limit;
	
	//Encapsulamento
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
	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

}
