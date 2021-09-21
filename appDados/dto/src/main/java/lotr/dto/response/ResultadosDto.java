package lotr.dto.response;

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
public class ResultadosDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5443267287703047129L;

	/** Propietario de resultados. */
	private String propietarioDeResultados;

	/** Lista de resultados. */
	private List<ResultadoDto> listaDeResultado;
}
