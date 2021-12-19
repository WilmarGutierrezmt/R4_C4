/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuatroa.retodos.repository.crud;

import com.cuatroa.retodos.model.CleaningProduct;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CleaningProductCrudRepository extends MongoRepository<CleaningProduct, Integer> {
    public List<CleaningProduct> findByPriceLessThanEqual(double precio);

    public List<CleaningProduct> findByCategory(String categoria);

    @Query("{'name':{'$regex':'?0','$options':'i'}}")
    public List<CleaningProduct> findByNameLike(String name);
}
