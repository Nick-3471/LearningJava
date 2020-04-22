package Projects;

public class opChallenge {
    public static void main(String[] args) {
        //Variables
        double var = 20.00d;
        double var2 = 80.00d;

        //Getting the total
        double varTotal = (var + var2)*100;
        System.out.println("The Total Var is " + varTotal);
        
        //Moding the total wit 40
        double varMod = varTotal % 40.00d;
        System.out.println("The mod Var is " + varMod);

       //boolean varBool = varMod == 0 ? true : false; //System.out.println("VarMod is equal to 0") : System.out.println("VarMod is not  to 0");

        //Outputting if the the mod is 0 or not
        System.out.println((varMod == 0) ? "VarMod is equal to 0" : "VarMod is not  to 0");
        
    }

}