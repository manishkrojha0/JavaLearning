package com.learning.DemoHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alien")
public class Alien {
	@Id
	@Column(name = "aid" ,nullable = false)
	private int aid;
	@Column(name = "aname")
	private String aname;
	@Column(name = "color")
	private String color;
	
	public Alien()
	{
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
