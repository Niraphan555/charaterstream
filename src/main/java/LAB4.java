import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class LAB4 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(50.5);
            output.println(175.0);
            output.close();
        }catch (FileNotFoundException ex){
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null,ex);
        }
        try {
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age =  input.nextInt();
            System.out.println(age);
            double weight = input.nextDouble();
            System.out.println(weight);
            float height = input.nextFloat();
            System.out.println(height);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
