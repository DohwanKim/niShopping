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
import java.time.temporal.ChronoUnit;

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
        Product expectProduct = createProductEntity("testPid");
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
                        rs.getInt("weight")
                ), expectProduct.getId());
        assertThat(actualProduct).isEqualTo(expectProduct);
    }

    @Test
    public void findByPid() {
        Product expectProduct = createProductEntity("testPid");
        target.create(expectProduct);
        expectProduct.setReleaseDate(expectProduct.getReleaseDate().minusHours(9));

        assertThat(target.findByPid(expectProduct.getPid())).isEqualTo(expectProduct);
    }

    @Test
    public void findByGenre() {
        String sameGenre = "sameGenre";
        Product expectProduct1 = createProductEntity("testPid1");
        Product expectProduct2 = createProductEntity("testPid2");
        Product expectProduct3 = createProductEntity("testPid3");

        expectProduct1.setGenre(sameGenre);
        expectProduct3.setGenre(sameGenre);

        target.create(expectProduct1);
        target.create(expectProduct2);
        target.create(expectProduct3);

        expectProduct1.setReleaseDate(expectProduct1.getReleaseDate().minusHours(9));
        expectProduct2.setReleaseDate(expectProduct2.getReleaseDate().minusHours(9));
        expectProduct3.setReleaseDate(expectProduct3.getReleaseDate().minusHours(9));

        assertThat(target.findByGenre(sameGenre)).containsExactly(expectProduct1, expectProduct3);
    }

    @Test
    public void findAll() {
        Product expectProduct1 = createProductEntity("testPid1");
        Product expectProduct2 = createProductEntity("testPid2");
        Product expectProduct3 = createProductEntity("testPid3");

        target.create(expectProduct1);
        target.create(expectProduct2);
        target.create(expectProduct3);

        expectProduct1.setReleaseDate(expectProduct1.getReleaseDate().minusHours(9));
        expectProduct2.setReleaseDate(expectProduct2.getReleaseDate().minusHours(9));
        expectProduct3.setReleaseDate(expectProduct3.getReleaseDate().minusHours(9));

        assertThat(target.findAll()).containsExactly(expectProduct1, expectProduct2, expectProduct3);

    }

    @Test
    public void updateProduct() {
        Product expectProduct = createProductEntity("testPid");
        target.create(expectProduct);
        expectProduct.setName("updateName");
        expectProduct.setAuthor("updateAuthor");
        target.updateProduct(expectProduct);

        expectProduct.setReleaseDate(expectProduct.getReleaseDate().minusHours(9));

        assertThat(target.findByPid(expectProduct.getPid())).isEqualTo(expectProduct);
    }

    public Product createProductEntity(String pid) {
        return Product.builder()
                .pid(pid)
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
