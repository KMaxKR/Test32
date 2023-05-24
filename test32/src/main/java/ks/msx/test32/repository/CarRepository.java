package ks.msx.test32.repository;

import ks.msx.test32.model.Car;
import org.hibernate.jpa.spi.JpaCompliance;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Integer> {
}
