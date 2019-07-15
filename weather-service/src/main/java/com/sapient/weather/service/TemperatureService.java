package com.sapient.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.sapient.weather.data.WeatherDao;
import com.sapient.weather.model.Temperature;
import com.sapient.weather.model.WeatherReport;

@Service
public class TemperatureService implements ApplicationContextAware{
	@Autowired 
	WeatherDao weatherDao;
	ApplicationContext context;
	
	public Temperature getCurrentTemperatureinCelcius(String city){
		Temperature temperature  = new Temperature();
		WeatherReport report = weatherDao.getWeatherReport(city);
		Double maxtTemp = report.getMain().getTempMax();
		Double minTemp = report.getMain().getTempMin();
		Double avgTemp = report.getMain().getTemp();
		temperature.setMaxTemp(maxtTemp-273.15);
		temperature.setMinTemp(minTemp-273.15);
		temperature.setAvgTemp(avgTemp-273.15);
		temperature.setCity(city);
		return temperature;
	}
	
	public Temperature getCurrentTemperatureinFarenhiet(String city){
		Temperature temperature  = new Temperature();
		WeatherReport report = weatherDao.getWeatherReport(city);
		Double maxtTemp = report.getMain().getTempMax();
		Double minTemp = report.getMain().getTempMin();
		Double avgTemp = report.getMain().getTemp();
		temperature.setMaxTemp(maxtTemp * 1.8 - 459.67);
		temperature.setMinTemp(minTemp * 1.8 - 459.67);
		temperature.setAvgTemp(avgTemp * 1.8 - 459.67);
		temperature.setCity(city);
		return temperature;
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.context=applicationContext;
	}
}
