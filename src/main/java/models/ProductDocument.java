package models;

import dto.ProductDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class ProductDocument {

    @Id
    String id;

    @Indexed(unique = true)
    String productName;

    String description;

    Double price;

    Double salesPrice;

    int stock;

    Date createdAt;

    public ProductDocument() {
    }

    public ProductDocument(ProductDto dto) {
        this.productName = dto.getProductName();
        this.description = dto.getDescription();
        this.price = dto.getPrice();
        this.salesPrice = dto.getSalesPrice();
        this.stock = dto.getStock();
        this.createdAt = new Date();
    }

    public void update(ProductDto dto) {
        this.productName = dto.getProductName();
        this.description = dto.getDescription();
        this.price = dto.getPrice();
        this.salesPrice = dto.getSalesPrice();
        this.stock = dto.getStock();
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }
}

