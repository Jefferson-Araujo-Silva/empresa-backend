package com.ethos.empresabackend.controller;

import com.ethos.empresabackend.controller.request.PlanoRequest;
import com.ethos.empresabackend.service.Sistema;
import com.ethos.empresabackend.entity.Empresa;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/empresas")
@RequiredArgsConstructor
public class EmpresaController {
    private final Sistema sistema;

    @GetMapping
    public List<Empresa> consultarEmpresas(){
        return sistema.consultarEmpresas();
    }

    @PutMapping(path = "/alterar-plano/{id}")
    public Empresa alterarPlanoPrestadora(@RequestBody PlanoRequest plano, @PathVariable UUID id){
        return sistema.alterarPlanoPrestadora(plano, id);
    }
}
