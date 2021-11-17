package repositories;

import models.ProductDocument;
import models.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserDocument, String> {

    UserDocument findByEmail(String email);

    List<ProductDocument> findByStockEquals(int stock);
}
