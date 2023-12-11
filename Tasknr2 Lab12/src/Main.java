public class Main {
    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator(TrafficLightColor.RED);

        for (int i = 1; i <= 5; i++) {
            System.out.println(simulator);
            simulator.changeColor();
        }
    }
}