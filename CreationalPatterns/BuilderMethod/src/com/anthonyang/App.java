package com.anthonyang;

public class App {
	public static void main(String args[]){
		
		User websiteUser = new User
					.Builder("antAng", "antAng@gmail.com")
					.firstName("ant")
					.lastName("ang")
					.phoneNumber(12345678)
					.address("any address")
					.build();

		System.out.println(websiteUser);
	}
}