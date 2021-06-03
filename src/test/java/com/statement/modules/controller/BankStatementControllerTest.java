package com.statement.modules.controller;

import com.statement.modules.repository.StatementsRepository;
import com.statement.modules.service.AuthService;
import com.statement.modules.service.HandleUtilityService;
import com.statement.modules.service.StatementService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(controllers = BankStatementController.class)
class BankStatementControllerTest {


    @MockBean
    private StatementsRepository statementRepository;

    @Autowired
    private UserDetailsService userDetailsService;
//    @MockBean
//    private AuthService authService;

    @MockBean
    private HandleUtilityService handleUtilityService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Should return Last three month in case of all params are nulls ")
    void getStatementsByParams() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/api/bank/statements"))
                    .andExpect(MockMvcResultMatchers.status().is(200));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}