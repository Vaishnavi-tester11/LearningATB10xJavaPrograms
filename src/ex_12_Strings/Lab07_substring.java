package ex_12_Strings;

public class Lab07_substring {
    public static void main(String[] args) {
        String self_intro="My name is Vaishnavi. I am unpredictable";
        String sub_intro=self_intro.substring(10,15);
        System.out.println(sub_intro);

        String s1="Vaishnavi";
        System.out.println(s1.substring(3,8));
        System.out.println(s1.charAt(7));
    }
}

