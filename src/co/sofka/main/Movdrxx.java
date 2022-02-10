package co.sofka.main;

import java.util.Locale;

public class Movdrxx {

    //Llenar el emulador de ceros

   

    public static void moverNumeroD_ARxx(String[] parametros){
        Long numeroDecimal = Long.parseLong(parametros[0]);
        String accion = parametros[1].toLowerCase();
        String temporal;
        int ubicacion = Integer.parseInt(accion.replace("r",""));
        temporal = Long.toBinaryString(numeroDecimal);
        main.memoria[ubicacion]=Long.parseLong(temporal,2);
    }
}
