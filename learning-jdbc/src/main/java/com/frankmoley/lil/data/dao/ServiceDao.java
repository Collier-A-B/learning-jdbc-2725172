package com.frankmoley.lil.data.dao;

import com.frankmoley.lil.data.entity.Service;

import java.sql.SQLException;
import java.util.UUID;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ServiceDao implements Dao<Service, UUID>{
  @Override
  public Service create(Service entity) {
    return null;
  }

  @Override
  public void delete(UUID id) {

  }

  @Override
  public List<Service> getAll() {
    return null;
  }

  @Override
  public Optional<Service> getOne(UUID id) {
    return Optional.empty();
  }

  @Override
  public Service update(Service entity) {
    return null;
  }

  private List<Service> processResultSet(ResultSet rs) throws SQLException {
    List<Service> services = new ArrayList<>();
    while(rs.next()){
      Service service = new Service();
      service.setServiceId((UUID)rs.getObject("service_id"));
      service.setName(rs.getString("name"));
      service.setPrice(rs.getBigDecimal("price"));
      services.add(service);
    }
    return services;
  }
}
