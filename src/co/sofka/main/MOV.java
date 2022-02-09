package co.sofka.main;


public class MOV {

    public static void mover(String parametros[]){

        int registro1 = Integer.parseInt(parametros[0].substring(1,3));
        int registro2 = Integer.parseInt(parametros[1].substring(1,3));
        main.memoria[registro2] = main.memoria[registro1];
        //System.out.println(main.memoria[registro2]);
    }
}
