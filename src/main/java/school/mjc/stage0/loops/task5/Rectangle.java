package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        var BORDER_LINE = "8".repeat(length);
        var INNER_LINE = "8" + " ".repeat(Math.max(0, length - 2)) + "8";

        for (var row = 0; row < height; row++) {
            System.out.println(row == 0 || row == height - 1 ? BORDER_LINE : INNER_LINE);
        }
    }
}
