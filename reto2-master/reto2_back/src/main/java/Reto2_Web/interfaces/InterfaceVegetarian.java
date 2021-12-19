
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jandr
 */
public interface InterfaceVegetarian extends MongoRepository<Vegetarian, String> {
    
}
