import java.io.IOException;
import java.util.Scanner;

public class Cifrado {
    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in );

        String minus = "abcdefghijklmnopqrstuvwxyz 0123456789";
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789";

        String result = "";

        String dE;

        String pwd;
        int CDD;

        System.out.print("Introduce la frase a cifrar: ");
        pwd = S.nextLine();
        System.out.print("Introduce la clave de cifrado: ");
        CDD = S.nextInt();

        for (int i = 0; i < pwd.length(); i++) {
            for (int j = 0; j < minus.length(); j++) {
                if (pwd.charAt(i) == minus.charAt(j)) {
                    if (j + CDD >= minus.length()) {
                        result += minus.charAt((j + CDD) % minus.length()); // 30
                    } else {
                        result += minus.charAt(j + CDD);
                    }

                } else if (pwd.charAt(i) == mayus.charAt(j)) {
                    if (j + CDD >= mayus.length()) {
                        result += mayus.charAt((j + CDD) % mayus.length()); // 30
                    } else {
                        result += mayus.charAt(j + CDD);
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("===================================");
        System.out.println("Frase original: " + pwd);
        System.out.println("Frase encriptada: " + result);
        System.out.println("===================================");

    }
}
