package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    @Column(name = "Security_ID",nullable = false)
    private long securityId;

    @Column(name = "Portfolio_ID",nullable = false)
    private Long portfolioId;

    @Column(name = "Security_Name",nullable = false)
    private String name;

    @Column(name = "Security_Category",nullable = false)
    private String security_Category;

    @Column(name = "Purchase_Date",nullable = false)
    private String purchase_Date;

    @Column(name = "Purchase_Price",nullable = false)
    private String purchase_Price;

    @Column(name = "Quantity",nullable = false)
    private String quantity;

    protected Security() {

    }

    public Security(Long portfolioId, String name, String security_Category, String purchase_Date, String purchase_Price, String quantity) {
        this.name = name;
        this.security_Category = security_Category;
        this.purchase_Date = purchase_Date;
        this.purchase_Price = purchase_Price;
        this.quantity = quantity;
        this.portfolioId = portfolioId;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecurityCategory() {
        return security_Category;
    }

    public void setSecurityCategory(String security_Category) {
        this.security_Category = security_Category;
    }

    public String getPurchaseDate() {
        return purchase_Date;
    }

    public void setPurchaseDate(String purchase_Date) {
        this.purchase_Date = purchase_Date;
    }

    public String getPurchasePrice() {
        return purchase_Price;
    }

    public void setPurchasePrice(String purchase_Price) {
        this.purchase_Price = purchase_Price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}


