import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstacaoMeteorologicaTest {
    @Test
    void deveRetornarTemperaturaCelsius() {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        estacao.setTemperaturaCelsius(25.0f);

        assertEquals(25.0f, estacao.getTemperaturaCelsius());
    }

    @Test
    void deveRetornarTemperaturaFahrenheit() {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        estacao.setTemperaturaCelsius(25.0f);

        // 25 °C = 77 °F
        assertEquals(77.0f, estacao.getTemperaturaFahrenheit());
    }
}
