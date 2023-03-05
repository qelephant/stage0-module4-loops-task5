package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int row = height; row >= 1; row--) {
            for (int col = 1; col <= height - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("8");
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print("8");
            }
            System.out.println();
        }
        
        for (int row = 2; row <= height; row++) {
            for (int col = 1; col <= height - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("8");
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
