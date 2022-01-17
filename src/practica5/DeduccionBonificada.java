package practica5;

public class DeduccionBonificada implements Deduccion{

    private double porcentajeDeduccion;
    
    @Override
    public void setDeduccion(double porcentaje) {
        this.porcentajeDeduccion=(2*porcentaje);
    }

    @Override
    public double calcularDeduccion(double importe) {
        return((importe*this.porcentajeDeduccion)/100);
    }
    
}
