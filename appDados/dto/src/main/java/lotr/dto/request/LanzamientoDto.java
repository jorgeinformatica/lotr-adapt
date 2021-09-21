package lotr.dto.request;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lotr.libreriaenums.enums.Tirada;

@Getter
@Setter
@Builder
@ToString
public class LanzamientoDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2705976491685064298L;

	/** El tipo tirada. */
	private Tirada tipoTirada;
}
