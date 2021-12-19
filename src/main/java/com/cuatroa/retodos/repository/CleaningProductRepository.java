package com.cuatroa.retodos.repository;

import com.cuatroa.retodos.model.CleaningProduct;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retodos.repository.crud.CleaningProductCrudRepository;

@Repository
public class CleaningProductRepository {
    @Autowired
    private CleaningProductCrudRepository gatgetCrudRepository;

    public List< CleaningProduct> getAll() {
        return gatgetCrudRepository.findAll();
    }

    public Optional<CleaningProduct> getGadget(int productId) {
        return gatgetCrudRepository.findById(productId);
    }
    
    public CleaningProduct create(CleaningProduct gadget) {
        return gatgetCrudRepository.save(gadget);
    }

    public void update(CleaningProduct product) {
        gatgetCrudRepository.save(product);
    }
    
    public void delete(CleaningProduct product) {
        gatgetCrudRepository.delete(product);
    }  
    
    public List<CleaningProduct> gadgetsByPrice(double precio){
        return gatgetCrudRepository.findByPriceLessThanEqual(precio);
    }
    
    public List<CleaningProduct> gadgetsByCategory(String categoria){
        return gatgetCrudRepository.findByCategory(categoria);
    }
    
    public List<CleaningProduct> gadgetsByName(String nombre){
        return gatgetCrudRepository.findByNameLike(nombre);
    }
}
