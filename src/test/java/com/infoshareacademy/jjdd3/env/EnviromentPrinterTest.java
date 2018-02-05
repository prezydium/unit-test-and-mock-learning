package com.infoshareacademy.jjdd3.env;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EnviromentPrinterTest {

    IEnvironmentReader mockedReader;

    @BeforeEach
    void beforeEach(){
        mockedReader = Mockito.mock(IEnvironmentReader.class);
    }


/*
        class TestEnvironmentReader implements IEnvironmentReader{
            String env;

            public TestEnvironmentReader(String env){
                this.env = env;
            }
            @Override
            public String read() {
                return env;
            }
        }
/*
    class TestEnvironmentReaderProduction implements IEnvironmentReader{

        @Override
        public String read() {
            return "PRODUCTION";
        }
    }
*/

    @Test
    void shouldPrintCurrentEnviroment(){
        //Given
        Mockito.when(mockedReader.read()).thenReturn("PRODUCTION");

        EnvironmentPrinter printer = new EnvironmentPrinter(mockedReader);
        //When
        String message = printer.print();

        //Then
        assertEquals("Current environment is PRODUCTION", message);
    }

/*    @Test
    void shouldPrintCurrentEnvironmentAsProduction(){
            IEnvironmentReader reader = new TestEnvironmentReader("PRODUCTION");
            EnvironmentPrinter printer = new EnvironmentPrinter(reader);

            assertEquals("Current environment is PRODUCTION", printer.print());

    }*/


}
