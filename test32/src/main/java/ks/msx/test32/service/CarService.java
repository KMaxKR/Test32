package ks.msx.test32.service;

import ks.msx.test32.model.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);
    List<Car> getCars();
    Car updateCar(Car car, Integer id);
    void deleteCar(Integer Car_Id);
}
