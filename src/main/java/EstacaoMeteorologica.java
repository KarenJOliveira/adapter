public class EstacaoMeteorologica {
    ITemperatura temperatura;
    TemperaturaAdapter persistencia;

    public EstacaoMeteorologica() {
        temperatura = new TemperaturaCelsius();
        persistencia = new TemperaturaAdapter(temperatura);
    }

    public void setTemperaturaCelsius(float celsius) {
        temperatura.setTemperatura(celsius);
        persistencia.salvarTemperatura();
    }

    public float getTemperaturaCelsius() {
        return persistencia.recuperarTemperatura();
    }

    public float getTemperaturaFahrenheit() {
        return persistencia.getFahrenheit();
    }
}
