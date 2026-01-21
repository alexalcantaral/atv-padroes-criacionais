package br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway;

import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.sdk.StripeSDK;

public class StripeGateway implements PagamentoGateway{

    private final StripeSDK stripeSDK = new StripeSDK();

    @Override
    public void pagar(double valor) {
        stripeSDK.cobrar(valor);
    }
}
