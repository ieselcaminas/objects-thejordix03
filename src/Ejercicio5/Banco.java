package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

// Clase Banco
class Banco {
    private int n_ent;
    private String nombre;
    private List<Sucursal> sucursales;

    public Banco(int n_ent, String nombre, List<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = (sucursales != null) ? sucursales : new ArrayList<>();
    }

    public int getN_ent() {
        return n_ent;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            this.sucursales.add(sucursal);
        }
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco: ").append(nombre).append(" (ID: ").append(n_ent).append(")\n");
        sb.append("Sucursales:\n");
        for (Sucursal s : sucursales) {
            sb.append(" - ").append(s.getNombre()).append(" (ID: ").append(s.getId()).append(")\n");
        }
        return sb.toString();
    }
}