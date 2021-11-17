package repositories;

import models.SaleDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface SaleRepository extends MongoRepository<SaleDocument, String> {

    List<SaleDocument> findBySoldAtBetween(Date initDate, Date endDate);
}
