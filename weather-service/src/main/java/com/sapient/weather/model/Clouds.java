package com.sapient.weather.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "all" })
public class Clouds {

	@JsonProperty("all")
	private Integer all;

	@JsonProperty("all")
	public Integer getAll() {
		return all;
	}

	@JsonProperty("all")
	public void setAll(Integer all) {
		this.all = all;
	}

}