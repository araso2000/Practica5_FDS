package practica5;

public class IVAReducido implements IVA{
    private final double PORCENTAJE_IVA_NORMAL = 0.08;

    @Override
    public double getPorcentajeIvaNormal() {
        return(this.PORCENTAJE_IVA_NORMAL);
    }

    @Override
    public double calcularIVA(double importe) {
        return(importe*this.PORCENTAJE_IVA_NORMAL);
    }
}
