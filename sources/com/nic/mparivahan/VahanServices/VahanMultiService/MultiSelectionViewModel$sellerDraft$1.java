package com.nic.mparivahan.VahanServices.VahanMultiService;

import cm.u;
import retrofit2.Call;
import retrofit2.Callback;

public final class MultiSelectionViewModel$sellerDraft$1 implements Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u f21068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MultiSelectionViewModel f21069b;

    MultiSelectionViewModel$sellerDraft$1(u uVar, MultiSelectionViewModel multiSelectionViewModel) {
        this.f21068a = uVar;
        this.f21069b = multiSelectionViewModel;
    }

    public void onFailure(Call call, Throwable th2) {
        this.f21069b.t().k(th2 != null ? th2.toString() : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.nic.mparivahan.Security.SecModle.SecurityModle} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(retrofit2.Call r4, retrofit2.Response r5) {
        /*
            r3 = this;
            java.lang.String r4 = "error"
            r0 = 0
            if (r5 == 0) goto L_0x004d
            int r1 = r5.code()     // Catch:{ Exception -> 0x0017 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x004d
            if (r5 == 0) goto L_0x001a
            java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0017 }
            r0 = r5
            com.nic.mparivahan.Security.SecModle.SecurityModle r0 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r0     // Catch:{ Exception -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r5 = move-exception
            goto L_0x00ab
        L_0x001a:
            pb.a$a r5 = pb.a.f14908a     // Catch:{ Exception -> 0x0017 }
            cm.u r1 = r3.f21068a     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0017 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0017 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r0 = r0.getData()     // Catch:{ Exception -> 0x0017 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r5 = r5.a(r1, r0)     // Catch:{ Exception -> 0x0017 }
            i7.d r0 = new i7.d     // Catch:{ Exception -> 0x0017 }
            r0.<init>()     // Catch:{ Exception -> 0x0017 }
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse> r1 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse.class
            java.lang.Object r5 = r0.j(r5, r1)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r0 = "fromJson(...)"
            cm.l.e(r5, r0)     // Catch:{ Exception -> 0x0017 }
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse r5 = (com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse) r5     // Catch:{ Exception -> 0x0017 }
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r3.f21069b     // Catch:{ Exception -> 0x0017 }
            androidx.lifecycle.a0 r0 = r0.s()     // Catch:{ Exception -> 0x0017 }
            r0.k(r5)     // Catch:{ Exception -> 0x0017 }
            goto L_0x00c2
        L_0x004d:
            if (r5 == 0) goto L_0x0058
            int r1 = r5.code()     // Catch:{ Exception -> 0x0017 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 != r2) goto L_0x0058
            goto L_0x0062
        L_0x0058:
            if (r5 == 0) goto L_0x00a1
            int r1 = r5.code()     // Catch:{ Exception -> 0x0017 }
            r2 = 409(0x199, float:5.73E-43)
            if (r1 != r2) goto L_0x00a1
        L_0x0062:
            um.e0 r1 = r5.errorBody()     // Catch:{ Exception -> 0x0017 }
            java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0017 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x0017 }
            r1.<init>()     // Catch:{ Exception -> 0x0017 }
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$sellerDraft$1$onResponse$type$1 r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$sellerDraft$1$onResponse$type$1     // Catch:{ Exception -> 0x0017 }
            r2.<init>()     // Catch:{ Exception -> 0x0017 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x0017 }
            um.e0 r5 = r5.errorBody()     // Catch:{ Exception -> 0x0017 }
            cm.l.c(r5)     // Catch:{ Exception -> 0x0017 }
            java.io.Reader r5 = r5.charStream()     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r5 = r1.h(r5, r2)     // Catch:{ Exception -> 0x0017 }
            com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ErroMultiSelection r5 = (com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ErroMultiSelection) r5     // Catch:{ Exception -> 0x0017 }
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r1 = r3.f21069b     // Catch:{ Exception -> 0x0017 }
            androidx.lifecycle.a0 r1 = r1.t()     // Catch:{ Exception -> 0x0017 }
            if (r5 == 0) goto L_0x009a
            com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ApiMessage r5 = r5.getApiMessage()     // Catch:{ Exception -> 0x0017 }
            if (r5 == 0) goto L_0x009a
            java.lang.String r0 = r5.getDeveloperMessage()     // Catch:{ Exception -> 0x0017 }
        L_0x009a:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0017 }
            r1.k(r0)     // Catch:{ Exception -> 0x0017 }
            goto L_0x00c2
        L_0x00a1:
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r3.f21069b     // Catch:{ Exception -> 0x0017 }
            androidx.lifecycle.a0 r5 = r5.t()     // Catch:{ Exception -> 0x0017 }
            r5.k(r4)     // Catch:{ Exception -> 0x0017 }
            goto L_0x00c2
        L_0x00ab:
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r3.f21069b
            androidx.lifecycle.a0 r0 = r0.t()
            r0.k(r4)
            r5.printStackTrace()
            pl.x r4 = pl.x.f30437a
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FinalRequest-ERROR"
            android.util.Log.e(r5, r4)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$sellerDraft$1.onResponse(retrofit2.Call, retrofit2.Response):void");
    }
}
