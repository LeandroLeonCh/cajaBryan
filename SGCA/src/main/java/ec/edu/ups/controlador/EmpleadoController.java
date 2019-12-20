/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Starman
 */
public class EmpleadoController {

    private List<Empleado> empleadoList;

    public EmpleadoController() {
        empleadoList = new ArrayList<>();
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public void crearEmpleado(Empleado empleado) {
        empleadoList.add(empleado);
    }

    public Empleado buscarEmpleado(String cedula) {
        for (Empleado empleado : empleadoList) {
            if (empleado.getpCedula().equals(cedula)) {
                return empleado;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(String cedula) {
        for (int i = 0; i < empleadoList.size(); i++) {
            Empleado s = empleadoList.get(i);
            if (s.getpCedula().equals(cedula)) {
                empleadoList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizarEmpleado(String cedula, Empleado empleado) {
        for (int i = 0; i < empleadoList.size(); i++) {
            Empleado s = empleadoList.get(i);
            if (s.getpCedula().equals(cedula)) {
                empleadoList.set(i, empleado);
                return true;
            }
        }
        return false;
    }
}
