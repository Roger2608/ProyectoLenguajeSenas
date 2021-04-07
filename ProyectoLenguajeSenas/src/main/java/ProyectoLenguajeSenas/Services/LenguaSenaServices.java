package ProyectoLenguajeSenas.Services;

import java.util.List;
import java.util.Optional;

public interface LenguaSenaServices<T> {
	public List<T> findAll();
	public Optional<T> finByID(String id);
}
