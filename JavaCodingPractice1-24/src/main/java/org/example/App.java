package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(validatePIN("121317")); //true

        System.out.println(validatePIN("1234")); // true

        System.out.println(validatePIN("45135")); // false

        System.out.println(validatePIN("89abc1"));//  false

        System.out.println(validatePIN("900876"));//  true

        System.out.println(validatePIN(" 4983"));// false
        //System.out.println( validatePIN("1231a3") );
    }

    public static boolean validatePIN(String pin){
        boolean isValid = true;
        if(pin.length() != 4 && pin.length() != 6){ //Wrong length
            //System.out.println("Wrong length");
            isValid = false;
        }

        if(!pin.matches("[0-9]+")){
            //System.out.println("Bad chars");
            isValid = false;
        }

        return isValid;
    }
}
