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
		this.repository.findByPostcode(postcode);
	}
	
}
