package co.sofka.main;

public class INV {
    public static void INVFuncion(String instruccion){
        int Position = 0;
        String sinLaR = instruccion.substring(1,instruccion.length());
        Integer posicion=Integer.parseInt(sinLaR);
        Integer numero=main.memoria[posicion];
        String binario = Integer.toBinaryString(numero);
        binario.replace("0","2"); //PASO A LOS 0 A 2 TEMPORALMENTE PARA EVITAR CONFLICTOS
        binario.replace("1","0"); // PASO LOS 1 A 0
        binario.replace("2","1"); //PASO A LOS 2 A 1
        Integer numeroconvertirdo = Integer.parseInt(binario, 2);
        main.memoria[posicion]=numeroconvertirdo;
    }
}
