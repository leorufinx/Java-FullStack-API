package br.com.api.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.project.DAO.IUsuario;
import br.com.api.project.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController{
	
	@Autowired
	private IUsuario dao;
	
	//listar
	@GetMapping
	public List<Usuario> listaUsuarios() {
		return (List<Usuario>) dao.findAll();
	}
	
	//adicionar
	@PostMapping
	public Usuario add(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
	
	//editar
	@PutMapping
	public Usuario edit(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
	
	//delete
	@DeleteMapping("/{id}")
	public Optional<Usuario> delete(@PathVariable Integer id) {
		Optional<Usuario> usuario = dao.findById(id);
		dao.deleteById(id);
		return usuario;
	}
	
}
