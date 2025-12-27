import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class jv46_write_files {
    // How to write a file using Java (4 popular options)

// FileWriter = Good for small or medium-sized text files
// BufferedWriter = Better performance for large amounts of text
// PrintWriter = Best for structured data, like reports or logs
// FileOutputStream = Best for binary files (e.g., images, audio files)

    static void main() {

        try(FileWriter writer = new FileWriter("\\test.txt")){ // to write in an absolute path
            writer.write("I like pizza");
            System.out.println("File has been written");

        }

        catch(FileNotFoundException e){
            System.out.println("could not found file location");
        }
        catch(IOException e){
            System.out.println("Could not find file");
        }

    }

}
