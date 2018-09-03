package dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import domain.CarBean;

@Component
public class BdD {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BdD.class);

	public BdD() {
		
	}
	
	CarBean car1 = new CarBean("porshe",250,"black");
	CarBean car2 = new CarBean("peugeot",100,"red");
	CarBean car3 = new CarBean("seat",160,"blue");
	CarBean car4 = new CarBean("renault",200,"grey");

	public List<CarBean> readAll() {
		List<CarBean> list = new ArrayList<CarBean>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		BdD.LOGGER.info("dans la dao, on a la liste :" + list);
		return list;
	}

	public String add(CarBean car) {
		String result = null;
		// if(création OK){result = "success"}else{result="echec"}
		BdD.LOGGER.info("La nouvelle voiture est arrivée jusqu'en base de données !! " + car.toString());
		return result;		
	}
	
}
