/*
 * This program expects two command-line arguments
 * -- a person's first name and last name.
 * For example:
 * C:\Mywork> java Greetings Annabel Lee
 */

public class Greetings
{
  public static void main(String[] args)
  {
    String firstName = args[0];
    String lastName = args[1];
    System.out.println("Hello, " + firstName + " " + lastName);
    System.out.println("Congratulations on your second program!");
    System.out.println("I suppose you could play with it right in here.")
    System.out.println("So this change was made on GitHub.")
    
  }
}
