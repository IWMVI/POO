package controller;

public class OperacaoController {

    public int operacaoValor(int numero) throws ParametroNegativoException {
        if (numero < 0) {
            throw new ParametroNegativoException("O parâmetro não pode ser negativo.");
        } else {
            if (numero % 2 == 0) {
                return numero * numero;
            } else {
                return numero * numero * numero;
            }
        }
    }
}
