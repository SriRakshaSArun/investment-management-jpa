package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    @Column(name = "Client_ID",nullable = false)
    private long clientId;

    @Column(name = "Client_FirstName",nullable = false)
    private String firstName;

    @Column(name = "Client_LastName",nullable = false)
    private String lastName;

    @Column(name = "Client_Phone",nullable = false)
    private String phone;

    @Column(name = "Client_Email",nullable = false)
    private String email;

    @Column(name = "FA_Count",nullable = false)
    private String FA_Count;

    @Column(name = "FA_ID",nullable = false)
    private Long advisorId;

    protected Client() {

    }

    public Client(String firstName, String lastName, String phone, String email, String FA_Count, Long advisorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.FA_Count = FA_Count;
        this.advisorId = advisorId;

    }

    public Long getClientId() {
        return clientId;
    }
    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFA_Count() {
        return FA_Count;
    }

    public void setFA_Count(String FA_Count) {
        this.FA_Count = FA_Count;
    }
}


