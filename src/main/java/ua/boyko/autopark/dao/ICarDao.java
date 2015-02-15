package ua.boyko.autopark.dao;

import java.util.List;

import ua.boyko.autopark.model.Car;


public interface ICarDao {
		public void addCar(Car car);
		public List<Car> listCar();
		public void removeCar(Integer id);
}
