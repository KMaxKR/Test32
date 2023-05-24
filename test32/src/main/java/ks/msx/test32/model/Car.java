package ks.msx.test32.model;


import jakarta.persistence.*;


@Entity
@Table(name = "cars_database_jpa", schema = "test2")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "car_name", nullable = false)
    private String car_name;
    @Column(name = "car_specification_name", nullable = false)
    private String car_specification_name;
    @Column(name = "car_hp")
    private int car_hp;
    @Column(name = "car_price", nullable = false)
    private double car_price;

    public Car(){}
    public Car(int id, String car_name, String car_specification_name, int car_hp, double car_price) {
        this.id = id;
        this.car_name = car_name;
        this.car_specification_name = car_specification_name;
        this.car_hp = car_hp;
        this.car_price = car_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_specification_name() {
        return car_specification_name;
    }

    public void setCar_specification_name(String car_specification_name) {
        this.car_specification_name = car_specification_name;
    }

    public int getCar_hp() {
        return car_hp;
    }

    public void setCar_hp(int car_hp) {
        this.car_hp = car_hp;
    }

    public double getCar_price() {
        return car_price;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }
}
