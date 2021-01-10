package Split;

public class Split {
  public static void main(String args[]) {
    String s = "he is a good player";
    String words[] = s.split(" ");
    System.out.println("The Number of words present in the string are : " + words.length);
  }
}