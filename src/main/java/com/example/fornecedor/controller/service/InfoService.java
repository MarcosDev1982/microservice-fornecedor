package com.example.fornecedor.controller.service;

import com.example.fornecedor.controller.model.InfoFornecedor;
import com.example.fornecedor.controller.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado){
      InfoFornecedor obj = infoRepository.findByEstado(estado);
      if (obj == null){
          return null;
      }
      return obj;
    }


}
