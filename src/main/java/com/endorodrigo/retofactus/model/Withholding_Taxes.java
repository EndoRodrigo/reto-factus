package com.endorodrigo.retofactus.model;

public class Withholding_Taxes {
    private String code;
    private String withholdingTaxRate;

    public Withholding_Taxes() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWithholdingTaxRate() {
        return withholdingTaxRate;
    }

    public void setWithholdingTaxRate(String withholdingTaxRate) {
        this.withholdingTaxRate = withholdingTaxRate;
    }
}
