package za.co.learn;

import io.javalin.Javalin;

public class GreetingAPI {

    private  Javalin server;

    public GreetingAPI() {
        this.server = Javalin.create();
        this.server.post("/greet", context -> {
            String name = context.body();
            context.result("Hello, " + name + "!");
            context.status(201);
        });
    }

    public Javalin start() {
        return this.server.start(7000);
    }

    public Javalin stop() {
        return this.server.stop();
    }

    public static void main(String[] args) {
        GreetingAPI api = new GreetingAPI();
        api.start();
    }
}
