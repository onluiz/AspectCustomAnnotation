package br.com.aspcect;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    @TestAnnotation(value = "PRINT_MESSAGE")
    public void print(String message) {
        System.out.println(message);
    }

}
