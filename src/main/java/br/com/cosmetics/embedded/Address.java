package br.com.cosmetics.embedded;

import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;

@Embeddable
public class Address {

	private String street;
	private Integer number;
	private String district;
	private String city;

	// Pattern to do validation for zip code. The valid pattern is 99999-999.
	@Pattern(regexp = "[0-9]{5}-[0-9]{3}", message = "CEP Invalido!")
	private String zipCode;
	private String state;
	private String pointOfReference;

	public Address() {
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPointOfReference() {
		return pointOfReference;
	}

	public void setPointOfReference(String pointOfReference) {
		this.pointOfReference = pointOfReference;
	}

}
