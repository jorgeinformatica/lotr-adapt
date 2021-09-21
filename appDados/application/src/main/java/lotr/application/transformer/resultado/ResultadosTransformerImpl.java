package lotr.application.transformer.resultado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lotr.apidados.response.Resultados;
import lotr.dto.response.ResultadosDto;

@Component
public class ResultadosTransformerImpl implements ResultadosTransformer {

	/** The mapper. */
	@Autowired
	private ResultadosMapper mapper;

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return los resultados
	 */
	@Override
	public Resultados toApi(ResultadosDto dto) {
		return mapper.toApi(dto);
	}

}
