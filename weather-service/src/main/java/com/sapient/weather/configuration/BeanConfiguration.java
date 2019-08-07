package com.sapient.weather.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sapient.weather.controller.PrecipitationController;
import com.sapient.weather.controller.TemperatureController;
import com.sapient.weather.data.WeatherDao;
import com.sapient.weather.model.Temperature;
import com.sapient.weather.service.PrecipitationService;
import com.sapient.weather.service.TemperatureService;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sapient.weather")
public class BeanConfiguration {

	@Bean
	public BeanConfiguration beanConfiguration(){
		return new BeanConfiguration();
	}

	@Bean
	public WeatherDao weatherDao(){
		return new WeatherDao();
	}

	@Bean
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public Temperature temperature(){
		return new Temperature();
	}

	@Bean
	public TemperatureService temperatureService(){
		return new TemperatureService();
	}

	@Bean
	public TemperatureController temperatureController(){
		return new TemperatureController();
	}

	@Bean
	public PrecipitationService precipitationService() {
		return new PrecipitationService();
	}

	@Bean
	public PrecipitationController precipitationController() {
		return new PrecipitationController();
	}

}
