package models;

import dto.SaleDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;

@Document(collection = "sales")
public class SaleDocument {

  @Id String id;

  Double amount;

  HashMap<String, Integer> products;

  Date soldAt;

  public SaleDocument() {}

  public SaleDocument(SaleDto saleDto) {
    this.amount = saleDto.getAmount();
    this.products = saleDto.getProducts();
    this.soldAt = new Date();
  }

  public void update(SaleDto saleDto) {
    this.amount = saleDto.getAmount();
    this.products = saleDto.getProducts();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public HashMap<String, Integer> getProducts() {
    return products;
  }

  public void setProducts(HashMap<String, Integer> products) {
    this.products = products;
  }

  public Date getSoldAt() {
    return soldAt;
  }

  public void setSoldAt(Date soldAt) {
    this.soldAt = soldAt;
  }
}
