package Tester;

import java.util.ArrayList;
import java.util.Arrays;

import Tienda.*;
import Notas.*;
import Carrera.*;

public class Reto4_tester {

    public static void main(String[] args) {

        Tienda_tester();
        Notas_tester();
        Carrera_tester();

    }

    public static void Tienda_tester() {

        // Arrays de prueba del VPL

        // Array # 1
        ArrayList<Cliente> t1 = new ArrayList<>();
        t1.add(new Cliente("Mateo", "1037543456", 6700, "01/07/2022", "0001"));

        // Array # 2
        ArrayList<Cliente> t2 = new ArrayList<>();
        t2.add(new Cliente("Luz Di", "32675123", 100, "02/07/2022", "0002"));
        t2.add(new Cliente("John Doe", "81200306", 2300, "02/07/2022", "0003"));

        // Array # 3
        ArrayList<Cliente> t3 = new ArrayList<>();
        t3.add(new Cliente("Valeria Di", "10367876345", 9653, "03/07/2022", "0004"));
        t3.add(new Cliente("Johan Doe", "1037645345", 3918, "03/07/2022", "0005"));
        t3.add(new Cliente("Maurice Doe", "98765234", 6048, "03/07/2022", "0006"));
        t3.add(new Cliente("Matthew Doe", "1036789453", 5840, "03/07/2022", "0007"));
        t3.add(new Cliente("Agustina Doe", "10003456", 3940, "03/07/2022", "0008"));
        t3.add(new Cliente("Agustina Doe", "10003456", 3840, "03/07/2022", "0009"));
        t3.add(new Cliente("Milena Doe", "20003456", 3696, "03/07/2022", "0010"));
        t3.add(new Cliente("Carla Di", "103789762", 2432, "03/07/2022", "0011"));

        // Array # 4
        ArrayList<Cliente> t4 = new ArrayList<>();
        t4.add(new Cliente("Valeria Di", "10367876345", 3240, "04/07/2022", "0012"));
        t4.add(new Cliente("Johan Doe", "1037645345", 9048, "04/07/2022", "0012"));
        t4.add(new Cliente("Maurice Doe", "98765234", 2310, "04/07/2022", "0013"));
        t4.add(new Cliente("Matthew Doe", "1036789453", 4680, "04/07/2022", "0014"));
        t4.add(new Cliente("Agustina Doe", "10003456", 3968, "04/07/2022", "0015"));
        t4.add(new Cliente("Agustina Doe", "10003456", 6000, "04/07/2022", "0016"));
        t4.add(new Cliente("Milena Doe", "20003456", 13120, "04/07/2022", "0017"));
        t4.add(new Cliente("Carla Di", "103789762", 5980, "04/07/2022", "0018"));
        t4.add(new Cliente("Luz Di", "32675123", 7240, "04/07/2022", "0019"));
        t4.add(new Cliente("John Doe", "81200306", 29900, "04/07/2022", "0020"));
        t4.add(new Cliente("Mateo", "1037543456", 193600, "04/07/2022", "0021"));

        // Array # 5
        ArrayList<Cliente> t5 = new ArrayList<>();
        t5.add(new Cliente("Valeria Di", "10367876345", 2700, "05/07/2022", "0022"));
        t5.add(new Cliente("Johan Doe", "1037645345", 9500, "05/07/2022", "0022"));
        t5.add(new Cliente("Maurice Doe", "98765234", 300, "05/07/2022", "0022"));
        t5.add(new Cliente("Matthew Doe", "1036789453", 15000, "05/07/2022", "0022"));
        t5.add(new Cliente("Agustina Doe", "10003456", 1800, "05/07/2022", "0022"));
        t5.add(new Cliente("Agustina Doe", "10003456", 10000, "05/07/2022", "0022"));
        t5.add(new Cliente("Milena Doe", "20003456", 400, "05/07/2022", "0022"));
        t5.add(new Cliente("Carla Di", "103789762", 3000, "05/07/2022", "0022"));
        t5.add(new Cliente("Luz Di", "32675123", 400, "05/07/2022", "0022"));

        // LLamado del metodo reportes()
        Object[] Respuesta_t1 = Tienda.Solution.reportes(t1);
        Object[] Respuesta_t2 = Tienda.Solution.reportes(t2);
        Object[] Respuesta_t3 = Tienda.Solution.reportes(t3);
        Object[] Respuesta_t4 = Tienda.Solution.reportes(t4);
        Object[] Respuesta_t5 = Tienda.Solution.reportes(t5);

        // Impresion de los resultados de la prueba
        System.out.println("Respuesta t1 = " + Arrays.toString(Respuesta_t1));

        System.out.println("Respuesta t2 = " + Arrays.toString(Respuesta_t2));

        System.out.println("Respuesta t3 = " + Arrays.toString(Respuesta_t3));

        System.out.println("Respuesta t4 = " + Arrays.toString(Respuesta_t4));

        System.out.println("Respuesta t5 = " + Arrays.toString(Respuesta_t5));

    }
    public static void Notas_tester() {

        // Array de ejemplo PDF
        ArrayList<Estudiante> grupo = new ArrayList<>();
        grupo.add(new Estudiante("John Doe", "0123", 5.0, 4, 8));
        grupo.add(new Estudiante("Jane Doe", "9283", 4.1, 7, 13));
        grupo.add(new Estudiante("Pepito Perez", "0194", 1.5, 5, 9));
        grupo.add(new Estudiante("Fulano de tal", "9013", 2.3, 2, 6));

        // Arrays de prueba del VPL

        // Array # 1
        ArrayList<Estudiante> g1 = new ArrayList<>();
        g1.add(new Estudiante("Mateo", "1037543456", 4.1, 7, 13));

        // Array # 2
        ArrayList<Estudiante> g2 = new ArrayList<>();
        g2.add(new Estudiante("Luz Di", "32675123", 4.8, 10, 7));
        g2.add(new Estudiante("John Doe", "81200306", 1.5, 10, 16));

        // Array # 3
        ArrayList<Estudiante> g3 = new ArrayList<>();
        g3.add(new Estudiante("Valeria Di", "10367876345", 2.3, 8, 8));
        g3.add(new Estudiante("Johan Doe", "1037645345", 0.1, 9, 17));
        g3.add(new Estudiante("Maurice Doe", "98765234", 0.9, 2, 19));
        g3.add(new Estudiante("Matthew Doe", "1036789453", 1.4, 5, 12));
        g3.add(new Estudiante("Agustina Doe", "10003456", 1.8, 6, 13));
        g3.add(new Estudiante("Agustina Doe", "10003456", 1.5, 4, 15));
        g3.add(new Estudiante("Milena Doe", "20003456", 3.0, 2, 16));
        g3.add(new Estudiante("Carla Di", "103789762", 0.5, 8, 13));

        // Array # 4
        ArrayList<Estudiante> g4 = new ArrayList<>();
        g4.add(new Estudiante("Valeria Di", "10367876345", 2.0, 8, 7));
        g4.add(new Estudiante("Johan Doe", "1037645345", 4.3, 7, 15));
        g4.add(new Estudiante("Maurice Doe", "98765234", 2.0, 6, 17));
        g4.add(new Estudiante("Matthew Doe", "1036789453", 1.7, 2, 14));
        g4.add(new Estudiante("Agustina Doe", "10003456", 1.8, 3, 13));
        g4.add(new Estudiante("Agustina Doe", "10003456", 2.1, 10, 9));
        g4.add(new Estudiante("Milena Doe", "20003456", 0.4, 9, 17));
        g4.add(new Estudiante("Carla Di", "103789762", 3.6, 6, 17));
        g4.add(new Estudiante("Luz Di", "32675123", 3.0, 1, 6));
        g4.add(new Estudiante("John Doe", "81200306", 3.4, 9, 8));
        g4.add(new Estudiante("Mateo", "1037543456", 4.5, 4, 9));

        // Array # 5
        ArrayList<Estudiante> g5 = new ArrayList<>();
        g5.add(new Estudiante("Valeria Di", "10367876345", 1.8, 3, 10));
        g5.add(new Estudiante("Johan Doe", "1037645345", 3.4, 2, 7));
        g5.add(new Estudiante("Maurice Doe", "98765234", 4.5, 8, 13));
        g5.add(new Estudiante("Matthew Doe", "1036789453", 1.8, 8, 16));
        g5.add(new Estudiante("Agustina Doe", "10003456", 3.4, 7, 15));
        g5.add(new Estudiante("Agustina Doe", "10003456", 0.5, 3, 12));
        g5.add(new Estudiante("Milena Doe", "20003456", 0.4, 6, 7));
        g5.add(new Estudiante("Carla Di", "103789762", 2.4, 1, 15));
        g5.add(new Estudiante("Luz Di", "32675123", 2.0, 5, 12));

        // LLamado del metodo reportes()
        Object[] retorno1 = Notas.Solucion.reportes(grupo);
        Object[] Respuesta_g1 = Notas.Solucion.reportes(g1);
        Object[] Respuesta_g2 = Notas.Solucion.reportes(g2);
        Object[] Respuesta_g3 = Notas.Solucion.reportes(g3);
        Object[] Respuesta_g4 = Notas.Solucion.reportes(g4);
        Object[] Respuesta_g5 = Notas.Solucion.reportes(g5);

        // Impresion de los resultados de la prueba
        System.out.println("Respuesta ejemplo PDF = " + Arrays.toString(retorno1));
        System.out.println("Respuesta grupo # 1 = " + Arrays.toString(Respuesta_g1));
        System.out.println("Respuesta grupo # 2 = " + Arrays.toString(Respuesta_g2));
        System.out.println("Respuesta grupo # 3 = " + Arrays.toString(Respuesta_g3));
        System.out.println("Respuesta grupo # 4 = " + Arrays.toString(Respuesta_g4));
        System.out.println("Respuesta grupo # 5 = " + Arrays.toString(Respuesta_g5));
    }
    public static void Carrera_tester() {

        // Array de ejemplo PDF
        ArrayList<Corredor> carrera = new ArrayList<>();
        carrera.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22));
        carrera.add(new Corredor("Juan Corredor", "28", 1.75, 24, 21));
        carrera.add(new Corredor("Carlos Perez", "19", 1.71, 28, 24));
        carrera.add(new Corredor("Maria Cadavid", "13", 1.80, 32, 22));

        // Arrays de prueba del VPL

        // Array # 1
        ArrayList<Corredor> c1 = new ArrayList<>();
        c1.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22.0));

        // Array # 2
        ArrayList<Corredor> c2 = new ArrayList<>();
        c2.add(new Corredor("Luz Diaz", "75", 1.7, 22, 26.0));
        c2.add(new Corredor("John Doe", "81", 1.76, 27, 30.0));

        // Array # 3
        ArrayList<Corredor> c3 = new ArrayList<>();
        c3.add(new Corredor("Valeria Diez", "87", 1.63, 20, 40.0));
        c3.add(new Corredor("Johan Doe", "64", 1.8, 27, 45.0));
        c3.add(new Corredor("Maurice Doe", "52", 1.68, 39, 35.0));
        c3.add(new Corredor("Matthew Doe", "13", 1.81, 22, 41.0));
        c3.add(new Corredor("Agustina Doe", "56", 1.7, 28, 33.0));
        c3.add(new Corredor("Agustin Doe", "16", 1.75, 26, 43.0));
        c3.add(new Corredor("Milena Doe", "26", 1.65, 23, 41.0));
        c3.add(new Corredor("Carla Diaz", "47", 1.59, 24, 44.0));

        // Array # 4
        ArrayList<Corredor> c4 = new ArrayList<>();
        c4.add(new Corredor("Valeria Diez", "87", 1.63, 20, 40.0));
        c4.add(new Corredor("Johan Doe", "64", 1.8, 27, 45.0));
        c4.add(new Corredor("Maurice Doe", "52", 1.68, 39, 35.0));
        c4.add(new Corredor("Matthew Doe", "13", 1.81, 22, 41.0));
        c4.add(new Corredor("Agustina Doe", "56", 1.7, 28, 33.0));
        c4.add(new Corredor("Agustin Doe", "16", 1.75, 26, 43.0));
        c4.add(new Corredor("Milena Doe", "26", 1.65, 23, 41.0));
        c4.add(new Corredor("Carla Diaz", "47", 1.59, 24, 44.0));
        c4.add(new Corredor("Luz Diana", "75", 1.64, 31, 45.0));
        c4.add(new Corredor("John Doe", "81", 1.79, 29, 46.0));
        c4.add(new Corredor("Mateo Fernandez", "104", 1.8, 24, 44.0));

        // Array # 5
        ArrayList<Corredor> c5 = new ArrayList<>();
        c5.add(new Corredor("Juan Diez", "87", 1.63, 20, 40.0));
        c5.add(new Corredor("Mateo Doe", "64", 1.8, 27, 45.0));
        c5.add(new Corredor("Fernando Doe", "52", 1.68, 39, 35.0));
        c5.add(new Corredor("Sebastian Doe", "13", 1.81, 22, 41.0));
        c5.add(new Corredor("Gladis Caro", "56", 1.58, 42, 33.0));
        c5.add(new Corredor("Agustin Doe", "16", 1.75, 26, 43.0));
        c5.add(new Corredor("Sergio Doe", "26", 1.65, 23, 41.0));
        c5.add(new Corredor("Carla Giraldo", "47", 1.59, 24, 44.0));
        c5.add(new Corredor("Luz Diana", "75", 1.64, 31, 45.0));
        c5.add(new Corredor("John Doe", "81", 1.79, 29, 46.0));
        c5.add(new Corredor("Mateo Fernandez", "104", 1.8, 24, 44.0));

        // LLamado del metodo reportes()
        Object[] retorno = Carrera.Solution.reporte(carrera);

        Object[] Respuesta_c1 = Carrera.Solution.reporte(c1);
        Object[] Respuesta_c2 = Carrera.Solution.reporte(c2);
        Object[] Respuesta_c3 = Carrera.Solution.reporte(c3);
        Object[] Respuesta_c4 = Carrera.Solution.reporte(c4);
        Object[] Respuesta_c5 = Carrera.Solution.reporte(c5);

        // Impresion de los resultados de la prueba
        System.out.println("Respuesta ejemplo PDF = " + Arrays.toString(retorno));
        System.out.println("Respuesta carrera # 1 = " + Arrays.toString(Respuesta_c1));
        System.out.println("Respuesta carrera # 2 = " + Arrays.toString(Respuesta_c2));
        System.out.println("Respuesta carrera # 3 = " + Arrays.toString(Respuesta_c3));
        System.out.println("Respuesta carrera # 4 = " + Arrays.toString(Respuesta_c4));
        System.out.println("Respuesta carrera # 5 = " + Arrays.toString(Respuesta_c5));
    }
}