package br.com.ifma.defesaDeMonografia.mapper;

import br.com.ifma.defesaDeMonografia.model.Orientador;
import br.com.ifma.defesaDeMonografia.model.Orientando;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrientadorMapper {
  @Select("select * from orientador")
  List<Orientador> recuperarOrientadores();


  @Select("select *" +
      "from orientacao inner join orientador o on orientacao.orientador_id = o.id\n" +
      "inner join orientando on orientando.id = orientador_id\n" +
      "inner join tema on tema.id =  tema_id\n" +
      " where orientacao.orientador_id = #{idOrientador}")
  List<Orientando> recuperarOrientandoPorOrientador(int idOrientador);


}
