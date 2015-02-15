package ua.boyko.autopark.service;

import java.util.List;
import ua.boyko.autopark.model.Car;

public interface ICarService {
	public void addCar(Car car);
	public List<Car> listCar();
	public void removeCar(Integer id);
}



