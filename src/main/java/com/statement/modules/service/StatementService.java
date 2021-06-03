package com.statement.modules.service;

import com.statement.modules.dto.StatementsDto;

import java.util.List;

public interface StatementService {
    List<StatementsDto> getStatments(String accountId, String fromDate, String toDate, String fromAmount, String toAmount);

}
