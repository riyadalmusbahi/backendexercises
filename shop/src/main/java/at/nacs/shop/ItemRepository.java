package at.nacs.shop;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends MongoRepository<Item, String> {

    Optional<Item> findOneByName(String name);

    List<Item> findByType(String electronics);

    List<Item> findByNameAndPrice(String sofa, double price);

    List<Item> findByPriceLessThan(double price);

    List<Item> findByPriceBetween(double price1, double price2);

    List<Item> findByOrderByPriceAsc();
}

