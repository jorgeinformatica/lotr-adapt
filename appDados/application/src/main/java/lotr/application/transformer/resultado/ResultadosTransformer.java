package lotr.application.transformer.resultado;

import lotr.apidados.response.Resultados;
import lotr.dto.response.ResultadosDto;

public interface ResultadosTransformer {

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return los resultados
	 */
	Resultados toApi(ResultadosDto dto);
}
