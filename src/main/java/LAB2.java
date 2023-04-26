import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {
    public static void main (String[]args)  {

        try{
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new  BufferedWriter(file);
            output.write("Hello World");
            output.write("Welcome to JAVA");
            output.close();
        }catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);
        }
        try{
            String s;
            FileReader file = new FileReader("lab2.txt");
            BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null) {
                System.out.print(s);
                input.close();
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);

        }catch (IOException ex){
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

}