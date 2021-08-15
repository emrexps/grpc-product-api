package com.emreeker.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@NamedQuery(name = "Products.findAll", query = "SELECT p FROM ProductEntity p")
public class ProductEntity {

	@Id
	private Integer idnum;
	private String productName;
	private String description;
	private Integer price;
	
	public Integer getIdnum() {
		return idnum;
	}

	public void setIdnum(Integer idnum) {
		this.idnum = idnum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


}
