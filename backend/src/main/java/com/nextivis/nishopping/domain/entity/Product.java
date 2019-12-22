package com.nextivis.nishopping.domain.entity;

import lombok.*;

import javax.validation.constraints.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Long id;
    @NotNull
    private String pid;
    @NotNull
    private String name;
    @NotNull
    private int price;
    private int salesRate;
    private String promotion;
    @NotNull
    private String seller;
    @NotNull
    private String genre;
    private String image;
    @NotNull
    private int stock;
    @Size(min = 0, max = 100)
    private Integer score;
    @NotNull
    private LocalDateTime releaseDate;
    private String translator;
    @NotNull
    private String author;
    @NotNull
    private String publisher;
    private String summary;
    private String size;
    private int weight;
}
