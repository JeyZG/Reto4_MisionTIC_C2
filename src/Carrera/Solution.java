package Carrera;

import java.util.ArrayList;
import java.util.Collections;

public class Solution{
    public static Object [] reporte(ArrayList <Corredor> carrera){

        // Definicion e inicializacion de variables locales a usar en el metodo
        double suma = 0, promedio, menorTiempo, mayorTiempo;
        String nombreCorredorMasRapido = "", nombreCorredorMasLento = "";
        int tamanoArray = carrera.size();
        ArrayList<Double> arrayTiempos = new ArrayList<Double>();

        // Recorrer el array de clientes para obtener la suma de las tiempos de llegada
        // a la meta y crear el array con cada uno de ellos
        for(Corredor participante : carrera){
            suma += participante.getTiempoMeta();
            arrayTiempos.add(participante.getTiempoMeta());
        }

        // Calculamos el promedio de los tiempos de llegada a la meta
        promedio = suma / tamanoArray;

        // Ordenamos el array de tiempos en forma ascendente
        Collections.sort(arrayTiempos);

        // Extraemos los valores mas bajo y mas alto del array de tiempos
        menorTiempo = arrayTiempos.get(0);
        mayorTiempo = arrayTiempos.get(tamanoArray - 1);

        // Recorremos el array de clientes para obtener el nombre del cliente que menos pagó
        for(Corredor participante : carrera){
            if(participante.getTiempoMeta() == menorTiempo){
                nombreCorredorMasRapido = participante.getNombreCompleto();
                break;
            }
        }

        // Recorremos el array de clientes para obtener el nombre del cliente que más pagó
        for(Corredor participante : carrera){
            if(participante.getTiempoMeta() == mayorTiempo){
                nombreCorredorMasLento = participante.getNombreCompleto();
                break;
            }
        }

        // Retornamos un array de tipo Object con los valores obtenidos
        return new Object[] {promedio, nombreCorredorMasRapido, menorTiempo,  nombreCorredorMasLento, mayorTiempo};
    }
}