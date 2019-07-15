package com.sapient.weather.data;

import org.springframework.web.client.RestTemplate;

import com.sapient.weather.model.WeatherReport;

public class WeatherDao {
	
	public final String SERVER_URI = "https://api.openweathermap.org/data/2.5/weather?";
	public final String API_KEY = "appid=cbff621888cc550c7bf755fd30cc3be9";
	
	public WeatherReport getWeatherReport(String city){
		RestTemplate client = new RestTemplate();
		String requestUri = SERVER_URI + "q=" + city + "&" + API_KEY;
		return client.getForObject(requestUri, WeatherReport.class);		
	}
}
