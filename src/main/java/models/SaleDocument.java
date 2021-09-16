package models;

import dto.SaleDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class SaleDocument {

    @Id
    String id;

    Double amount;

    List<String> products;

    Date soldAt;

    public SaleDocument() {
    }

    public SaleDocument(SaleDto saleDto) {
        this.amount = saleDto.getAmount();
        this.products = saleDto.getProducts();
        this.soldAt = new Date();
    }

    public void update(SaleDto saleDto) {
        this.amount = saleDto.getAmount();
        this.products = saleDto.getProducts();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public Date getSoldAt() {
        return soldAt;
    }

    public void setSoldAt(Date soldAt) {
        this.soldAt = soldAt;
    }
}
