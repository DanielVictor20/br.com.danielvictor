package br.com.danielvictor.dao;

import org.springframework.stereotype.Repository;

import br.com.danielvictor.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
