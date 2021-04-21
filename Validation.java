import java.util.regex.*;

class Validation
{
public static boolean isValidPinCode(String pinCode)
{
String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

Pattern p = Pattern.compile(regex);

        if(pinCode == null)
        {
                return false;
        }

        Matcher m = p.matcher(pinCode);
                return m.matches();
        }

        public static void main(String args[])
        {
                String num1 = args[0];
                System.out.println(num1 +" : "+ isValidPinCode(num1));
        }
        }


