package ua.taraslviv.model;

import java.util.Date;

public class Basket {

	private Long id;
	private Customer customer;
	private Stuff stuff;
	private Date saleORadditional;
	private Boolean sold;  			// ุ่๋ไ - java core
	
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
		return saleORadditional;
	}

	public void setSaleORadditional(Date saleORadditional) {
		this.saleORadditional = saleORadditional;
	}

	public Boolean getSold() {
		return sold;
	}

	public void setSold(Boolean sold) {
		this.sold = sold;
	}
	
	
}
