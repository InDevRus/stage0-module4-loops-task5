package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (var y = 0; y < cathetusLength; y++) {
            for (var x = 0; x < cathetusLength; x++) {
                System.out.print(y >= x ? "8" : " ");
            }
            System.out.println();
        }
    }
}
