package ks.msx.test32.service.impl;

import ks.msx.test32.model.Car;
import ks.msx.test32.repository.CarRepository;
import ks.msx.test32.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list = carRepository.findAll();
        return list;
    }

    @Override
    public Car updateCar(Car car, Integer id) {
        return carRepository.save(updateCar(car, id));
    }

    @Override
    public void deleteCar(Integer Car_Id) {
        carRepository.deleteById(Car_Id);
    }
}
