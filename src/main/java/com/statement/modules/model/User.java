package com.statement.modules.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @org.springframework.data.annotation.Id
    private Integer ID;
    private String username;
    private String password;
    private String role;

}
