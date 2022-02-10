package co.sofka.main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class main {


    static Movdrxx moverFunction = new Movdrxx();

    public static Long[] memoria = new Long[43];

    static INV invfuncion = new INV();
    static MOV mov = new MOV();
    static DEC dec= new DEC();
    static FuncionINC inc = new FuncionINC();
    public static void main(String[] args) {

        Long cero = Long.valueOf(0);
        Arrays.fill(memoria, cero);
        //ArrayList instrucciones = new ArrayList<String>();
        String [] ins={"MOV 5,R00", "MOV 10,R01", "JZ 7", "ADD R02,R01", "DEC R00", "JMP 3", "MOV R02,R42"};
        hacerTareas(ins);
    }

    public static void hacerTareas(String[] instrucciones) {

        String[] instrucionesDesglosadas = new String[instrucciones.length];
        String[] instruccionArelizar = new String[2];
        String[] parametros = new String[2];
        int i = 0;
        String instruccionx;
        for ( int h = 0; h < instrucciones.length;h++ ) {

            String instruccion = instrucciones[h];
            if (h <= 1024) {
                instruccionArelizar = instruccion.split(" ");
                instruccionx = instruccionArelizar[0];
                parametros = instruccionArelizar[1].split(",");
                switch (instruccionx) {
                    case "MOV":
                        if (parametros[0].contains("R"))
                            mov.mover(parametros);
                        else moverFunction.moverNumeroD_ARxx(parametros);
                        break;
                    case "ADD":
                        memoria = MethodADD.ADD(memoria, parametros);
                        break;
                    case "DEC":
                        dec.instruccionDEC(parametros, memoria);
                        break;
                    case "INC":
                        inc.INC(parametros[0]);
                        break;
                    case "JMP":
                        if (h >= 1024 && h>= instrucciones.length) {

                        } else {
                            h= Integer.parseInt(parametros[0])-2;
                        }
                        break;

                    case "JZ":
                        if (memoria[0]==0) {
                            h= Integer.parseInt(parametros[0])-2;
                        }
                        break;
                    case "INV":
                        invfuncion.INVFuncion(parametros[0]);
                        break;

                    case "NOP":
                        break;

                }


            }else{
                System.out.println("SE REBASO EL MAXIMO DE INSTRUCCIONES");
                System.out.println(memoria[42]);
                break;
        }

        }
        System.out.println(memoria[42]);
    }
}


