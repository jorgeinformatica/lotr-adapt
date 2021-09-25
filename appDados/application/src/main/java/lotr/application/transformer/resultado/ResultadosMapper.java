package lotr.application.transformer.resultado;

import org.mapstruct.Mapper;

import com.lotr.apidados.response.Resultados;

import lotr.dto.response.ResultadosDto;

@Mapper(componentModel = "spring", uses = { ResultadoMapper.class })
public interface ResultadosMapper {

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return los resultados
	 */
	Resultados toApi(ResultadosDto dto);
}
