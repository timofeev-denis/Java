package ru.code4fun.demo.web.controllers;

import dto.HelloWorldDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<HelloWorldDto> helloWorld() {
        return ResponseEntity.ok(new HelloWorldDto("Hello world"));
    }
}
