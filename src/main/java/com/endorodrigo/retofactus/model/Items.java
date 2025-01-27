package com.endorodrigo.retofactus.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Items {
    @Id
    private String code_reference = "";
    private String name = "";
    private Integer quantity = Integer.valueOf(0);
    private float discount_rate = 0.0f;
    private float price = 0.0f;
    private String tax_rate = "";
    private Integer unit_measure_id = Integer.valueOf(0);
    private Integer standard_code_id = Integer.valueOf(0);
    private Integer is_excluded = Integer.valueOf(0);
    private Integer tribute_id = Integer.valueOf(0);

    @OneToMany(mappedBy = "items", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Withholding_Taxes> Withholding_Taxes = new ArrayList<>();
}

