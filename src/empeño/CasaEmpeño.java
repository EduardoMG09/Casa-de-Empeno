/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empeño;

/**
 *
 * @author Jorge Martinez
 */
public class CasaEmpeño {
    private int numClientesRegistrados;
    private double reembolso;
    private double pagofinal;

    public CasaEmpeño() {
    }
    
    void agregarClientes(){
        this.numClientesRegistrados += 1;
    }
    void visualizarClientes(){
        
    }

    public double getReembolso() {
        return reembolso;
    }

    public double getPagofinal() {
        return pagofinal;
    }

    public void setReembolso(double reembolso) {
        this.reembolso = reembolso;
    }

    public void setPagofinal(double s) {
        this.pagofinal = this.pagofinal + s;
    }
    
}
