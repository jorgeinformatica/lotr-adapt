package com.lotr.apidados.response;

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
public class Resultados implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5443267287703047129L;

	/** Propietario de resultados. */
	private String propietarioDeResultados;

	/** Lista de resultados. */
	private List<Resultado> listaDeResultado;
}
