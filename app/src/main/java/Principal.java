
public class Principal {

    private static void haz_Algo(String s) {

        s = s + " " + "adios";

        System.out.println(s);

    }

    public static void main( String arg[]){

        String a = "Hola";

        String b = "Adios";

        try {

            for (int i = 0; i < 10; i++){
                System.out.println(a.charAt(i));
            }
            System.out.println("Todo OK");
        }

        haz_Algo(a);

        System.out.println( a );

        String a = "Hola";

        for(int i  = 0; i < a.length(); i++)

            System.out.println(a.charAt(i));

        System.out.println("No");
    }
}
