package lotr.business.impl;

import java.util.SplittableRandom;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import lotr.business.service.CalcularTiradas;
import lotr.dto.request.LanzamientosDto;
import lotr.dto.response.ResultadoDto;
import lotr.dto.response.ResultadosDto;
import lotr.libreriaenums.enums.Tirada;


/**
 * The Class CalcularTiradasImpl.
 */
@Component
public class CalcularTiradasImpl implements CalcularTiradas {

	/**
	 * Calcular tiradas.
	 *
	 * @param request la request
	 * @return los resultados dto
	 */
	@Override
	public ResultadosDto calcularTiradas(final LanzamientosDto request) {

		return ResultadosDto.builder().propietarioDeResultados(request.getPropietarioDeLanzamientos())
				.listaDeResultado(request.getListaDeLanzamiento().parallelStream()
						.map(lanzamiento -> calcularLanzamiento(lanzamiento.getTipoTirada()))
						.collect(Collectors.toList()))
				.build();
	}

	/**
	 * Calcular lanzamiento.
	 *
	 * @param tirada la tirada
	 * @return el resultado dto
	 */
	private ResultadoDto calcularLanzamiento(final Tirada tirada) {
		int value = calcularValor(tirada.getMinimo(), tirada.getMaximo());
		int tempo = 0;
		if (tirada.isRepeticion() && (value < 6 || value > 95)) {
			tempo = ajusteTirada();
		}
		value = value > 95 ? value + tempo : value - tempo;
		return ResultadoDto.builder().valorResultado(value).build();
	}

	/**
	 * Ajuste tirada.
	 *
	 * @return el valor
	 */
	private int ajusteTirada() {
		int tempo = 0;
		int calculo;
		do {
			calculo = calcularValor(1, 100);
			tempo += calculo;
		} while (calculo > 95);

		return tempo;
	}

	/**
	 * Calcular valor.
	 *
	 * @param minimo el minimo
	 * @param maximo el maximo
	 * @return el valor
	 */
	private int calcularValor(final int minimo, final int maximo) {
		SplittableRandom splittableRandom = new SplittableRandom();
		return splittableRandom.nextInt(minimo, maximo);
	}

}
