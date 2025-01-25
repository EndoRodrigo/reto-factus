package com.endorodrigo.retofactus.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer product_id;
    private String code_reference;
    private String name;
    private Integer quantity;
    private float discount_rate;
    private float price;
    private String tax_rate;
    private Integer unit_measure_id;
    private Integer standard_code_id;
    private Integer is_excluded;
    private Integer tribute_id;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Withholding_Taxes> Withholding_Taxes = new ArrayList<>();
}

