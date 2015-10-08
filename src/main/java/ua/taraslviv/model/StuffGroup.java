package ua.taraslviv.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StuffGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "stuffgroup", fetch = FetchType.LAZY)
	private List<Stuff> stuff;
	
	public StuffGroup() {
		
	}
	
	public StuffGroup(String name) {
		this.name = name;
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
	public List<Stuff> getStuff() {
		return stuff;
	}
	public void setStuff(List<Stuff> stuff) {
		this.stuff = stuff;
	}
	
}
