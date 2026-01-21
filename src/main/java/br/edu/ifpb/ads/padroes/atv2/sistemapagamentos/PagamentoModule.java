package br.edu.ifpb.ads.padroes.atv2.sistemapagamentos;

import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway.PagamentoGateway;
import com.google.inject.AbstractModule;

public class PagamentoModule extends AbstractModule {

    private final Class<? extends PagamentoGateway> gatewayClass;

    public PagamentoModule(Class<? extends PagamentoGateway> gatewayClass) {
        this.gatewayClass = gatewayClass;
    }

    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(gatewayClass);
    }
}
