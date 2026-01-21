package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public interface EquipamentoFactory {
    Arma criarArma(Classe classe);
    Armadura criarArmadura(Classe classe);
    String[] criarHabilidades(Classe classe);
}
