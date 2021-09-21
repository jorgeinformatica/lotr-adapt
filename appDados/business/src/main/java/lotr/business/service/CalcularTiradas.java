package lotr.business.service;

import lotr.dto.request.LanzamientosDto;
import lotr.dto.response.ResultadosDto;

public interface CalcularTiradas {
	
	/**
	 * Calcular tiradas.
	 *
	 * @param request the request
	 * @return los resultados dto
	 */
	ResultadosDto calcularTiradas(LanzamientosDto request);
}
