package com.sapient.weather.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.weather.data.WeatherDao;
import com.sapient.weather.model.Precipitation;
import com.sapient.weather.model.WeatherReport;

@Service
public class PrecipitationService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PrecipitationService.class);

	@Autowired
	WeatherDao weatherDao;

	public Precipitation getCurrentPrecipitation(String city) {
		LOGGER.info("into precipitation service");
		Precipitation precipitation = new Precipitation();
		precipitation.setCity(city);
		WeatherReport report = weatherDao.getWeatherReport(city);
		Integer humidity = report.getMain().getHumidity();
		Integer clouds = report.getClouds().getAll();
		String weather = report.getWeather().get(0).getMain();
		if (clouds > 50 && weather.equals("Haze") && humidity > 60) {
			LOGGER.info("Scenario: High Chances of rain");
			precipitation.setPrecpChance("High Chances of rain");
		} else if (clouds > 40 && weather.equals("Haze") && humidity > 60) {
			LOGGER.info("Moderate Chances of rain");
			precipitation.setPrecpChance("Scenario: Moderate Chances of rain");
		} else if (clouds > 40 && weather.equals("Haze") && humidity > 40) {
			LOGGER.info("Mostly cloudy and humid");
			precipitation.setPrecpChance("Scenario: Mostly cloudy and humid");
		} else if (clouds > 20 && weather.equals("Haze") && humidity > 40) {
			LOGGER.info("Scenario: Partly cloudy");
			precipitation.setPrecpChance("Partly cloudy");
		} else {
			LOGGER.info("Scenario: Sunny");
			precipitation.setPrecpChance("Its a Sunny Day");
		}
		return precipitation;
	}
}
