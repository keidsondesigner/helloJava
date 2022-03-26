package com.example.aula2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Ola {
  @GetMapping(value="/")
  public String getMethodName() {
      return "Olá turma!";
  }
  
}
