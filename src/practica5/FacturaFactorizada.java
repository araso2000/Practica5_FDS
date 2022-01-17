package practica5;

import java.time.LocalDateTime;

public class FacturaFactorizada {
    private String codigo;
    private LocalDateTime fechaEmision;
    private double importeFactura ;
    private double importeIVA;
    private double importeDeduccion;
    private double importeTotal;
    private double porcentajeDeduccion;
    
    private Deduccion deduccion;
    private IVA iva;
    
    public FacturaFactorizada(Deduccion deduccion,IVA iva){
        this.deduccion=deduccion;
        this.iva=iva;
    }
    
    public void calcularTotal() { 
        deduccion.setDeduccion (porcentajeDeduccion); 
        importeIVA = iva.calcularIVA(importeFactura);
        importeDeduccion=deduccion.calcularDeduccion(importeFactura);
        importeTotal=importeFactura-importeDeduccion+importeIVA;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public void setFechaEmision(LocalDateTime fechaEmision){
        this.fechaEmision=fechaEmision;
    }
    
    public void setImporteFactura(double importeFactura){
        this.importeFactura=importeFactura;
    }
    
    public void setPorcentajeDeduccion(double porcentajeDeduccion){
        this.porcentajeDeduccion=porcentajeDeduccion;
    }
    
    public String getCodigo(){
        return(this.codigo);
    }
    
    public LocalDateTime getFechaEmision(){
        return(this.fechaEmision);
    }
    
    public double getImporteFactura(){
        return(this.importeFactura);
    }
    
    public double getImporteIVA(){
        return(this.importeIVA);
    }
    
    public double getImporteDeduccion(){
        return(this.importeDeduccion);
    }
    
    public double getImporteTotal(){
        return(this.importeTotal);
    }
    
    public double getPorcentajeDeduccion(){
        return(this.porcentajeDeduccion);
    }
    
}
