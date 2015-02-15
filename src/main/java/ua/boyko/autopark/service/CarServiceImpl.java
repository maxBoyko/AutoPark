package ua.boyko.autopark.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.boyko.autopark.dao.ICarDao;
import ua.boyko.autopark.model.Car;

@Service
public class CarServiceImpl implements ICarService {

	@Autowired
    private ICarDao carDao;
 
    @Transactional
    public void addCar(Car car) {
        carDao.addCar(car);
    }
 
    @Transactional
    public List<Car> listCar() {
 
        return carDao.listCar();
    }
 
    @Transactional
    public void removeCar(Integer id) {
        carDao.removeCar(id);
    }
}

