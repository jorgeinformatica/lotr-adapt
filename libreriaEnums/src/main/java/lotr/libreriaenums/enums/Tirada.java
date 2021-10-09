package lotr.libreriaenums.enums;

import lombok.Getter;

@Getter
public enum Tirada {

	/** La tirada d100. */
	TIRADA_D100(1, 100, false),
	/** La tirada d100 abierta. */
	TIRADA_ABIERTA(1, 100, true),
	/** La tirada d10. */
	TIRADA_D10(1, 10, false);

	/** El minimo. */
	private final int minimo;

	/** El maximo. */
	private final int maximo;

	/** La repeticion. */
	private final boolean repeticion;

	private Tirada(final int minimo, final int maximo, final boolean repeticion) {
		this.minimo = minimo;
		this.maximo = maximo;
		this.repeticion = repeticion;
	}
}
