import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.lang.Exception;


public class PickManyQuotes {

    public static void main(String[] args) throws Exception {
        // assert args.length != 0 ;
        // assert args.length != 1;

        if (args.length == 0 || args.length == 1) {
            return;
        }

        final String quotesFile = args[0];

        try {
            FileReader flrd = new FileReader(quotesFile);
            BufferedReader buff = new BufferedReader(flrd);
            int[] anArray = new int[(args.length - 1)];
            int j = 0;

            for (int i = 1; i < args.length; i++) {
                anArray[j] = Integer.parseInt(args[i]);
                j++;
            }

            reformat(loadQuotes(buff), anArray);

        } catch (FileNotFoundException fe) {

            return;
        }


    }


    public static void reformat(List<Quote> quotes, int[] choices) {

        for (int i = 0; i < choices.length; i++) {
            System.out.println(choices[i]);
/*
try {
    assert choices[i] <= quotes.size() && choices[i] > 1;
} catch (AssertionError e) {

return;
}
*/

            if (choices[i] > quotes.size() || choices[i] < 1) {
                return;
            }

            String wruble = quotes.get(choices[i] - 1).toString();
            System.out.println(wruble);
        }

    }

    public static List<Quote> loadQuotes(BufferedReader input) throws IOException {

        List<Quote> quotes = new ArrayList<Quote>();

        String line = input.readLine();

        while (line != null) {
            Quote sentence = new Quote(line);
            quotes.add(sentence);
            line = input.readLine();
        }


        return quotes;
    }

}

