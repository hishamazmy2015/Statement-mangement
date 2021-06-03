package com.statement.modules.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StatementsDto {


    private Long Id;
    private String AccountId;
    private LocalDate datefield;
    private BigDecimal amount;

}
