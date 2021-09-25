package lotr.application.transformer.lanzamiento;

import org.mapstruct.Mapper;

import com.lotr.apidados.request.Lanzamientos;

import lotr.dto.request.LanzamientosDto;


@Mapper(componentModel = "spring", uses = { LanzamientoMapper.class })
public interface LanzamientosMapper {
	
	/**
	 * To dto.
	 *
	 * @param bean the bean
	 * @return el lanzamientos dto
	 */
	LanzamientosDto toDto(Lanzamientos bean);
}
