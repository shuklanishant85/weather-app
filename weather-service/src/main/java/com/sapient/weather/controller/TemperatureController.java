package com.sapient.weather.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sapient.weather.constants.MappingConstants;
import com.sapient.weather.model.Temperature;
import com.sapient.weather.service.TemperatureService;

@Controller
public class TemperatureController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TemperatureController.class);

	@Autowired
	TemperatureService temperatureService;
	
	@RequestMapping(value=MappingConstants.TEMPEARTURE_REQUEST, method=RequestMethod.GET)
	@ResponseBody
	public Temperature getTemperature(@PathVariable("unit") String unit , @PathVariable("city") String city){
		if (StringUtils.equals(unit, "C")) {
			LOGGER.info("feching service for temperature in Celcius");
			return temperatureService.getCurrentTemperatureinCelcius(city);
		} else if(StringUtils.equals(unit, "F")){
			LOGGER.info("feching service for temperature in Farenhiet");
			return temperatureService.getCurrentTemperatureinFarenhiet(city);
		}
		return null;
	}
	
	
}
