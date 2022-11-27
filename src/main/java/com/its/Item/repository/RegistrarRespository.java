package com.its.Item.repository;

import com.its.Item.dto.RegistrarDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegistrarRespository {
    SqlSessionTemplate sql;

    public RegistrarDTO  save(RegistrarDTO registrarDTO) {
        return sql.selectOne("Registrar.save",registrarDTO);
    }

    public List<RegistrarDTO> findAll() {
        return sql.selectList("Registrar.findAll");
    }

    public RegistrarDTO findById(Long id) {
        return sql.selectOne("Registrar.findBy",id);
    }

    public int update(RegistrarDTO registrarDTO) {
        return sql.update("Registrar.update",registrarDTO);
    }

    public void deleta(Long id) {
        sql.delete("Registrar.delete",id);
    }
}
