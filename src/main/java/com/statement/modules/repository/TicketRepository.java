package com.statement.modules.repository;

import com.statement.modules.model.Ticket;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface TicketRepository extends PagingAndSortingRepository<Ticket, Long> {
}
