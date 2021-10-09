package lotr.libreriaenums.enums;

import lombok.Getter;

@Getter
public enum Atributo {
	FUE("Fuerza", "No se trata de la fuerza bruta, sino de la capacidad de usar la musculatura de la mejor forma."),
	AGI("Agilidad", "La destreza manual, la rapidez, los reflejos, la ligereza, todo ello se refleja en la agilidad."),
	CON("Constitución", "Se trata de la salud general y la buena forma fisica de un personaje."),
	INT("Inteligencia", "El razonamiento, la deduccion, la memoria y sentido comun del personaje."),
	I("Intuición",
			"Representa la relacion entre el personaje y la fuerza omnipresente de la naturaleza. (la cancion que creo y dio forma a Arda)"),
	PRE("Presencia",
			"El coraje, carisma, autodisciplina y autoestima, todo ello se refleja en la presencia y su bonificacion/penalizacion incide en la APA"),
	APA("Apariencia", "Representa nuestra 'belleza' desde el punto de vista de un igual(congénere).");

	private String nombre;
	private String descripcion;

	private Atributo(final String nombre, final String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
}
