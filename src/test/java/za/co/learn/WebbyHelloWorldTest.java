package za.co.learn;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class WebbyHelloWorldTest {
    @Test
    @DisplayName("GET /hello")
    public void shouldGetHelloWorld() {
        TestableWebbyHelloWorld api = new TestableWebbyHelloWorld(5050);
        api.start();
        HttpResponse<String> response = Unirest.get("http://localhost:5050/hello").asString();
        assertEquals(200, response.getStatus());
        assertEquals("Hello World", response.getBody());
        api.stop();
    }

}
