package com.nareshit.saurabh.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private Integer userId;
	private String userName;
	private String userRole;
	private String userDept;
	
}
