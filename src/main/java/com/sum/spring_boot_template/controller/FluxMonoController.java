package com.sum.spring_boot_template.controller;

import org.reactivestreams.Subscription;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sum.spring_boot_template.service.SampleService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
// @RequestMapping("/fluxmono")
@RequiredArgsConstructor
public class FluxMonoController {

    // Creating a Mono and a Flux

    Mono<String> monoExample = Mono.just("Sumanth");
    Flux<String> fluxExample = Flux.just("A", "B", "C");

    private final SampleService sampleService;

    @GetMapping(path = "/sample", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Object sampleMethod() {
        // return fluxExample;
        // return sampleService.sampleFlux();
        // monoExample.map(String::toUpperCase)
        //     .map(name -> {
        //         System.out.println(name);
        //         return name;
        //     })
        //     .subscribe()
        //     .dispose();;

        Flux<String> sampleFlux = sampleService.sampleFlux();

        // sampleFlux.subscribe(System.out::println);
        sampleFlux.subscribe(new BaseSubscriber<String>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                request(1);
            }

            @Override
            protected void hookOnNext(String value) {
                System.out.println(value);
                request(1);
            }
        });

        return null;
    }
}
