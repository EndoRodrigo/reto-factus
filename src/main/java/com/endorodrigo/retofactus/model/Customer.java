package com.endorodrigo.retofactus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;


@Entity
public class Customer {
    @Id
    private Integer identification_document_id = Integer.valueOf(0);
    private String identification = "";
    private String names = "";
    private String address = "";
    private String email = "";
    private String phone = "";
    private String legal_organization_id = "";
    private Integer tribute_id = Integer.valueOf(0);
    private Integer municipality_id = Integer.valueOf(0);

    public Customer() {
    }

    public Customer(Integer identification_document_id, String identification, String names, String address, String email, String legal_organization_id, String phone, Integer tribute_id, Integer municipality_id) {
        this.identification_document_id = identification_document_id;
        this.identification = identification;
        this.names = names;
        this.address = address;
        this.email = email;
        this.legal_organization_id = legal_organization_id;
        this.phone = phone;
        this.tribute_id = tribute_id;
        this.municipality_id = municipality_id;
    }

    public Integer getIdentification_document_id() {
        return identification_document_id;
    }

    public void setIdentification_document_id(Integer identification_document_id) {
        this.identification_document_id = identification_document_id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLegal_organization_id() {
        return legal_organization_id;
    }

    public void setLegal_organization_id(String legal_organization_id) {
        this.legal_organization_id = legal_organization_id;
    }

    public Integer getTribute_id() {
        return tribute_id;
    }

    public void setTribute_id(Integer tribute_id) {
        this.tribute_id = tribute_id;
    }

    public Integer getMunicipality_id() {
        return municipality_id;
    }

    public void setMunicipality_id(Integer municipality_id) {
        this.municipality_id = municipality_id;
    }

    @Override
    public String toString() {
        return ", identification_document_id=" + identification_document_id +
                ", identification='" + identification + '\'' +
                ", names='" + names + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", legal_organization_id='" + legal_organization_id + '\'' +
                ", tribute_id=" + tribute_id +
                ", municipality_id=" + municipality_id;
    }
}
