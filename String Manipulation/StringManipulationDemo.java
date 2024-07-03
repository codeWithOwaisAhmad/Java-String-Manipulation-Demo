public class StringManipulationDemo {
  public static void main(String[] args) {
      // Case Insensitivity
      String firstName = "Ali";
      String secondName = "ali";
      System.out.println("Is 'Ali' equal to 'ali' (ignoring case)? " + firstName.equalsIgnoreCase(secondName));

      // String Conversion
      System.out.println("Second name in lower case: " + secondName.toLowerCase());
      System.out.println("Second name in upper case: " + secondName.toUpperCase());

      // Reference Equality
      System.out.println("Are 'Ali' and 'ali' the same object? " + (firstName == secondName));

      // Primitive Equality
      int a = 10;
      int b = 10;
      System.out.println("Are 10 and 10 equal? " + (a == b));

      // Object Equality
      String str1 = new String("Hello");
      String str2 = new String("Hello");
      System.out.println("Are 'Hello' objects the same? " + (str1 == str2));
      System.out.println("Are 'Hello' objects equal? " + str1.equals(str2));

      // String Operations
      String domain = "www.pakistaniDomain.pk";
      System.out.println("Does the domain end with '.pk'? " + domain.endsWith(".pk"));

      String gmail = "owaisChaudhary971@gmail.com";
      System.out.println("Does the email contain '@'? " + gmail.contains("@"));

      // Integer Conversion
      System.out.println("Octal representation of 101001110: " + Integer.toOctalString(101001110));
  }
}