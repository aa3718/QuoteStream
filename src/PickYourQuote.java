import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PickYourQuote {

    public static void main(String[] args) throws Exception {

        final String quotesFile = args[0];
        int numberQuote = Integer.parseInt(args[1]);

        BufferedReader buff = null;
        FileReader flrd = null;

        flrd = new FileReader(quotesFile);
        buff = new BufferedReader(flrd);

        reformat(numberQuote, buff);

    }

    public static void reformat(int i, BufferedReader input) throws IOException {

        String line = input.readLine();
        int count = 1;

        while (line != null) {
            line = line.replace(";", "\n");

            if (count == i) {
                System.out.println(line);
            return;
            }

            line = input.readLine();
            count++;
        }

    }

}
