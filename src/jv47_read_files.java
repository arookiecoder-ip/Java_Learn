import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class jv47_read_files {
    static void main() {
        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\jkarm\\desktop\\test.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line; //created a string to read every single line

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }


//            System.out.println("file exists");

        }
        catch (FileNotFoundException e) {
            System.out.println("could not locate file");
        }
        catch(IOException e ){
            System.out.println("SOmething went wrong");
        }

    }
}
