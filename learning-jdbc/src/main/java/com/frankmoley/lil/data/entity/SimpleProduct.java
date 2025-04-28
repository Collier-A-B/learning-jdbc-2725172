package com.frankmoley.lil.data.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class SimpleProduct {
  private UUID productId;
  private String name;
  private BigDecimal price;
  private UUID vendorId;
  private String vendorName;
  private String contact;
  private String phoneNumber;
  private String email;
  private String address;

  public void setProductId(UUID prodId) {
    this.productId = prodId;
  }
  public UUID getProductId() {
    return this.productId;
  }

  public void setProductName(String prodName) {
    this.name = prodName;
  }
  public String getProductName() {
    return this.name;
  }

  public void setPrice(BigDecimal prodPrice) {
    this.price = prodPrice;
  }
  public BigDecimal getPrice() {
    return this.price;
  }

  public void setVendorId(UUID vendId) {
    this.vendorId = vendId;
  }
  public UUID getVendorId() {
    return this.vendorId;
  }

  public void setVendorName(String vendName) {
    this.vendorName = vendName;
  }
  public String getVendorName() {
    return this.vendorName;
  }

  public void setContact(String newContact) {
    this.contact = newContact;
  }
  public String getContact() {
    return this.contact;
  }

  public void setPhoneNumber(String phoneNum) {
    this.phoneNumber = phoneNum;
  }
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setEmail(String newEmail) {
    this.email = newEmail;
  }
  public String getEmail() {
    return this.email;
  }

  public void setAddress(String newAddress) {
    this.address = newAddress;
  }
  public String getAddress() {
    return this.address;
  }

  @Override
  public String toString() {
    return String.format(
"""
SimpleProduct [
                productId=%s,
                name=%s,
                price=%f,
                vendorId=%s,
                vendorName=%s,
                contact=%s,
                phoneNumber=%s,
                email=%s,
                address=%s
              ]        
""", this.productId, this.name, this.price, this.vendorId, this.vendorName, 
     this.contact, this.phoneNumber, this.email, this.address);
  }
}
