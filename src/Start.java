import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Start {
    public static void main(String[] args)throws NullPointerException, IOException {
        String fileIn = String.valueOf(Path.of("C:\\Users\\David\\IdeaProjects\\TestSbarramentoDue\\src\\fileIn.txt"));
        String fileOut = String.valueOf(Path.of("C:\\Users\\David\\IdeaProjects\\TestSbarramentoDue\\src\\fileOut.txt"));
        Words words = new Words();
        words.inizialiParole(fileIn,fileOut);
        System.out.println(words.inizialiParole(fileIn,fileOut));

    }
}
