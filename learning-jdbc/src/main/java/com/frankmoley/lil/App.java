package com.frankmoley.lil;

import java.util.List;

import com.frankmoley.lil.data.dao.ServiceDao;
import com.frankmoley.lil.data.entity.Service;

public class App {
    public static void main(String[] args) {
        ServiceDao serviceDao = new ServiceDao();
        List<Service> services = serviceDao.getAll();
        System.out.println("**** Services ****");
        System.out.println("\n*** GET_ALL ***");
        services.forEach(System.out::println);
    }
}
