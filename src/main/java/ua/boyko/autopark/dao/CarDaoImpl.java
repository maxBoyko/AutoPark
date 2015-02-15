package ua.boyko.autopark.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.boyko.autopark.model.Car;

@Repository
public class CarDaoImpl implements ICarDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addCar(Car car) {
		sessionFactory.getCurrentSession().save(car);
	}

	@SuppressWarnings("unchecked")
	public List<Car> listCar() {

		return sessionFactory.getCurrentSession().createQuery("from Car")
				.list();
	}

	public void removeCar(Integer id) {
		Car car = (Car) sessionFactory.getCurrentSession().load(Car.class, id);
		if (null != car) {
			sessionFactory.getCurrentSession().delete(car);
		}

	}

}

