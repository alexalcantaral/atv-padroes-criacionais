package br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.gateway;

import br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.sdk.PagSeguroSDK;

public class PagSeguroGateway implements PagamentoGateway{

    private final PagSeguroSDK pagSeguroSDK = new PagSeguroSDK();

    @Override
    public void pagar(double valor) {
        pagSeguroSDK.pagar(valor);
    }
}
