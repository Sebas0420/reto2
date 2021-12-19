
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Vegetarian;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceVegetarian;

/**
 *
 * @author jandr
 */
@Repository
public class VegetarianRepositorio {
    @Autowired
    private InterfaceVegetarian repository;

    public List<Vegetarian> getAll() {
        return repository.findAll();
    }

    public Optional<Vegetarian> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Vegetarian create(Vegetarian clothe) {
        return repository.save(clothe);
    }

    public void update(Vegetarian clothe) {
        repository.save(clothe);
    }
    
    public void delete(Vegetarian clothe) {
        repository.delete(clothe);
    }
}
