package postcodeapi.postcodeapi.suburb;

import javax.persistence.Column;

public class SuburbCreateDTO {

	private String postcode;
	
	private String suburb;


	public SuburbCreateDTO(String postcode, String suburb) {
		super();
		this.postcode = postcode;
		this.suburb = suburb;
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
	
	
	
}
