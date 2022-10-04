//problem D
import java.util.Scanner;
public class ZipCheck
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter zip code press Enter");
String zipCode = input.nextLine();
while(true)
if(zipCode.length() != 5)
{
System.out.println("Enter 5 digit");
System.out.println("Zip Code is not five character");
System.out.println("Enter your zip code");

zipCode = input.next();
}
else

{
System.out.println("Thanks for the ZipCode");
break;
}
}
}
