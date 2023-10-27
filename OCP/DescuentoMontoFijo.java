package OCP;

public class DescuentoMontoFijo implements Descuento{

    @Override
    public Double aplicarDescuento(Double precio) {
        return precio - 5000;
    }
}
