package lotr.application.transformer.lanzamiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lotr.apidados.request.Lanzamiento;
import lotr.dto.request.LanzamientoDto;


@Component
public class LanzamientoTransformerImpl implements LanzamientoTransformer {

	/** The mapper. */
	@Autowired
	private LanzamientoMapper mapper;

	/**
	 * To dto.
	 *
	 * @param bean the bean
	 * @return el lanzamiento dto
	 */
	@Override
	public LanzamientoDto toDto(Lanzamiento bean) {
		return mapper.toDto(bean);
	}

	/**
	 * To dtos.
	 *
	 * @param bean the bean
	 * @return the list
	 */
	@Override
	public List<LanzamientoDto> toDtos(List<Lanzamiento> bean) {
		return mapper.toDtos(bean);
	}

}
