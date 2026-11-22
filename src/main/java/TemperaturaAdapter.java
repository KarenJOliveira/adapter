public class TemperaturaAdapter extends TemperaturaFahrenheit{
    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public void salvarTemperatura() {
        // Converte Celsius → Fahrenheit
        float f = (temperaturaCelsius.getTemperatura() * 9/5) + 32;
        this.setFahrenheit(f);
    }

    public float recuperarTemperatura() {
        // Converte Fahrenheit → Celsius
        float c = (this.getFahrenheit() - 32) * 5/9;
        temperaturaCelsius.setTemperatura(c);
        return temperaturaCelsius.getTemperatura();
    }
}
