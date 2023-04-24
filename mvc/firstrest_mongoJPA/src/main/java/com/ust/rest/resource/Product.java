
package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data//adds set-get methods,equals methods and constructor
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	
	private String _id;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;}
	