package com.mchu;

import au.com.dius.pact.core.model.Pact;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider("ArticlesProvider")
@PactFolder("pacts")
public class ContractVerificationTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContractVerificationTest.class);

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactVerificationTestTemplate(Pact pact, PactVerificationContext context){
        LOGGER.info("testTemplate called: %", pact.getProvider());
        context.verifyInteraction();
    }

    @BeforeAll
    static void setUpService() {
        //Run DB, create schema
        //Run service
        //...
        LOGGER.info("BeforeAll - setUpService ");
    }

    @State("test state")
    public void testState() {
        LOGGER.info("Now service in default state");
    }

}
