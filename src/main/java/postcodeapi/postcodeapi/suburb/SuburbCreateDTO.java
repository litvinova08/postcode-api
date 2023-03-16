package postcodeapi.postcodeapi.suburb;

import javax.persistence.Column;

public class SuburbCreateDTO {

	private String postcode;

	private String suburb;

	private String stateName;

	private String stateCode;

	private String latitude;

	private String longitude;

	private String accuracy;

	public SuburbCreateDTO() {
	}

	public SuburbCreateDTO(String postcode, String suburb, String stateName, String stateCode, String latitude,
			String longitude, String accuracy) {
		super();
		this.postcode = postcode;
		this.suburb = suburb;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

}
