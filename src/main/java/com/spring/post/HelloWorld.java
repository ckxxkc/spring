package com.spring.post;

/**
 * Created by cornelia on 10/11/17.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your message: "+ message);
    }

    public void init(){
        System.out.println("Init");
    }

    public void destroy(){
        System.out.println("Destroy");
    }

}
