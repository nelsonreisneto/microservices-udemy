package br.com.udemy.microservices.hrworker.exception;

public class WorkerNotFoundException extends RuntimeException {

    public WorkerNotFoundException() {
        super();
    }

    public WorkerNotFoundException(String message) {
        super(message);
    }

}
