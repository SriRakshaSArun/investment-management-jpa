package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    @Column(name = "Portfolio_ID",nullable = false)
    private long portfolioId;

    @Column(name = "Client_ID",nullable = false)
    private Long clientId;

    @Column(name = "Date_Created",nullable = false)
    private String date_Created;

    protected Portfolio() {

    }

    public Portfolio(Long clientId, String date_Created) {
        this.date_Created = date_Created;
        this.clientId = clientId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getDate_Created() {
        return date_Created;
    }

    public void setDate_Created(String date_Created) {
        this.date_Created = date_Created;
    }
}