package com.sum.spring_boot_template.service;

import java.time.Duration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class SampleService {

    public Flux<String> sampleFlux() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> "Event-" + i);
    }
}
