package com.statement.modules.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    private Long ticketId;
    private String userId;
    private String message;

    public Ticket(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }
}
