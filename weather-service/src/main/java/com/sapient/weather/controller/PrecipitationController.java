package com.sapient.weather.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sapient.weather.constants.MappingConstants;
import com.sapient.weather.model.Precipitation;
import com.sapient.weather.service.PrecipitationService;

@Controller
public class PrecipitationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PrecipitationController.class);

	@Autowired
	PrecipitationService precipitationService;

	@RequestMapping(value = MappingConstants.PRECIPITATION_REQUEST, method = RequestMethod.GET)
	@ResponseBody
	public Precipitation getPrecipitation(@PathVariable("city") String city) {
		LOGGER.info("fetching service for precipitation prediction");
		return precipitationService.getCurrentPrecipitation(city);
	}
}
