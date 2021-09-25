package lotr.application.transformer.lanzamiento;

import java.util.List;

import com.lotr.apidados.request.Lanzamiento;

import lotr.dto.request.LanzamientoDto;

public interface LanzamientoTransformer {
	LanzamientoDto toDto(Lanzamiento bean);
	List<LanzamientoDto> toDtos(List<Lanzamiento> bean);
}
