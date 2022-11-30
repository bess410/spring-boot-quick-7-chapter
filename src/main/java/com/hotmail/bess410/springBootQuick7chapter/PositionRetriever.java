package com.hotmail.bess410.springBootQuick7chapter;

import com.hotmail.bess410.springBootQuick7chapter.model.Aircraft;
import com.hotmail.bess410.springBootQuick7chapter.repository.AircraftRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;

@AllArgsConstructor
@Configuration
public class PositionRetriever {
    private final AircraftRepository repo;

    @Bean
    Consumer<List<Aircraft>> retrieveAircraftPositions() {
        return acList -> {
            repo.deleteAll();
            repo.saveAll(acList);
            repo.findAll().forEach(System.out::println);
        };
    }
}