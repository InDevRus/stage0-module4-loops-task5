package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength % 2 == 0) {
            return;
        }

        var CENTRAL_ROW = " ".repeat(sideLength / 2) + "8" + " ".repeat(sideLength / 2);
        var NON_CENTRAL_ROW = "8".repeat(sideLength);

        for (var row = 0; row < sideLength; row++) {
            System.out.println(row * 2 + 1 == sideLength ? NON_CENTRAL_ROW : CENTRAL_ROW);
        }
    }
}
