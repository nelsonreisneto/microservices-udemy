package br.com.udemy.microservices.hroauth.exceptions;

public class ClientCommunicationException extends RuntimeException {
    public ClientCommunicationException(String message) {
        super(message);
    }
}
