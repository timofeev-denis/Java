package ru.code4fun.demo.requestslogging.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@Slf4j
@Component
public class RequestLogger extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("Получен запрос: " + request.getRequestURI());
        ContentCachingRequestWrapper wrapper = new ContentCachingRequestWrapper(request);
//        byte[] content = wrapper.getContentAsByteArray();
//        String requestBody = IOUtils.toString(wrapper.getInputStream(), StandardCharsets.UTF_8.name());
        log.info("Тело запроса: " + wrapper.getReader().lines().collect(Collectors.joining()));
        filterChain.doFilter(wrapper, response);
    }
}
