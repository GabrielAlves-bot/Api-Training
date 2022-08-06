package com.gabriel.br.apitraining.data.vo;

import java.io.Serializable;
import java.util.Objects;

public class ProductVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long ProductId;
	
	private String ProductName;
	
	private String ProductDescription;
	
	private Double ProductPrice;
	
	private String ProductColor;
	
	private String ProductSize;
	
	public ProductVO() {
	}

	public ProductVO(long productId, String productName, String productDescription, Double productPrice,
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
		ProductVO other = (ProductVO) obj;
		return Objects.equals(ProductColor, other.ProductColor)
				&& Objects.equals(ProductDescription, other.ProductDescription) && ProductId == other.ProductId
				&& Objects.equals(ProductName, other.ProductName) && Objects.equals(ProductPrice, other.ProductPrice)
				&& Objects.equals(ProductSize, other.ProductSize);
	}
	
}
