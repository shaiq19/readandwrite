package com.example.readandwrite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class CSVGRABBER {
    ArrayList<CSVMODEL> obj = new ArrayList();
   // String sample = ",";
    public ArrayList<CSVMODEL> crawl() throws IOException {
        Document document = Jsoup.connect("https://cdn.finra.org/equity/regsho/daily/CNMSshvol20220822.txt").get();
        Elements doc = document.select("body");


        for (Element element : doc) {
            /*     System.out.println(  element.select("Date").text());*/
           String str = element.text();
           String[] arrOfStr = str.split(",");
           for(int i=0; i<=arrOfStr.length-1; i++)
            obj.add(new CSVMODEL(arrOfStr[i]));

        }
        System.out.println(obj);
return obj;
    }
}
