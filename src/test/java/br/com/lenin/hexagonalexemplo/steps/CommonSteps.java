package br.com.lenin.hexagonalexemplo.steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Entao;
import org.junit.After;
import org.junit.Before;

public class CommonSteps {
    @Before
    public void gerarEvidencia(Scenario scenario) throws Throwable {
        String cenario = scenario.getName();
//        EvidenciaUtil.adicionaTituloCenario(cenario, "Teste exemplo", "Hexagonal")
    }

    @After
    public void fecharEvidencia(){

    }

    @Entao("valida o cenario")
    public void validaStatus(){
        
    }
}
