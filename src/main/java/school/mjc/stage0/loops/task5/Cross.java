package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int row = 1; row <= sideLength; row++) {
            for (int col = 1; col <= sideLength; col++) {
                if (row == col || row == sideLength - col + 1) {
                System.out.print("8");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
