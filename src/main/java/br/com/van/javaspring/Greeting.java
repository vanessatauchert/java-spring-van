package br.com.van.javaspring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@AllArgsConstructor
@Getter
@Setter
public class Greeting {

    private final long id;
    private final String content;


}
