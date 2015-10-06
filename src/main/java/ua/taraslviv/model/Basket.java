package ua.taraslviv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Basket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@Column(nullable = false)
	private Customer customer;
	
	@ManyToOne
	@Column(nullable = false)
	private Stuff stuff;
	
	@Column(nullable = false)
	private Date saleOrAdditional;
	
	@Column(nullable = false)
	private Boolean isSold;  			// ุ่๋ไ - java core
	
	public Basket() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Stuff getStuff() {
		return stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Date getSaleORadditional() {
		return saleOrAdditional;
	}

	public void setSaleORadditional(Date saleORadditional) {
		this.saleOrAdditional = saleORadditional;
	}

	public Boolean getSold() {
		return isSold;
	}

	public void setSold(Boolean sold) {
		this.isSold = sold;
	}
	
}
