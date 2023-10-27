package LSP;

import SRP.Forma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculadoraArea {

    public List<Double> calcularAreaTotal(Forma[] formas){
        return Arrays.stream(formas).map(Forma::calcularArea).collect(Collectors.toList());
    }

}
