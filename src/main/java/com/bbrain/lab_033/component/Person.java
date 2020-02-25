package com.bbrain.lab_033.component;

import com.bbrain.lab_033.service.TaxiCaller;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Person {

    @Autowired
    TaxiCaller taxiCAller;

    @Value("${user.properties.person.name}")
    String name;
    @Value("${user.properties.person.phone}")
    String phone;

    public void goTaxi(){
        taxiCAller.call(name);
    }
}
