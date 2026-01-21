package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public class EquipamentoOrcFactory implements EquipamentoFactory {

    @Override
    public Arma criarArma(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new Arma("Machado de Guerra", 30);
            case MAGO -> new Arma("Cajado Tribal", 12);
            case ARQUEIRO -> new Arma("Arco de Osso", 24);
        };
    }

    @Override
    public Armadura criarArmadura(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new Armadura("Armadura Brutal", 25);
            case MAGO -> new Armadura("Vestes Xamânicas", 6);
            case ARQUEIRO -> new Armadura("Couro de Besta", 16);
        };
    }

    @Override
    public String[] criarHabilidades(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new String[]{"Fúria", "Pancada Devastadora"};
            case MAGO -> new String[]{"Magia Sombria", "Invocação"};
            case ARQUEIRO -> new String[]{"Tiro Brutal", "Intimidação"};
        };
    }
}
