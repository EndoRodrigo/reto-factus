package com.endorodrigo.retofactus.model;

import java.util.List;

public class Product {
    private String codeReference;
    private String name;
    private int quantity;
    private double discount;
    private double discountRate;
    private double price;
    private String taxRate;
    private int unitMeasureId;
    private int standardCodeId;
    private int isExcluded;
    private int tributeId;
    private List<String> withholding_taxes;

    public Product(String codeReference, String name, int quantity, double discount, double discountRate, double price, String taxRate, int unitMeasureId, int standardCodeId, int isExcluded, int tributeId, List<String> withholdingTaxes) {
        this.codeReference = codeReference;
        this.name = name;
        this.quantity = quantity;
        this.discount = discount;
        this.discountRate = discountRate;
        this.price = price;
        this.taxRate = taxRate;
        this.unitMeasureId = unitMeasureId;
        this.standardCodeId = standardCodeId;
        this.isExcluded = isExcluded;
        this.tributeId = tributeId;
        this.withholding_taxes = withholdingTaxes;
    }

    public Product() {
    }

    public String getCodeReference() {
        return codeReference;
    }

    public void setCodeReference(String codeReference) {
        this.codeReference = codeReference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public int getUnitMeasureId() {
        return unitMeasureId;
    }

    public void setUnitMeasureId(int unitMeasureId) {
        this.unitMeasureId = unitMeasureId;
    }

    public int getStandardCodeId() {
        return standardCodeId;
    }

    public void setStandardCodeId(int standardCodeId) {
        this.standardCodeId = standardCodeId;
    }

    public int getIsExcluded() {
        return isExcluded;
    }

    public void setIsExcluded(int isExcluded) {
        this.isExcluded = isExcluded;
    }

    public int getTributeId() {
        return tributeId;
    }

    public void setTributeId(int tributeId) {
        this.tributeId = tributeId;
    }

    public List<String> getWithholding_taxes() {
        return withholding_taxes;
    }

    public void setWithholding_taxes(List<String> withholding_taxes) {
        this.withholding_taxes = withholding_taxes;
    }
}
