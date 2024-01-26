
import java.util.concurrent.TimeUnit;

public class Nomer18 {
    public static void main(String[] args) {
        int[] inputHours = new int[] { 9, 13, 15, 17 };
        int[] inputCalories = new int[] { 30, 20, 50, 80 };
        int inputTime = 18;

        burningCalories(inputHours, inputCalories, inputTime);
    }

    private static int calculateDuration(int[] inputHours, int[] inputCalories, int inputTime) {
        int exerciseDuration = 0;
        int minutesInAnHour = 60;
        for (int i = 0; i < inputHours.length; i++) {
            int timeDifference = (inputTime - inputHours[i]);
            exerciseDuration += 0.1 * inputCalories[i] * timeDifference;

        }
        return exerciseDuration / minutesInAnHour;
    }

    private static int caseBurningCalories(int exerciseDuration) {
        return (100 * exerciseDuration * 2) + 500;
    }

    public static void burningCalories(int[] inputHours, int[] inputCalories, int inputTime) {
        int duration = calculateDuration(inputHours, inputCalories, inputTime);
        System.out.println("Donna needs " + caseBurningCalories(duration) + "cc of waters");
    }
}