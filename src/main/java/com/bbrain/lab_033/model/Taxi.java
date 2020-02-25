package com.bbrain.lab_033.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Taxi {
    String car;
    String carNumber;
    String driverName;
    DayOfWeek restDay;
}
