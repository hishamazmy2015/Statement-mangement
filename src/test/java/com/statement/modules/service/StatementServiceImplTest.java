package com.statement.modules.service;

import com.statement.modules.dto.StatementsDto;
import com.statement.modules.model.Statement;
import com.statement.modules.repository.StatementsRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.doReturn;

public class StatementServiceImplTest {

    private StatementsRepository statementRepository = Mockito.mock(StatementsRepository.class);
    private HandleUtilityService handleUtilityService = Mockito.mock(HandleUtilityService.class);


    @Test
    void handleStatmentsfilters() {
        Statement statement1 = new Statement(1L, 1L, "15.11.2020", "535.197875027054");
        Statement statement2 = new Statement(2L, 2L, "25.03.2020", "292.451273402434");
        Statement statement3 = new Statement(3L, 3L, "16.07.2020", "320.113318991709");
        Statement statement4 = new Statement(4L, 4L, "05.11.2020", "546.183713080865");
        Statement statement5 = new Statement(5L, 5L, "18.12.2012", "160.447345398501");
        statements = Arrays.asList(statement1, statement2, statement3, statement4, statement5);

        StatementServiceImpl statementService = new StatementServiceImpl(statementRepository, handleUtilityService);
        Mockito.when(statementRepository.getAllByFilterArgs()).thenReturn(statements);
        List<Statement> allByFilterArgs = statementRepository.getAllByFilterArgs();
        List<StatementsDto> actualStatementsRes = statementService.getStatments(null, null, null, null, null);
        Assertions.assertThat(handleUtilityService.mapListToDTO(allByFilterArgs)).isEqualTo(actualStatementsRes);

    }


    /**
     * Autowire in the service we want to test
     */
//    @Autowired
    @Mock
    private StatementService service;

    /**
     * Create a mock implementation of the WidgetRepository
     */
    @Mock
    private StatementsRepository repository;

    List<Statement> statements;

    @Test
    @DisplayName("findAll state ments Success")
    void testFindAlls() {
        StatementsRepository myRepository = Mockito.mock(StatementsRepository.class);
        StatementService myService = Mockito.mock(StatementService.class);

        // Setup our mock repository
        Statement statement1 = new Statement(1L, 1L, "15.11.2020", "535.197875027054");
        Statement statement2 = new Statement(2L, 2L, "25.03.2020", "292.451273402434");
        Statement statement3 = new Statement(3L, 3L, "16.07.2020", "320.113318991709");
        Statement statement4 = new Statement(4L, 4L, "05.11.2020", "546.183713080865");
        Statement statement5 = new Statement(5L, 5L, "18.12.2012", "160.447345398501");
        statements = Arrays.asList(statement1, statement2, statement3, statement4, statement5);

        doReturn(Arrays.asList(statement1, statement2, statement3, statement4, statement5)).when(myRepository).getAllByFilterArgs();

        statements = Arrays.asList(statement1, statement2, statement3, statement4, statement5);

        StatementServiceImpl statementService = new StatementServiceImpl(statementRepository, handleUtilityService);

        Mockito.when(statementRepository.getAllByFilterArgs()).thenReturn(statements);

        List<Statement> allByFilterArgs = statementRepository.getAllByFilterArgs();
        List<StatementsDto> widgets = statementService.getStatments(null, null, null, null, null);


        Assertions.assertThat(allByFilterArgs.size()).isEqualTo(5);

    }
}