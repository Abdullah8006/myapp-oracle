package com.appster.abdullah.entity.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.appster.abdullah.util.AppConstant;
import com.appster.abdullah.util.AppConstant.AddressType;

@Embeddable
public class Address {

    @Column(name = "street")
    private String street;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "zip")
    private String zip;
    
    @Column(name = "country")
    private String country;
    
    @Enumerated(EnumType.STRING)
    private AppConstant.AddressType addressType;

    public Address() {
        super();
    }

    public Address(String street, String city, String state, String zip, String country, AddressType type) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.addressType = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AppConstant.AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AppConstant.AddressType addressType) {
        this.addressType = addressType;
    }

}
