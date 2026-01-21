package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public class EquipamentoElfoFactory implements EquipamentoFactory {

    @Override
    public Arma criarArma(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new Arma("Lâmina Élfica", 22);
            case MAGO -> new Arma("Cajado da Natureza", 18);
            case ARQUEIRO -> new Arma("Arco Longo Élfico", 28);
        };
    }

    @Override
    public Armadura criarArmadura(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new Armadura("Cota de Malha Élfica", 15);
            case MAGO -> new Armadura("Mantos Élficos", 10);
            case ARQUEIRO -> new Armadura("Armadura de Couro Élfico", 14);
        };
    }

    @Override
    public String[] criarHabilidades(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new String[]{"Dança das Lâminas", "Agilidade Élfica"};
            case MAGO -> new String[]{"Magia da Natureza", "Teleporte"};
            case ARQUEIRO -> new String[]{"Tiro Múltiplo", "Camuflagem"};
        };
    }
}
