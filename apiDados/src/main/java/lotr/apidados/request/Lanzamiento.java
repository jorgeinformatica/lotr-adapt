package lotr.apidados.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lotr.libreriaenums.enums.Tirada;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lanzamiento implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2705976491685064298L;

	/** El tipo tirada. */
	private Tirada tipoTirada;
}
