package com.its.Item.service;

import com.its.Item.dto.RegistrarDTO;
import com.its.Item.repository.RegistrarRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrarService {
    @Autowired
    RegistrarRespository registrarRespository;
    public RegistrarDTO save(RegistrarDTO registrarDTO) {
        RegistrarDTO save = registrarRespository.save(registrarDTO);
        return save;
    }

    public RegistrarDTO findById(Long id) {
        RegistrarDTO byId = registrarRespository.findById(id);
        return byId;
    }

    public List<RegistrarDTO> findAll() {
        List<RegistrarDTO> all = registrarRespository.findAll();
        return all;
    }

    public int update(RegistrarDTO registrarDTO) {
        int u = registrarRespository.update(registrarDTO);
        return u;
    }

    public void deleta(Long id) {
        registrarRespository.deleta(id);
    }
}
