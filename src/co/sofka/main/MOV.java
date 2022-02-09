package co.sofka.main;


public class MOV {
    //public static  Integer[] memoria = new Integer[43];
    public static void mover(String parametro1, String parametro2){

        int registro1 = Integer.parseInt(parametro1.substring(1,3));
        int registro2 = Integer.parseInt(parametro2.substring(1,3));
        main.memoria[registro2] = main.memoria[registro1];
        //System.out.println(main.memoria[registro2]);
    }
}
