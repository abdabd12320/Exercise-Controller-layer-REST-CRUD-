package com.example.bankmanagementsystem.BankApiResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ApiResponse {

    private String message;
    private String todayDate;
}
