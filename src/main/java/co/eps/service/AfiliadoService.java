package co.eps.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.eps.exception.EpsException;
import co.eps.model.Afiliado;
import co.eps.repository.AfiliadoRepository;

@Service
public class AfiliadoService {
	
	@Autowired
	private AfiliadoRepository afiliadoRepository;
	
	public Iterable<Afiliado> buscarTodos() {
		return afiliadoRepository.findAll();
	}
	
	public Afiliado buscarPorId(Long id) {
		Optional<Afiliado> encontrado = afiliadoRepository.findById(id);
		if (encontrado.isPresent()) {
			return encontrado.get();
		} else {
			throw new EpsException("Afiliado no encontrado");
		}
	}
	
	public Afiliado grabar(Afiliado afiliado) {
		return afiliadoRepository.save(afiliado);
	}
	
	public void eliminar(Long id) {
		afiliadoRepository.deleteById(id);
	}

}
