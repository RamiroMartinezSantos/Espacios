import java.util.Scanner;

public class Menu {
    public void menu(){

        QuitarEspacios quitarEspacios = new QuitarEspacios();
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            System.out.println("--MENU--");
            System.out.println(" [1] Ingresar Palabra\n");
            System.out.println(" [2] Salir");
            op = scanner.nextInt();
            if(op == 1){quitarEspacios.palabra();}
        }while(op != 2);
    }
}
