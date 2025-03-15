package com.example.SpringEcom.Repository;

import com.example.SpringEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    /**
     * Here, the method implements JPQL (Java Persistence Query Language).
     * The difference between normal SQL and JPQL is its approach.
     * JPQL uses class (entity) name instead of DB table name.
     * It uses properties of class instead table column name.
     * It always uses colon (:) in front of variables.
     * @param keyword [String] Based on keyword, search query is executed
     * @return List of products
     */
    @Query("select p from Product p where " +
            "lower(p.name) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.description) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.brand) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.category) like lower(concat('%', :keyword, '%'))")
    List<Product> searchProduct(String keyword);
}
