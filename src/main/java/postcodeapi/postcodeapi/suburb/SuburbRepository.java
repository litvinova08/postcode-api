package postcodeapi.postcodeapi.suburb;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuburbRepository extends JpaRepository<Suburb, Long> {

	Optional<Suburb> findByPostcode(String postcode);
	
	Optional<Suburb> findBySuburb(String suburb);
	
}
