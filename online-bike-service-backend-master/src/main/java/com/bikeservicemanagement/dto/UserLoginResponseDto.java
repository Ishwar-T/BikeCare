package com.bikeservicemanagement.dto;

import lombok.Data;

@Data
public class UserLoginResponseDto extends CommonApiResponse {
	
	private UserLoginResponse user;

}
