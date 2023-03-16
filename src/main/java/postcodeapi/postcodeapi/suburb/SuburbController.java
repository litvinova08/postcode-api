package postcodeapi.postcodeapi.suburb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SuburbController {

	@Autowired
	SuburbService service;

	// get all suburbs
	@GetMapping("/postcodes")
	public ResponseEntity<List<Suburb>> getAll() {
		List<Suburb> allSuburbs = this.service.getAll();
		return ResponseEntity.ok(allSuburbs);
	}

	//get a record by a postcode
//	@GetMapping("/postcodes/postcode={postcode}")
	
	@GetMapping("/postcodes/{postcode}")
	public ResponseEntity<Suburb> getByPostcode(@PathVariable String postcode) {
		Optional<Suburb> maybeSuburb = this.service.findByPostcode(postcode);
		if (maybeSuburb.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.FOUND);
		} else {
			return ResponseEntity.ok(maybeSuburb.get());

		}
	}
	
//	//get a record by a suburb
//	@GetMapping("/postcodes/suburb={suburb}/")
//	public ResponseEntity<Suburb> getBySuburb(@PathVariable String suburb) {
//		Optional<Suburb> maybeSuburb = this.service.findBySuburb(suburb);
//		if (maybeSuburb.isEmpty()) {
//			return new ResponseEntity<>(null, HttpStatus.FOUND);
//		} else {
//			return ResponseEntity.ok(maybeSuburb.get());
//
//		}
//	}
	
}
