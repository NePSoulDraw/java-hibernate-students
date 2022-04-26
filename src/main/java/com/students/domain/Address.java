
package com.students.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Address implements Serializable{
    
    private static final long SERIAL_VERSION_UID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    
    @Column(name = "street")
    private String street;
    
    @Column(name = "street_number")
    private int streetNumber;
    
    @Column(name = "country")
    private String country;
    
    public Address(){
        
    }

    public Address(Integer addressId) {
        this.addressId = addressId;
    }

    public Address(String street, int streetNumber, String country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    public Address(Integer addressId, String street, int streetNumber, String country) {
        this.addressId = addressId;
        this.street = street;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "addressId=" + addressId + ", street=" + street + ", streetNumber=" + streetNumber + ", country=" + country + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.addressId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.addressId, other.addressId)) {
            return false;
        }
        return true;
    }
    
}
