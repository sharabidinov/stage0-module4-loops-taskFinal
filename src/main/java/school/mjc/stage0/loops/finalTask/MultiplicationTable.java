package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        int count = 1;
        while (count <= 10) {
            System.out.printf("%d x %d = %d\n", count, numberTableToPrint, count * numberTableToPrint);
            count++;
        }
    }
}
