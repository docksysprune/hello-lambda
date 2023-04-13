package dev.oceballos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloLambdaTest {

    @Test
    public void shouldReturnHelloMessage() {
        var sut = new HelloLambda();
        Assertions.assertEquals("Hello AWS Lambda", sut.handleRequest());
    }
}