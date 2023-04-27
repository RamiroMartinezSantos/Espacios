import java.util.Scanner;

public class QuitarEspacios {
    public void palabra(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la palabra:\n");
        String palab = scanner.nextLine();
        StringBuilder palabraNueva = new StringBuilder();
        for(int i=0;i<palab.length();i++){
            if(palab.charAt(i) != ' '){palabraNueva.append(palab.charAt(i));}}
        System.out.println(" Palabra nueva:\n");
        System.out.println(" "+palabraNueva);
    }
}
