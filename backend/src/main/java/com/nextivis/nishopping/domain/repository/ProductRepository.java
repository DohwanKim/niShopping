package com.nextivis.nishopping.domain.repository;

import com.nextivis.nishopping.domain.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductRepository {
    int create(Product product);

    Product findByPid(String pid);

    List<Product> findByGenre(String genre);

    List<Product> findAll();

    int updateProduct(Product product);
}
