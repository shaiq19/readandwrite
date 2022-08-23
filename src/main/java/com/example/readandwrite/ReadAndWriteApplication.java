package com.example.readandwrite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class ReadAndWriteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadAndWriteApplication.class, args);
       /* String[] names = {"shaqi", "sameer", "asif"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("i am shahaque");
            writer.write("\nthis is my first time");
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\dell pc\\Downloads\\ads.csv"));
            String line;
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

/*   String string="euqahahs mA I";
   for(int i = string.length()-1; i>-1; i--)
       System.out.print(string.charAt(i));
   }*/