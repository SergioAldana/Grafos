package co.edu.utadeo;

public class App {

    // Driver Program
    public static void main(String[] args) {

        /* Let us create following weighted ejercicioTres
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */
        int V = 4;  // Number of vertices in ejercicioTres
        int E = 5;  // Number of edges in ejercicioTres
        EjercicioTres ejercicioTres = new EjercicioTres(V, E);

        // add edge 0-1
        ejercicioTres.edge[0].src = 0;
        ejercicioTres.edge[0].dest = 1;
        ejercicioTres.edge[0].weight = 10;

        // add edge 0-2
        ejercicioTres.edge[1].src = 0;
        ejercicioTres.edge[1].dest = 2;
        ejercicioTres.edge[1].weight = 6;

        // add edge 0-3
        ejercicioTres.edge[2].src = 0;
        ejercicioTres.edge[2].dest = 3;
        ejercicioTres.edge[2].weight = 5;

        // add edge 1-3
        ejercicioTres.edge[3].src = 1;
        ejercicioTres.edge[3].dest = 3;
        ejercicioTres.edge[3].weight = 15;

        // add edge 2-3
        ejercicioTres.edge[4].src = 2;
        ejercicioTres.edge[4].dest = 3;
        ejercicioTres.edge[4].weight = 4;

        System.out.println(ejercicioTres.KruskalMST());
    }

}
