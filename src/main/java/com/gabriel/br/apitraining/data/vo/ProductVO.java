package com.gabriel.br.apitraining.data.vo;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
@JsonPropertyOrder({"Product_Id","Product_Name","Product_Description","Product_Price","Product_Color","Product_Size"})
public class ProductVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Product_Id")
	private long ProductId;
	
	@JsonProperty("Product_Name")
	private String ProductName;
	
	@JsonProperty("Product_Description")
	private String ProductDescription;
	
	@JsonProperty("Product_Price")
	private Double ProductPrice;
	
	@JsonProperty("Product_Color")
	private String ProductColor;
	
	@JsonProperty("Product_Size")
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
