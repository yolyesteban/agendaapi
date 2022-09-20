package edu.galileo.agenda.model.respository;

import edu.galileo.agenda.model.Contacto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
    List<Contacto> findAll();
}
