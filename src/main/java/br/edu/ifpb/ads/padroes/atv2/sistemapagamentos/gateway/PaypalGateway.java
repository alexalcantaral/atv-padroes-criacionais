package br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway;

import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.sdk.PaypalSDK;

public class PaypalGateway implements PagamentoGateway{

    private final PaypalSDK paypalSDK = new PaypalSDK();

    @Override
    public void pagar(double valor) {
        paypalSDK.realizarPagamento(valor);
    }
}
