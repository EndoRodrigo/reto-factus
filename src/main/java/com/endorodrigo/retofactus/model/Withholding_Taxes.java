package com.endorodrigo.retofactus.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Withholding_Taxes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String taxName;
    private String taxValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
