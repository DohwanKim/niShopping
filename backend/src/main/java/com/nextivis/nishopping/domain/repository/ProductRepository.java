package com.nextivis.nishopping.domain.repository;

import com.nextivis.nishopping.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface ProductRepository {
    int create(Product product);
    List<Product> findAll();
    Product findByPid(long pid);
    List<Product> findByGenre(String genre);
    int updateProduct(Product product, LocalDateTime lastLoggedIn);
}
