package com.nextivis.nishopping.domain.service;

import com.nextivis.nishopping.domain.entity.Product;
import com.nextivis.nishopping.domain.repository.ProductRepository;
import com.nextivis.nishopping.domain.service.helper.RandomHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
    @InjectMocks
    ProductService target;
    @Mock
    ProductRepository productRepository;
    @Mock
    RandomHelper randomHelper;

    @Test
    public void createProduct() {
        Product product = createProductEntity(null);
        when(randomHelper.getUUID()).thenReturn("randomUUID");
        when(productRepository.create(product)).thenReturn(1);

        assertThat(target.createProduct(product)).isEqualTo(1);
        verify(randomHelper).getUUID();
        verify(productRepository).create(product);
    }

    @Test
    public void getAllProduct() {
        Product product1 = createProductEntity("testProduct1");
        Product product2 = createProductEntity("testProduct2");
        Product product3 = createProductEntity("testProduct3");

        when(productRepository.findAll()).thenReturn(asList(product1, product2, product3));

        assertThat(target.getAllProduct()).containsExactly(product1, product2, product3);
        verify(productRepository).findAll();
    }

    @Test
    public void getProductByPid() {
        Product product = createProductEntity("testProduct");

        when(productRepository.findByPid(product.getPid())).thenReturn(product);

        assertThat(target.getProductByPid(product.getPid())).isEqualTo(product);
        verify(productRepository).findByPid(product.getPid());
    }

    @Test
    public void getProductByGenre() {
        Product product1 = createProductEntity("testProduct1");
        Product product2 = createProductEntity("testProduct2");
        Product product3 = createProductEntity("testProduct3");

        when(productRepository.findByGenre(product1.getGenre())).thenReturn(asList(product1, product2, product3));

        assertThat(target.getProductByGenre(product1.getGenre())).containsExactly(product1, product2, product3);
        verify(productRepository).findByGenre(product1.getGenre());
    }

    @Test
    public void updateProduct() {
        Product product = createProductEntity("testProduct");

        when(productRepository.updateProduct(product)).thenReturn(1);

        assertThat(target.updateProduct(product)).isEqualTo(1);
        verify(productRepository).updateProduct(product);
    }

    public Product createProductEntity(String pid) {
        return Product.builder()
                .name("testName")
                .price(12345)
                .salesRate(100)
                .promotion("testPromotion")
                .seller("testSeller")
                .genre("testGenre")
                .image("testImage")
                .stock(100)
                .score(123)
                .releaseDate(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .translator("testTranslator")
                .author("testAuthor")
                .publisher("testPublisher")
                .summary("testSummary")
                .size("100x100")
                .weight(7)
                .build();
    }
}
