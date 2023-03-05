package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int row = 1; row <= length; row++) {
            for (int col = 1; col <= row && col <= height; col++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
