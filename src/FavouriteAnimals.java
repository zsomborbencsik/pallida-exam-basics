import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FavouriteAnimals {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        if (args.length < 0) {
            System.out.println("java FavouriteAnimals [animal] [animal]");
        } else if (args.length >= 1) {
            Path filePath1 = Paths.get("..\\favouriteanimals\\favourites.txt");
            for (int i = 0; i < args.length; i++) {
                lines.add(args[i]);
            }
            try {
             Files.write(filePath1,lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
         } catch (IOException e) {
              e.printStackTrace();
            }
        }
    }
}

// The program's aim is to collect your favourite animals and store them in a text file.
// There is a given text file called '''favourites.txt''', it will contain the animals
// If ran from the command line without arguments
// It should print out the usage:
// ```java FavouriteAnimals [animal] [animal]```
// You can add as many command line arguments as many favourite you have.
// One animal should be stored only at once
// Each animal should be written in separate lines
// The program should only save animals, no need to print them