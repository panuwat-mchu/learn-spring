package com.mchu.pact;

import au.com.dius.pact.consumer.MockServer;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@ExtendWith(PactConsumerTestExt.class)
@PactTestFor(providerName = "ArticlesProvider")
public class ExampleJavaConsumerPactTest {

    @Pact(provider="ArticlesProvider", consumer="test_consumer")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        return builder
                .given("test state")
                .uponReceiving("ExampleJavaConsumerPactTest test interaction")
                .path("/articles.json")
                .method("GET")
                .willRespondWith()
                .status(200)
                .body("{\"responsetest\": true}")
                .toPact();
    }

    @Test
    void test(MockServer mockServer) throws IOException {
        HttpResponse httpResponse = Request.Get(mockServer.getUrl() + "/articles.json").execute().returnResponse();
        assertThat(httpResponse.getStatusLine().getStatusCode(), is(equalTo(200)));
    }

}
