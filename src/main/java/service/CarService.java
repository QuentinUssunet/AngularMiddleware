package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BdD;
import domain.CarBean;

@Service
public class CarService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CarService.class);
	
	public CarService() {
		
	}
	
	@Autowired
	private BdD dao;
	
	public List<CarBean> getList() {
		CarService.LOGGER.info("dans le service");
		return dao.readAll();
	}

	public String create(String model, Integer power, String color) {
		String result = null;
		
		return result;
	}
	
}
