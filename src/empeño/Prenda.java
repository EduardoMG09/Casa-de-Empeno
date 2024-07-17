/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empeño;

/**
 *
 * @author Jorge Martinez
 */
public class Prenda {
    private String prenda;
    private String categoria;
    private cliente dueño;
    private String fecha;
    private double valorComercial;
    private double prestamo;
    private CasaEmpeño payback;

    public Prenda(String prenda, String categoria, String fecha, double valorComercial) {
        this.prenda = prenda;
        this.categoria = categoria;
        //this.dueño = dueño;
        this.fecha = fecha;
        this.valorComercial = valorComercial;        
    }
    
    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDueño(cliente dueño) {
        this.dueño = dueño;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public void setPrestamo(double X) {
        X = X - (X*.40);
        this.prestamo = X;
    }

    public String getPrenda() {
        return prenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public cliente getDueño() {
        return dueño;
    }

    public String getFecha() {
        return fecha;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public double getPrestamo() {
        return prestamo;
    }
    
    
}
