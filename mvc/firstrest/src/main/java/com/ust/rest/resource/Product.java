package com.ust.rest.resource;

import java.math.BigDecimal;

//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.Setter;

public class Product {
	private long productId;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
//	@Getter @Setter private boolean productId = true;
//	@Setter(AccessLevel.PROTECTED) private String name;
//	@Setter(AccessLevel.PROTECTED) private String description;
//	@Setter @Getter private BigDecimal price;
//	@Setter @Getter private int qty;
//	
}
