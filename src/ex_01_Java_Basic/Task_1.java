package ex_01_Java_Basic;

public class Task_1 {
    public static void main(String[] args){
        String s1="Hello";    // creates "Hello" in the SCP
        String s2="Hello";  // Reuses the "Hello" in the SCP
        String s3=new String("Hello") ;// Creates new object in the Heap Area (or) Object Area

        System.out.println(s1 == s2);    //true, it is refering the same memory
        System.out.println(s1 == s3);    // false, s1 is from SCP where as s3 from Heap Area
        System.out.println(s1.equals(s3));   // true, equals() will chesk the value of the s1 & s3 are matched or not

        // practice

        String name="Vaishnavi";
        String name2="Vaishnavi Guvvala";

        // 1.charAt()
        System.out.println(name.charAt(8)); // i
        System.out.println(name.charAt(0));  // V

        // 2. concat()
        System.out.println(name.concat(" is Brave girl"));

        //3. contains()
        System.out.println(name2.contains("Vaish"));  // true

        //4. equals()
        System.out.println(name.equals(name2));   // false

        // 5. equalsIgnoranceCase()
        System.out.println(name.equalsIgnoreCase("vaishnavi"));

        // 6. indexOf()
        System.out.println(name2.indexOf("G")); // 10

        // 7. length()
        System.out.println(name2.length());

        // 8. replace()
        System.out.println(name.replace("i","I"));

        // 9. split()
        String[] list=name2.split(" ");
        System.out.println(list[0]);
        System.out.println(list[1]);

        // 10. substring()
        System.out.println(name2.substring(10,15));

        // 11. toLowerCase()
        System.out.println(name.toLowerCase());

        // 12. toUpperCase()
        System.out.println(name.toUpperCase());

        // 13. replaceAll()
        System.out.println(name.replaceAll("i","IO"));

        // 14. startsWith()
        System.out.println(name.startsWith("V"));
        System.out.println(name.startsWith("v"));

        // 15.endsWith()
        System.out.println(name.endsWith("I"));
        System.out.println(name2.endsWith("a"));

        // 16. isEmpty()
        System.out.println(name.isEmpty());

        // 17. trim()
        String s4="  Vaishnavi Guvvala  ";
        System.out.println(s4.trim());

        // 18. compareTo
        System.out.println(name.compareTo("Vaishnavi"));

        // 19. compareToIgnoewCase
        System.out.println(name.equalsIgnoreCase("vaishnavi"));

        // 20. lastIndexOf
        System.out.println(name.lastIndexOf("i"));

        // 21.repeat()
        System.out.println(name.repeat(2));  // name value will repeat 2 times

        StringBuffer name1=new StringBuffer("Vamsi");
        name1.append(" Reddy");
        System.out.println(name);
        name1.reverse();
        System.out.println(name);
        name1.reverse();
        System.out.println(name);


        StringBuilder sb=new StringBuilder(" Ahaana ");
        sb.append("Reddy");
        System.out.println();
        sb.reverse();
        System.out.println(sb);

        String x="Hello";
        String y="World!";
        String Z=x+y;
        System.out.println(Z);












    }
}
