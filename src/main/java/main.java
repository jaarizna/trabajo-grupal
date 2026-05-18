package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.Dominio.Criatura;
import main.java.LogicaNegocio.Simulacion;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();	
        a.add(2);
        a.add(1);
        a.add(1);
        System.out.println("LISTA= "+a);

        Simulacion s=new Simulacion(10, a);
       
        s.simular();
        for (String res : s.getResultados()) {
            System.out.println(res);
        }
    }
}
