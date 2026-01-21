package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public abstract class PersonagemFactory {

    protected EquipamentoFactory equipamentoFactory;

    public Personagem criar(String nome, Raca raca, Classe classe) {

        Arma arma = equipamentoFactory.criarArma(classe);
        Armadura armadura = equipamentoFactory.criarArmadura(classe);
        String[] habilidades = equipamentoFactory.criarHabilidades(classe);

        return new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe(classe)
                .atributos(10, 10, 10, 100, 50)
                .equipamento(arma, armadura, habilidades)
                .build();
    }
}
