package com.gabriel.br.apitraining.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ProductId;
	
	@Column(name = "product_name",nullable = false,length = 80)
	private String ProductName;
	
	@Column(name= "product_description",nullable = false, length = 350)
	private String ProductDescription;
	
	@Column(name = "product_price", nullable = false)
	private Double ProductPrice;
	
	@Column(name = "product_color",nullable = false, length = 40)
	private String ProductColor;
	
	@Column(name= "product_size",nullable = false, length = 60)
	private String ProductSize;
	
	public Product() {
	}

	public Product(long productId, String productName, String productDescription, Double productPrice,
			String productColor, String productSize) {
		ProductId = productId;
		ProductName = productName;
		ProductDescription = productDescription;
		ProductPrice = productPrice;
		ProductColor = productColor;
		ProductSize = productSize;
	}
	
	public long getProductId() {
		return ProductId;
	}

	public void setProductId(long productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public Double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(Double productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductColor() {
		return ProductColor;
	}

	public void setProductColor(String productColor) {
		ProductColor = productColor;
	}

	public String getProductSize() {
		return ProductSize;
	}

	public void setProductSize(String productSize) {
		ProductSize = productSize;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ProductColor, ProductDescription, ProductId, ProductName, ProductPrice, ProductSize);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(ProductColor, other.ProductColor)
				&& Objects.equals(ProductDescription, other.ProductDescription) && ProductId == other.ProductId
				&& Objects.equals(ProductName, other.ProductName) && Objects.equals(ProductPrice, other.ProductPrice)
				&& Objects.equals(ProductSize, other.ProductSize);
	}
	
}
