package za.co.learn;

import io.javalin.Javalin;

public class TestableWebbyHelloWorld {
    private final Javalin server;
    private final int port;
    public TestableWebbyHelloWorld(int port) {
        this.server= Javalin.create();
        this.port = port;
        this.server.get("/hello", context -> context.result("Hello World"));
    }
    public Javalin start(){
        return this.server.start(this.port);
    }
    public Javalin stop(){
        return this.server.stop();
    }
    public static void main(String[] args) {
        TestableWebbyHelloWorld api = new TestableWebbyHelloWorld(5050);
        api.start();
    }
}
