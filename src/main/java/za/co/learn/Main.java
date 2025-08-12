package za.co.learn;

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create(/*config*/)
                    .get("/", ctx -> ctx.json("Hello World"))
                    .start(7070);
    }
}