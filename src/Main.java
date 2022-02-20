public class Main {
    public static void main(String[] args) {
      Cup first = new Cup();
      Cup second = new Cup(1, "ceramic", "transparent");
      Cup third = new Cup(2,"glass","black","ikea", 12, true);

      System.out.println(first + "\n" + second + "\n" + third);
    }
}
