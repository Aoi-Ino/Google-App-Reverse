package com.nic.mparivahan.VahanServices.VahanMultiService;

import cm.u;
import retrofit2.Call;
import retrofit2.Callback;

public final class MultiSelectionViewModel$multSelectService$1 implements Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u f21066a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MultiSelectionViewModel f21067b;

    MultiSelectionViewModel$multSelectService$1(u uVar, MultiSelectionViewModel multiSelectionViewModel) {
        this.f21066a = uVar;
        this.f21067b = multiSelectionViewModel;
    }

    public void onFailure(Call call, Throwable th2) {
        this.f21067b.o().k(th2 != null ? th2.getMessage() : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
        r4 = r4.getApiMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(retrofit2.Call r3, retrofit2.Response r4) {
        /*
            r2 = this;
            java.lang.String r3 = "error"
            cm.l.c(r4)     // Catch:{ Exception -> 0x004b }
            boolean r0 = r4.isSuccessful()     // Catch:{ Exception -> 0x004b }
            if (r0 == 0) goto L_0x004d
            int r0 = r4.code()     // Catch:{ Exception -> 0x004b }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x004d
            java.lang.Object r4 = r4.body()     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.Security.SecModle.SecurityModle r4 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r4     // Catch:{ Exception -> 0x004b }
            pb.a$a r0 = pb.a.f14908a     // Catch:{ Exception -> 0x004b }
            cm.u r1 = r2.f21066a     // Catch:{ Exception -> 0x004b }
            java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004b }
            cm.l.c(r4)     // Catch:{ Exception -> 0x004b }
            java.lang.String r4 = r4.getData()     // Catch:{ Exception -> 0x004b }
            cm.l.c(r4)     // Catch:{ Exception -> 0x004b }
            java.lang.String r4 = r0.a(r1, r4)     // Catch:{ Exception -> 0x004b }
            i7.d r0 = new i7.d     // Catch:{ Exception -> 0x004b }
            r0.<init>()     // Catch:{ Exception -> 0x004b }
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp> r1 = com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp.class
            java.lang.Object r4 = r0.j(r4, r1)     // Catch:{ Exception -> 0x004b }
            java.lang.String r0 = "fromJson(...)"
            cm.l.e(r4, r0)     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp r4 = (com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp) r4     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r2.f21067b     // Catch:{ Exception -> 0x004b }
            androidx.lifecycle.a0 r0 = r0.n()     // Catch:{ Exception -> 0x004b }
        L_0x0047:
            r0.k(r4)     // Catch:{ Exception -> 0x004b }
            goto L_0x00b3
        L_0x004b:
            r4 = move-exception
            goto L_0x00a7
        L_0x004d:
            int r0 = r4.code()     // Catch:{ Exception -> 0x004b }
            r1 = 400(0x190, float:5.6E-43)
            if (r0 != r1) goto L_0x009d
            java.lang.Object r4 = r4.body()     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.Security.SecModle.SecurityModle r4 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r4     // Catch:{ Exception -> 0x004b }
            pb.a$a r0 = pb.a.f14908a     // Catch:{ Exception -> 0x004b }
            cm.u r1 = r2.f21066a     // Catch:{ Exception -> 0x004b }
            java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004b }
            cm.l.c(r4)     // Catch:{ Exception -> 0x004b }
            java.lang.String r4 = r4.getData()     // Catch:{ Exception -> 0x004b }
            cm.l.c(r4)     // Catch:{ Exception -> 0x004b }
            java.lang.String r4 = r0.a(r1, r4)     // Catch:{ Exception -> 0x004b }
            i7.d r0 = new i7.d     // Catch:{ Exception -> 0x004b }
            r0.<init>()     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$multSelectService$1$onResponse$type$1 r1 = new com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$multSelectService$1$onResponse$type$1     // Catch:{ Exception -> 0x004b }
            r1.<init>()     // Catch:{ Exception -> 0x004b }
            java.lang.reflect.Type r1 = r1.getType()     // Catch:{ Exception -> 0x004b }
            java.lang.Object r4 = r0.k(r4, r1)     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ErroMultiSelection r4 = (com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ErroMultiSelection) r4     // Catch:{ Exception -> 0x004b }
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r2.f21067b     // Catch:{ Exception -> 0x004b }
            androidx.lifecycle.a0 r0 = r0.o()     // Catch:{ Exception -> 0x004b }
            if (r4 == 0) goto L_0x0098
            com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ApiMessage r4 = r4.getApiMessage()     // Catch:{ Exception -> 0x004b }
            if (r4 == 0) goto L_0x0098
            java.lang.String r4 = r4.getDeveloperMessage()     // Catch:{ Exception -> 0x004b }
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            cm.l.c(r4)     // Catch:{ Exception -> 0x004b }
            goto L_0x0047
        L_0x009d:
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r4 = r2.f21067b     // Catch:{ Exception -> 0x004b }
            androidx.lifecycle.a0 r4 = r4.o()     // Catch:{ Exception -> 0x004b }
            r4.k(r3)     // Catch:{ Exception -> 0x004b }
            goto L_0x00b3
        L_0x00a7:
            r4.printStackTrace()
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r4 = r2.f21067b
            androidx.lifecycle.a0 r4 = r4.o()
            r4.k(r3)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$multSelectService$1.onResponse(retrofit2.Call, retrofit2.Response):void");
    }
}
