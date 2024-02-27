package com.nic.mparivahan.LLServices.UI;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.u;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeAddressLlReq;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.StateMasterItem;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jj.c0;
import kk.e;
import ni.v;
import pl.x;
import tb.n;
import tb.o;
import tb.p;

public final class ChangeAddressLL extends androidx.appcompat.app.d {
    public FetchLlDetails G;
    public v H;
    public Context I;
    public ProgressDialog J;
    public ld.c K;
    public ld.f L;
    /* access modifiers changed from: private */
    public List M;
    /* access modifiers changed from: private */
    public List N;
    /* access modifiers changed from: private */
    public List O;
    /* access modifiers changed from: private */
    public List P;
    /* access modifiers changed from: private */
    public List Q;
    /* access modifiers changed from: private */
    public List R;
    /* access modifiers changed from: private */
    public List S;
    private DlAddress T = new DlAddress("", "", "", "", "", "", "", "");
    private DlAddress U = new DlAddress("", "", "", "", "", "", "", "");
    /* access modifiers changed from: private */
    public String V = "";
    /* access modifiers changed from: private */
    public c0 W;
    public t9.a X;
    public ClInter Y;
    public sb.c Z;

    /* renamed from: a0  reason: collision with root package name */
    public LlInterface f9006a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f9007b0;

    /* renamed from: c0  reason: collision with root package name */
    public w9.c f9008c0;

    /* renamed from: d0  reason: collision with root package name */
    public FromEligCheck f9009d0;

    /* renamed from: e0  reason: collision with root package name */
    private String f9010e0 = "N";

    /* renamed from: f0  reason: collision with root package name */
    private String f9011f0 = "N";

    /* renamed from: g0  reason: collision with root package name */
    private String f9012g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f9013h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f9014i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f9015j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f9016k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f9017l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f9018m0 = "N";

    /* renamed from: n0  reason: collision with root package name */
    private String f9019n0;

    /* renamed from: o0  reason: collision with root package name */
    private String f9020o0;

    /* renamed from: p0  reason: collision with root package name */
    public y8.c f9021p0;

    /* renamed from: q0  reason: collision with root package name */
    public SubmitInterface f9022q0;

    static final class a extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9023e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9023e = changeAddressLL;
        }

        public final void b(StateResponse stateResponse) {
            try {
                this.f9023e.i2().dismiss();
                if (cm.l.a(stateResponse.getStatusCode(), "00")) {
                    List<StateMasterItem> stateMaster = stateResponse.getStateMaster();
                    if (stateMaster != null && (!stateMaster.isEmpty())) {
                        this.f9023e.M = stateResponse.getStateMaster();
                        return;
                    }
                    return;
                }
                ChangeAddressLL changeAddressLL = this.f9023e;
                changeAddressLL.L2(changeAddressLL.n2().b("no_details", this.f9023e.getString(R.string.no_Details_are_avail)));
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = this.f9023e;
                changeAddressLL2.L2(changeAddressLL2.n2().b("service_is_not_present", this.f9023e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9024e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9024e = changeAddressLL;
        }

        public final void b(DistResponse distResponse) {
            try {
                this.f9024e.i2().dismiss();
                if (cm.l.a(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    this.f9024e.N = distResponse.getDistMaster();
                    this.f9024e.O = distResponse.getDistMaster();
                    return;
                }
                ChangeAddressLL changeAddressLL = this.f9024e;
                changeAddressLL.L2(changeAddressLL.n2().b("no_details", this.f9024e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = this.f9024e;
                changeAddressLL2.L2(changeAddressLL2.n2().b("service_is_not_present", this.f9024e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DistResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9025e = changeAddressLL;
        }

        public final void b(TalukaResponse talukaResponse) {
            ChangeAddressLL changeAddressLL;
            ld.c n22;
            String str;
            String string;
            try {
                this.f9025e.i2().dismiss();
                String str2 = null;
                if (!cm.l.a(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (talukaResponse != null) {
                        str2 = talukaResponse.getStatusCode();
                    }
                    if (cm.l.a(str2, "01")) {
                        changeAddressLL = this.f9025e;
                        n22 = changeAddressLL.n2();
                        str = "no_taluka_found";
                        string = "";
                    } else {
                        changeAddressLL = this.f9025e;
                        n22 = changeAddressLL.n2();
                        str = "no_details";
                        string = this.f9025e.getString(R.string.unable_to_get_details);
                    }
                    changeAddressLL.L2(n22.b(str, string));
                } else if (cm.l.a(this.f9025e.V, "dl-renewal-current-address")) {
                    this.f9025e.P = talukaResponse.getTakulaMaster();
                } else {
                    this.f9025e.Q = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = this.f9025e;
                changeAddressLL2.L2(changeAddressLL2.n2().b("service_is_not_present", this.f9025e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TalukaResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9026e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9026e = changeAddressLL;
        }

        public final void b(VillageOrTownResponse villageOrTownResponse) {
            try {
                this.f9026e.i2().dismiss();
                if (!cm.l.a(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    ChangeAddressLL changeAddressLL = this.f9026e;
                    changeAddressLL.L2(changeAddressLL.n2().b("no_vill_found", ""));
                } else if (cm.l.a(this.f9026e.V, "dl-renewal-current-address")) {
                    this.f9026e.R = villageOrTownResponse.getVillageMaster();
                } else {
                    this.f9026e.S = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                ChangeAddressLL changeAddressLL2 = this.f9026e;
                changeAddressLL2.L2(changeAddressLL2.n2().b("service_is_not_present", this.f9026e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VillageOrTownResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9027e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9027e = changeAddressLL;
        }

        public final void b(SubmitResponse submitResponse) {
            this.f9027e.i2().dismiss();
            try {
                if (cm.l.a(submitResponse.getStatus_code(), "00")) {
                    this.f9027e.c3("Y");
                    this.f9027e.L2(submitResponse.getFoneObject().get(0).getMsg());
                    return;
                }
                this.f9027e.J2(submitResponse.getFoneObject().get(0).getMsg());
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9028e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9028e = changeAddressLL;
        }

        public final void b(String str) {
            this.f9028e.i2().dismiss();
            ChangeAddressLL changeAddressLL = this.f9028e;
            changeAddressLL.L2(changeAddressLL.n2().b("service_is_not_present", this.f9028e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9029e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9029e = changeAddressLL;
        }

        public final void b(x9.a aVar) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((x9.a) null);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9030e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9030e = changeAddressLL;
        }

        public final void b(sb.d dVar) {
            this.f9030e.Z1().f28922h0.c(false);
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((sb.d) null);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ChangeAddressLL changeAddressLL) {
            super(1);
            this.f9031e = changeAddressLL;
        }

        public final void b(String str) {
            this.f9031e.Z1().f28922h0.c(false);
            ChangeAddressLL changeAddressLL = this.f9031e;
            changeAddressLL.L2(changeAddressLL.n2().b("service_is_not_present", this.f9031e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class j implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9032a;

        j(ChangeAddressLL changeAddressLL) {
            this.f9032a = changeAddressLL;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
            if (r0 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
            r3 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ca, code lost:
            if (r0 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r0 = r4.f9032a
                java.lang.String r0 = r0.V
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                r3 = 0
                if (r1 == 0) goto L_0x0079
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r0 = r4.f9032a
                java.util.List r0 = r0.N
                if (r0 == 0) goto L_0x0026
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r6
                if (r6 == 0) goto L_0x0026
                java.lang.String r6 = r6.getDistCode()
                goto L_0x0027
            L_0x0026:
                r6 = r3
            L_0x0027:
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r0 = r4.f9032a
                ni.v r0 = r0.Z1()
                android.widget.EditText r0 = r0.f28939x
                r0.setText(r5)
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                ni.v r5 = r5.Z1()
                android.widget.EditText r5 = r5.f28939x
                r5.setContentDescription(r6)
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.l2()
                r5.setDistrict(r6)
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                r5.S1()
                if (r6 == 0) goto L_0x00cd
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                android.app.ProgressDialog r0 = r5.i2()
                r0.dismiss()
                jj.c0 r0 = r5.W
                if (r0 != 0) goto L_0x0060
            L_0x005c:
                cm.l.v(r2)
                goto L_0x0061
            L_0x0060:
                r3 = r0
            L_0x0061:
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r5 = r5.Y1()
                com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.State r5 = r5.getState()
                java.lang.String r5 = r5.getStCd()
                java.lang.CharSequence r5 = km.q.B0(r5)
                java.lang.String r5 = r5.toString()
                r3.n(r5, r6)
                goto L_0x00cd
            L_0x0079:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00cd
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r0 = r4.f9032a
                java.util.List r0 = r0.O
                if (r0 == 0) goto L_0x0096
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r6
                if (r6 == 0) goto L_0x0096
                java.lang.String r6 = r6.getDistCode()
                goto L_0x0097
            L_0x0096:
                r6 = r3
            L_0x0097:
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r0 = r4.f9032a
                ni.v r0 = r0.Z1()
                android.widget.EditText r0 = r0.E
                r0.setText(r5)
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                ni.v r5 = r5.Z1()
                android.widget.EditText r5 = r5.E
                r5.setContentDescription(r6)
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.j2()
                r5.setDistrict(r6)
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                r5.U1()
                if (r6 == 0) goto L_0x00cd
                com.nic.mparivahan.LLServices.UI.ChangeAddressLL r5 = r4.f9032a
                android.app.ProgressDialog r0 = r5.i2()
                r0.dismiss()
                jj.c0 r0 = r5.W
                if (r0 != 0) goto L_0x0060
                goto L_0x005c
            L_0x00cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.ChangeAddressLL.j.a(java.lang.String, int):void");
        }
    }

    public static final class k implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f9034b;

        k(ChangeAddressLL changeAddressLL, u uVar) {
            this.f9033a = changeAddressLL;
            this.f9034b = uVar;
        }

        public void a(String str, int i10) {
            EditText editText;
            StringBuilder sb2;
            EditText editText2;
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            String str2 = null;
            if (cm.l.a(this.f9033a.V, "dl-renewal-current-address")) {
                List z12 = this.f9033a.P;
                if (!(z12 == null || (talukaMasterItem2 = (TalukaMasterItem) z12.get(i10)) == null)) {
                    str2 = talukaMasterItem2.getSubDistcode();
                }
                this.f9033a.Z1().f28937w.setText(str);
                this.f9033a.Z1().f28937w.setContentDescription(str2);
                this.f9033a.l2().setSubDistrict(str2);
                this.f9033a.X1((String) this.f9034b.f20234e);
                editText = this.f9033a.Z1().M;
                sb2 = new StringBuilder();
                sb2.append(this.f9033a.Z1().f28937w.getText());
                sb2.append(", ");
                sb2.append(this.f9033a.Z1().f28939x.getText());
                sb2.append(", ");
                editText2 = this.f9033a.Z1().f28941y;
            } else {
                List C1 = this.f9033a.Q;
                if (!(C1 == null || (talukaMasterItem = (TalukaMasterItem) C1.get(i10)) == null)) {
                    str2 = talukaMasterItem.getSubDistcode();
                }
                this.f9033a.Z1().D.setText(str);
                this.f9033a.Z1().D.setContentDescription(str2);
                this.f9033a.j2().setSubDistrict(str2);
                this.f9033a.k2((String) this.f9034b.f20234e);
                editText = this.f9033a.Z1().A;
                sb2 = new StringBuilder();
                sb2.append(this.f9033a.Z1().D.getText());
                sb2.append(", ");
                sb2.append(this.f9033a.Z1().E.getText());
                sb2.append(", ");
                editText2 = this.f9033a.Z1().F;
            }
            sb2.append(editText2.getText());
            editText.setText(sb2.toString());
        }
    }

    public static final class l implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeAddressLL f9035a;

        l(ChangeAddressLL changeAddressLL) {
            this.f9035a = changeAddressLL;
        }

        public void a(String str, int i10) {
            DlAddress j22;
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            String str2 = null;
            if (cm.l.a(this.f9035a.V, "dl-renewal-current-address")) {
                List A1 = this.f9035a.R;
                if (!(A1 == null || (villageOrTownMasterItem2 = (VillageOrTownMasterItem) A1.get(i10)) == null)) {
                    str2 = villageOrTownMasterItem2.getVillageCode();
                }
                this.f9035a.Z1().L.setText(str);
                this.f9035a.Z1().L.setContentDescription(str2);
                j22 = this.f9035a.l2();
            } else {
                List D1 = this.f9035a.S;
                if (!(D1 == null || (villageOrTownMasterItem = (VillageOrTownMasterItem) D1.get(i10)) == null)) {
                    str2 = villageOrTownMasterItem.getVillageCode();
                }
                this.f9035a.Z1().G.setText(str);
                this.f9035a.Z1().G.setContentDescription(str2);
                j22 = this.f9035a.j2();
            }
            j22.setVillageOrTown(str2);
        }
    }

    static final class m implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9036a;

        m(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f9036a = lVar;
        }

        public final pl.c a() {
            return this.f9036a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9036a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public ChangeAddressLL() {
    }

    /* access modifiers changed from: private */
    public static final void A2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.I2("dl-renewal-current-address");
        } else {
            Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void B2(ChangeAddressLL changeAddressLL, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(changeAddressLL, "this$0");
        List list = changeAddressLL.P;
        if (list != null && (!list.isEmpty())) {
            if (i10 == R.id.town_rb) {
                str = "U";
            } else if (i10 == R.id.village_rb) {
                str = "R";
            } else {
                return;
            }
            changeAddressLL.X1(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void C2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.G2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.H2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    private final void E2() {
        try {
            Z1().f28924j0.setVisibility(8);
            Z1().C0.setVisibility(8);
            Z1().X.f29580g.setText(m2().i());
            Z1().X.f29581h.setPaintFlags(8 | Z1().X.f29581h.getPaintFlags());
            Z1().X.f29581h.setText(q.B0(Y1().getLearningLicence()).toString());
            Z1().X.f29581h.setOnClickListener(new tb.g(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void F2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        try {
            Intent intent = new Intent(changeAddressLL, LlDetails.class);
            intent.putExtra("LLDetails", changeAddressLL.Y1());
            changeAddressLL.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void G2(String str) {
        try {
            this.V = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.V, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.N;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.O;
                if (list2 != null) {
                    for (DistrictsMasterItem districtsMasterItem2 : list2) {
                        arrayList.add(String.valueOf(districtsMasterItem2 != null ? districtsMasterItem2.getDistName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Districts", arrayList);
            a10.k2(F0(), "DistPicker");
            a10.n2(new j(this));
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (Z1().f28923i0.isChecked() != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H2(java.lang.String r7) {
        /*
            r6 = this;
            r6.V = r7     // Catch:{ Exception -> 0x00a1 }
            cm.u r7 = new cm.u     // Catch:{ Exception -> 0x00a1 }
            r7.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = ""
            r7.f20234e = r0     // Catch:{ Exception -> 0x00a1 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a1 }
            r0.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r1 = r6.V     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "dl-renewal-current-address"
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "R"
            java.lang.String r3 = "U"
            r4 = 0
            if (r1 == 0) goto L_0x0055
            java.util.List r1 = r6.P     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x0045
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00a1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00a1 }
        L_0x0029:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x00a1 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x00a1 }
            com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r5     // Catch:{ Exception -> 0x00a1 }
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = r5.getSubDistname()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x003d
        L_0x003c:
            r5 = r4
        L_0x003d:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a1 }
            r0.add(r5)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0029
        L_0x0045:
            ni.v r1 = r6.Z1()     // Catch:{ Exception -> 0x00a1 }
            android.widget.RadioButton r1 = r1.f28923i0     // Catch:{ Exception -> 0x00a1 }
            boolean r1 = r1.isChecked()     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            r7.f20234e = r2     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0088
        L_0x0055:
            java.util.List r1 = r6.Q     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x007b
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00a1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00a1 }
        L_0x005f:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x00a1 }
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x00a1 }
            com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r5     // Catch:{ Exception -> 0x00a1 }
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = r5.getSubDistname()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0073
        L_0x0072:
            r5 = r4
        L_0x0073:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a1 }
            r0.add(r5)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x005f
        L_0x007b:
            ni.v r1 = r6.Z1()     // Catch:{ Exception -> 0x00a1 }
            android.widget.RadioButton r1 = r1.H     // Catch:{ Exception -> 0x00a1 }
            boolean r1 = r1.isChecked()     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x0052
            goto L_0x0051
        L_0x0088:
            kk.e$a r1 = kk.e.A0     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "Select Taluka"
            kk.e r0 = r1.a(r2, r0)     // Catch:{ Exception -> 0x00a1 }
            androidx.fragment.app.q r1 = r6.F0()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "TalukaPicker"
            r0.k2(r1, r2)     // Catch:{ Exception -> 0x00a1 }
            com.nic.mparivahan.LLServices.UI.ChangeAddressLL$k r1 = new com.nic.mparivahan.LLServices.UI.ChangeAddressLL$k     // Catch:{ Exception -> 0x00a1 }
            r1.<init>(r6, r7)     // Catch:{ Exception -> 0x00a1 }
            r0.n2(r1)     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.ChangeAddressLL.H2(java.lang.String):void");
    }

    private final void I2(String str) {
        try {
            this.V = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.V, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.R;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.S;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Village/Town", arrayList);
            a10.k2(F0(), "VillageTownPicker");
            a10.n2(new l(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void K2(Dialog dialog, ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(changeAddressLL, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(changeAddressLL, DashBoard.class);
        intent.addFlags(67108864);
        changeAddressLL.startActivity(intent);
        changeAddressLL.finish();
    }

    /* access modifiers changed from: private */
    public final void L2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new tb.f(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void N2() {
        try {
            this.U = this.T;
            Z1().E.setText(Z1().f28939x.getText());
            Z1().D.setText(Z1().f28937w.getText());
            Z1().G.setText(Z1().L.getText());
            Z1().f28943z.setText(Z1().K.getText());
            Z1().C.setText(Z1().O.getText());
            Z1().A.setText(Z1().M.getText());
            Z1().B.setText(Z1().N.getText());
        } catch (Exception unused) {
        }
    }

    private final void P1() {
        this.W = (c0) new u0(this).a(c0.class);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            c0 c0Var = this.W;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.g(q.B0(Y1().getState().getStCd()).toString());
            return;
        }
        Toast.makeText(getApplicationContext(), n2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    private final void Q1() {
        c0 c0Var = this.W;
        c0 c0Var2 = null;
        if (c0Var == null) {
            cm.l.v("viewModel");
            c0Var = null;
        }
        c0Var.i().g(this, new m(new a(this)));
        c0 c0Var3 = this.W;
        if (c0Var3 == null) {
            cm.l.v("viewModel");
            c0Var3 = null;
        }
        c0Var3.h().g(this, new m(new b(this)));
        c0 c0Var4 = this.W;
        if (c0Var4 == null) {
            cm.l.v("viewModel");
            c0Var4 = null;
        }
        c0Var4.k().g(this, new m(new c(this)));
        c0 c0Var5 = this.W;
        if (c0Var5 == null) {
            cm.l.v("viewModel");
        } else {
            c0Var2 = c0Var5;
        }
        c0Var2.l().g(this, new m(new d(this)));
        g2().i().g(this, new m(new e(this)));
        g2().h().g(this, new m(new f(this)));
    }

    private final FormOneRequest R1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(504);
        String str = this.f9019n0;
        if (str == null) {
            cm.l.v("selectedRtoCd");
            str = null;
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str, arrayList);
    }

    /* access modifiers changed from: private */
    public final void S1() {
        Z1().f28937w.setText("");
        Z1().f28937w.setHint(n2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.P = q.i();
        T1();
        T1();
    }

    private final void T1() {
        Z1().L.setText("");
        Z1().L.setHint(n2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.R = q.i();
    }

    /* access modifiers changed from: private */
    public final void U1() {
        Z1().D.setText("");
        Z1().D.setHint(n2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.Q = q.i();
        V1();
    }

    private final void V1() {
        Z1().G.setText("");
        Z1().G.setHint(n2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.S = q.i();
    }

    private final ChangeAddressLlReq W1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("changeOfAddress");
        String obj = q.B0(Y1().getLearningLicence()).toString();
        String obj2 = q.B0(Y1().getDateOfBirth()).toString();
        String stCd = Y1().getState().getStCd();
        String str = this.f9019n0;
        if (str == null) {
            cm.l.v("selectedRtoCd");
            str = null;
        }
        String str2 = str;
        String stCd2 = Y1().getState().getStCd();
        String district = this.T.getDistrict();
        String str3 = district;
        cm.l.c(district);
        String subDistrict = this.T.getSubDistrict();
        String str4 = subDistrict;
        cm.l.c(subDistrict);
        String villageOrTown = this.T.getVillageOrTown();
        String str5 = villageOrTown;
        cm.l.c(villageOrTown);
        String obj3 = Z1().M.getText().toString();
        String obj4 = Z1().K.getText().toString();
        String obj5 = Z1().O.getText().toString();
        String obj6 = Z1().N.getText().toString();
        String stCd3 = Y1().getState().getStCd();
        String district2 = this.U.getDistrict();
        String str6 = district2;
        cm.l.c(district2);
        String subDistrict2 = this.U.getSubDistrict();
        String str7 = subDistrict2;
        cm.l.c(subDistrict2);
        String villageOrTown2 = this.U.getVillageOrTown();
        cm.l.c(villageOrTown2);
        ArrayList arrayList2 = arrayList;
        return new ChangeAddressLlReq("UmangOD", "2335647e653c970102713f68f6aad970", "164.100.161.142", "SarathiMobileService", obj, obj2, stCd, str2, "", stCd2, str3, str4, "NA", str5, obj3, obj4, obj5, obj6, "NA", stCd3, str6, str7, "NA", villageOrTown2, Z1().A.getText().toString(), Z1().f28943z.getText().toString(), Z1().C.getText().toString(), Z1().N.getText().toString(), Y1().getMobileNumber(), "changeOfAddress", arrayList2);
    }

    /* access modifiers changed from: private */
    public final void X1(String str) {
        try {
            String obj = Z1().f28937w.getContentDescription().toString();
            T1();
            i2().dismiss();
            c0 c0Var = this.W;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.o(q.B0(Y1().getState().getStCd()).toString(), Z1().f28939x.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void k2(String str) {
        try {
            String obj = Z1().D.getContentDescription().toString();
            V1();
            c0 c0Var = this.W;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.o(q.B0(Y1().getState().getStCd()).toString(), Z1().E.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    private final void o2() {
        b3(new ld.c(b2()));
        a3(new ld.f(b2()));
        Z2(new ProgressDialog(b2()));
        i2().setMessage(n2().b("label_challan_please_wait", getString(R.string.please_wait)));
        i2().setCancelable(false);
        i2().setCanceledOnTouchOutside(false);
        Z1().W.f25961g.setText(m2().i());
        Z1().C0.setPaintFlags(Z1().f28924j0.getPaintFlags() | 8);
        R2(ClInter.f7830a.a(b2()));
        Q2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(a2()))).a(t9.a.class));
        V2(LlInterface.f9003a.a(b2()));
        W2((sb.c) new u0((x0) this, (u0.b) new sb.a(new sb.b(e2()))).a(sb.c.class));
        if (getIntent() != null) {
            this.f9007b0 = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            O2((FetchLlDetails) serializableExtra);
            this.f9019n0 = String.valueOf(getIntent().getStringExtra("selectedRtoCd"));
            this.f9020o0 = String.valueOf(getIntent().getStringExtra("selectedRtoName"));
            TextView textView = Z1().f28924j0;
            textView.setText("LL No. : " + q.B0(Y1().getLearningLicence()).toString());
            Z1().f28941y.setText(Y1().getState().getStateName());
            Z1().F.setText(Y1().getState().getStateName());
        }
        Z1().C0.setOnClickListener(new tb.h(this));
        U2(FromEligCheck.f8099a.a(this));
        T2((w9.c) new u0((x0) this, (u0.b) new w9.b(new w9.a(d2()))).a(w9.c.class));
        c2().h(R1());
        c2().j().g(this, new m(new g(this)));
        Y2(SubmitInterface.f7733a.a(this));
        X2((y8.c) new u0((x0) this, (u0.b) new y8.a(new y8.b(h2()))).a(y8.c.class));
    }

    /* access modifiers changed from: private */
    public static final void p2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        try {
            Intent intent = new Intent(changeAddressLL, LlDetails.class);
            intent.putExtra("LLDetails", changeAddressLL.Y1());
            changeAddressLL.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final boolean q2() {
        ld.c n22;
        String string;
        String str;
        String b10;
        Editable text = Z1().f28941y.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            n22 = n2();
            string = getString(R.string.select_state);
            str = "select_state";
        } else {
            Editable text2 = Z1().f28939x.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                n22 = n2();
                string = getString(R.string.select_district);
                str = "select_district";
            } else {
                Editable text3 = Z1().f28937w.getText();
                cm.l.e(text3, "getText(...)");
                if (text3.length() == 0) {
                    n22 = n2();
                    string = getString(R.string.select_taluka);
                    str = "select_taluka";
                } else {
                    Editable text4 = Z1().M.getText();
                    cm.l.e(text4, "getText(...)");
                    if (text4.length() == 0) {
                        n22 = n2();
                        string = getString(R.string.sel_landmark);
                        str = "select_landmark";
                    } else {
                        Editable text5 = Z1().N.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() == 0) {
                            n22 = n2();
                            string = getString(R.string.enter_pincode);
                            str = "select_pincode";
                        } else {
                            if (Z1().N.getText().length() >= 6) {
                                Editable text6 = Z1().F.getText();
                                cm.l.e(text6, "getText(...)");
                                if (text6.length() == 0) {
                                    n22 = n2();
                                    string = getString(R.string.sel_p_state);
                                    str = "select_pstate";
                                } else {
                                    Editable text7 = Z1().E.getText();
                                    cm.l.e(text7, "getText(...)");
                                    if (text7.length() == 0) {
                                        n22 = n2();
                                        string = getString(R.string.sel_p_dis);
                                        str = "select_pdistrict";
                                    } else {
                                        Editable text8 = Z1().D.getText();
                                        cm.l.e(text8, "getText(...)");
                                        if (text8.length() == 0) {
                                            n22 = n2();
                                            string = getString(R.string.sel_p_tal);
                                            str = "select_ptaluka";
                                        } else {
                                            Editable text9 = Z1().A.getText();
                                            cm.l.e(text9, "getText(...)");
                                            if (text9.length() == 0) {
                                                n22 = n2();
                                                string = getString(R.string.sel_p_lm);
                                                str = "select_plandmark";
                                            } else {
                                                Editable text10 = Z1().B.getText();
                                                cm.l.e(text10, "getText(...)");
                                                if (text10.length() != 0) {
                                                    if (Z1().B.getText().length() >= 6) {
                                                        return true;
                                                    }
                                                    n22 = n2();
                                                    string = getString(R.string.sel_pc_pin);
                                                    str = "select_ppin_code";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b10 = n2().b("select_pin_code", getString(R.string.enter_correct_pincode));
                            Toast.makeText(this, b10, 0).show();
                            return false;
                        }
                    }
                }
            }
        }
        b10 = n22.b(str, string);
        Toast.makeText(this, b10, 0).show();
        return false;
    }

    private final void r2() {
        Z1().W.f25959e.setOnClickListener(new tb.i(this));
        Z1().X.f29577d.setOnClickListener(new tb.l(this));
        Z1().f28939x.setOnClickListener(new tb.m(this));
        Z1().f28937w.setOnClickListener(new n(this));
        Z1().L.setOnClickListener(new o(this));
        Z1().E0.setOnCheckedChangeListener(new p(this));
        Z1().E.setOnClickListener(new tb.b(this));
        Z1().D.setOnClickListener(new tb.c(this));
        Z1().G.setOnClickListener(new tb.d(this));
        Z1().J.setOnCheckedChangeListener(new tb.e(this));
        Z1().f28921g0.setOnCheckedChangeListener(new tb.j(this));
        Z1().f28922h0.setOnClickListener(new tb.k(this));
    }

    /* access modifiers changed from: private */
    public static final void s2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.I2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void t2(ChangeAddressLL changeAddressLL, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(changeAddressLL, "this$0");
        List list = changeAddressLL.Q;
        if (list != null && (!list.isEmpty())) {
            switch (i10) {
                case R.id.dl_permanent_town_rb /*2131362641*/:
                    str = "U";
                    break;
                case R.id.dl_permanent_village_rb /*2131362642*/:
                    str = "R";
                    break;
                default:
                    return;
            }
            changeAddressLL.k2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void u2(ChangeAddressLL changeAddressLL, CompoundButton compoundButton, boolean z10) {
        cm.l.f(changeAddressLL, "this$0");
        if (z10) {
            try {
                changeAddressLL.N2();
                changeAddressLL.Z1().F.setEnabled(false);
                changeAddressLL.Z1().E.setEnabled(false);
                changeAddressLL.Z1().D.setEnabled(false);
                changeAddressLL.Z1().G.setEnabled(false);
                changeAddressLL.Z1().A.setEnabled(false);
                changeAddressLL.Z1().f28943z.setEnabled(false);
                changeAddressLL.Z1().C.setEnabled(false);
                changeAddressLL.Z1().B.setEnabled(false);
            } catch (Exception unused) {
                return;
            }
        } else {
            changeAddressLL.Z1().F.setEnabled(true);
            changeAddressLL.Z1().E.setEnabled(true);
            changeAddressLL.Z1().D.setEnabled(true);
            changeAddressLL.Z1().G.setEnabled(true);
            changeAddressLL.Z1().A.setEnabled(true);
            changeAddressLL.Z1().f28943z.setEnabled(true);
            changeAddressLL.Z1().C.setEnabled(true);
            changeAddressLL.Z1().B.setEnabled(true);
            changeAddressLL.U = new DlAddress("", "", "", "", "", "", "", "");
            changeAddressLL.Z1().E.setText("");
            changeAddressLL.Z1().D.setText("");
            changeAddressLL.Z1().G.setText("");
            changeAddressLL.Z1().A.setText("");
            changeAddressLL.Z1().f28943z.setText("");
            changeAddressLL.Z1().C.setText("");
            changeAddressLL.Z1().B.setText("");
        }
        changeAddressLL.Z1().z(changeAddressLL.U);
        changeAddressLL.Z1().a();
    }

    /* access modifiers changed from: private */
    public static final void v2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (!changeAddressLL.q2()) {
            return;
        }
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.Z1().f28922h0.c(true);
            changeAddressLL.f2().g(changeAddressLL, changeAddressLL.W1());
            return;
        }
        Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void w2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        changeAddressLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void x2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        changeAddressLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void y2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.G2("dl-renewal-current-address");
        } else {
            Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(ChangeAddressLL changeAddressLL, View view) {
        cm.l.f(changeAddressLL, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeAddressLL)) {
            changeAddressLL.H2("dl-renewal-current-address");
        } else {
            Toast.makeText(changeAddressLL.b2(), changeAddressLL.n2().b("label_log_check_internet", changeAddressLL.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public final void J2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n2().b("btn_ok", "OK"));
        textView.setOnClickListener(new tb.a(dialog, this));
        dialog.show();
    }

    public final void O2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.G = fetchLlDetails;
    }

    public final void P2(v vVar) {
        cm.l.f(vVar, "<set-?>");
        this.H = vVar;
    }

    public final void Q2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.X = aVar;
    }

    public final void R2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.Y = clInter;
    }

    public final void S2(Context context) {
        cm.l.f(context, "<set-?>");
        this.I = context;
    }

    public final void T2(w9.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9008c0 = cVar;
    }

    public final void U2(FromEligCheck fromEligCheck) {
        cm.l.f(fromEligCheck, "<set-?>");
        this.f9009d0 = fromEligCheck;
    }

    public final void V2(LlInterface llInterface) {
        cm.l.f(llInterface, "<set-?>");
        this.f9006a0 = llInterface;
    }

    public final void W2(sb.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final void X2(y8.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9021p0 = cVar;
    }

    public final FetchLlDetails Y1() {
        FetchLlDetails fetchLlDetails = this.G;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final void Y2(SubmitInterface submitInterface) {
        cm.l.f(submitInterface, "<set-?>");
        this.f9022q0 = submitInterface;
    }

    public final v Z1() {
        v vVar = this.H;
        if (vVar != null) {
            return vVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final void Z2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final ClInter a2() {
        ClInter clInter = this.Y;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final void a3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.L = fVar;
    }

    public final Context b2() {
        Context context = this.I;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void b3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final w9.c c2() {
        w9.c cVar = this.f9008c0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mFormEligVM");
        return null;
    }

    public final void c3(String str) {
        cm.l.f(str, "<set-?>");
        this.f9011f0 = str;
    }

    public final FromEligCheck d2() {
        FromEligCheck fromEligCheck = this.f9009d0;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final LlInterface e2() {
        LlInterface llInterface = this.f9006a0;
        if (llInterface != null) {
            return llInterface;
        }
        cm.l.v("mLlInterface");
        return null;
    }

    public final sb.c f2() {
        sb.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mLlViewModel");
        return null;
    }

    public final y8.c g2() {
        y8.c cVar = this.f9021p0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface h2() {
        SubmitInterface submitInterface = this.f9022q0;
        if (submitInterface != null) {
            return submitInterface;
        }
        cm.l.v("mSubmitInterface");
        return null;
    }

    public final ProgressDialog i2() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlAddress j2() {
        return this.U;
    }

    public final DlAddress l2() {
        return this.T;
    }

    public final ld.f m2() {
        ld.f fVar = this.L;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.c n2() {
        ld.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v x10 = v.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        P2(x10);
        setContentView(Z1().m());
        S2(this);
        v9.e.f17509a.y(this, Z1());
        o2();
        P1();
        Q1();
        r2();
        f2().l().g(this, new m(new h(this)));
        f2().i().g(this, new m(new i(this)));
        E2();
    }
}
