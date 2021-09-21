package lotr.application.transformer.resultado;

import java.util.List;

import lotr.apidados.response.Resultado;
import lotr.dto.response.ResultadoDto;


public interface ResultadoTransformer {

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return el resultado
	 */
	Resultado toApi(ResultadoDto dto);

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return the list
	 */
	List<Resultado> toApi(List<ResultadoDto> dto);
}
