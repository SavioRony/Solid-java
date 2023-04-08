package rh.service.reajuste;

import rh.exception.ValidacaoException;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriocidadeReajuste implements ValidacaoReajuste {
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataDoUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long quantMesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataDoUltimoReajuste, dataAtual);
        if (quantMesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intevalo de meses não pode ser menor que 6 desde o ultimo reajuste!");
        }
    }
}
