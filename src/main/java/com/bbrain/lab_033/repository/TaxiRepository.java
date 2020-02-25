package com.bbrain.lab_033.repository;

import com.bbrain.lab_033.model.Taxi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import static java.util.Objects.isNull;

@Repository
@AllArgsConstructor
public class TaxiRepository {

    private List<Taxi> taxiList;

    public Taxi getFreeTaxi(){
        if (isNull(taxiList)){
            throw new RuntimeException("Список такси не существует");
        }

        if (taxiList.isEmpty()){
            throw new RuntimeException("Список такси пуст");
        }
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return taxiList.stream()
                .filter(t -> !t.getRestDay().equals(dayOfWeek))
                .findFirst().orElseThrow(() -> new RuntimeException("Нет свободных машин"));
    }
}
