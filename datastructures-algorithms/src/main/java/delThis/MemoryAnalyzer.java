package delThis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vthiagarajan on 4/9/18.
 */
public class MemoryAnalyzer {

    public static void main(String[] args) {
        int vinodh = 10;
        int priya = 100;
        print10to100(vinodh,priya);
        System.out.println("Test Flow");
        print10to100(vinodh,priya);
        System.out.println("Test Flow");
        print10to100(vinodh,priya);
        System.out.println("Test Flow");
        print10to100(vinodh,priya);
        System.out.println("Test Flow");
    }

    public static void print10to100(int a, int b) {
        Animal an;
        List<Animal> animalList = new ArrayList<>();
        for(int i=a; i < b; i++) {
            System.out.println(i);
             an = new Animal("k"+i, "d"+i);
            animalList.add(an);
        }
        System.out.println("Done");
    }
}
