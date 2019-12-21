package com.nextivis.nishopping.app.controller;

import com.nextivis.nishopping.domain.entity.Product;
import com.nextivis.nishopping.domain.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    ProductController productController;

    @Mock
    ProductService productService;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    public void create() throws Exception {
        when(productService.createProduct(createProductEntity())).thenReturn(1);
        mockMvc.perform(post("/product/create")
                .params(createProductParams()))
                .andExpect(status().isOk());
        verify(productService).createProduct(createProductEntity());
    }

    @Test
    public void update() throws Exception {
        mockMvc.perform(post("/product/update")
                .params(createProductParams()))
                .andExpect(status().isOk());
    }

    @Test
    public void findAll() throws Exception {
        List<Product> lst = new ArrayList<>();
        when(productService.getAllProduct()).thenReturn(lst);
        mockMvc.perform(get("/product/find/all")
                .param("order", "orderType"))
                .andExpect(status().isOk());
        verify(productService).getAllProduct();
    }

    @Test
    public void findByPid() throws Exception {
        String pid = "testPid";

        when(productService.getProductByPid(pid)).thenReturn(createProductEntity());

        mockMvc.perform(get("/product/find")
                .param("pid", pid))
                .andExpect(status().isOk());
        verify(productService).getProductByPid(pid);
    }

    @Test
    public void findByGenre() throws Exception {
        List<Product> lst = new ArrayList<>();
        String genre = "testGenre";
        when(productService.getProductByGenre(genre)).thenReturn(lst);

        mockMvc.perform(get("/product/find")
                .param("genre", genre))
                .andExpect(status().isOk());
        verify(productService).getProductByGenre(genre);
    }

    private MultiValueMap createProductParams() {
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("id", "123");
        multiValueMap.add("pid", "pidTest");
        multiValueMap.add("name", "nameTest");
        multiValueMap.add("price", "123");
        multiValueMap.add("salesRate", "100");
        multiValueMap.add("promotion", "promotionTest");
        multiValueMap.add("seller", "sellerTest");
        multiValueMap.add("genre", "genreTest");
        multiValueMap.add("image", "imageTest");
        multiValueMap.add("stock", "100");
        multiValueMap.add("score", "70");
        multiValueMap.add("translator", "translatorTest");
        multiValueMap.add("author", "authorTest");
        multiValueMap.add("publisher", "publisherTest");
        multiValueMap.add("summary", "summaryTest");
        multiValueMap.add("size", "sizeTest");
        multiValueMap.add("weight", "7");

        return multiValueMap;
    }

    Product createProductEntity() {
        Product product = Product.builder()
                .id(123L)
                .pid("pidTest")
                .name("nameTest")
                .price(123)
                .salesRate(100)
                .promotion("promotionTest")
                .seller("sellerTest")
                .genre("genreTest")
                .image("imageTest")
                .stock(100)
                .score(70)
                .translator("translatorTest")
                .author("authorTest")
                .publisher("publisherTest")
                .summary("summaryTest")
                .size("sizeTest")
                .weight(7)
                .build();

        return product;
    }
}
