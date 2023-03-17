package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        var countOf8s = height;
        for (var row = 1; row <= height; row++) {
            var spacesCount = (height - countOf8s) / 2;
            var line = " ".repeat(spacesCount) + "8".repeat(countOf8s) + " ".repeat(spacesCount);
            System.out.println(line);

            countOf8s += 2 * row == height ? 0
                    : 2 * row > height ? 2
                    : -2;
        }
    }
}
