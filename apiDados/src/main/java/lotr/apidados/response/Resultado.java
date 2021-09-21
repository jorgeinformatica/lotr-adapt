package lotr.apidados.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Resultado implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4314204831536678717L;

	/** El resultado. */
	private int valorResultado;
}
