import java.io.File;

import java.io.FileWriter;

import java.io.BufferedWriter;

import java.io.IOException;

public class AppendToFile {

   public static void main(String[] args) {

      try {

         String data = "Greetings!!";

         File file = new File("C:\\Users\\conta\\OneDrive\\Desktop\\Mashup labs\\Sample.txt");

         if(!file.exists()) {

            file.createNewFile();

         }

         FileWriter fileWritter = new FileWriter(file.getName(),true);

         BufferedWriter bw = new BufferedWriter(fileWritter);

         bw.write(data);

         bw.close();

         System.out.println("\nThe data is appended to the file");

      } 

	catch(IOException e) {

         e.printStackTrace();

      }

   }

}
