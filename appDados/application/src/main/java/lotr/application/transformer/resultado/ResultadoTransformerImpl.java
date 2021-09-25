package lotr.application.transformer.resultado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lotr.apidados.response.Resultado;

import lotr.dto.response.ResultadoDto;

@Component
public class ResultadoTransformerImpl implements ResultadoTransformer {

	/** The mapper. */
	@Autowired
	private ResultadoMapper mapper;

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return el resultado
	 */
	@Override
	public Resultado toApi(ResultadoDto dto) {
		return mapper.toApi(dto);
	}

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return the list
	 */
	@Override
	public List<Resultado> toApi(List<ResultadoDto> dto) {
		return mapper.toApis(dto);
	}

}
