package dto;

import java.util.HashMap;

public class SaleDto {

  Double amount;

  HashMap<String, Integer> products;

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
}
