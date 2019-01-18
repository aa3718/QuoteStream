import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PickManyQuotes {

  public static void main(String[] args) throws Exception {

      final String quotesFile = args[0];
      BufferedReader buff = null;
      FileReader flrd = null;

      flrd = new FileReader(quotesFile);
      buff = new BufferedReader(flrd);

      int [] anArray = new int[(args.length - 1)];
      int j = 0;

      for (int i = 1; i < args.length ; i++) {
        anArray[j] = Integer.parseInt(args[i]);
        j++;
      }

          reformat(loadQuotes(buff), anArray);
 }


  public static void reformat(List<Quote> quotes, int[] choices) {
      System.out.println("here");

      for (int i = 0; i < choices.length ; i++) {
          quotes.get(choices[i]).printOut();
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

