package com.nextivis.nishopping.domain.service;

import com.nextivis.nishopping.domain.entity.Product;
import com.nextivis.nishopping.domain.repository.ProductRepository;
import com.nextivis.nishopping.domain.service.helper.RandomHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final RandomHelper randomHelper;

    public int createProduct(Product product) {
        String newPid = randomHelper.getUUID();
        LocalDateTime releaseDate = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        // TODO : duplicatePID check
        product.setPid(newPid);
        product.setReleaseDate(releaseDate);
        return productRepository.create(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getProductByPid(String pid) {
        return productRepository.findByPid(pid);
    }

    public List<Product> getProductByGenre(String genre) {
        return productRepository.findByGenre(genre);
    }

    public int updateProduct(Product product) {
        return productRepository.updateProduct(product);
    }
}
