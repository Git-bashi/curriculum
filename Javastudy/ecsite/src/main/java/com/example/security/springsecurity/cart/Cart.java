package com.example.security.springsecurity.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull

public class Cart {

	@Entity
	@Table(name="cart")
	    @Id
	    @Column(name="cart")
	    @NotNull
		@Column
		private String id;

		@NotNull
		@Column
		private String name;

		@NotNull
		@Column
		private Integer price;

		@NotNull
		@Column
		private Integer size;

		@NotNull
		@Column
		private String color;

		@NotNull
		@Column(unique = true)
		private String  username;

		@NotNull
		@Column
		private String  last_name;

		@NotNull
		@Column
		private String  first_name;


	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getId() {
	        return id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }

	    public void setPrice(Integer price) {
	        this.price = price;
	    }

	    public Integer getPrice() {
	        return price;
	    }

	    public void setSize(Integer size) {
	        this.size = size;
	    }

	    public int getSize() {
	        return size;
	    }

	    public void setColor(String Color) {
	        this.color = Color;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setLast_name(String last_name) {
	        this.last_name = last_name;
	    }

	    public String getLast_name() {
	        return last_name;
	    }

	    public void setFirst_name(String first_name) {
	        this.first_name = first_name;
	    }

	    public String getFirst_name() {
	        return first_name;
	    }

	}
