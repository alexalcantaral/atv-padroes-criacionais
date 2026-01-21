package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public class PersonagemBuilder {

    private String nome;
    private Raca raca;
    private Classe classe;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder raca(Raca raca) {
        this.raca = raca;
        return this;
    }

    public PersonagemBuilder classe(Classe classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemBuilder atributos(int f, int i, int a, int v, int m) {
        this.forca = f;
        this.inteligencia = i;
        this.agilidade = a;
        this.vida = v;
        this.mana = m;
        return this;
    }

    public PersonagemBuilder equipamento(Arma arma, Armadura armadura, String[] habilidades) {
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
        return this;
    }

    public Personagem build() {
        return new Personagem(nome, raca, classe, forca, inteligencia,
                agilidade, vida, mana, arma, armadura, habilidades);
    }
}
