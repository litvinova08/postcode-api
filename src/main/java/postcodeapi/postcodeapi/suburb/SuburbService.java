package postcodeapi.postcodeapi.suburb;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SuburbService {

	@Autowired
	private SuburbRepository repository;
	
	
	public List<Suburb> getAll() {
		return this.repository.findAll();
	}
	
	public Optional<Suburb> findByPostcode(String postcode) {
		return this.repository.findByPostcode(postcode);
	}
	
	public Optional<Suburb> findBySuburb(String suburb) {
		return this.repository.findBySuburb(suburb);
	}
}
