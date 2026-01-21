package br.edu.ifpb.ads.padroes.atv1.rpg.service;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public class CriacaoPersonagemService {

    public Personagem criarPersonagem(String nome, Raca raca, Classe classe) {

        EquipamentoFactory equipamentoFactory = escolherEquipamentoFactory(raca);
        PersonagemFactory personagemFactory = new PersonagemFactory() {
            {
                this.equipamentoFactory = equipamentoFactory;
            }
        };

        return personagemFactory.criar(nome, raca, classe);
    }

    private EquipamentoFactory escolherEquipamentoFactory(Raca raca) {
        return switch (raca) {
            case HUMANO -> new EquipamentoHumanoFactory();
            case ELFO -> new EquipamentoElfoFactory();
            case ORC -> new EquipamentoOrcFactory();
        };
    }
}
