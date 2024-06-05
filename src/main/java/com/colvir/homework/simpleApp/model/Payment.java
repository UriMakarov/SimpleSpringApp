package com.colvir.homework.simpleApp.model;

import lombok.Data;
import java.util.Date;

@Data
public class Payment {
    private Employee employee;
    private double amount;
    private Date transferDate;
}
