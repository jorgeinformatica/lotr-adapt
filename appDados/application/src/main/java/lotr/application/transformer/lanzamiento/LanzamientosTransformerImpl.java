package lotr.application.transformer.lanzamiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lotr.apidados.request.Lanzamientos;
import lotr.dto.request.LanzamientosDto;


@Component
public class LanzamientosTransformerImpl implements LanzamientosTransformer {

	/** The mapper. */
	@Autowired
	private LanzamientosMapper mapper;

	/**
	 * To dto.
	 *
	 * @param bean the bean
	 * @return the lanzamientos dto
	 */
	@Override
	public LanzamientosDto toDto(Lanzamientos bean) {
		return mapper.toDto(bean);
	}

}
