package com.ethos.empresabackend.service;

import com.ethos.empresabackend.controller.request.PlanoRequest;
import com.ethos.empresabackend.entity.Empresa;
import com.ethos.empresabackend.entity.EmpresaContratante;
import com.ethos.empresabackend.entity.EmpresaPrestadora;
import com.ethos.empresabackend.entity.Plano;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Sistema {

    private List<Empresa> empresas = List.of(
        new EmpresaPrestadora("Empresa 1", "123456789", "123456789", "Setor 1", 10),
        new EmpresaContratante("Empresa 2", "123456789", "123456789", "Setor 2", 20));
    private List<Plano> planos = List.of(
        new Plano(1,"Gratuito", 0.0, 0),
        new Plano(2,"Pro", 50.0, 1),
        new Plano(3,"Plus", 100.0, 2)
    );
    public Empresa cadastrarEmpresa(Empresa empresa){
        empresas.add(empresa);
        return empresa;
    }

    public List<Empresa> consultarEmpresas(){
        System.out.println(empresas);
        return empresas;
    }
    public Empresa alterarPlanoPrestadora(PlanoRequest planoRequest, UUID idEmpresa){
        Empresa empresa = empresas.stream().filter(e -> e.getId().equals(idEmpresa)).findFirst().get();

        Plano plano = planos.stream().filter(p -> p.getId() == (planoRequest.id())).findFirst().get();

        empresa.escolherPlano(plano);
        return empresa;
    }
}
