import java.util.*;
class Wrap{
    public static void main(String args[])
    {
        int a=5;
        Scanner s= new Scanner(System.in);
        Integer obj = Integer.valueOf(a);
        Integer obj1 = a;
        Integer obj2 = 7;
        obj1 = s.nextInt();
        int c=obj.intValue();
        int b= obj1*obj2;
        System.out.println(b);
    }
}



//java is 99.99% oopm
// After the development of Java5, it developed 8 wrapper class,
/*Integer
Character
Boolean
Float
Double
Long
Byte
Short
valueOf function is used to create objects in primitive datatype
