package lotr.dto.response;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ResultadoDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4314204831536678717L;

	/** El resultado. */
	private int valorResultado;
}
