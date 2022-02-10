package co.sofka.main;

import java.util.Arrays;

public class DEC {

    public static void instruccionDEC(String[] parametros, Long [] memoria){
        int reg = Integer.parseInt(parametros[0].replace("R", ""));
        if (memoria[reg] == 0){
            memoria[reg] = Long.parseUnsignedLong("4294967295");
        } else {
            memoria[reg] -= 1;
        }
    }

//    public static void main(String[] args) {
//        Long [] memoria = new Long[43];
//        Long cero = Long.valueOf(0);
//        Arrays.fill(memoria, cero);
//        String [] params = {"R02"};
//        instruccionDEC(params, memoria);
//        System.out.println(memoria[2]);
//    }
}
