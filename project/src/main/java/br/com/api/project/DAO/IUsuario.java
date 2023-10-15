package br.com.api.project.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.api.project.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
