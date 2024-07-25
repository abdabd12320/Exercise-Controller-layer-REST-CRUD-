package com.example.bankmanagementsystem.BankModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Model {

    private String id;
    private String username;
    private double balance;
}
