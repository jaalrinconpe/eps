package co.eps.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "afiliado")
public class Afiliado {

	@Id
	private Long id;
	private String identificacion;
	private LocalDateTime inicioAfiliacion;
	private LocalDateTime finAfiliacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public LocalDateTime getFinAfiliacion() {
		return finAfiliacion;
	}

	public void setFinAfiliacion(LocalDateTime finAfiliacion) {
		this.finAfiliacion = finAfiliacion;
	}

	public LocalDateTime getInicioAfiliacion() {
		return inicioAfiliacion;
	}

	public void setInicioAfiliacion(LocalDateTime inicioAfiliacion) {
		this.inicioAfiliacion = inicioAfiliacion;
	}

}
