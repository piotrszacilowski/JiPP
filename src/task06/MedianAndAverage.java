package task06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianAndAverage {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(10.00, 20.00, 30.00, 5.00, 12.00);

//        for (int i = 1; i <= 50; i++) {
//            doubles.add((double) i);
//        }

        Collections.sort(doubles);

        System.out.println(doubles);
        System.out.println("Average: " + calculateAverage(doubles));
        System.out.println("Median: " + calculateMedian(doubles));
    }

    private static double calculateMedian(List<Double> doubles) {
        if (isEven(doubles))
            return (doubles.get(doubles.size() / 2 + (doubles.size() / 2) - 1)) / 2;
        else
            return doubles.get(doubles.size() / 2);
    }

    private static boolean isEven(List<Double> doubles) {
        return doubles.size() % 2 == 0;
    }

    private static double calculateAverage(List<Double> doubles) {
        double sum = 0;
        for (Double aDouble : doubles) {
            sum += aDouble;
        }
        return sum / doubles.size();
    }
}
