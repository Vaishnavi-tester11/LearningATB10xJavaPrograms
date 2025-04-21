package Practise_variables_datatypes;

public class Vowels_Consonants_count {
    public static void main(String[] args) {
        String name="Vaishnavi is Beautiful! girl.";
        String nam2=name.toLowerCase();

        int Vcnt=0;
        int Ccnt=0;

        for(int i=0;i<name.length()-1;i++){
            char c=nam2.charAt(i);
            if(c == 'a'|| c=='e'|| c=='o' || c=='i'|| c=='u'){
                Vcnt=Vcnt+1;
            }
            else if( c>='a' && c<='z') {
                Ccnt = Ccnt + 1;
            }
        }

        System.out.println("Vowels are "+Vcnt);
        System.out.println("Consonants are "+Ccnt);
    }
}
