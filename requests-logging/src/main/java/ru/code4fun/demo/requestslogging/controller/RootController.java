package ru.code4fun.demo.requestslogging.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.code4fun.demo.requestslogging.dto.QuestionDto;

import java.nio.charset.StandardCharsets;

@Slf4j
@RestController
public class RootController {

    @GetMapping("")
    public ResponseEntity<String> index() {
        log.info("GET request");
        return ResponseEntity.ok(null);
    }

    @PostMapping("")
    public ResponseEntity<String> index(@RequestBody QuestionDto dto) {
        log.info("POST request: " + dto);



        return ResponseEntity.ok("OK");
    }
}
