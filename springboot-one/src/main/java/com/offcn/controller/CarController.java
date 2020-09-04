package com.offcn.controller;

import com.offcn.pojo.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {
    private List<Car>carList=new ArrayList();
    @RequestMapping("/car")
    public List<Car> getCarList(@RequestBody Car car){

            carList.add(car);

        return carList;
    }
    @RequestMapping("/car1")
    public List<Car> getCarList1(Car car){

        carList.add(car);

        return carList;
    }
}
