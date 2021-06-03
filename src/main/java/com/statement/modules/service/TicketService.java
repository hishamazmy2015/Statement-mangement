package com.statement.modules.service;


import com.statement.modules.model.Ticket;
import com.statement.modules.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final AuthService authService;

    @Transactional(readOnly = true)
    public List<Ticket> getAllTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

//    @Transactional
//    public void saveTicket(String message) {
//        User currentUser = authService.getCurrentUser();
//        Ticket ticket = new Ticket(String.valueOf(currentUser.getUserId()), message);
//        ticketRepository.save(ticket);
//    }


}

