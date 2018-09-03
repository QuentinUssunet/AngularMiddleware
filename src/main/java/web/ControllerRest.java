package web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import domain.CarBean;
import service.CarService;

@RestController
//@RequestMapping("")
@CrossOrigin(origins="*")
public class ControllerRest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerRest.class);
	
	@Autowired
	private CarService service;
	
	@RequestMapping("")
	@ResponseBody
	private List<CarBean> loadList(){
		ControllerRest.LOGGER.info("Dans le WebService !");
		return service.getList();
	}
	
	@PostMapping("")
	private String addCar(@RequestParam String model, @RequestParam Integer power, @RequestParam String color) {
		ControllerRest.LOGGER.info("on ajoute une voiture !!! ------------");
		this.service.create(model,power,color);
		return "DONE";
	}

}
