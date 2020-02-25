package com.bbrain.lab_033.configuration;

import com.bbrain.lab_033.model.Taxi;
import org.assertj.core.util.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TaxiConfiguration {

    @Bean
    public List<Taxi> taxiList(){
        List<Taxi> list = new ArrayList<>();
        list.add(Taxi.builder()
                .car("Lanos")
                .carNumber("1234")
                .driverName("Rafik")
                .restDay(DayOfWeek.SATURDAY)
                .build());
        list.add(Taxi.builder()
                .car("Aveo")
                .carNumber("123")
                .driverName("Tolik")
                .restDay(DayOfWeek.WEDNESDAY)
                .build());
        list.add(Taxi.builder()
                .car("Camry")
                .carNumber("1234")
                .driverName("Vasya")
                .restDay(DayOfWeek.MONDAY)
                .build());
        list.add(Taxi.builder()
                .car("Toyota")
                .carNumber("2324")
                .driverName("Boris")
                .restDay(DayOfWeek.TUESDAY)
                .build());
        return list;
    }
}
