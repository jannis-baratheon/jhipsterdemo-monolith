package it.januszwisniowski.jhipsterpresentation.examples.monolith.cucumber.stepdefs;

import it.januszwisniowski.jhipsterpresentation.examples.monolith.JhipstermonolithApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipstermonolithApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
