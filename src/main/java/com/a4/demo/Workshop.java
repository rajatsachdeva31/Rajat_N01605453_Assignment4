package com.a4.demo;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "workshop_registrations")
public class Workshop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "First name is required")
	private String firstName;

	@NotBlank(message = "Last name is required")
	private String lastName;
	
	@NotBlank(message = "Company Name is required")
	private String companyInstitution;

	@NotBlank(message = "Address is required")
	private String address;

	@NotBlank(message = "City is required")
	private String city;

	@NotBlank(message = "State is required")
	private String state;

	@NotBlank(message = "Country is required")
	private String country;

	@Email(message = "Invalid email format")
	@NotBlank(message = "Email is required")
	private String email;

	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
	private String phoneNumber;

	@NotBlank(message = "Meal preference is required")
	private String mealPreference;

	private String paymentMode;
	private String chequeNumber;
	private String bankName;
	private String payableAt;

	public Workshop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Workshop(Long id, @NotBlank(message = "First name is required") String firstName,
			@NotBlank(message = "Last name is required") String lastName, @NotBlank(message = "Company Name is required")String companyInstitution,
			@NotBlank(message = "Address is required") String address,
			@NotBlank(message = "City is required") String city, @NotBlank(message = "State is required") String state,
			@NotBlank(message = "Country is required") String country,
			@Email(message = "Invalid email format") @NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Phone number is required") @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits") String phoneNumber,
			@NotBlank(message = "Meal preference is required") String mealPreference, String paymentMode,
			String chequeNumber, String bankName, String payableAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyInstitution = companyInstitution;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.mealPreference = mealPreference;
		this.paymentMode = paymentMode;
		this.chequeNumber = chequeNumber;
		this.bankName = bankName;
		this.payableAt = payableAt;
	}



	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyInstitution() {
		return companyInstitution;
	}

	public void setCompanyInstitution(String companyInstitution) {
		this.companyInstitution = companyInstitution;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMealPreference() {
		return mealPreference;
	}

	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPayableAt() {
		return payableAt;
	}

	public void setPayableAt(String payableAt) {
		this.payableAt = payableAt;
	}

}
