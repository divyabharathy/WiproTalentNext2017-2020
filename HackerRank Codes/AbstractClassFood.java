import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
abstract class  Food{
    double protiens;
    double fats;
    double carbs;
    int tastyScore;
    abstract void getMacroNutrients();
}
class Egg extends Food{
    String type="non-vegetarian";
    Egg(double p,double f,double c)
    {
        super.protiens=p;
        super.fats=f;
        super.carbs=c;
        super.tastyScore=7;
    }
    void getMacroNutrients()
    {
        System.out.println("An egg has 6.3 gms of protein, 5.3 gms of fats and 0.6 gms of carbohydrates.");
    }

}
class Bread extends Food{
    String type="vegetarian";
    Bread(double p,double f,double c)
    {
        super.protiens=p;
        super.fats=f;
        super.carbs=c;
        super.tastyScore=8;
    }
    void getMacroNutrients()
    {
        System.out.println("A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.");
    }

}


public class AbstractClassFood {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cnt; i++) {
            String name = sc.nextLine();

            if(name.equals("Bread")) {
                Bread breadObj = new Bread(4, 1.1, 13.8);
                for(int j = 0; j < 3; j++) {
                    String command = sc.nextLine();
                    if(command.equals("getMacros")) {
                        breadObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + breadObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Bread is " + breadObj.type);
                    }
                }
            } else if (name.equals("Egg")) {
                Egg eggObj = new Egg(6.3, 5.3, 0.6);
                for(int j = 0; j < 3; j++) {
                    String command = sc.nextLine();
                    if(command.equals("getMacros")) {
                        eggObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + eggObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Egg is " + eggObj.type);
                    }
                }
            }
        }
    }
}
