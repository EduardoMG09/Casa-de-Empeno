/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empeño;

/**
 *
 * @author Jorge Martinez
 */
public class cliente {
    private String nombre;
    private String telefono;
    private double saldo;
    private String prenda;

    public cliente(String nombre, String telefono, double saldo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }
    
    
}
