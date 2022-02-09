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

        if ( emulador[Integer.parseInt(posicion)] >= 4294967295)
        {
            emulador[Integer.parseInt(posicion)] = 0;

        }
        else{
            emulador[Integer.parseInt(posicion)] =  emulador[Integer.parseInt(posicion)] + 1;
        }

    }

}
