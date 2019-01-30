package Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Writefile
{
    public static void main( String[] args ) {
        File file = new File("in.txt");
try {
    PrintWriter output = new PrintWriter(file);

    output.println("Potra Andrei");
    output.println("Potra Daniel");
    output.println("Potra Ramona");

    output.close();
} catch(IOException ex){
    System.out.printf("Error !: &s\n",ex);
        }
    }
}
