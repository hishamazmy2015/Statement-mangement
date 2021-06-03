package com.statement.modules.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {

    @Id
    private Integer id;

    private String name;

    @Override
    public String toString() {
        return this.name;
    }

}