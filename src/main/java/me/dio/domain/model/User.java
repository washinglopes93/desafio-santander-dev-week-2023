package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Entity(name = "tb_users") //02:43 especificar o nome da tabela e tem que fazer o  import do jakarta
public class User {
	
	//Criado os atributos
	
	//Para criar um identificador tem que colocar o @id
	@Id	// Ele serve para dizer que é o identificador |Precisou fazer o import 
	@GeneratedValue(strategy =  GenerationType.IDENTITY) //"Dizer que é gerado automaticamente" as 3:14 como estrategia 
	private Long id;	
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL) //Aqui esta falandoq ue tem relacionamento 1 para 1 | cascade ser para dizer que o relacionemtno é muito forte em 5:00 
	private Account account;
	
	@OneToOne(cascade = CascadeType.ALL) //mesma cosa de cima
	private Card card;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //significa toda fez que for buscar um usuario no banco tras de volta a lista de features
	private List<Feature> features;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //significa toda fez que for buscar um usuario no banco tras de volta a lista de features
	private List<News> news;
	
	
	//Criando os getter and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}

}
