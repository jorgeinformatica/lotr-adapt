package lotr.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lotr.apidados.request.Lanzamientos;
import com.lotr.apidados.response.Resultados;

import lombok.RequiredArgsConstructor;

import lotr.application.transformer.lanzamiento.LanzamientosTransformer;
import lotr.application.transformer.resultado.ResultadosTransformer;
import lotr.business.service.CalcularTiradas;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class DadosController {

	private final LanzamientosTransformer transformerLanzamientos;
	private final ResultadosTransformer transformerResultados;
	private final CalcularTiradas serviceCalcularTiradas;
	
	@PostMapping(value = "lotr/Lanzamientos")
	public ResponseEntity<Resultados> lanzamientos(@RequestBody Lanzamientos lanzamientos) {
		return new ResponseEntity<>(
				transformerResultados
						.toApi(serviceCalcularTiradas.calcularTiradas(transformerLanzamientos.toDto(lanzamientos))),
				HttpStatus.OK);
	}

}
