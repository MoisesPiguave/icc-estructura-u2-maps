package controllers;

import java.util.Map;
import java.util.TreeMap;


import models.Empleado;

public class EmpleadoDAOTreemap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreemap() {
        empleados = new TreeMap<>(); 
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void remove(int id) {
       Empleado emp = new Empleado(id);
        empleados.remove(emp);
    }

    @Override
    public void list() {
    if (empleados.isEmpty()) {
        System.out.println("No hay empleados registrados.");
    } else {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }

}

        

}
