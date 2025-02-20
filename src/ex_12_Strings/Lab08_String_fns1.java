package ex_12_Strings;

public class Lab08_String_fns1 {
    public static void main(String[] args){
        String name="Raghu";
        System.out.printf("Length of name is %d",name.length());
        System.out.println();

        // 1. charAt(index);
        System.out.println(name.charAt(4));
        // System.out.println(name.charAt(6)); // if we exceed length of the string we will get StringIndexOutOfBoundsException

        // 2. concat(String);
        System.out.println(name.concat(" Reddy"));
        name=name.concat(" Reddy");

        //  3. contains();
        System.out.println(name.contains("dd"));

        // 4. equals();
        System.out.println(name.equals("Raghu"));
        System.out.println(name.equals("Raghu Reddy"));

        // 5. equalsIgnoreCase();
        System.out.println(name.equalsIgnoreCase("raghu reddy")) ;

        // 6. Indexof('char') it will give index of that char

        System.out.println(name.indexOf('u')); // Raghu Reddy
        System.out.println(name.indexOf('R')); // first R it will take

        // 7. replace();
        String nam="Bindu";
        System.out.println(nam.replace('i','I'));
        System.out.println(nam.replace("in","IN"));
        // System.out.println(nam);
        String Angel="Ahaana";
        System.out.println(Angel.replace('a','A')); // AhAAnA

        // 8. split()
       String email="Vaishnvai@yahoo.com@1234";
       String[] split=email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 9. sunstring(index,index)

        String nam2="Bindu is good and. A beautiful girl.";
        String sub_nam2=nam2.substring(9,18); // index,index-1
        System.out.println(sub_nam2);

        // 10.toLowerCase()
        System.out.println(nam2.toLowerCase());

        // 11.toUpperCase()
        System.out.println(nam2.toUpperCase());

        // 12. startsWith("")
        String x="Vaishnavi";
        System.out.println(x.startsWith("V"));
        System.out.println(x.startsWith(""));

        // 13. endsWith("")

        System.out.println(x.endsWith("I"));
        System.out.println(x.endsWith("i"));
        System.out.println(x.endsWith(""));

         // 14. trim();

        String nam4= "   Hello! everyone.    ";
        System.out.println(nam4.trim()); // remove white spaces front & last

        // 15. compareTo(); // it will give result as integer
        String y="Srinivas";
        System.out.println(y.compareToIgnoreCase("srinivas"));
        System.out.println(y.compareTo("Srinivas"));
        System.out.println(y.compareTo("Sri"));

    }
}
