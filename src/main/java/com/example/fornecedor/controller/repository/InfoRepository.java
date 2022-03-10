package com.example.fornecedor.controller.repository;

import com.example.fornecedor.controller.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

    InfoFornecedor findByEstado(String estado);

}
