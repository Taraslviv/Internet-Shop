package ua.taraslviv.model;

public class Stuff { // martin fauler refactoring!

	private Long id;
	private String name;
	private String description;
	private Integer amount;
	private Double price;
	private StuffGroup group;
	
	public Stuff() {
		
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public StuffGroup getGroup() {
		return group;
	}

	public void setGroup(StuffGroup group) {
		this.group = group;
	}
	
}
