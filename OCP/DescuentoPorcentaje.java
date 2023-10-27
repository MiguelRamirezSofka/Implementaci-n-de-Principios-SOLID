package OCP;

public class DescuentoPorcentaje implements Descuento{

    @Override
    public Double aplicarDescuento(Double precio) {
        return (precio - (precio*0.5));
    }
}
