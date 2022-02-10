package co.sofka.main;
/*
* INC Rxx → aumenta el valor de Rxx en 1. Si el valor del registro es 2 a la 32–1, al aumentarlo se
* genera un desbordamiento obteniendo por resultado 0;
*
* */
public class FuncionINC {

    public void INC(String Rxx)
    {
        String posicion = Rxx.replace("R", "");

        if ( main.memoria[Integer.parseInt(posicion)] >= Long.parseLong("4294967295",32))
        {
            main.memoria[Integer.parseInt(posicion)] = (long) 0;

        }
        else{
            main.memoria[Integer.parseInt(posicion)] =  main.memoria[Integer.parseInt(posicion)] + 1;
        }

    }

}
