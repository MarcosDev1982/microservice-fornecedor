package com.example.fornecedor.controller;

import com.example.fornecedor.controller.model.InfoFornecedor;
import com.example.fornecedor.controller.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/{estado}")
    public ResponseEntity<InfoFornecedor> getInfoEstado(@PathVariable String estado) {
        InfoFornecedor infornecedo = infoService.getInfoPorEstado(estado);
        return ResponseEntity.ok().body(infornecedo);
    }
}
