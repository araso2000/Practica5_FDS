package practica5;

public class DeduccionNormal implements Deduccion{
    
    private double porcentajeDeduccion;
    
    @Override
    public void setDeduccion(double porcentaje) {
        this.porcentajeDeduccion=porcentaje;
    }

    @Override
    public double calcularDeduccion(double importe) {
        return((importe*this.porcentajeDeduccion)/100);
    }
}
