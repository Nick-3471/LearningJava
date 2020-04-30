/*  Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".

EXAMPLES OF INPUT/OUTPUT:
* printEqual(1, 1, 1); should print text All numbers are equal
* printEqual(1, 1, 2); should print text Neither all are equal or different
* printEqual(-1, -1, -1); should print text Invalid Value
* printEqual(1, 2, 3); should print text All numbers are different

TIP: Be extremely careful about spaces in the printed message. 

NOTES
* The solution will not be accepted if there are extra spaces.
* The method printEqual needs to be defined as public static like we have been doing so far in the course.
* Do not add main method to solution code.*/

package projects;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 2, 1);
        
    }

    public static void printEqual(int valOne, int valTwo, int valThree) {
        if(valOne < 0 ||valTwo < 0 ||valThree < 0)
            System.out.println("Invalid Value");
        else{
            if((valOne == valTwo) && (valTwo == valThree))
                System.out.println("All numbers are equal");
            else if( ((valOne != valTwo) && (valTwo == valThree)) || ((valOne == valTwo) && (valTwo != valThree)) || ((valOne == valThree) && (valTwo != valThree)))
                System.out.println("Neither all are equal or different");
            else
                System.out.println("All numbers are different");
        }
    }



    /*public static void printEqual(int valOne, int valTwo, int valThree) {
        if(valOne < 0 ||valTwo < 0 ||valThree < 0)
            System.out.println("Invalid values");
        else{
            if(printEqual(valOne, valTwo) && printEqual(valTwo, valThree))
                System.out.println("All Values are Equal");
            else if((!printEqual(valOne, valTwo) && printEqual(valTwo, valThree)) || (printEqual(valOne, valTwo) && !printEqual(valTwo, valThree) ))
                System.out.println("Neither all are equal or different");
            else
                System.out.println("All Values are Differnt");
        }
    }

    public static boolean printEqual(int valOne, int valTwo) {
        if(valOne == valTwo)
            return true;
        
        return false;
    }*/
}