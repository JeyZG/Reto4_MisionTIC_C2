package Notas;

import java.util.ArrayList;
import java.util.Collections;

public class Solucion {
    public static Object[] reportes(ArrayList<Estudiante> grupo) {

        // Definicion e inicializacion de variables locales a usar en el metodo
        double suma = 0, promedio, menorNota, mayorNota;
        String nombreEstudianteMenorNota = "", nombreEstudianteMayorNota = "";
        int tamanoArray = grupo.size();
        ArrayList<Double> arrayNotas = new ArrayList<Double>();

        // Recorrer el array de estudiantes para obtener la suma de las notas y
        // crear el array con el total de cada una de ellos
        for(Estudiante estudiante : grupo){
            suma += estudiante.getNota();
            arrayNotas.add(estudiante.getNota());
        }

        // Calculamos el promedio de compras de todos los clientes
        promedio = suma / tamanoArray;

        // Ordenamos el array de totales en forma ascendente
        Collections.sort(arrayNotas);

        // Extraemos los valores mas bajo y mas alto del array de totales
        menorNota = arrayNotas.get(0);
        mayorNota = arrayNotas.get(tamanoArray - 1);

        // Recorremos el array de clientes para obtener el nombre del cliente que menos pagó
        for(Estudiante estudiante : grupo){
            if(estudiante.getNota() == menorNota){
                nombreEstudianteMenorNota = estudiante.getNombreCompleto();
                break;
            }
        }

        // Recorremos el array de clientes para obtener el nombre del cliente que más pagó
        for(Estudiante estudiante : grupo){
            if(estudiante.getNota() == mayorNota){
                nombreEstudianteMayorNota = estudiante.getNombreCompleto();
                break;
            }
        }

        // Retornamos un array de tipo Object con los valores obtenidos
        return new Object[] {promedio, nombreEstudianteMenorNota, menorNota,  nombreEstudianteMayorNota, mayorNota};
    }
}