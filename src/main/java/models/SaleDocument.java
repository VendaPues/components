package models;

import dto.ProductSaleDetailsDto;
import dto.SaleDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "sales")
public class SaleDocument {

    @Id
    String id;

    Double amount;

    List<ProductSaleDetailsDto> products;

    Date soldAt;

    public SaleDocument() {
    }

    public SaleDocument(SaleDto saleDto) {
        this.amount = 0.0;
        for (ProductSaleDetailsDto saleItem : saleDto.getSaleData()) {
            this.amount = this.amount + (saleItem.getProductPrice() * saleItem.getQuantity());
        }
        this.soldAt = new Date();
        this.products = saleDto.getSaleData();
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

    public List<ProductSaleDetailsDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductSaleDetailsDto> products) {
        this.products = products;
    }

    public Date getSoldAt() {
        return soldAt;
    }

    public void setSoldAt(Date soldAt) {
        this.soldAt = soldAt;
    }
}
