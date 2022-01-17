package practica5;

public class IVANormal implements IVA{
    
    private final double PORCENTAJE_IVA_NORMAL = 0.16;

    @Override
    public double getPorcentajeIvaNormal() {
        return(this.PORCENTAJE_IVA_NORMAL);
    }

    @Override
    public double calcularIVA(double importe) {
        return(importe*this.PORCENTAJE_IVA_NORMAL);
    }
    
}
