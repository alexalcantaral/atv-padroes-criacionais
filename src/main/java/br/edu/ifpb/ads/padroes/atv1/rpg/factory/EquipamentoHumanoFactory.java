package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public class EquipamentoHumanoFactory implements EquipamentoFactory {

    public Arma criarArma(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new Arma("Espada Longa", 25);
            case MAGO -> new Arma("Cajado Arcano", 15);
            case ARQUEIRO -> new Arma("Arco Composto", 20);
        };
    }

    public Armadura criarArmadura(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new Armadura("Placas", 20);
            case MAGO -> new Armadura("Vestes", 8);
            case ARQUEIRO -> new Armadura("Couro", 12);
        };
    }

    public String[] criarHabilidades(Classe classe) {
        return switch (classe) {
            case GUERREIRO -> new String[]{"Investida", "Bloqueio"};
            case MAGO -> new String[]{"Bola de Fogo", "Cura"};
            case ARQUEIRO -> new String[]{"Tiro Preciso", "Rajada"};
        };
    }
}
