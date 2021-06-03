package com.statement.modules.mapper;

import com.statement.modules.dto.StatementsDto;
import com.statement.modules.model.Statement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StatementsMapper {

    //    @Mapping(source = "AccountId", target = "AccountId", qualifiedBy = BigDecimal.class)
//    @Mapping(source = "Id", target = "Id", qualifiedBy = BigDecimal.class)
    @Mapping(source = "accountId", target = "AccountId")
//    @Mapping(source = "datefield", target = "java.time.format.DateTimeFormatter stringToDate(datefield)")

    @Mapping(source = "id", target = "Id")
//    @Mapping(target = "Id", ignore = true)
    StatementsDto mapDtoToStatementDto(Statement subredditDto);

//    default BigDecimal map(String value) {
//        return value == null ? null : new BigDecimal(value);
//    }

//    default LocalDate stringToDate(String date) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        return LocalDate.parse(date, formatter);
//    }


}
