package co.edu.utadeo;

import java.util.Scanner;

public class App {

    // Driver Program
    public static void main(String[] args) {

        int N;

        //Ciclos del programa
        System.out.println("Numero de veces que quiere que se ejecute el programa: ");
        Scanner scanner1 = new Scanner(System.in);
        N = scanner1.nextInt();

        //De acuerdo al numero de veces que se repita el programa, osea N,
        //se creara N numero de objetos de la clase EjericioTres
        EjercicioTres iteraciones[] = new EjercicioTres[N];

        for (int i = 0; i < N; i++) {

            int V;
            int E;

            // Number of vertices in ejercicioTres
            System.out.println("Numero de esferas del dragon: ");
            Scanner scanner2 = new Scanner(System.in);
            V = scanner2.nextInt();

            // Number of edges in ejercicioTres
            System.out.println("Numero de intersecciones de las ubicaciones: ");
            Scanner scanner3 = new Scanner(System.in);
            E = scanner3.nextInt();

            //Aqui enlazo el indide del arreglo en el que este con un nuevo
            //Objeto EjercicioTres
            iteraciones[i] = new EjercicioTres(V, E);

            Scanner scanner4 = new Scanner(System.in);
            Scanner scanner5 = new Scanner(System.in);
            Scanner scanner6 = new Scanner(System.in);

            for (int j = 0; j < E; j++) {

                System.out.print("Origen: ");
                iteraciones[i].edge[j].src = scanner4.nextInt();
                System.out.print("Destino: ");
                iteraciones[i].edge[j].dest = scanner5.nextInt();
                System.out.print("Peso: ");
                iteraciones[i].edge[j].weight = scanner6.nextInt();

            }

            try {
                System.out.println("El camino mas corto es: " + iteraciones[i].KruskalMST());

            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Lo siento, Krilin no podra ser revivido");
            }

        }
    }

}
