import java.net.MalformedURLException;
import java.rmi.*;
public class ReverseClient {
    public static void main(String[] args) {
        try {
            ReverseInterface rev = (ReverseInterface) Naming.lookup("rmi://ic2s124-16.univ-lemans.fr:2001/MyReverse");
            String result = rev.reverseString(args[0]);
            System.out.println("L'inverse de " + args[0] + " est " + result);
        } catch (Exception e) {
            System.out.println("Erreur d'accès à l'objet distant.");
            System.out.println(e.toString());
        }

    }
}