package com.nextivis.nishopping.domain.repository;

import com.nextivis.nishopping.domain.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository target;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void create() {
        Product expectProduct = createProductBuilder("testPid");

        target.create(expectProduct);
        Product actualProduct = jdbcTemplate.queryForObject("SELECT * FROM product WHERE id = ?",
                (rs, rowNum) -> new Product(
                        rs.getLong("id"),
                        rs.getString("pid"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getInt("sales_rate"),
                        rs.getString("promotion"),
                        rs.getString("seller"),
                        rs.getString("genre"),
                        rs.getString("image"),
                        rs.getInt("stock"),
                        rs.getInt("score"),
                        rs.getTimestamp("release_date").toLocalDateTime(),
                        rs.getString("translator"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getString("summary"),
                        rs.getString("size"),
                        rs.getFloat("weight")
                ), expectProduct.getId());

        assertThat(actualProduct).isEqualTo(expectProduct);
    }

    public Product createProductBuilder(String pid) {
        return Product.builder()
                .pid(pid)
                .name("testName")
                .price(12345)
                .salesRate(100)
                .promotion("testPromotion")
                .seller("testSeller")
                .genre("testGenere")
                .image("testImage")
                .stock(100)
                .score(123)
                .releaseDate(LocalDateTime.now())
                .translator("testTranslator")
                .author("testAuthor")
                .publisher("testPublisher")
                .summary("testSummary")
                .size("100x100")
                .weight(123f)
                .build();
    }
}
