public class TrafficLightSimulator {
    private TrafficLightColor currentColor;

    public TrafficLightSimulator(TrafficLightColor initialColor) {
        this.currentColor = initialColor;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                currentColor = TrafficLightColor.RED;
                break;
            case GREEN:
                currentColor = TrafficLightColor.YELLOW;
                break;
            default:
                System.out.println("Invalid traffic light color");
        }
    }

    @Override
    public String toString() {
        return "Current Traffic Light Color: " + currentColor + ", Value: " + currentColor.getValue() + ", Ordinal Number: " + currentColor.getOrdinalNumber();
    }
}