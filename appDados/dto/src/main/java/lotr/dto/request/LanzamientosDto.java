package lotr.dto.request;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class LanzamientosDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2616811155607114735L;

	/** Propietario de lanzamientos. */
	private String propietarioDeLanzamientos;

	/** Lista de lanzamientos. */
	private List<LanzamientoDto> listaDeLanzamiento;

}
