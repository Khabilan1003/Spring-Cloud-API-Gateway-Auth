package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingConfig {

    @Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true); // Include query string in the log
        filter.setIncludePayload(true);     // Include request payload (body)
        filter.setMaxPayloadLength(10000);  // Max length of the request body to log
        filter.setIncludeHeaders(true);     // Log headers
        filter.setAfterMessagePrefix("REQUEST DATA : "); // Log prefix
        return filter;
    }
}
