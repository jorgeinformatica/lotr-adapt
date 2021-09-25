package com.lotr.apidados.request;

import java.io.Serializable;
import java.util.List;

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
public class Lanzamientos implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2616811155607114735L;

	/** Propietario de lanzamientos. */
	private String propietarioDeLanzamientos;

	/** Lista de lanzamientos. */
	private List<Lanzamiento> listaDeLanzamiento;

}
