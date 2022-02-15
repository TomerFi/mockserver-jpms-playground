package com.example;

import static org.mockserver.verify.VerificationTimes.never;
import static org.mockserver.model.HttpRequest.request;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockserver.client.MockServerClient;
import org.mockserver.junit.jupiter.MockServerExtension;

@ExtendWith(MockServerExtension.class)
class MockserverTest {
  @Test
  void mockserver_test(MockServerClient mockServerClient) {
    mockServerClient.verify(
        request().withMethod("GET").withPath("/test"),
        never());
  }
}
