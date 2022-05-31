package desafio.projeto.gof.service;

import desafio.projeto.gof.model.Cliente;

/**
 * Interface com todas as operações de CRUD para multiplas implementações
 * da própria interface.
 * 
 * @author Caio Lamarão
 */


public interface ClienteService {
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
}
