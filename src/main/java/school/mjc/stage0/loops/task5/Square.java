package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        var BORDER_ROW = "8".repeat(sideLength);

        for (var x = 0; x < sideLength; x++) {
            if (x == 0 || x == sideLength - 1) {
                System.out.println(BORDER_ROW);
                continue;
            }

            System.out.print("8");
            for (int y = 1; y < sideLength - 1; y++) {
                System.out.print(" ");
            }

            System.out.println("8");
        }
    }
}
