package com.sapient.weather.model;

import java.io.Serializable;

public class Temperature implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double maxTemp;
	private Double minTemp;
	private Double avgTemp;
	private String city;

	public Double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(Double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public Double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(Double minTemp) {
		this.minTemp = minTemp;
	}

	public Double getAvgTemp() {
		return avgTemp;
	}

	public void setAvgTemp(Double avgTemp) {
		this.avgTemp = avgTemp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
