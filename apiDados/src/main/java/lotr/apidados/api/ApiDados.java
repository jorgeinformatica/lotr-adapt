package lotr.apidados.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lotr.apidados.request.Lanzamientos;
import lotr.apidados.response.Resultados;

/**
 * The Interface ApiDados.
 */
public interface ApiDados {

	/**
	 * Lanzamientos.
	 *
	 * @param tiradas de dados
	 * @return los resultados de los lanzamientos
	 */
	@PostMapping(value="/Lanzamientos", consumes = "application/json", produces = "application/json")
	ResponseEntity<Resultados> lanzamientos(@RequestBody Lanzamientos lanzamientos);
}
