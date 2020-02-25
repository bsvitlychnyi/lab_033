package com.bbrain.lab_033.service;

import com.bbrain.lab_033.model.Taxi;
import com.bbrain.lab_033.repository.TaxiRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Data
@AllArgsConstructor
public class TaxiCaller {

    private TaxiRepository taxiRepository;

    public void call(String person){
        Taxi car = taxiRepository.getFreeTaxi();
        log.info("Call taxi for " + person);
        log.info("Car" + car);
    }
}
