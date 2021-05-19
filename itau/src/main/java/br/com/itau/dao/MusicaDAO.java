package br.com.itau.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.itau.modelo.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer>{

	@Query(value="select count(id) as total from tb_musica where lancamento=1 and artista_id=:num",nativeQuery=true)
	public int  findByTotalLancamento(@Param("num") int num);
	
	@Query(value="select count(id) as total from tb_musica where lancamento=0 and artista_id=:num",nativeQuery=true)
	public int  findByTotalCatalogo(@Param("num") int num);
}
