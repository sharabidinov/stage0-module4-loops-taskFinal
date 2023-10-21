package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int count = 1;
        int num = numberToPrint;
        while (count < power) {
            num *= numberToPrint;
            count++;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
