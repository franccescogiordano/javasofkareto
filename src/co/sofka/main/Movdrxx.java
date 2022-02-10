package co.sofka.main;

import java.util.Locale;

public class Movdrxx {
    public static String[] Emulador = new String[43];
    //Llenar el emulador de ceros

    public Movdrxx(String[] emulador) {
        Emulador = emulador;
        for (int i = 0; i < 42 ; i++) {
            Emulador[i] = "00000000000000000000000000000000";
        }
    }

    public static void moverNumeroD_ARxx(String[] parametros){
        int numeroDecimal = Integer.parseInt(parametros[0]);
        String accion = parametros[1].toLowerCase();
        int ubicacion = Integer.parseInt(accion.replace("r",""));
        Emulador[ubicacion] = Integer.toBinaryString(numeroDecimal);
    }
}
