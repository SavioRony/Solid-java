import rh.model.Cargo;
import rh.model.Funcionario;
import rh.service.reajuste.ReajusteService;
import rh.service.reajuste.ValidacaoPercentualReajuste;
import rh.service.reajuste.ValidacaoPeriocidadeReajuste;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Savio","45688795824", Cargo.ANALISTA, new BigDecimal("1000.00"));
        ReajusteService reajusteService = new ReajusteService(List.of(new ValidacaoPercentualReajuste(), new ValidacaoPeriocidadeReajuste()));
        reajusteService.reajustarSalarioDoFuncionario(funcionario, new BigDecimal(500));

    }
}