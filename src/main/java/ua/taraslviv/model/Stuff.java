package ua.taraslviv.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Stuff { // martin fauler refactoring!

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stuff_id")
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = true, length = 7000)
	private String description;
	
	@Column(nullable = false)
	private Integer amount;
	
	@Column(nullable = false)
	private Double price;
	
	@ManyToOne
	@JoinColumn(name="id", nullable = false)
	//@Column(nullable = false)
	private StuffGroup stuffgroup;
	
	@OneToMany(mappedBy = "stuff", fetch = FetchType.LAZY)
	private List<Basket> baskets;
	
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
		return stuffgroup;
	}

	public void setGroup(StuffGroup group) {
		this.stuffgroup = group;
	}

	public List<Basket> getBaskets() {
		return baskets;
	}

	public void setBaskets(List<Basket> baskets) {
		this.baskets = baskets;
	}
	
}
