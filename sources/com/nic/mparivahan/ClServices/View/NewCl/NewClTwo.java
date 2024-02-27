package com.nic.mparivahan.ClServices.View.NewCl;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
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
import bm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
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
import java.util.ArrayList;
import java.util.List;
import jj.c0;
import kk.e;
import ni.n6;
import pl.x;
import q9.a0;
import q9.d0;
import q9.e0;
import q9.f0;
import q9.g0;
import q9.h0;
import q9.v;
import q9.w;
import q9.y;
import q9.z;

public final class NewClTwo extends androidx.appcompat.app.d {
    public n6 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public ld.f K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f7986a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f7987b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f7988c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f7989d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f7990e0;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public c0 f7991f0;

    /* renamed from: g0  reason: collision with root package name */
    public t9.a f7992g0;

    /* renamed from: h0  reason: collision with root package name */
    public ClInter f7993h0;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public List f7994i0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public List f7995j0;
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public List f7996k0;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public List f7997l0;
    /* access modifiers changed from: private */

    /* renamed from: m0  reason: collision with root package name */
    public List f7998m0;
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public List f7999n0;
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public List f8000o0;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public String f8001p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private DlAddress f8002q0 = new DlAddress("", "", "", "", "", "", "", "");

    /* renamed from: r0  reason: collision with root package name */
    private DlAddress f8003r0 = new DlAddress("", "", "", "", "", "", "", "");

    /* renamed from: s0  reason: collision with root package name */
    public String f8004s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f8005t0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NewClTwo newClTwo) {
            super(1);
            this.f8006e = newClTwo;
        }

        public final void b(StateResponse stateResponse) {
            try {
                this.f8006e.r2().dismiss();
                if (cm.l.a(stateResponse.getStatusCode(), "00")) {
                    List<StateMasterItem> stateMaster = stateResponse.getStateMaster();
                    if (stateMaster != null && (!stateMaster.isEmpty())) {
                        this.f8006e.f7994i0 = stateResponse.getStateMaster();
                        return;
                    }
                    return;
                }
                NewClTwo newClTwo = this.f8006e;
                newClTwo.Y2(newClTwo.C2().b("no_details", this.f8006e.getString(R.string.no_Details_are_avail)));
            } catch (Exception unused) {
                NewClTwo newClTwo2 = this.f8006e;
                newClTwo2.Y2(newClTwo2.C2().b("service_is_not_present", this.f8006e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8007e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NewClTwo newClTwo) {
            super(1);
            this.f8007e = newClTwo;
        }

        public final void b(DistResponse distResponse) {
            try {
                this.f8007e.r2().dismiss();
                if (cm.l.a(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    this.f8007e.f7995j0 = distResponse.getDistMaster();
                    this.f8007e.f7996k0 = distResponse.getDistMaster();
                    return;
                }
                NewClTwo newClTwo = this.f8007e;
                newClTwo.Y2(newClTwo.C2().b("no_details", this.f8007e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
                NewClTwo newClTwo2 = this.f8007e;
                newClTwo2.Y2(newClTwo2.C2().b("service_is_not_present", this.f8007e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DistResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8008e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NewClTwo newClTwo) {
            super(1);
            this.f8008e = newClTwo;
        }

        public final void b(TalukaResponse talukaResponse) {
            NewClTwo newClTwo;
            ld.c C2;
            String str;
            String string;
            try {
                this.f8008e.r2().dismiss();
                String str2 = null;
                if (!cm.l.a(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (talukaResponse != null) {
                        str2 = talukaResponse.getStatusCode();
                    }
                    if (cm.l.a(str2, "01")) {
                        newClTwo = this.f8008e;
                        C2 = newClTwo.C2();
                        str = "no_taluka_found";
                        string = "";
                    } else {
                        newClTwo = this.f8008e;
                        C2 = newClTwo.C2();
                        str = "no_details";
                        string = this.f8008e.getString(R.string.unable_to_get_details);
                    }
                    newClTwo.Y2(C2.b(str, string));
                } else if (cm.l.a(this.f8008e.f8001p0, "dl-renewal-current-address")) {
                    this.f8008e.f7997l0 = talukaResponse.getTakulaMaster();
                } else {
                    this.f8008e.f7998m0 = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                NewClTwo newClTwo2 = this.f8008e;
                newClTwo2.Y2(newClTwo2.C2().b("service_is_not_present", this.f8008e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TalukaResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8009e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NewClTwo newClTwo) {
            super(1);
            this.f8009e = newClTwo;
        }

        public final void b(VillageOrTownResponse villageOrTownResponse) {
            try {
                this.f8009e.r2().dismiss();
                if (!cm.l.a(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    NewClTwo newClTwo = this.f8009e;
                    newClTwo.Y2(newClTwo.C2().b("no_vill_found", ""));
                } else if (cm.l.a(this.f8009e.f8001p0, "dl-renewal-current-address")) {
                    this.f8009e.f7999n0 = villageOrTownResponse.getVillageMaster();
                } else {
                    this.f8009e.f8000o0 = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                NewClTwo newClTwo2 = this.f8009e;
                newClTwo2.Y2(newClTwo2.C2().b("service_is_not_present", this.f8009e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VillageOrTownResponse) obj);
            return x.f30437a;
        }
    }

    public static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8010a;

        e(NewClTwo newClTwo) {
            this.f8010a = newClTwo;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8010a
                java.lang.String r0 = r0.f8001p0
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                r3 = 0
                if (r1 == 0) goto L_0x0073
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8010a
                java.util.List r0 = r0.f7995j0
                if (r0 == 0) goto L_0x0026
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r6
                if (r6 == 0) goto L_0x0026
                java.lang.String r6 = r6.getDistCode()
                goto L_0x0027
            L_0x0026:
                r6 = r3
            L_0x0027:
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8010a
                ni.n6 r0 = r0.m2()
                android.widget.EditText r0 = r0.f27601x
                r0.setText(r5)
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                ni.n6 r5 = r5.m2()
                android.widget.EditText r5 = r5.f27601x
                r5.setContentDescription(r6)
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.v2()
                r5.setDistrict(r6)
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                r5.T1()
                if (r6 == 0) goto L_0x00d2
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                android.app.ProgressDialog r0 = r5.r2()
                r0.dismiss()
                jj.c0 r0 = r5.f7991f0
                if (r0 != 0) goto L_0x0060
                cm.l.v(r2)
                goto L_0x0061
            L_0x0060:
                r3 = r0
            L_0x0061:
                ni.n6 r5 = r5.m2()
                android.widget.EditText r5 = r5.f27603y
            L_0x0067:
                java.lang.CharSequence r5 = r5.getContentDescription()
                java.lang.String r5 = r5.toString()
                r3.n(r5, r6)
                goto L_0x00d2
            L_0x0073:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00d2
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8010a
                java.util.List r0 = r0.f7996k0
                if (r0 == 0) goto L_0x0090
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r6
                if (r6 == 0) goto L_0x0090
                java.lang.String r6 = r6.getDistCode()
                goto L_0x0091
            L_0x0090:
                r6 = r3
            L_0x0091:
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8010a
                ni.n6 r0 = r0.m2()
                android.widget.EditText r0 = r0.E
                r0.setText(r5)
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                ni.n6 r5 = r5.m2()
                android.widget.EditText r5 = r5.E
                r5.setContentDescription(r6)
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.t2()
                r5.setDistrict(r6)
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                r5.W1()
                if (r6 == 0) goto L_0x00d2
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8010a
                android.app.ProgressDialog r0 = r5.r2()
                r0.dismiss()
                jj.c0 r0 = r5.f7991f0
                if (r0 != 0) goto L_0x00ca
                cm.l.v(r2)
                goto L_0x00cb
            L_0x00ca:
                r3 = r0
            L_0x00cb:
                ni.n6 r5 = r5.m2()
                android.widget.EditText r5 = r5.F
                goto L_0x0067
            L_0x00d2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.NewCl.NewClTwo.e.a(java.lang.String, int):void");
        }
    }

    public static final class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8011a;

        f(NewClTwo newClTwo) {
            this.f8011a = newClTwo;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
            if (r6 == null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            r3 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
            if (r6 == null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.StateMasterItem) r1.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8011a
                java.lang.String r0 = r0.f8001p0
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                r3 = 0
                if (r1 == 0) goto L_0x006e
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                java.util.List r1 = r0.f7994i0     // Catch:{ Exception -> 0x00cb }
                if (r1 == 0) goto L_0x0026
                java.lang.Object r6 = r1.get(r6)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.dlservices.data.model.StateMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.StateMasterItem) r6     // Catch:{ Exception -> 0x00cb }
                if (r6 == 0) goto L_0x0026
                java.lang.String r6 = r6.getStateCode()     // Catch:{ Exception -> 0x00cb }
                goto L_0x0027
            L_0x0026:
                r6 = r3
            L_0x0027:
                cm.l.c(r6)     // Catch:{ Exception -> 0x00cb }
                r0.n3(r6)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r6 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                ni.n6 r6 = r6.m2()     // Catch:{ Exception -> 0x00cb }
                android.widget.EditText r6 = r6.f27603y     // Catch:{ Exception -> 0x00cb }
                r6.setText(r5)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                ni.n6 r5 = r5.m2()     // Catch:{ Exception -> 0x00cb }
                android.widget.EditText r5 = r5.f27603y     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r6 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                java.lang.String r6 = r6.k2()     // Catch:{ Exception -> 0x00cb }
                r5.setContentDescription(r6)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                r5.S1()     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                java.lang.String r5 = r5.k2()     // Catch:{ Exception -> 0x00cb }
                if (r5 == 0) goto L_0x00cb
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r6 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                android.app.ProgressDialog r0 = r6.r2()     // Catch:{ Exception -> 0x00cb }
                r0.dismiss()     // Catch:{ Exception -> 0x00cb }
                jj.c0 r6 = r6.f7991f0     // Catch:{ Exception -> 0x00cb }
                if (r6 != 0) goto L_0x0069
            L_0x0065:
                cm.l.v(r2)     // Catch:{ Exception -> 0x00cb }
                goto L_0x006a
            L_0x0069:
                r3 = r6
            L_0x006a:
                r3.g(r5)     // Catch:{ Exception -> 0x00cb }
                goto L_0x00cb
            L_0x006e:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00cb
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r0 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                java.util.List r1 = r0.f7994i0     // Catch:{ Exception -> 0x00cb }
                if (r1 == 0) goto L_0x008b
                java.lang.Object r6 = r1.get(r6)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.dlservices.data.model.StateMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.StateMasterItem) r6     // Catch:{ Exception -> 0x00cb }
                if (r6 == 0) goto L_0x008b
                java.lang.String r6 = r6.getStateCode()     // Catch:{ Exception -> 0x00cb }
                goto L_0x008c
            L_0x008b:
                r6 = r3
            L_0x008c:
                cm.l.c(r6)     // Catch:{ Exception -> 0x00cb }
                r0.v3(r6)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r6 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                ni.n6 r6 = r6.m2()     // Catch:{ Exception -> 0x00cb }
                android.widget.EditText r6 = r6.F     // Catch:{ Exception -> 0x00cb }
                r6.setText(r5)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                ni.n6 r5 = r5.m2()     // Catch:{ Exception -> 0x00cb }
                android.widget.EditText r5 = r5.F     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r6 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                java.lang.String r6 = r6.s2()     // Catch:{ Exception -> 0x00cb }
                r5.setContentDescription(r6)     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                r5.V1()     // Catch:{ Exception -> 0x00cb }
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r5 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                java.lang.String r5 = r5.s2()     // Catch:{ Exception -> 0x00cb }
                if (r5 == 0) goto L_0x00cb
                com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r6 = r4.f8011a     // Catch:{ Exception -> 0x00cb }
                android.app.ProgressDialog r0 = r6.r2()     // Catch:{ Exception -> 0x00cb }
                r0.dismiss()     // Catch:{ Exception -> 0x00cb }
                jj.c0 r6 = r6.f7991f0     // Catch:{ Exception -> 0x00cb }
                if (r6 != 0) goto L_0x0069
                goto L_0x0065
            L_0x00cb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.NewCl.NewClTwo.f.a(java.lang.String, int):void");
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f8013b;

        g(NewClTwo newClTwo, u uVar) {
            this.f8012a = newClTwo;
            this.f8013b = uVar;
        }

        public void a(String str, int i10) {
            EditText editText;
            StringBuilder sb2;
            EditText editText2;
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            String str2 = null;
            if (cm.l.a(this.f8012a.f8001p0, "dl-renewal-current-address")) {
                List z12 = this.f8012a.f7997l0;
                if (!(z12 == null || (talukaMasterItem2 = (TalukaMasterItem) z12.get(i10)) == null)) {
                    str2 = talukaMasterItem2.getSubDistcode();
                }
                this.f8012a.m2().f27599w.setText(str);
                this.f8012a.m2().f27599w.setContentDescription(str2);
                this.f8012a.v2().setSubDistrict(str2);
                this.f8012a.l2((String) this.f8013b.f20234e);
                editText = this.f8012a.m2().M;
                sb2 = new StringBuilder();
                sb2.append(this.f8012a.m2().f27599w.getText());
                sb2.append(", ");
                sb2.append(this.f8012a.m2().f27601x.getText());
                sb2.append(", ");
                editText2 = this.f8012a.m2().f27603y;
            } else {
                List C1 = this.f8012a.f7998m0;
                if (!(C1 == null || (talukaMasterItem = (TalukaMasterItem) C1.get(i10)) == null)) {
                    str2 = talukaMasterItem.getSubDistcode();
                }
                this.f8012a.m2().D.setText(str);
                this.f8012a.m2().D.setContentDescription(str2);
                this.f8012a.t2().setSubDistrict(str2);
                this.f8012a.u2((String) this.f8013b.f20234e);
                editText = this.f8012a.m2().A;
                sb2 = new StringBuilder();
                sb2.append(this.f8012a.m2().D.getText());
                sb2.append(", ");
                sb2.append(this.f8012a.m2().E.getText());
                sb2.append(", ");
                editText2 = this.f8012a.m2().F;
            }
            sb2.append(editText2.getText());
            editText.setText(sb2.toString());
        }
    }

    public static final class h implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewClTwo f8014a;

        h(NewClTwo newClTwo) {
            this.f8014a = newClTwo;
        }

        public void a(String str, int i10) {
            DlAddress t22;
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            String str2 = null;
            if (cm.l.a(this.f8014a.f8001p0, "dl-renewal-current-address")) {
                List A1 = this.f8014a.f7999n0;
                if (!(A1 == null || (villageOrTownMasterItem2 = (VillageOrTownMasterItem) A1.get(i10)) == null)) {
                    str2 = villageOrTownMasterItem2.getVillageCode();
                }
                this.f8014a.m2().L.setText(str);
                this.f8014a.m2().L.setContentDescription(str2);
                t22 = this.f8014a.v2();
            } else {
                List D1 = this.f8014a.f8000o0;
                if (!(D1 == null || (villageOrTownMasterItem = (VillageOrTownMasterItem) D1.get(i10)) == null)) {
                    str2 = villageOrTownMasterItem.getVillageCode();
                }
                this.f8014a.m2().G.setText(str);
                this.f8014a.m2().G.setContentDescription(str2);
                t22 = this.f8014a.t2();
            }
            t22.setVillageOrTown(str2);
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8015a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f8015a = lVar;
        }

        public final pl.c a() {
            return this.f8015a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8015a.invoke(obj);
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

    public NewClTwo() {
    }

    private final void E2() {
        C3(new ld.c(o2()));
        B3(new ld.f(o2()));
        u3(new ProgressDialog(o2()));
        r2().setMessage(C2().b("label_challan_please_wait", getString(R.string.please_wait)));
        r2().setCancelable(false);
        r2().setCanceledOnTouchOutside(false);
        m2().W.f25961g.setText(B2().i());
        q3(ClInter.f7830a.a(o2()));
        p3((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(n2()))).a(t9.a.class));
        if (getIntent() != null) {
            D3(String.valueOf(getIntent().getStringExtra("state_code")));
            z3(String.valueOf(getIntent().getStringExtra("rto_code")));
            A3(String.valueOf(getIntent().getStringExtra("rto_name")));
            h3(String.valueOf(getIntent().getStringExtra("clFirstName")));
            j3(String.valueOf(getIntent().getStringExtra("clMiddleName")));
            i3(String.valueOf(getIntent().getStringExtra("clLastName")));
            m3(String.valueOf(getIntent().getStringExtra("clRelation")));
            w3(String.valueOf(getIntent().getStringExtra("relFirstName")));
            y3(String.valueOf(getIntent().getStringExtra("relMiddleName")));
            x3(String.valueOf(getIntent().getStringExtra("relLastName")));
            b3(String.valueOf(getIntent().getStringExtra("appDob")));
            f3(String.valueOf(getIntent().getStringExtra("clEdu")));
            e3(String.valueOf(getIntent().getStringExtra("clBlood")));
            l3(String.valueOf(getIntent().getStringExtra("clPhone")));
            g3(String.valueOf(getIntent().getStringExtra("clEmail")));
            k3(String.valueOf(getIntent().getStringExtra("clMobile")));
            d3(String.valueOf(getIntent().getStringExtra("clAlterMobile")));
            s3(String.valueOf(getIntent().getStringExtra("mark1")));
            t3(String.valueOf(getIntent().getStringExtra("mark2")));
            c3(String.valueOf(getIntent().getStringExtra("appGender")));
        }
    }

    private final boolean F2() {
        ld.c C2;
        String string;
        String str;
        String b10;
        Editable text = m2().f27603y.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            C2 = C2();
            string = getString(R.string.select_state);
            str = "select_state";
        } else {
            Editable text2 = m2().f27601x.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                C2 = C2();
                string = getString(R.string.select_district);
                str = "select_district";
            } else {
                Editable text3 = m2().f27599w.getText();
                cm.l.e(text3, "getText(...)");
                if (text3.length() == 0) {
                    C2 = C2();
                    string = getString(R.string.select_taluka);
                    str = "select_taluka";
                } else {
                    Editable text4 = m2().M.getText();
                    cm.l.e(text4, "getText(...)");
                    if (text4.length() == 0) {
                        C2 = C2();
                        string = getString(R.string.sel_landmark);
                        str = "select_landmark";
                    } else {
                        Editable text5 = m2().N.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() == 0) {
                            C2 = C2();
                            string = getString(R.string.enter_pincode);
                            str = "select_pincode";
                        } else {
                            if (m2().N.getText().length() >= 6) {
                                Editable text6 = m2().F.getText();
                                cm.l.e(text6, "getText(...)");
                                if (text6.length() == 0) {
                                    C2 = C2();
                                    string = getString(R.string.sel_p_state);
                                    str = "select_pstate";
                                } else {
                                    Editable text7 = m2().E.getText();
                                    cm.l.e(text7, "getText(...)");
                                    if (text7.length() == 0) {
                                        C2 = C2();
                                        string = getString(R.string.sel_p_dis);
                                        str = "select_pdistrict";
                                    } else {
                                        Editable text8 = m2().D.getText();
                                        cm.l.e(text8, "getText(...)");
                                        if (text8.length() == 0) {
                                            C2 = C2();
                                            string = getString(R.string.sel_p_tal);
                                            str = "select_ptaluka";
                                        } else {
                                            Editable text9 = m2().A.getText();
                                            cm.l.e(text9, "getText(...)");
                                            if (text9.length() == 0) {
                                                C2 = C2();
                                                string = getString(R.string.sel_p_lm);
                                                str = "select_plandmark";
                                            } else {
                                                Editable text10 = m2().B.getText();
                                                cm.l.e(text10, "getText(...)");
                                                if (text10.length() != 0) {
                                                    if (m2().B.getText().length() >= 6) {
                                                        return true;
                                                    }
                                                    C2 = C2();
                                                    string = getString(R.string.sel_pc_pin);
                                                    str = "select_ppin_code";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b10 = C2().b("select_pin_code", getString(R.string.enter_correct_pincode));
                            Toast.makeText(this, b10, 0).show();
                            return false;
                        }
                    }
                }
            }
        }
        b10 = C2.b(str, string);
        Toast.makeText(this, b10, 0).show();
        return false;
    }

    private final void G2() {
        m2().W.f25959e.setOnClickListener(new z(this));
        m2().f27603y.setOnClickListener(new d0(this));
        m2().f27601x.setOnClickListener(new e0(this));
        m2().f27599w.setOnClickListener(new f0(this));
        m2().L.setOnClickListener(new g0(this));
        m2().B0.setOnCheckedChangeListener(new h0(this));
        m2().F.setOnClickListener(new v(this));
        m2().E.setOnClickListener(new w(this));
        m2().D.setOnClickListener(new q9.x(this));
        m2().G.setOnClickListener(new y(this));
        m2().J.setOnCheckedChangeListener(new a0(this));
        m2().f27582f0.setOnCheckedChangeListener(new q9.b0(this));
        m2().f27583g0.setOnClickListener(new q9.c0(this));
    }

    /* access modifiers changed from: private */
    public static final void H2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        newClTwo.finish();
    }

    /* access modifiers changed from: private */
    public static final void I2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.V2("dl-renewal-current-address");
        } else {
            Toast.makeText(newClTwo.o2(), "Please Check Your Internet connection", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void J2(NewClTwo newClTwo, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(newClTwo, "this$0");
        List list = newClTwo.f7998m0;
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
            newClTwo.u2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void K2(NewClTwo newClTwo, CompoundButton compoundButton, boolean z10) {
        cm.l.f(newClTwo, "this$0");
        if (z10) {
            try {
                newClTwo.a3();
            } catch (Exception unused) {
                return;
            }
        } else {
            newClTwo.f8003r0 = new DlAddress("", "", "", "", "", "", "", "");
            newClTwo.m2().E.setText("");
            newClTwo.m2().D.setText("");
            newClTwo.m2().G.setText("");
            newClTwo.m2().f27605z.setText("");
            newClTwo.m2().C.setText("");
            newClTwo.m2().C.setText("");
            newClTwo.m2().C.setText("");
        }
        newClTwo.m2().z(newClTwo.f8003r0);
        newClTwo.m2().a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x020f A[SYNTHETIC, Splitter:B:27:0x020f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void L2(com.nic.mparivahan.ClServices.View.NewCl.NewClTwo r3, android.view.View r4) {
        /*
            java.lang.String r4 = ""
            java.lang.String r0 = "this$0"
            cm.l.f(r3, r0)
            boolean r0 = r3.F2()
            if (r0 == 0) goto L_0x022e
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x022e }
            java.lang.Class<com.nic.mparivahan.ClServices.View.NewCl.NewClThree> r1 = com.nic.mparivahan.ClServices.View.NewCl.NewClThree.class
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "state_code"
            java.lang.String r2 = r3.D2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "rto_code"
            java.lang.String r2 = r3.z2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "rto_name"
            java.lang.String r2 = r3.A2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "clFirstName"
            java.lang.String r2 = r3.e2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r3.g2()     // Catch:{ Exception -> 0x022e }
            boolean r1 = cm.l.a(r1, r4)     // Catch:{ Exception -> 0x022e }
            java.lang.String r2 = "clMiddleName"
            if (r1 == 0) goto L_0x0048
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x022e }
            goto L_0x004f
        L_0x0048:
            java.lang.String r1 = r3.g2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x022e }
        L_0x004f:
            java.lang.String r1 = "clLastName"
            java.lang.String r2 = r3.f2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "clRelation"
            java.lang.String r2 = r3.j2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "relFirstName"
            java.lang.String r2 = r3.w2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r3.y2()     // Catch:{ Exception -> 0x022e }
            boolean r1 = cm.l.a(r1, r4)     // Catch:{ Exception -> 0x022e }
            java.lang.String r2 = "relMiddleName"
            if (r1 == 0) goto L_0x007a
        L_0x0076:
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x022e }
            goto L_0x007f
        L_0x007a:
            java.lang.String r4 = r3.y2()     // Catch:{ Exception -> 0x022e }
            goto L_0x0076
        L_0x007f:
            java.lang.String r4 = "relLastName"
            java.lang.String r1 = r3.x2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "appGender"
            java.lang.String r1 = r3.Z1()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "appDob"
            java.lang.String r1 = r3.Y1()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "clEdu"
            java.lang.String r1 = r3.c2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "clBlood"
            java.lang.String r1 = r3.b2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "clPhone"
            java.lang.String r1 = r3.i2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "clEmail"
            java.lang.String r1 = r3.d2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "clMobile"
            java.lang.String r1 = r3.h2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "clAlterMobile"
            java.lang.String r1 = r3.a2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "mark1"
            java.lang.String r1 = r3.p2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "mark2"
            java.lang.String r1 = r3.q2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presHouseNo"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.K     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presStreet"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.O     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presLocation"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.M     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presVillageOrTown"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8002q0     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.getVillageOrTown()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presSubDistrict"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8002q0     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.getSubDistrict()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presDistrict"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8002q0     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.getDistrict()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presState"
            java.lang.String r1 = r3.k2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "presPincode"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.N     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perHouseNo"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.f27605z     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perStreet"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.C     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perLocation"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.A     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "permVillageOrTown"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8003r0     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.getVillageOrTown()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perSubDistrict"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8003r0     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.getSubDistrict()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perDistrict"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8003r0     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.getDistrict()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perState"
            java.lang.String r1 = r3.s2()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "perPinCode"
            ni.n6 r1 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r1 = r1.N     // Catch:{ Exception -> 0x022e }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = "permanentAdd"
            com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r3.f8003r0     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x022e }
            ni.n6 r4 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r4 = r4.L     // Catch:{ Exception -> 0x022e }
            android.text.Editable r4 = r4.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r1 = "NA"
            java.lang.String r2 = "presVillageOrTownName"
            if (r4 == 0) goto L_0x01fe
            int r4 = r4.length()     // Catch:{ Exception -> 0x022e }
            if (r4 != 0) goto L_0x01ec
            goto L_0x01fe
        L_0x01ec:
            ni.n6 r4 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r4 = r4.L     // Catch:{ Exception -> 0x022e }
            android.text.Editable r4 = r4.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x022e }
            goto L_0x0201
        L_0x01fe:
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x022e }
        L_0x0201:
            ni.n6 r4 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r4 = r4.G     // Catch:{ Exception -> 0x022e }
            android.text.Editable r4 = r4.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r2 = "permVillageOrTownName"
            if (r4 == 0) goto L_0x0228
            int r4 = r4.length()     // Catch:{ Exception -> 0x022e }
            if (r4 != 0) goto L_0x0216
            goto L_0x0228
        L_0x0216:
            ni.n6 r4 = r3.m2()     // Catch:{ Exception -> 0x022e }
            android.widget.EditText r4 = r4.G     // Catch:{ Exception -> 0x022e }
            android.text.Editable r4 = r4.getText()     // Catch:{ Exception -> 0x022e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x022e }
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x022e }
            goto L_0x022b
        L_0x0228:
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x022e }
        L_0x022b:
            r3.startActivity(r0)     // Catch:{ Exception -> 0x022e }
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.NewCl.NewClTwo.L2(com.nic.mparivahan.ClServices.View.NewCl.NewClTwo, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void M2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.U2("dl-renewal-current-address");
        } else {
            Toast.makeText(newClTwo.o2(), newClTwo.C2().b("label_log_check_internet", newClTwo.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void N2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.W2("dl-renewal-current-address");
        } else {
            Toast.makeText(newClTwo.o2(), newClTwo.C2().b("label_log_check_internet", newClTwo.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void O2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.X2("dl-renewal-current-address");
        } else {
            Toast.makeText(newClTwo.o2(), newClTwo.C2().b("label_log_check_internet", newClTwo.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void P2(NewClTwo newClTwo, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(newClTwo, "this$0");
        List list = newClTwo.f7997l0;
        if (list != null && (!list.isEmpty())) {
            if (i10 == R.id.town_rb) {
                str = "U";
            } else if (i10 == R.id.village_rb) {
                str = "R";
            } else {
                return;
            }
            newClTwo.l2(str);
        }
    }

    private final void Q1() {
        this.f7991f0 = (c0) new u0(this).a(c0.class);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            r2().show();
            c0 c0Var = this.f7991f0;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.m();
            return;
        }
        Toast.makeText(o2(), "Please Check Your Internet connection", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void Q2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.V2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(newClTwo.o2(), "Please Check Your Internet connection", 1).show();
        }
    }

    private final void R1() {
        c0 c0Var = this.f7991f0;
        c0 c0Var2 = null;
        if (c0Var == null) {
            cm.l.v("viewModel");
            c0Var = null;
        }
        c0Var.i().g(this, new i(new a(this)));
        c0 c0Var3 = this.f7991f0;
        if (c0Var3 == null) {
            cm.l.v("viewModel");
            c0Var3 = null;
        }
        c0Var3.h().g(this, new i(new b(this)));
        c0 c0Var4 = this.f7991f0;
        if (c0Var4 == null) {
            cm.l.v("viewModel");
            c0Var4 = null;
        }
        c0Var4.k().g(this, new i(new c(this)));
        c0 c0Var5 = this.f7991f0;
        if (c0Var5 == null) {
            cm.l.v("viewModel");
        } else {
            c0Var2 = c0Var5;
        }
        c0Var2.l().g(this, new i(new d(this)));
    }

    /* access modifiers changed from: private */
    public static final void R2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.U2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(newClTwo.o2(), newClTwo.C2().b("label_log_check_internet", newClTwo.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public final void S1() {
        m2().f27601x.setText("");
        m2().f27601x.setHint(C2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.f7997l0 = q.i();
        T1();
    }

    /* access modifiers changed from: private */
    public static final void S2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.W2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(newClTwo.o2(), newClTwo.C2().b("label_log_check_internet", newClTwo.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public final void T1() {
        m2().f27599w.setText("");
        m2().f27599w.setHint(C2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.f7997l0 = q.i();
        U1();
        U1();
    }

    /* access modifiers changed from: private */
    public static final void T2(NewClTwo newClTwo, View view) {
        cm.l.f(newClTwo, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newClTwo)) {
            newClTwo.X2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(newClTwo.o2(), newClTwo.C2().b("label_log_check_internet", newClTwo.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    private final void U1() {
        m2().L.setText("");
        m2().L.setHint(C2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.f7999n0 = q.i();
    }

    private final void U2(String str) {
        try {
            this.f8001p0 = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.f8001p0, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.f7995j0;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.f7996k0;
                if (list2 != null) {
                    for (DistrictsMasterItem districtsMasterItem2 : list2) {
                        arrayList.add(String.valueOf(districtsMasterItem2 != null ? districtsMasterItem2.getDistName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Districts", arrayList);
            a10.k2(F0(), "DistPicker");
            a10.n2(new e(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void V1() {
        m2().E.setText("");
        m2().E.setHint(C2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.f7996k0 = q.i();
        W1();
    }

    private final void V2(String str) {
        try {
            this.f8001p0 = str;
            ArrayList arrayList = new ArrayList();
            List<StateMasterItem> list = this.f7994i0;
            if (list != null) {
                for (StateMasterItem stateMasterItem : list) {
                    arrayList.add(String.valueOf(stateMasterItem != null ? stateMasterItem.getStateName() : null));
                }
            }
            kk.e a10 = kk.e.A0.a("Select State", arrayList);
            a10.k2(F0(), "StatePicker");
            a10.n2(new f(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void W1() {
        m2().D.setText("");
        m2().D.setHint(C2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.f7998m0 = q.i();
        X1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (m2().f27584h0.isChecked() != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void W2(java.lang.String r7) {
        /*
            r6 = this;
            r6.f8001p0 = r7     // Catch:{ Exception -> 0x00a1 }
            cm.u r7 = new cm.u     // Catch:{ Exception -> 0x00a1 }
            r7.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = ""
            r7.f20234e = r0     // Catch:{ Exception -> 0x00a1 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a1 }
            r0.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r1 = r6.f8001p0     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "dl-renewal-current-address"
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "R"
            java.lang.String r3 = "U"
            r4 = 0
            if (r1 == 0) goto L_0x0055
            java.util.List r1 = r6.f7997l0     // Catch:{ Exception -> 0x00a1 }
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
            ni.n6 r1 = r6.m2()     // Catch:{ Exception -> 0x00a1 }
            android.widget.RadioButton r1 = r1.f27584h0     // Catch:{ Exception -> 0x00a1 }
            boolean r1 = r1.isChecked()     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            r7.f20234e = r2     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0088
        L_0x0055:
            java.util.List r1 = r6.f7998m0     // Catch:{ Exception -> 0x00a1 }
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
            ni.n6 r1 = r6.m2()     // Catch:{ Exception -> 0x00a1 }
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
            com.nic.mparivahan.ClServices.View.NewCl.NewClTwo$g r1 = new com.nic.mparivahan.ClServices.View.NewCl.NewClTwo$g     // Catch:{ Exception -> 0x00a1 }
            r1.<init>(r6, r7)     // Catch:{ Exception -> 0x00a1 }
            r0.n2(r1)     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.NewCl.NewClTwo.W2(java.lang.String):void");
    }

    private final void X1() {
        m2().G.setText("");
        m2().G.setHint(C2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.f8000o0 = q.i();
    }

    private final void X2(String str) {
        try {
            this.f8001p0 = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.f8001p0, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.f7999n0;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.f8000o0;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Village/Town", arrayList);
            a10.k2(F0(), "VillageTownPicker");
            a10.n2(new h(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void Y2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById2).setText(str);
        ((TextView) findViewById).setText(C2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(C2().b("btn_ok", "OK"));
        textView.setOnClickListener(new q9.u(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Z2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void a3() {
        try {
            this.f8003r0 = this.f8002q0;
            v3(k2());
            m2().F.setText(m2().f27603y.getText());
            m2().E.setText(m2().f27601x.getText());
            m2().D.setText(m2().f27599w.getText());
            m2().G.setText(m2().L.getText());
            m2().f27605z.setText(m2().K.getText());
            m2().C.setText(m2().O.getText());
            m2().A.setText(m2().M.getText());
            m2().B.setText(m2().N.getText());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void l2(String str) {
        try {
            String obj = m2().f27599w.getContentDescription().toString();
            U1();
            r2().dismiss();
            c0 c0Var = this.f7991f0;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.o(m2().f27603y.getContentDescription().toString(), m2().f27601x.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void u2(String str) {
        try {
            String obj = m2().D.getContentDescription().toString();
            X1();
            c0 c0Var = this.f7991f0;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.o(m2().F.getContentDescription().toString(), m2().E.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    public final String A2() {
        String str = this.f7990e0;
        if (str != null) {
            return str;
        }
        cm.l.v("rto_name");
        return null;
    }

    public final void A3(String str) {
        cm.l.f(str, "<set-?>");
        this.f7990e0 = str;
    }

    public final ld.f B2() {
        ld.f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void B3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final ld.c C2() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void C3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final String D2() {
        String str = this.f7988c0;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public final void D3(String str) {
        cm.l.f(str, "<set-?>");
        this.f7988c0 = str;
    }

    public final String Y1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("appDob");
        return null;
    }

    public final String Z1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("appGender");
        return null;
    }

    public final String a2() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("clAlterMobile");
        return null;
    }

    public final String b2() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("clBlood");
        return null;
    }

    public final void b3(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final String c2() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("clEdu");
        return null;
    }

    public final void c3(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final String d2() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("clEmail");
        return null;
    }

    public final void d3(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final String e2() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("clFirstName");
        return null;
    }

    public final void e3(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final String f2() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("clLastName");
        return null;
    }

    public final void f3(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final String g2() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("clMiddleName");
        return null;
    }

    public final void g3(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final String h2() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("clMobile");
        return null;
    }

    public final void h3(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final String i2() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("clPhone");
        return null;
    }

    public final void i3(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final String j2() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("clRelation");
        return null;
    }

    public final void j3(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final String k2() {
        String str = this.f8004s0;
        if (str != null) {
            return str;
        }
        cm.l.v("currStateCd");
        return null;
    }

    public final void k3(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void l3(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final n6 m2() {
        n6 n6Var = this.G;
        if (n6Var != null) {
            return n6Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final void m3(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final ClInter n2() {
        ClInter clInter = this.f7993h0;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final void n3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8004s0 = str;
    }

    public final Context o2() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void o3(n6 n6Var) {
        cm.l.f(n6Var, "<set-?>");
        this.G = n6Var;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n6 x10 = n6.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        o3(x10);
        setContentView(m2().m());
        r3(this);
        v9.e.f17509a.u1(this, m2());
        E2();
        Q1();
        R1();
        G2();
    }

    public final String p2() {
        String str = this.f7986a0;
        if (str != null) {
            return str;
        }
        cm.l.v("mark1");
        return null;
    }

    public final void p3(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f7992g0 = aVar;
    }

    public final String q2() {
        String str = this.f7987b0;
        if (str != null) {
            return str;
        }
        cm.l.v("mark2");
        return null;
    }

    public final void q3(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.f7993h0 = clInter;
    }

    public final ProgressDialog r2() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void r3(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final String s2() {
        String str = this.f8005t0;
        if (str != null) {
            return str;
        }
        cm.l.v("perStateCd");
        return null;
    }

    public final void s3(String str) {
        cm.l.f(str, "<set-?>");
        this.f7986a0 = str;
    }

    public final DlAddress t2() {
        return this.f8003r0;
    }

    public final void t3(String str) {
        cm.l.f(str, "<set-?>");
        this.f7987b0 = str;
    }

    public final void u3(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final DlAddress v2() {
        return this.f8002q0;
    }

    public final void v3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8005t0 = str;
    }

    public final String w2() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("relFirstName");
        return null;
    }

    public final void w3(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final String x2() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("relLastName");
        return null;
    }

    public final void x3(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final String y2() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("relMiddleName");
        return null;
    }

    public final void y3(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String z2() {
        String str = this.f7989d0;
        if (str != null) {
            return str;
        }
        cm.l.v("rto_code");
        return null;
    }

    public final void z3(String str) {
        cm.l.f(str, "<set-?>");
        this.f7989d0 = str;
    }
}
