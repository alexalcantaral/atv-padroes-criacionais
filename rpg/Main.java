package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.service.CriacaoPersonagemService;

public class Main {

    public static void main(String[] args) {

        
        ConfiguracaoJogo config = ConfiguracaoJogo.getInstancia();
        config.setNivelDificuldade(2);

        
        CriacaoPersonagemService service = new CriacaoPersonagemService();

        
        Personagem guerreiroHumano =
                service.criarPersonagem("Arthur", Raca.HUMANO, Classe.GUERREIRO);

        Personagem magoElfo =
                service.criarPersonagem("Elandor", Raca.ELFO, Classe.MAGO);

        Personagem arqueiroOrc =
                service.criarPersonagem("Grom", Raca.ORC, Classe.ARQUEIRO);

        
        Personagem lendario = guerreiroHumano.clone();
        lendario.setNome("Sergio, o Lendário");
        System.out.println("Nível de dificuldade: " + config.getNivelDificuldade());

        System.out.println(guerreiroHumano);
        System.out.println(magoElfo);
        System.out.println(arqueiroOrc);

        System.out.println(lendario);
    }
}
