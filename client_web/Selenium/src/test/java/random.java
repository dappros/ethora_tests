
//A Java program generate a random AlphaNumeric String
//using CharSet
import java.util.*;
import java.nio.charset.*;
class Main {
static String RequiredString(int n)
{
//length declaration
byte[] array = new byte[256];
new Random().nextBytes(array);
String randomString
= new String(array, Charset.forName("UTF-8"));
//Creating a StringBuffer
StringBuffer ra = new StringBuffer();
//Appending first 20 alphanumeric characters
for (int i = 0; i < randomString.length(); i++) { char ch = randomString.charAt(i); if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) && (n > 0)) {
ra.append(ch);
n--;
}
}
//returning the resultant string
return ra.toString();
}
public static void main(String[] args)
{
//size of random alphanumeric string
int n = 10;
//Get and display the alphanumeric string
System.out.println(RequiredString(n));
}
}