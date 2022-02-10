package co.sofka.main;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static MOV moverFunction= new MOV();

    public static  Long[] memoria = new Long[43];
    public static void main(String[] args) {
        System.out.println("Buenas tardes creador, ingrese las tareas a realiza, al terminar ingrese 0");
        Scanner sc = new Scanner(System.in);
        String instruccion = sc.nextLine();
        int opcion = -1;
        //  ArrayList instrucciones=new ArrayList<String>();

    }

    public static void hacerTareas(String[] instrucciones) {
        String[] instrucionesDesglosadas= new String[instrucciones.length];
       String[] instruccionArelizar= new String[2];
        String[] parametros= new String[2];
        int i=0;
        String instruccionx;
        for (String instruccion: instrucciones) {

            instruccionArelizar=instruccion.split(" ");
            instruccionx=instruccionArelizar[0];
            parametros=instruccionArelizar[1].split(",");
        switch (instruccionx){
            case "MOV":
                moverFunction.mover(parametros);
                break;
            case "ADD":

                break;
            case "DEC":

               break;
            case "INC":

                break;
            case "JMP":

                break;

            case "JZ":

                break;




        }
            i++;
        }
    }
    public static void MOV (String parametro1, String parametro2){

    }

}
