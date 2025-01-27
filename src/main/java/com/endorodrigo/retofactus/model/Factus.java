package com.endorodrigo.retofactus.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Factus {
    private int numbering_range_id = 8;
    private String reference_code = "FAC99910001";
    private String observation = "";
    private String payment_method_code = "10";
    private Customer customer;
    private List<Items> items;

}
