public class Quote {

  public String first;
  public String extra;

  public Quote(String line) {

    int middle = line.indexOf(";");
    first = line.substring(0, middle);
    middle++;
    int length = line.length();
    extra = line.substring(middle, length);
  }

  public String getText() {
    return first;
  }

  public String getComment() {
    return extra;
  }

  public String toString() {
    String ruble = "'" + first + "' by " + extra;
    return ruble;
  }
}
