public class correct {
    
  public static String correct(String string) {
       String correctedText = string.replace('5', 'S').replace('0', 'O').replace('1', 'I');
    return correctedText;
  }
}
