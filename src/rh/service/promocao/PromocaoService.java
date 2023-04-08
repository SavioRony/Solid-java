package rh.service.promocao;

import rh.exception.ValidacaoException;
import rh.model.Cargo;
import rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerente não podem ser promovido!");
        }
        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }
    }
}
