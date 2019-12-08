package com.nextivis.nishopping.app.controller;

import com.nextivis.nishopping.domain.entity.Product;
import com.nextivis.nishopping.domain.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    // need admin role
    @PostMapping("/create")
    public int create(Product product) {
        return productService.createProduct(product);
    }

    // need admin role
    @PostMapping("/update")
    int update(@RequestParam Product product) {
        return productService.updateProduct(product);
    }

    @GetMapping(value="/find/all", params="order")
    public List<Product> findAll(@PathVariable String order) {
        return productService.getAllProduct();
    }

    @GetMapping(value="/find", params="pid")
    public Product findByPid(@PathVariable long pid) {
        return productService.getProductByPid(pid);
    }

    @GetMapping(value="/find", params="genre")
    List<Product> findByGenre(@PathVariable String genre) {
        return productService.getProductByGenre(genre);
    }
}
