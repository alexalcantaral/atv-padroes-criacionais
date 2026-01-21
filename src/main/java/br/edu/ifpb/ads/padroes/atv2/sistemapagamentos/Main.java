package br.edu.ifpb.ads.padroes.atv2.sistemapagamentos;

import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway.PaypalGateway;
import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway.StripeGateway;
import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector injectorPaypal = Guice.createInjector(
                new PagamentoModule(PaypalGateway.class)
        );

        PagamentoService pagamentoPaypal =
                injectorPaypal.getInstance(PagamentoService.class);

        pagamentoPaypal.pagar(150.0);

        Injector injectorStripe = Guice.createInjector(
                new PagamentoModule(StripeGateway.class)
        );

        PagamentoService pagamentoStripe =
                injectorStripe.getInstance(PagamentoService.class);

        pagamentoStripe.pagar(300.0);

        Injector injectorPagSeguro = Guice.createInjector(
                new PagamentoModule(PagSeguroGateway.class)
        );

        PagamentoService pagamentoPagSeguro =
                injectorPagSeguro.getInstance(PagamentoService.class);

        pagamentoPagSeguro.pagar(500.0);
    }
}
