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
    private long pid;
    @NotNull
    private int price;
    private int salesRage;
    private String promotion;
    @NotNull
    private String seller;
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
    private String size;
    private Float weight;
}
