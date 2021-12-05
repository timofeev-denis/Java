package ru.code4fun.demo.logging;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import static net.logstash.logback.argument.StructuredArguments.keyValue;

@Slf4j
@RestController
public class LoggingController {

    @GetMapping("/log-simple-message")
    public String logSimpleMessage(ServletWebRequest request) {
        MDC.put("host_name", "localhost");
        MDC.put("session_id", request.getSessionId());
        log.info("Simple log message", keyValue("someKey", "42"));
        MDC.clear();
        return "OK";
    }

    @GetMapping("/log-error")
    public void logError() {
        final IllegalStateException rootCause = new IllegalStateException("Some error occurred");
        throw new RuntimeException(rootCause);
    }
}
