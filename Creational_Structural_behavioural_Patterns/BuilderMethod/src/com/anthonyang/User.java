package com.anthonyang;

public class User {
	
	private String userName; // Required
	private String emailAddress; // Required
	
	private String firstName; // Optional
	private String lastName;  // Optional
	private int phoneNumber; // Optional
	private String address; // Optional
	
	//private constructor -> does not allow client to directly instantiate new object through main/ client code
	private User(Builder builder){	//Builder class
		
		//using builder object's attribute to set User object.
		this.userName = builder.userName;	
		this.emailAddress = builder.emailAddress;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailAddress=" + emailAddress
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}	
	
	
	//inner class -> Builder class
	public static class Builder{ 
		
		//same fields as above
		private String userName; // Required
		private String emailAddress; // Required
		
		private String firstName; // Optional
		private String lastName;  // Optional
		private int phoneNumber; // Optional
		private String address; // Optional
		
		
		//constructor for *required fields to be populated
		public Builder(String userName, String email){
			this.userName = userName;
			this.emailAddress = email;
		}
		
		//other methods to populate other attributes of the Builder object
		public Builder firstName(String value){
			//some validation
			if (value == null || value.length() == 0) {
                throw new IllegalArgumentException("User.Builder.firstName (" + firstName + ") is null or empty.");
            }
			this.firstName = value;
			return this; //returns current object
		}
		
		public Builder lastName(String value){
			//some validation
			if (value == null || value.length() == 0) {
                throw new IllegalArgumentException("User.Builder.lastName (" + lastName + ") is null or empty.");
            }
			this.lastName = value;
			return this;
		}
		
		public Builder phoneNumber(int value){
			this.phoneNumber = value;
			return this;
		}
		
		public Builder address(String value){
			this.address = value;
			return this;
		}
		
		//build method -> invokes User class constructor
		public User build(){
			return new User(this); //passes itself (builder object) to it.
			//return an instance of User.
			//immutable object as there are no setters on user class.
		}
		
	}

	
}
