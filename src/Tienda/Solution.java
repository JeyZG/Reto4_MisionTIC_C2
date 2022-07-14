package Tienda;

import java.util.ArrayList;
import java.util.Collections;

public class Solution{
    public static Object[] reportes(ArrayList <Cliente> tienda){

        // Definicion e inicializacion de variables locales a usar en el metodo
        double suma = 0, promedio;
        String nombreClienteMenosPago = "", nombreClienteMasPago = "";
        int tamanoArray = tienda.size(), totalMasBajo, totalMasAlto;
        ArrayList<Integer> arrayTotales = new ArrayList<Integer>();

        // Recorrer el array de clientes para obtener la suma de las compras y
        // crear el array con el total de cada uno de ellos
        for(Cliente cliente : tienda){
            suma += cliente.getTotalAPagar();
            arrayTotales.add(cliente.getTotalAPagar());
        }

        // Calculamos el promedio de compras de todos los clientes
        promedio = suma / tamanoArray;

        // Ordenamos el array de totales en forma ascendente
        Collections.sort(arrayTotales);

        // Extraemos los valores mas bajo y mas alto del array de totales
        totalMasBajo = arrayTotales.get(0);
        totalMasAlto = arrayTotales.get(tamanoArray - 1);

        // Recorremos el array de clientes para obtener el nombre del cliente que menos pagó
        for(Cliente cliente : tienda){
            if(cliente.getTotalAPagar() == totalMasBajo){
                nombreClienteMenosPago = cliente.getNombreCompleto();
                break;
            }
        }

        // Recorremos el array de clientes para obtener el nombre del cliente que más pagó
        for(Cliente cliente : tienda){
            if(cliente.getTotalAPagar() == totalMasAlto){
                nombreClienteMasPago = cliente.getNombreCompleto();
                break;
            }
        }

        // Retornamos un array de tipo Object con los valores obtenidos
        return new Object[] {promedio, nombreClienteMenosPago, totalMasBajo,  nombreClienteMasPago, totalMasAlto};
    }
}