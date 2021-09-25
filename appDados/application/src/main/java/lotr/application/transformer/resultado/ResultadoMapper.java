package lotr.application.transformer.resultado;

import java.util.List;

import org.mapstruct.Mapper;

import com.lotr.apidados.response.Resultado;

import lotr.dto.response.ResultadoDto;

@Mapper(componentModel = "spring")
public interface ResultadoMapper {

	/**
	 * To api.
	 *
	 * @param dto the dto
	 * @return el resultado
	 */
	Resultado toApi(ResultadoDto dto);

	/**
	 * To apis.
	 *
	 * @param dto the dto
	 * @return the list
	 */
	List<Resultado> toApis(List<ResultadoDto> dto);
}
