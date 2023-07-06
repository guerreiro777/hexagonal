package br.com.lenin.hexagonalexemplo;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber/hexagonal"},
        extraGlue = "br.com.clean.arq.hexagonal")
public class HexagonalExemploApplicationCucumberTest {
}
