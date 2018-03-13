package com.java.jhipster.microservice.cucumber.stepdefs;

import com.java.jhipster.microservice.MygatewayappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MygatewayappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
