package com.statement.modules.repository;

import com.statement.modules.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository   extends PagingAndSortingRepository<Role, Long> {
}
