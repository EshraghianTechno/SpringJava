package com.anisa.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "product")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "t_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private BigDecimal price;
}
