import java.io.*;
import java.util.Scanner;
public class test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        Scanner reader = new Scanner(file);
        String name;
        double scores[] = new double[5];
        while (reader.hasNext()) {
            name = reader.next() + " " + reader.next();
            for (int i = 0; reader.hasNextDouble(); i++) {
                scores[i] = reader.nextDouble();
            }
        }
    }
}