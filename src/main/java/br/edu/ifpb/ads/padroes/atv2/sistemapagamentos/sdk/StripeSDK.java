package br.edu.ifpb.ads.padroes.atv2.sistemapagamentos.sdk;

public class StripeSDK {
    public void cobrar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Stripe");
    }
}
