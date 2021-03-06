package co.eps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.eps.model.Afiliado;
import co.eps.service.AfiliadoService;

@RestController
@RequestMapping(value = "/afiliado")
public class AfiliadoController {
	
	@Autowired
	private AfiliadoService afiliadoService;
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Afiliado> buscar() {
		return afiliadoService.buscarTodos();
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Afiliado buscarPorId(@PathVariable("id") Long idAfiliado) {
		return afiliadoService.buscarPorId(idAfiliado);
	}
	
	@PostMapping(value = "/guardar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Afiliado guardar(@RequestBody Afiliado afiliado) {
		return afiliadoService.grabar(afiliado);
	}
	
	@DeleteMapping(value = "/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		afiliadoService.eliminar(id);
	}

}
