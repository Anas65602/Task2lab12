public enum TrafficLightColor {
    RED(0),
    YELLOW(1),
    GREEN(2);

    private int value;

    private TrafficLightColor(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getOrdinalNumber() {
        return ordinal();
    }
}