package practica5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Factura con IVA Reducido y Deduccion Bonificada");
        FacturaFactorizada factura1 = new FacturaFactorizada(new DeduccionBonificada(),new IVAReducido());
        
        System.out.println("Introduzca porcentaje Deduccion Bonificada (Doble)");
        factura1.setPorcentajeDeduccion(scan.nextDouble());
        
        System.out.println("Introduzca importe de la factura");
        factura1.setImporteFactura(scan.nextDouble());
        
        factura1.calcularTotal();
        System.out.println("Importe IVA: " + factura1.getImporteIVA() + " - Importe Deduccion: " + factura1.getImporteDeduccion() + " - Importe Factura: " + factura1.getImporteFactura());
        System.out.println("Importe TOTAL: " + factura1.getImporteTotal());
        
        //-------------------------------------------------------------------------------------------------------------------
        
        System.out.println("Factura con IVA Normal y Deduccion Normal");
        FacturaFactorizada factura2 = new FacturaFactorizada(new DeduccionNormal(),new IVANormal());
        
        System.out.println("Introduzca porcentaje Deduccion Normal");
        factura2.setPorcentajeDeduccion(scan.nextDouble());
        
        System.out.println("Introduzca importe de la factura");
        factura2.setImporteFactura(scan.nextDouble());
        
        factura2.calcularTotal();
        System.out.println("Importe IVA: " + factura2.getImporteIVA() + " - Importe Deduccion: " + factura2.getImporteDeduccion() + " - Importe Factura: " + factura2.getImporteFactura());
        System.out.println("Importe TOTAL: " + factura2.getImporteTotal());
    }
}