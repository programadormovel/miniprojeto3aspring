package br.com.itb.miniprojeto3aspring.service;

import org.springframework.stereotype.Service;

import br.com.itb.miniprojeto3aspring.model.ProdutoRepository;

@Service
public class ProdutoService {
	//Criar objeto repositório
	final ProdutoRepository produtoRepository;
	// Injeção de Dependência
	public ProdutoService(
				ProdutoRepository objetoRepository
			) 
	{
		this.produtoRepository = objetoRepository;		
	}
	
}







