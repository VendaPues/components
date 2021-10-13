package models;

import dto.ProductDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "products")
public class ProductDocument {

  @Id String id;

  @Indexed(unique = true)
  String productName;

  String description;

  Double price;

  Double salesPrice;

  int stock;

  Double tax;

  String imageUrl;

  Date createdAt;

  public ProductDocument() {}

  public ProductDocument(ProductDto dto) {
    this.productName = dto.getProductName();
    this.description = dto.getDescription();
    this.price = dto.getPrice();
    this.salesPrice = dto.getSalesPrice();
    this.stock = dto.getStock();
    this.tax = dto.getTax();
    this.imageUrl = dto.getImageUrl();
    this.createdAt = new Date();
  }

  public void update(ProductDto dto) {
    this.productName = dto.getProductName();
    this.description = dto.getDescription();
    this.price = dto.getPrice();
    this.salesPrice = dto.getSalesPrice();
    this.stock = dto.getStock();
    this.tax = dto.getTax();
    this.imageUrl = dto.getImageUrl();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getSalesPrice() {
    return salesPrice;
  }

  public void setSalesPrice(Double salesPrice) {
    this.salesPrice = salesPrice;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}
