package br.com.ifma.defesaDeMonografia.mapper;

import br.com.ifma.defesaDeMonografia.model.Encontro;
import br.com.ifma.defesaDeMonografia.model.Orientador;
import br.com.ifma.defesaDeMonografia.model.Orientando;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrientadorMapper {

  List<Orientador> recuperarOrientadores();

  List<Orientando> recuperarOrientandoPorOrientador(@Param("idOrientador") int idOrientador);


  void marcarEncontro(@Param("encontro") Encontro encontro);

}
