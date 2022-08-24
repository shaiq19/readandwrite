package com.example.readandwrite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

@SpringBootApplication
public class ReadAndWriteApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ReadAndWriteApplication.class, args);

CSVGRABBER csvgrabber = new CSVGRABBER();
csvgrabber.crawl();
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
        /* try {
         *//*   BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\dell pc\\Downloads\\ads.csv"));*//*
            BufferedReader reader = new BufferedReader(
                    new FileReader("   BufferedReader reader = new BufferedReader(\n" +
                            "                    new FileReader(\"C:\\\\Users\\\\dell pc\\\\Downloads\\\\ads.csv\"));"));
            String line;
           // reader.skip(12);
        //    Files.lines("C:\\Users\\dell pc\\Downloads\\ads.csv");
             while ((line=reader.readLine())!=null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/



    }

}

/*   String string="euqahahs mA I";
   for(int i = string.length()-1; i>-1; i--)
       System.out.print(string.charAt(i));
   }*/