public class TemperaturaCelsius implements ITemperatura{
    private float celsius;

    @Override
    public float getTemperatura() {
        return this.celsius;
    }

    @Override
    public void setTemperatura(float temperatura) {
        this.celsius = temperatura;
    }
}
