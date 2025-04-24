package com.frankmoley.lil.data.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class Service {
  private UUID serviceId;
  private String name;
  private BigDecimal price;

  public UUID getServiceId() {
    return this.serviceId;
  }

  public void setServiceId(UUID serviceId) {
    this.serviceId = serviceId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Service [serviceId=" + this.serviceId + ", name=" + this.name + ", price=" + this.price + "]";
  }
}
