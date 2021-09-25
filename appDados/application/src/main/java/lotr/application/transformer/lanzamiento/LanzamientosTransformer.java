package lotr.application.transformer.lanzamiento;

import com.lotr.apidados.request.Lanzamientos;

import lotr.dto.request.LanzamientosDto;

public interface LanzamientosTransformer {
	LanzamientosDto toDto(Lanzamientos bean);
}
