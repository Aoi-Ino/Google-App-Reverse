package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.DataOpt;

import cm.g;

public abstract class DataHandler implements gh.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21376b = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private String f21377a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        System.loadLibrary("system-arch");
    }

    public void a(String str) {
        this.f21377a = getResUrl(str) + getPayment();
    }

    public String b() {
        return this.f21377a;
    }

    public final native String getPayment();

    public final native String getResUrl(String str);
}
