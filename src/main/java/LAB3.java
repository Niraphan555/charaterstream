import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3 {
    public static void main(String[] args) throws FileNotFoundException {
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



