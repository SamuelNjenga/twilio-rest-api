package com.sam.demo;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class SmsRequest {
	@NotBlank
	private final String phoneNumber; //The destination
	@NotBlank
	private final String message;
	public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber, 
			@JsonProperty("message") String message) {
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

}
