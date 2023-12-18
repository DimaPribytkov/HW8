import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] weights = new double[10];
        double middleWeights = 0;
        int peopleCount = 0;
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextDouble() * 60) + 40;
            middleWeights += weights[i];
            if (weights[i] >= 60 && weights[i] <= 80){
                peopleCount++;
            }
        }
        System.out.println("Средний вес = " + middleWeights/weights.length);
        System.out.println("Колличество людей = " + peopleCount);

    }
}
