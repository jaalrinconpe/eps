package co.eps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.eps.model.Afiliado;

@Repository
public interface AfiliadoRepository extends CrudRepository<Afiliado, Long> {

}
