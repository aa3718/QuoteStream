import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuotesPrinter {

    public static void main(String[] args) throws Exception {

        final String quotesFile = "Quotes.txt";
        FileReader flrd = new FileReader(quotesFile);
        BufferedReader buff = new BufferedReader(flrd);


        reformat(buff);

    }

    public static void reformat(BufferedReader input) throws IOException {

        String line = input.readLine();

        while (line != null) {
            line = line.replace(";", "\n");
            System.out.println(line);
            line = input.readLine();
        }


    }
}

