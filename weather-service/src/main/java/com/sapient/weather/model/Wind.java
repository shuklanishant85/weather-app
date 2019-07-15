package com.sapient.weather.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "speed", "deg" })
public class Wind {

	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("deg")
	private Integer deg;

	@JsonProperty("speed")
	public Double getSpeed() {
		return speed;
	}

	@JsonProperty("speed")
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@JsonProperty("deg")
	public Integer getDeg() {
		return deg;
	}

	@JsonProperty("deg")
	public void setDeg(Integer deg) {
		this.deg = deg;
	}

}