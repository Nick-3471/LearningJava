package Examples;

public class Flow {
    public static void main(String[] args) {
        

        int swichValue = 5;
        switch (swichValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4:
                System.out.println("Value is 4");
                break;
        
            default: 
                System.out.println("No Value");
                break;
        }


        char switchCarVal = 'a';
        switch (switchCarVal) {
            case 'a':
                System.out.println("Value is A");
                break;
            case 'b':
                System.out.println("Value is B");
                break;
            case 'c':
                System.out.println("Value is C");
                break;
            case 'd':
                System.out.println("Value is D");
                break;
        
            default: 
                System.out.println("No Value");
                break;
        }


        String month = "Feb";
            switch (month.toLowerCase()) {
            case "jan":
                System.out.println("World War 3");
                break;
            case "feb":
                System.out.println("Biblical Flames");
                break;
            case "march":
                System.out.println("Beer Virus");
                break;
            case "april":
                System.out.println("Alone");
                break;
        
            default: 
                System.out.println("No Value");
                break;
        }

        dayOfTheWeek(5);
    }

    public static void dayOfTheWeek(int val) {
        switch (val) {
            case 0:
                System.out.println("The Day is Monday");
                break;
            case 1:
                System.out.println("The Day is Tuesday");
                break;
            case 2:
                System.out.println("The Day is Wednesday");
                break;
            case 3:
                System.out.println("The Day is Thursday");
                break;
            case 4:
                System.out.println("The Day is Friday");
                break;
            case 5:
                System.out.println("The Day is Saturday");
                break;
            case 6:
                System.out.println("The Day is Sunday");
                break;
        
            default:
                break;
        }
    }
}   