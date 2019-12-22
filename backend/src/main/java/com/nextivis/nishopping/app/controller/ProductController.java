package com.nextivis.nishopping.app.controller;

import com.nextivis.nishopping.domain.entity.Product;
import com.nextivis.nishopping.domain.service.ProductService;
import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    // need admin role
    @PostMapping("/create")
    public int create(@Valid Product product) {
        return productService.createProduct(product);
    }

    // need admin role
    @PostMapping("/update")
    int update(@Valid Product product) {
        return productService.updateProduct(product);
    }

    @GetMapping(value="/find/all", params = "order")
    public List<Product> findAll(@Param(value = "order") String order) {
        return productService.getAllProduct();
    }

    @GetMapping(value="/find", params="pid")
    public Product findByPid(@Param(value = "pid") String pid) {
        return productService.getProductByPid(pid);
    }

    @GetMapping(value="/find", params="genre")
    List<Product> findByGenre(@Param(value = "genre") String genre) {
        return productService.getProductByGenre(genre);
    }
}
