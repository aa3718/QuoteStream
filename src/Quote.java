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

            public void printOut() {
                System.out.println("'" + first + "' by " + extra);
            }

        }