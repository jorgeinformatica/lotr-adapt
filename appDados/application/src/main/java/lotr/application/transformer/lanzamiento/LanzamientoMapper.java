package lotr.application.transformer.lanzamiento;

import java.util.List;

import org.mapstruct.Mapper;

import lotr.apidados.request.Lanzamiento;
import lotr.dto.request.LanzamientoDto;

@Mapper(componentModel = "spring")
public interface LanzamientoMapper {

	/**
	 * To dto.
	 *
	 * @param bean the bean
	 * @return el lanzamiento dto
	 */
	LanzamientoDto toDto(Lanzamiento bean);

	/**
	 * To dtos.
	 *
	 * @param bean the bean
	 * @return la list
	 */
	List<LanzamientoDto> toDtos(List<Lanzamiento> bean);
}
