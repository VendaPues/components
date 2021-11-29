package dto;

import java.util.List;

public class SaleDto {

    List<ProductSaleDetailsDto> saleData;

    public List<ProductSaleDetailsDto> getSaleData() {
        return saleData;
    }

    public void setSaleData(List<ProductSaleDetailsDto> saleData) {
        this.saleData = saleData;
    }
}
