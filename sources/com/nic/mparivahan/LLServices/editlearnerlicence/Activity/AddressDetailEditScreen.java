package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
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
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import java.util.ArrayList;
import java.util.List;
import jj.c0;
import kk.e;
import ni.n4;
import pl.x;
import ub.i;
import ub.j;
import ub.k;
import ub.n;
import ub.o;
import v9.e;

public final class AddressDetailEditScreen extends androidx.appcompat.app.d {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private int D0;
    private int E0;
    private ArrayList F0 = new ArrayList();
    /* access modifiers changed from: private */
    public n4 G;
    private String G0 = "";
    /* access modifiers changed from: private */
    public c0 H;
    private String H0 = "";
    public t9.a I;
    private String I0 = "";
    public ClInter J;
    private String J0 = "";
    /* access modifiers changed from: private */
    public List K;
    private String K0 = "";
    /* access modifiers changed from: private */
    public List L;
    private String L0 = "";
    /* access modifiers changed from: private */
    public List M;
    private String M0 = "";
    /* access modifiers changed from: private */
    public List N;
    private String N0 = "";
    /* access modifiers changed from: private */
    public List O;
    private String O0 = "";
    /* access modifiers changed from: private */
    public List P;
    private String P0 = "";
    /* access modifiers changed from: private */
    public List Q;
    private String Q0 = "";
    private ArrayList R = new ArrayList();
    private String R0 = "";
    private ArrayList S = new ArrayList();
    private String S0 = "";
    /* access modifiers changed from: private */
    public String T = "";
    private String T0 = "";
    private DlAddress U = new DlAddress("", "", "", "", "", "", "", "");
    private String U0 = "";
    private DlAddress V = new DlAddress("", "", "", "", "", "", "", "");
    private String V0 = "";
    public String W;
    private String W0 = "";
    public String X;
    private String X0 = "";
    public Context Y;
    private String Y0 = "";
    public ProgressDialog Z;
    private String Z0 = "";

    /* renamed from: a0  reason: collision with root package name */
    public ld.c f9152a0;

    /* renamed from: b0  reason: collision with root package name */
    public ld.f f9153b0;

    /* renamed from: c0  reason: collision with root package name */
    private ArrayList f9154c0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    private String f9155d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f9156e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f9157f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f9158g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f9159h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f9160i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f9161j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f9162k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f9163l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f9164m0 = "";
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public boolean f9165n0;
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public boolean f9166o0;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public boolean f9167p0;
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public boolean f9168q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f9169r0;

    /* renamed from: s0  reason: collision with root package name */
    private String f9170s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f9171t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f9172u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f9173v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f9174w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f9175x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f9176y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private boolean f9177z0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9178e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AddressDetailEditScreen addressDetailEditScreen) {
            super(1);
            this.f9178e = addressDetailEditScreen;
        }

        public final void b(StateResponse stateResponse) {
            try {
                this.f9178e.g2().dismiss();
                if (cm.l.a(stateResponse.getStatusCode(), "00")) {
                    List<StateMasterItem> stateMaster = stateResponse.getStateMaster();
                    if (stateMaster != null && (!stateMaster.isEmpty())) {
                        this.f9178e.K = stateResponse.getStateMaster();
                        return;
                    }
                    return;
                }
                AddressDetailEditScreen addressDetailEditScreen = this.f9178e;
                addressDetailEditScreen.H2(addressDetailEditScreen.m2().b("no_details", this.f9178e.getString(R.string.no_Details_are_avail)));
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen2 = this.f9178e;
                addressDetailEditScreen2.H2(addressDetailEditScreen2.m2().b("service_is_not_present", this.f9178e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9179e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AddressDetailEditScreen addressDetailEditScreen) {
            super(1);
            this.f9179e = addressDetailEditScreen;
        }

        public final void b(DistResponse distResponse) {
            try {
                this.f9179e.g2().dismiss();
                if (cm.l.a(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    this.f9179e.L = distResponse.getDistMaster();
                    this.f9179e.M = distResponse.getDistMaster();
                    return;
                }
                AddressDetailEditScreen addressDetailEditScreen = this.f9179e;
                addressDetailEditScreen.H2(addressDetailEditScreen.m2().b("no_details", this.f9179e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen2 = this.f9179e;
                addressDetailEditScreen2.H2(addressDetailEditScreen2.m2().b("service_is_not_present", this.f9179e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DistResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9180e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AddressDetailEditScreen addressDetailEditScreen) {
            super(1);
            this.f9180e = addressDetailEditScreen;
        }

        public final void b(TalukaResponse talukaResponse) {
            AddressDetailEditScreen addressDetailEditScreen;
            ld.c m22;
            String str;
            String string;
            AddressDetailEditScreen addressDetailEditScreen2;
            AddressDetailEditScreen addressDetailEditScreen3;
            try {
                this.f9180e.g2().dismiss();
                String str2 = null;
                if (cm.l.a(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (this.f9180e.f9165n0) {
                        if (this.f9180e.f9166o0) {
                            addressDetailEditScreen3 = this.f9180e;
                        } else {
                            addressDetailEditScreen2 = this.f9180e;
                            addressDetailEditScreen2.O = talukaResponse.getTakulaMaster();
                        }
                    } else if (cm.l.a(this.f9180e.T, "dl-renewal-current-address")) {
                        addressDetailEditScreen3 = this.f9180e;
                    } else {
                        addressDetailEditScreen2 = this.f9180e;
                        addressDetailEditScreen2.O = talukaResponse.getTakulaMaster();
                    }
                    addressDetailEditScreen3.N = talukaResponse.getTakulaMaster();
                } else {
                    if (talukaResponse != null) {
                        str2 = talukaResponse.getStatusCode();
                    }
                    if (cm.l.a(str2, "01")) {
                        addressDetailEditScreen = this.f9180e;
                        m22 = addressDetailEditScreen.m2();
                        str = "no_taluka_found";
                        string = "";
                    } else {
                        addressDetailEditScreen = this.f9180e;
                        m22 = addressDetailEditScreen.m2();
                        str = "no_details";
                        string = this.f9180e.getString(R.string.unable_to_get_details);
                    }
                    addressDetailEditScreen.H2(m22.b(str, string));
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen4 = this.f9180e;
                addressDetailEditScreen4.H2(addressDetailEditScreen4.m2().b("service_is_not_present", this.f9180e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TalukaResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9181e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddressDetailEditScreen addressDetailEditScreen) {
            super(1);
            this.f9181e = addressDetailEditScreen;
        }

        public final void b(VillageOrTownResponse villageOrTownResponse) {
            AddressDetailEditScreen addressDetailEditScreen;
            AddressDetailEditScreen addressDetailEditScreen2;
            try {
                this.f9181e.g2().dismiss();
                if (cm.l.a(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    if (this.f9181e.f9167p0) {
                        if (this.f9181e.f9168q0) {
                            addressDetailEditScreen2 = this.f9181e;
                        } else {
                            addressDetailEditScreen = this.f9181e;
                            addressDetailEditScreen.Q = villageOrTownResponse.getVillageMaster();
                            return;
                        }
                    } else if (cm.l.a(this.f9181e.T, "dl-renewal-current-address")) {
                        addressDetailEditScreen2 = this.f9181e;
                    } else {
                        addressDetailEditScreen = this.f9181e;
                        addressDetailEditScreen.Q = villageOrTownResponse.getVillageMaster();
                        return;
                    }
                    addressDetailEditScreen2.P = villageOrTownResponse.getVillageMaster();
                    return;
                }
                AddressDetailEditScreen addressDetailEditScreen3 = this.f9181e;
                addressDetailEditScreen3.H2(addressDetailEditScreen3.m2().b("no_vill_found", ""));
            } catch (Exception unused) {
                AddressDetailEditScreen addressDetailEditScreen4 = this.f9181e;
                addressDetailEditScreen4.H2(addressDetailEditScreen4.m2().b("service_is_not_present", this.f9181e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VillageOrTownResponse) obj);
            return x.f30437a;
        }
    }

    public static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9182a;

        e(AddressDetailEditScreen addressDetailEditScreen) {
            this.f9182a = addressDetailEditScreen;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
            r7 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r0.get(r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r6, int r7) {
            /*
                r5 = this;
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r5.f9182a
                r1 = 0
                r0.f9165n0 = r1
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r5.f9182a
                java.lang.String r0 = r0.T
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                java.lang.String r3 = "binding"
                r4 = 0
                if (r1 == 0) goto L_0x008e
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r5.f9182a
                java.util.List r0 = r0.L
                if (r0 == 0) goto L_0x002e
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r7
                if (r7 == 0) goto L_0x002e
                java.lang.String r7 = r7.getDistCode()
                goto L_0x002f
            L_0x002e:
                r7 = r4
            L_0x002f:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r5.f9182a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x003b
                cm.l.v(r3)
                r0 = r4
            L_0x003b:
                android.widget.EditText r0 = r0.f27574y
                r0.setText(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                ni.n4 r6 = r6.G
                if (r6 != 0) goto L_0x004c
                cm.l.v(r3)
                r6 = r4
            L_0x004c:
                android.widget.EditText r6 = r6.f27574y
                r6.setContentDescription(r7)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.k2()
                r6.setDistrict(r7)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                r6.X1()
                if (r7 == 0) goto L_0x00ff
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                android.app.ProgressDialog r0 = r6.g2()
                r0.dismiss()
                jj.c0 r0 = r6.H
                if (r0 != 0) goto L_0x0074
                cm.l.v(r2)
                r0 = r4
            L_0x0074:
                ni.n4 r6 = r6.G
                if (r6 != 0) goto L_0x007e
                cm.l.v(r3)
                goto L_0x007f
            L_0x007e:
                r4 = r6
            L_0x007f:
                android.widget.EditText r6 = r4.f27575z
            L_0x0081:
                java.lang.CharSequence r6 = r6.getContentDescription()
                java.lang.String r6 = r6.toString()
                r0.n(r6, r7)
                goto L_0x00ff
            L_0x008e:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00ff
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r5.f9182a
                java.util.List r0 = r0.M
                if (r0 == 0) goto L_0x00ab
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r7
                if (r7 == 0) goto L_0x00ab
                java.lang.String r7 = r7.getDistCode()
                goto L_0x00ac
            L_0x00ab:
                r7 = r4
            L_0x00ac:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r5.f9182a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x00b8
                cm.l.v(r3)
                r0 = r4
            L_0x00b8:
                android.widget.EditText r0 = r0.F
                r0.setText(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                ni.n4 r6 = r6.G
                if (r6 != 0) goto L_0x00c9
                cm.l.v(r3)
                r6 = r4
            L_0x00c9:
                android.widget.EditText r6 = r6.F
                r6.setContentDescription(r7)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.i2()
                r6.setDistrict(r7)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                r6.Z1()
                if (r7 == 0) goto L_0x00ff
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r6 = r5.f9182a
                android.app.ProgressDialog r0 = r6.g2()
                r0.dismiss()
                jj.c0 r0 = r6.H
                if (r0 != 0) goto L_0x00f1
                cm.l.v(r2)
                r0 = r4
            L_0x00f1:
                ni.n4 r6 = r6.G
                if (r6 != 0) goto L_0x00fb
                cm.l.v(r3)
                goto L_0x00fc
            L_0x00fb:
                r4 = r6
            L_0x00fc:
                android.widget.EditText r6 = r4.G
                goto L_0x0081
            L_0x00ff:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen.e.a(java.lang.String, int):void");
        }
    }

    public static final class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f9184b;

        f(AddressDetailEditScreen addressDetailEditScreen, u uVar) {
            this.f9183a = addressDetailEditScreen;
            this.f9184b = uVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                r1 = 0
                r0.f9167p0 = r1
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                java.lang.String r0 = r0.T
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r0 = cm.l.a(r0, r1)
                java.lang.String r1 = ", "
                java.lang.String r2 = "binding"
                r3 = 0
                if (r0 == 0) goto L_0x00c7
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                java.util.List r0 = r0.N
                if (r0 == 0) goto L_0x002e
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r6
                if (r6 == 0) goto L_0x002e
                java.lang.String r6 = r6.getSubDistcode()
                goto L_0x002f
            L_0x002e:
                r6 = r3
            L_0x002f:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x003b
                cm.l.v(r2)
                r0 = r3
            L_0x003b:
                android.widget.EditText r0 = r0.f27573x
                r0.setText(r5)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                ni.n4 r5 = r5.G
                if (r5 != 0) goto L_0x004c
                cm.l.v(r2)
                r5 = r3
            L_0x004c:
                android.widget.EditText r5 = r5.f27573x
                r5.setContentDescription(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.k2()
                r5.setSubDistrict(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                cm.u r6 = r4.f9184b
                java.lang.Object r6 = r6.f20234e
                java.lang.String r6 = (java.lang.String) r6
                r5.c2(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                ni.n4 r5 = r5.G
                if (r5 != 0) goto L_0x0071
                cm.l.v(r2)
                r5 = r3
            L_0x0071:
                android.widget.EditText r5 = r5.N
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x0084
                cm.l.v(r2)
                r0 = r3
            L_0x0084:
                android.widget.EditText r0 = r0.f27573x
                android.text.Editable r0 = r0.getText()
                r6.append(r0)
                r6.append(r1)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x009c
                cm.l.v(r2)
                r0 = r3
            L_0x009c:
                android.widget.EditText r0 = r0.f27574y
                android.text.Editable r0 = r0.getText()
                r6.append(r0)
                r6.append(r1)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x00b4
                cm.l.v(r2)
                goto L_0x00b5
            L_0x00b4:
                r3 = r0
            L_0x00b5:
                android.widget.EditText r0 = r3.f27575z
            L_0x00b7:
                android.text.Editable r0 = r0.getText()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.setText(r6)
                goto L_0x0167
            L_0x00c7:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                java.util.List r0 = r0.O
                if (r0 == 0) goto L_0x00dc
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r6
                if (r6 == 0) goto L_0x00dc
                java.lang.String r6 = r6.getSubDistcode()
                goto L_0x00dd
            L_0x00dc:
                r6 = r3
            L_0x00dd:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x00e9
                cm.l.v(r2)
                r0 = r3
            L_0x00e9:
                android.widget.EditText r0 = r0.E
                r0.setText(r5)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                ni.n4 r5 = r5.G
                if (r5 != 0) goto L_0x00fa
                cm.l.v(r2)
                r5 = r3
            L_0x00fa:
                android.widget.EditText r5 = r5.E
                r5.setContentDescription(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.i2()
                r5.setSubDistrict(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                cm.u r6 = r4.f9184b
                java.lang.Object r6 = r6.f20234e
                java.lang.String r6 = (java.lang.String) r6
                r5.j2(r6)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r5 = r4.f9183a
                ni.n4 r5 = r5.G
                if (r5 != 0) goto L_0x011f
                cm.l.v(r2)
                r5 = r3
            L_0x011f:
                android.widget.EditText r5 = r5.B
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x0132
                cm.l.v(r2)
                r0 = r3
            L_0x0132:
                android.widget.EditText r0 = r0.E
                android.text.Editable r0 = r0.getText()
                r6.append(r0)
                r6.append(r1)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x014a
                cm.l.v(r2)
                r0 = r3
            L_0x014a:
                android.widget.EditText r0 = r0.F
                android.text.Editable r0 = r0.getText()
                r6.append(r0)
                r6.append(r1)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r4.f9183a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x0162
                cm.l.v(r2)
                goto L_0x0163
            L_0x0162:
                r3 = r0
            L_0x0163:
                android.widget.EditText r0 = r3.G
                goto L_0x00b7
            L_0x0167:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen.f.a(java.lang.String, int):void");
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressDetailEditScreen f9185a;

        g(AddressDetailEditScreen addressDetailEditScreen) {
            this.f9185a = addressDetailEditScreen;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r0.get(r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r4, int r5) {
            /*
                r3 = this;
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r3.f9185a
                java.lang.String r0 = r0.T
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r0 = cm.l.a(r0, r1)
                java.lang.String r1 = "binding"
                r2 = 0
                if (r0 == 0) goto L_0x0054
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r3.f9185a
                java.util.List r0 = r0.P
                if (r0 == 0) goto L_0x0026
                java.lang.Object r5 = r0.get(r5)
                com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r5
                if (r5 == 0) goto L_0x0026
                java.lang.String r5 = r5.getVillageCode()
                goto L_0x0027
            L_0x0026:
                r5 = r2
            L_0x0027:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r3.f9185a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x0033
                cm.l.v(r1)
                r0 = r2
            L_0x0033:
                android.widget.EditText r0 = r0.M
                r0.setText(r4)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r4 = r3.f9185a
                ni.n4 r4 = r4.G
                if (r4 != 0) goto L_0x0044
                cm.l.v(r1)
                goto L_0x0045
            L_0x0044:
                r2 = r4
            L_0x0045:
                android.widget.EditText r4 = r2.M
                r4.setContentDescription(r5)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r4 = r3.f9185a
                com.nic.mparivahan.dlservices.data.model.DlAddress r4 = r4.k2()
            L_0x0050:
                r4.setVillageOrTown(r5)
                goto L_0x0094
            L_0x0054:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r3.f9185a
                java.util.List r0 = r0.Q
                if (r0 == 0) goto L_0x0069
                java.lang.Object r5 = r0.get(r5)
                com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r5
                if (r5 == 0) goto L_0x0069
                java.lang.String r5 = r5.getVillageCode()
                goto L_0x006a
            L_0x0069:
                r5 = r2
            L_0x006a:
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r0 = r3.f9185a
                ni.n4 r0 = r0.G
                if (r0 != 0) goto L_0x0076
                cm.l.v(r1)
                r0 = r2
            L_0x0076:
                android.widget.EditText r0 = r0.H
                r0.setText(r4)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r4 = r3.f9185a
                ni.n4 r4 = r4.G
                if (r4 != 0) goto L_0x0087
                cm.l.v(r1)
                goto L_0x0088
            L_0x0087:
                r2 = r4
            L_0x0088:
                android.widget.EditText r4 = r2.H
                r4.setContentDescription(r5)
                com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen r4 = r3.f9185a
                com.nic.mparivahan.dlservices.data.model.DlAddress r4 = r4.i2()
                goto L_0x0050
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen.g.a(java.lang.String, int):void");
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9186a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f9186a = lVar;
        }

        public final pl.c a() {
            return this.f9186a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9186a.invoke(obj);
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

    public AddressDetailEditScreen() {
    }

    /* access modifiers changed from: private */
    public static final void A2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(addressDetailEditScreen)) {
            addressDetailEditScreen.E2("dl-renewal-current-address");
        } else {
            Toast.makeText(addressDetailEditScreen.f2(), addressDetailEditScreen.m2().b("label_log_check_internet", addressDetailEditScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void B2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(addressDetailEditScreen)) {
            addressDetailEditScreen.F2("dl-renewal-current-address");
        } else {
            Toast.makeText(addressDetailEditScreen.f2(), addressDetailEditScreen.m2().b("label_log_check_internet", addressDetailEditScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void C2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(addressDetailEditScreen)) {
            addressDetailEditScreen.G2("dl-renewal-current-address");
        } else {
            Toast.makeText(addressDetailEditScreen.f2(), addressDetailEditScreen.m2().b("label_log_check_internet", addressDetailEditScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(AddressDetailEditScreen addressDetailEditScreen, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(addressDetailEditScreen, "this$0");
        List list = addressDetailEditScreen.N;
        if (list != null && (!list.isEmpty())) {
            if (i10 == R.id.town_rb) {
                addressDetailEditScreen.D0 = 2;
                str = "U";
            } else if (i10 == R.id.village_rb) {
                addressDetailEditScreen.D0 = 1;
                str = "R";
            } else {
                return;
            }
            addressDetailEditScreen.c2(str);
        }
    }

    private final void E2(String str) {
        try {
            this.T = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.T, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.L;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.M;
                if (list2 != null) {
                    for (DistrictsMasterItem districtsMasterItem2 : list2) {
                        arrayList.add(String.valueOf(districtsMasterItem2 != null ? districtsMasterItem2.getDistName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Districts", arrayList);
            a10.k2(F0(), "DistPicker");
            a10.n2(new e(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r5.f27551a0.isChecked() != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void F2(java.lang.String r8) {
        /*
            r7 = this;
            r7.T = r8     // Catch:{ Exception -> 0x003e }
            cm.u r8 = new cm.u     // Catch:{ Exception -> 0x003e }
            r8.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.String r0 = ""
            r8.f20234e = r0     // Catch:{ Exception -> 0x003e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x003e }
            r0.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = r7.T     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "dl-renewal-current-address"
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "R"
            java.lang.String r3 = "U"
            java.lang.String r4 = "binding"
            r5 = 0
            if (r1 == 0) goto L_0x005d
            java.util.List r1 = r7.N     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x004a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x003e }
        L_0x002b:
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x003e }
            if (r6 == 0) goto L_0x004a
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x003e }
            com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r6     // Catch:{ Exception -> 0x003e }
            if (r6 == 0) goto L_0x0041
            java.lang.String r6 = r6.getSubDistname()     // Catch:{ Exception -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r8 = move-exception
            goto L_0x00b1
        L_0x0041:
            r6 = r5
        L_0x0042:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x003e }
            r0.add(r6)     // Catch:{ Exception -> 0x003e }
            goto L_0x002b
        L_0x004a:
            ni.n4 r1 = r7.G     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x0052
            cm.l.v(r4)     // Catch:{ Exception -> 0x003e }
            goto L_0x0053
        L_0x0052:
            r5 = r1
        L_0x0053:
            android.widget.RadioButton r1 = r5.f27551a0     // Catch:{ Exception -> 0x003e }
            boolean r1 = r1.isChecked()     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0095
        L_0x005b:
            r2 = r3
            goto L_0x0095
        L_0x005d:
            java.util.List r1 = r7.O     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0083
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x003e }
        L_0x0067:
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x003e }
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r1.next()     // Catch:{ Exception -> 0x003e }
            com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r6     // Catch:{ Exception -> 0x003e }
            if (r6 == 0) goto L_0x007a
            java.lang.String r6 = r6.getSubDistname()     // Catch:{ Exception -> 0x003e }
            goto L_0x007b
        L_0x007a:
            r6 = r5
        L_0x007b:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x003e }
            r0.add(r6)     // Catch:{ Exception -> 0x003e }
            goto L_0x0067
        L_0x0083:
            ni.n4 r1 = r7.G     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x008b
            cm.l.v(r4)     // Catch:{ Exception -> 0x003e }
            goto L_0x008c
        L_0x008b:
            r5 = r1
        L_0x008c:
            android.widget.RadioButton r1 = r5.I     // Catch:{ Exception -> 0x003e }
            boolean r1 = r1.isChecked()     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0095
            goto L_0x005b
        L_0x0095:
            r8.f20234e = r2     // Catch:{ Exception -> 0x003e }
            kk.e$a r1 = kk.e.A0     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "Select Taluka"
            kk.e r0 = r1.a(r2, r0)     // Catch:{ Exception -> 0x003e }
            androidx.fragment.app.q r1 = r7.F0()     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "TalukaPicker"
            r0.k2(r1, r2)     // Catch:{ Exception -> 0x003e }
            com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen$f r1 = new com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen$f     // Catch:{ Exception -> 0x003e }
            r1.<init>(r7, r8)     // Catch:{ Exception -> 0x003e }
            r0.n2(r1)     // Catch:{ Exception -> 0x003e }
            goto L_0x00b4
        L_0x00b1:
            r8.printStackTrace()
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.editlearnerlicence.Activity.AddressDetailEditScreen.F2(java.lang.String):void");
    }

    private final void G2(String str) {
        try {
            this.T = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.T, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.P;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.Q;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Village/Town", arrayList);
            a10.k2(F0(), "VillageTownPicker");
            a10.n2(new g(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void H2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new ub.a(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void I2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void J2() {
        try {
            this.V = this.U;
            Q2(b2());
            n4 n4Var = this.G;
            n4 n4Var2 = null;
            if (n4Var == null) {
                cm.l.v("binding");
                n4Var = null;
            }
            EditText editText = n4Var.G;
            n4 n4Var3 = this.G;
            if (n4Var3 == null) {
                cm.l.v("binding");
                n4Var3 = null;
            }
            editText.setText(n4Var3.f27575z.getText());
            n4 n4Var4 = this.G;
            if (n4Var4 == null) {
                cm.l.v("binding");
                n4Var4 = null;
            }
            EditText editText2 = n4Var4.F;
            n4 n4Var5 = this.G;
            if (n4Var5 == null) {
                cm.l.v("binding");
                n4Var5 = null;
            }
            editText2.setText(n4Var5.f27574y.getText());
            n4 n4Var6 = this.G;
            if (n4Var6 == null) {
                cm.l.v("binding");
                n4Var6 = null;
            }
            EditText editText3 = n4Var6.E;
            n4 n4Var7 = this.G;
            if (n4Var7 == null) {
                cm.l.v("binding");
                n4Var7 = null;
            }
            editText3.setText(n4Var7.f27573x.getText());
            n4 n4Var8 = this.G;
            if (n4Var8 == null) {
                cm.l.v("binding");
                n4Var8 = null;
            }
            EditText editText4 = n4Var8.H;
            n4 n4Var9 = this.G;
            if (n4Var9 == null) {
                cm.l.v("binding");
                n4Var9 = null;
            }
            editText4.setText(n4Var9.M.getText());
            n4 n4Var10 = this.G;
            if (n4Var10 == null) {
                cm.l.v("binding");
                n4Var10 = null;
            }
            EditText editText5 = n4Var10.A;
            n4 n4Var11 = this.G;
            if (n4Var11 == null) {
                cm.l.v("binding");
                n4Var11 = null;
            }
            editText5.setText(n4Var11.L.getText());
            n4 n4Var12 = this.G;
            if (n4Var12 == null) {
                cm.l.v("binding");
                n4Var12 = null;
            }
            EditText editText6 = n4Var12.D;
            n4 n4Var13 = this.G;
            if (n4Var13 == null) {
                cm.l.v("binding");
                n4Var13 = null;
            }
            editText6.setText(n4Var13.P.getText());
            n4 n4Var14 = this.G;
            if (n4Var14 == null) {
                cm.l.v("binding");
                n4Var14 = null;
            }
            EditText editText7 = n4Var14.B;
            n4 n4Var15 = this.G;
            if (n4Var15 == null) {
                cm.l.v("binding");
                n4Var15 = null;
            }
            editText7.setText(n4Var15.N.getText());
            n4 n4Var16 = this.G;
            if (n4Var16 == null) {
                cm.l.v("binding");
                n4Var16 = null;
            }
            EditText editText8 = n4Var16.C;
            n4 n4Var17 = this.G;
            if (n4Var17 == null) {
                cm.l.v("binding");
            } else {
                n4Var2 = n4Var17;
            }
            editText8.setText(n4Var2.O.getText());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void L2(ArrayList arrayList) {
        try {
            this.f9155d0 = ((vb.a) arrayList.get(0)).x();
            this.f9156e0 = ((vb.a) arrayList.get(0)).s();
            this.f9157f0 = ((vb.a) arrayList.get(0)).A();
            this.f9158g0 = ((vb.a) arrayList.get(0)).B();
            this.f9159h0 = ((vb.a) arrayList.get(0)).q();
            K2(this.f9155d0);
            Q2(b2());
            this.U.setDistrict(this.f9156e0);
            this.U.setSubDistrict(this.f9157f0);
            this.U.setVillageOrTown(this.f9159h0);
            Log.e("Sub District", this.f9157f0);
            if (com.nic.mparivahan.dlservices.utilities.d.d(this.f9158g0)) {
                this.D0 = Integer.parseInt(this.f9158g0);
            }
            this.f9160i0 = ((vb.a) arrayList.get(0)).k();
            this.f9161j0 = ((vb.a) arrayList.get(0)).f();
            this.f9162k0 = ((vb.a) arrayList.get(0)).n();
            this.f9163l0 = ((vb.a) arrayList.get(0)).o();
            this.f9164m0 = ((vb.a) arrayList.get(0)).d();
            this.V.setDistrict(this.f9161j0);
            this.V.setSubDistrict(this.f9162k0);
            this.V.setVillageOrTown(this.f9164m0);
            if (com.nic.mparivahan.dlservices.utilities.d.d(this.f9163l0)) {
                this.E0 = Integer.parseInt(this.f9163l0);
            }
            g2().dismiss();
            c0 c0Var = this.H;
            n4 n4Var = null;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.g(this.f9155d0);
            this.f9165n0 = true;
            this.f9167p0 = true;
            if (((vb.a) arrayList.get(0)).w().length() > 0) {
                n4 n4Var2 = this.G;
                if (n4Var2 == null) {
                    cm.l.v("binding");
                    n4Var2 = null;
                }
                n4Var2.f27575z.setText(((vb.a) arrayList.get(0)).w());
                n4 n4Var3 = this.G;
                if (n4Var3 == null) {
                    cm.l.v("binding");
                    n4Var3 = null;
                }
                n4Var3.f27575z.setContentDescription(this.f9155d0);
            }
            if (((vb.a) arrayList.get(0)).r().length() > 0) {
                n4 n4Var4 = this.G;
                if (n4Var4 == null) {
                    cm.l.v("binding");
                    n4Var4 = null;
                }
                n4Var4.f27574y.setText(((vb.a) arrayList.get(0)).r());
                n4 n4Var5 = this.G;
                if (n4Var5 == null) {
                    cm.l.v("binding");
                    n4Var5 = null;
                }
                n4Var5.f27574y.setContentDescription(this.f9156e0);
            }
            if (((vb.a) arrayList.get(0)).z().length() > 0) {
                this.f9166o0 = true;
                n4 n4Var6 = this.G;
                if (n4Var6 == null) {
                    cm.l.v("binding");
                    n4Var6 = null;
                }
                n4Var6.f27573x.setText(((vb.a) arrayList.get(0)).z());
                g2().dismiss();
                c0 c0Var2 = this.H;
                if (c0Var2 == null) {
                    cm.l.v("viewModel");
                    c0Var2 = null;
                }
                c0Var2.n(this.f9155d0, this.f9156e0);
            }
            if (p.o(((vb.a) arrayList.get(0)).B(), "1", true)) {
                n4 n4Var7 = this.G;
                if (n4Var7 == null) {
                    cm.l.v("binding");
                    n4Var7 = null;
                }
                n4Var7.f27568r0.setChecked(true);
                n4 n4Var8 = this.G;
                if (n4Var8 == null) {
                    cm.l.v("binding");
                    n4Var8 = null;
                }
                n4Var8.f27551a0.setChecked(false);
            } else {
                n4 n4Var9 = this.G;
                if (n4Var9 == null) {
                    cm.l.v("binding");
                    n4Var9 = null;
                }
                n4Var9.f27568r0.setChecked(false);
                n4 n4Var10 = this.G;
                if (n4Var10 == null) {
                    cm.l.v("binding");
                    n4Var10 = null;
                }
                n4Var10.f27551a0.setChecked(true);
            }
            String str = "R";
            if (((vb.a) arrayList.get(0)).p().length() > 0) {
                n4 n4Var11 = this.G;
                if (n4Var11 == null) {
                    cm.l.v("binding");
                    n4Var11 = null;
                }
                n4Var11.M.setText(((vb.a) arrayList.get(0)).p());
                g2().dismiss();
                this.f9168q0 = true;
                n4 n4Var12 = this.G;
                if (n4Var12 == null) {
                    cm.l.v("binding");
                    n4Var12 = null;
                }
                String str2 = n4Var12.f27551a0.isChecked() ? "U" : str;
                c0 c0Var3 = this.H;
                if (c0Var3 == null) {
                    cm.l.v("viewModel");
                    c0Var3 = null;
                }
                c0Var3.o(this.f9155d0, this.f9156e0, this.f9157f0, str2);
            }
            if (((vb.a) arrayList.get(0)).t().length() > 0) {
                n4 n4Var13 = this.G;
                if (n4Var13 == null) {
                    cm.l.v("binding");
                    n4Var13 = null;
                }
                n4Var13.L.setText(((vb.a) arrayList.get(0)).t());
            }
            if (((vb.a) arrayList.get(0)).y().length() > 0) {
                n4 n4Var14 = this.G;
                if (n4Var14 == null) {
                    cm.l.v("binding");
                    n4Var14 = null;
                }
                n4Var14.P.setText(((vb.a) arrayList.get(0)).y());
            }
            if (((vb.a) arrayList.get(0)).u().length() > 0) {
                n4 n4Var15 = this.G;
                if (n4Var15 == null) {
                    cm.l.v("binding");
                    n4Var15 = null;
                }
                n4Var15.N.setText(((vb.a) arrayList.get(0)).u());
            }
            if (((vb.a) arrayList.get(0)).v().length() > 0) {
                n4 n4Var16 = this.G;
                if (n4Var16 == null) {
                    cm.l.v("binding");
                    n4Var16 = null;
                }
                n4Var16.O.setText(((vb.a) arrayList.get(0)).v());
            }
            if (((vb.a) arrayList.get(0)).C().length() > 0) {
                n4 n4Var17 = this.G;
                if (n4Var17 == null) {
                    cm.l.v("binding");
                    n4Var17 = null;
                }
                n4Var17.V.setText(((vb.a) arrayList.get(0)).C());
            }
            if (((vb.a) arrayList.get(0)).D().length() > 0) {
                n4 n4Var18 = this.G;
                if (n4Var18 == null) {
                    cm.l.v("binding");
                    n4Var18 = null;
                }
                n4Var18.f27570t0.setText(((vb.a) arrayList.get(0)).D());
            }
            if (((vb.a) arrayList.get(0)).j().length() > 0) {
                n4 n4Var19 = this.G;
                if (n4Var19 == null) {
                    cm.l.v("binding");
                    n4Var19 = null;
                }
                n4Var19.G.setText(((vb.a) arrayList.get(0)).j());
                n4 n4Var20 = this.G;
                if (n4Var20 == null) {
                    cm.l.v("binding");
                    n4Var20 = null;
                }
                n4Var20.G.setContentDescription(this.f9160i0);
            }
            if (((vb.a) arrayList.get(0)).e().length() > 0) {
                n4 n4Var21 = this.G;
                if (n4Var21 == null) {
                    cm.l.v("binding");
                    n4Var21 = null;
                }
                n4Var21.F.setText(((vb.a) arrayList.get(0)).r());
                n4 n4Var22 = this.G;
                if (n4Var22 == null) {
                    cm.l.v("binding");
                    n4Var22 = null;
                }
                n4Var22.F.setContentDescription(this.f9161j0);
            }
            if (((vb.a) arrayList.get(0)).m().length() > 0) {
                this.f9166o0 = false;
                n4 n4Var23 = this.G;
                if (n4Var23 == null) {
                    cm.l.v("binding");
                    n4Var23 = null;
                }
                n4Var23.E.setText(((vb.a) arrayList.get(0)).m());
                g2().dismiss();
                c0 c0Var4 = this.H;
                if (c0Var4 == null) {
                    cm.l.v("viewModel");
                    c0Var4 = null;
                }
                c0Var4.n(this.f9160i0, this.f9161j0);
            }
            if (p.o(((vb.a) arrayList.get(0)).o(), "1", true)) {
                n4 n4Var24 = this.G;
                if (n4Var24 == null) {
                    cm.l.v("binding");
                    n4Var24 = null;
                }
                n4Var24.J.setChecked(true);
                n4 n4Var25 = this.G;
                if (n4Var25 == null) {
                    cm.l.v("binding");
                    n4Var25 = null;
                }
                n4Var25.I.setChecked(false);
            } else {
                n4 n4Var26 = this.G;
                if (n4Var26 == null) {
                    cm.l.v("binding");
                    n4Var26 = null;
                }
                n4Var26.J.setChecked(false);
                n4 n4Var27 = this.G;
                if (n4Var27 == null) {
                    cm.l.v("binding");
                    n4Var27 = null;
                }
                n4Var27.I.setChecked(true);
            }
            if (((vb.a) arrayList.get(0)).c().length() > 0) {
                n4 n4Var28 = this.G;
                if (n4Var28 == null) {
                    cm.l.v("binding");
                    n4Var28 = null;
                }
                n4Var28.H.setText(((vb.a) arrayList.get(0)).c());
                g2().dismiss();
                this.f9168q0 = false;
                n4 n4Var29 = this.G;
                if (n4Var29 == null) {
                    cm.l.v("binding");
                    n4Var29 = null;
                }
                if (n4Var29.f27551a0.isChecked()) {
                    str = "U";
                }
                c0 c0Var5 = this.H;
                if (c0Var5 == null) {
                    cm.l.v("viewModel");
                    c0Var5 = null;
                }
                c0Var5.o(this.f9160i0, this.f9161j0, this.f9162k0, str);
            }
            if (((vb.a) arrayList.get(0)).g().length() > 0) {
                n4 n4Var30 = this.G;
                if (n4Var30 == null) {
                    cm.l.v("binding");
                    n4Var30 = null;
                }
                n4Var30.A.setText(((vb.a) arrayList.get(0)).g());
            }
            if (((vb.a) arrayList.get(0)).l().length() > 0) {
                n4 n4Var31 = this.G;
                if (n4Var31 == null) {
                    cm.l.v("binding");
                    n4Var31 = null;
                }
                n4Var31.D.setText(((vb.a) arrayList.get(0)).l());
            }
            if (((vb.a) arrayList.get(0)).h().length() > 0) {
                n4 n4Var32 = this.G;
                if (n4Var32 == null) {
                    cm.l.v("binding");
                    n4Var32 = null;
                }
                n4Var32.B.setText(((vb.a) arrayList.get(0)).h());
            }
            if (((vb.a) arrayList.get(0)).i().length() > 0) {
                n4 n4Var33 = this.G;
                if (n4Var33 == null) {
                    cm.l.v("binding");
                } else {
                    n4Var = n4Var33;
                }
                n4Var.C.setText(((vb.a) arrayList.get(0)).i());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void V1() {
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            g2().show();
            c0 c0Var = this.H;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.m();
            return;
        }
        Toast.makeText(f2(), "Please Check Your Internet connection", 1).show();
    }

    private final void W1() {
        c0 c0Var = this.H;
        c0 c0Var2 = null;
        if (c0Var == null) {
            cm.l.v("viewModel");
            c0Var = null;
        }
        c0Var.i().g(this, new h(new a(this)));
        c0 c0Var3 = this.H;
        if (c0Var3 == null) {
            cm.l.v("viewModel");
            c0Var3 = null;
        }
        c0Var3.h().g(this, new h(new b(this)));
        c0 c0Var4 = this.H;
        if (c0Var4 == null) {
            cm.l.v("viewModel");
            c0Var4 = null;
        }
        c0Var4.k().g(this, new h(new c(this)));
        c0 c0Var5 = this.H;
        if (c0Var5 == null) {
            cm.l.v("viewModel");
        } else {
            c0Var2 = c0Var5;
        }
        c0Var2.l().g(this, new h(new d(this)));
    }

    /* access modifiers changed from: private */
    public final void X1() {
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        n4Var.f27573x.setText("");
        n4 n4Var3 = this.G;
        if (n4Var3 == null) {
            cm.l.v("binding");
        } else {
            n4Var2 = n4Var3;
        }
        n4Var2.f27573x.setHint(m2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.N = q.i();
        Y1();
        Y1();
    }

    private final void Y1() {
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        n4Var.M.setText("");
        n4 n4Var3 = this.G;
        if (n4Var3 == null) {
            cm.l.v("binding");
        } else {
            n4Var2 = n4Var3;
        }
        n4Var2.M.setHint(m2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.P = q.i();
    }

    /* access modifiers changed from: private */
    public final void Z1() {
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        n4Var.E.setText("");
        n4 n4Var3 = this.G;
        if (n4Var3 == null) {
            cm.l.v("binding");
        } else {
            n4Var2 = n4Var3;
        }
        n4Var2.E.setHint(m2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.O = q.i();
        a2();
    }

    private final void a2() {
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        n4Var.H.setText("");
        n4 n4Var3 = this.G;
        if (n4Var3 == null) {
            cm.l.v("binding");
        } else {
            n4Var2 = n4Var3;
        }
        n4Var2.H.setHint(m2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.Q = q.i();
    }

    /* access modifiers changed from: private */
    public final void c2(String str) {
        try {
            n4 n4Var = this.G;
            n4 n4Var2 = null;
            if (n4Var == null) {
                cm.l.v("binding");
                n4Var = null;
            }
            String obj = n4Var.f27573x.getContentDescription().toString();
            Y1();
            g2().dismiss();
            c0 c0Var = this.H;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            n4 n4Var3 = this.G;
            if (n4Var3 == null) {
                cm.l.v("binding");
                n4Var3 = null;
            }
            String obj2 = n4Var3.f27575z.getContentDescription().toString();
            n4 n4Var4 = this.G;
            if (n4Var4 == null) {
                cm.l.v("binding");
            } else {
                n4Var2 = n4Var4;
            }
            c0Var.o(obj2, n4Var2.f27574y.getContentDescription().toString(), obj, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void d2() {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("addressDetails");
        cm.l.c(parcelableArrayListExtra);
        this.f9154c0 = parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("covDetails");
        cm.l.c(parcelableArrayListExtra2);
        this.R = parcelableArrayListExtra2;
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("selectedCovDetails");
        cm.l.c(parcelableArrayListExtra3);
        this.S = parcelableArrayListExtra3;
        this.f9169r0 = getIntent().getBooleanExtra("willingToDonate", false);
        String stringExtra = getIntent().getStringExtra("licenseFromState");
        cm.l.c(stringExtra);
        this.f9170s0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("licenceFromRTO");
        cm.l.c(stringExtra2);
        this.f9171t0 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("jurisdiction");
        cm.l.c(stringExtra3);
        this.f9172u0 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("licenceFromRTOCode");
        cm.l.c(stringExtra4);
        this.f9173v0 = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicationNo");
        cm.l.c(stringExtra5);
        this.f9174w0 = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        cm.l.c(stringExtra6);
        this.f9175x0 = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("applDate");
        cm.l.c(stringExtra7);
        this.f9176y0 = stringExtra7;
        this.f9177z0 = getIntent().getBooleanExtra("allowNewAddr", false);
        String stringExtra8 = getIntent().getStringExtra("applCatg");
        cm.l.c(stringExtra8);
        this.A0 = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("bioId");
        cm.l.c(stringExtra9);
        this.B0 = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("allClassOfVehicles");
        cm.l.c(stringExtra10);
        this.C0 = stringExtra10;
        ArrayList parcelableArrayListExtra4 = getIntent().getParcelableArrayListExtra("llRefDetails");
        cm.l.c(parcelableArrayListExtra4);
        this.F0 = parcelableArrayListExtra4;
        String stringExtra11 = getIntent().getStringExtra("applicantFName");
        cm.l.c(stringExtra11);
        this.G0 = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("applicantMName");
        cm.l.c(stringExtra12);
        this.H0 = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("applicantLName");
        cm.l.c(stringExtra13);
        this.I0 = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("fullName");
        cm.l.c(stringExtra14);
        this.J0 = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("relationship");
        cm.l.c(stringExtra15);
        this.K0 = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("relationFName");
        cm.l.c(stringExtra16);
        this.L0 = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("relationMName");
        cm.l.c(stringExtra17);
        this.M0 = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("relationLName");
        cm.l.c(stringExtra18);
        this.N0 = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("gender");
        cm.l.c(stringExtra19);
        this.O0 = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("dob");
        cm.l.c(stringExtra20);
        this.P0 = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("placeOfBirth");
        cm.l.c(stringExtra21);
        this.Q0 = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("country");
        cm.l.c(stringExtra22);
        this.R0 = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("educationQualification");
        cm.l.c(stringExtra23);
        this.S0 = stringExtra23;
        String stringExtra24 = getIntent().getStringExtra("bloodGroup");
        cm.l.c(stringExtra24);
        this.T0 = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("mobileNo");
        cm.l.c(stringExtra25);
        this.U0 = stringExtra25;
        String stringExtra26 = getIntent().getStringExtra("emailId");
        cm.l.c(stringExtra26);
        this.V0 = stringExtra26;
        String stringExtra27 = getIntent().getStringExtra("applicantMobileNo");
        cm.l.c(stringExtra27);
        this.W0 = stringExtra27;
        String stringExtra28 = getIntent().getStringExtra("emergencyContactNo");
        cm.l.c(stringExtra28);
        this.X0 = stringExtra28;
        String stringExtra29 = getIntent().getStringExtra("identificationMark1");
        cm.l.c(stringExtra29);
        this.Y0 = stringExtra29;
        String stringExtra30 = getIntent().getStringExtra("identificationMark2");
        cm.l.c(stringExtra30);
        this.Z0 = stringExtra30;
        if (this.f9154c0.size() > 0) {
            L2(this.f9154c0);
        }
    }

    /* access modifiers changed from: private */
    public final void j2(String str) {
        try {
            n4 n4Var = this.G;
            n4 n4Var2 = null;
            if (n4Var == null) {
                cm.l.v("binding");
                n4Var = null;
            }
            String obj = n4Var.E.getContentDescription().toString();
            a2();
            c0 c0Var = this.H;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            n4 n4Var3 = this.G;
            if (n4Var3 == null) {
                cm.l.v("binding");
                n4Var3 = null;
            }
            String obj2 = n4Var3.G.getContentDescription().toString();
            n4 n4Var4 = this.G;
            if (n4Var4 == null) {
                cm.l.v("binding");
            } else {
                n4Var2 = n4Var4;
            }
            c0Var.o(obj2, n4Var2.F.getContentDescription().toString(), obj, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void n2() {
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        n4Var.U.f28452f.setText(l2().i());
        n4 n4Var3 = this.G;
        if (n4Var3 == null) {
            cm.l.v("binding");
            n4Var3 = null;
        }
        n4Var3.U.f28448b.setOnClickListener(new ub.g(this));
        n4 n4Var4 = this.G;
        if (n4Var4 == null) {
            cm.l.v("binding");
            n4Var4 = null;
        }
        n4Var4.S.setOnClickListener(new ub.h(this));
        n4 n4Var5 = this.G;
        if (n4Var5 == null) {
            cm.l.v("binding");
            n4Var5 = null;
        }
        n4Var5.Y.setOnClickListener(new i(this));
        n4 n4Var6 = this.G;
        if (n4Var6 == null) {
            cm.l.v("binding");
        } else {
            n4Var2 = n4Var6;
        }
        n4Var2.f27572w.setOnClickListener(new j(this));
    }

    /* access modifiers changed from: private */
    public static final void o2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        addressDetailEditScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void p2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        Object systemService = addressDetailEditScreen.getSystemService("layout_inflater");
        cm.l.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        n4 n4Var = null;
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_info, (ViewGroup) null);
        cm.l.e(inflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(inflate, (int) (((double) addressDetailEditScreen.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        ((ImageView) inflate.findViewById(R.id.closeIv)).setOnClickListener(new ub.f(popupWindow));
        ((TextView) inflate.findViewById(R.id.infoMessageTv)).setText(addressDetailEditScreen.m2().b("address_ll_print_msg", "Address 1, Address 2, Address 3 & Pincode will be printed on your Driving Licence Number"));
        n4 n4Var2 = addressDetailEditScreen.G;
        if (n4Var2 == null) {
            cm.l.v("binding");
        } else {
            n4Var = n4Var2;
        }
        popupWindow.showAsDropDown(n4Var.Z, 0, 10);
    }

    /* access modifiers changed from: private */
    public static final void q2(PopupWindow popupWindow, View view) {
        cm.l.f(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (addressDetailEditScreen.t2()) {
            Intent intent = new Intent(addressDetailEditScreen, SelectedCovDetailsScreen.class);
            intent.putParcelableArrayListExtra("covDetails", addressDetailEditScreen.R);
            intent.putParcelableArrayListExtra("selectedCovDetails", addressDetailEditScreen.S);
            intent.putExtra("willingToDonate", addressDetailEditScreen.f9169r0);
            intent.putExtra("licenseFromState", addressDetailEditScreen.f9170s0);
            intent.putExtra("licenceFromRTO", addressDetailEditScreen.f9171t0);
            intent.putExtra("jurisdiction", addressDetailEditScreen.f9172u0);
            intent.putExtra("licenceFromRTOCode", addressDetailEditScreen.f9173v0);
            intent.putExtra("applicationNo", addressDetailEditScreen.f9174w0);
            intent.putExtra("reference", addressDetailEditScreen.f9175x0);
            intent.putExtra("applDate", addressDetailEditScreen.f9176y0);
            intent.putExtra("allowNewAddr", addressDetailEditScreen.f9177z0);
            intent.putExtra("applCatg", addressDetailEditScreen.A0);
            intent.putParcelableArrayListExtra("llRefDetails", addressDetailEditScreen.F0);
            intent.putExtra("bioId", addressDetailEditScreen.B0);
            intent.putExtra("allClassOfVehicles", addressDetailEditScreen.C0);
            intent.putExtra("applicantFName", addressDetailEditScreen.getIntent().getStringExtra("applicantFName"));
            intent.putExtra("applicantMName", addressDetailEditScreen.getIntent().getStringExtra("applicantMName"));
            intent.putExtra("applicantLName", addressDetailEditScreen.getIntent().getStringExtra("applicantLName"));
            intent.putExtra("fullName", addressDetailEditScreen.getIntent().getStringExtra("fullName"));
            intent.putExtra("relationship", addressDetailEditScreen.getIntent().getStringExtra("relationship"));
            intent.putExtra("relationFName", addressDetailEditScreen.getIntent().getStringExtra("relationFName"));
            intent.putExtra("relationMName", addressDetailEditScreen.getIntent().getStringExtra("relationMName"));
            intent.putExtra("relationLName", addressDetailEditScreen.getIntent().getStringExtra("relationLName"));
            intent.putExtra("gender", addressDetailEditScreen.getIntent().getStringExtra("gender"));
            intent.putExtra("dob", addressDetailEditScreen.getIntent().getStringExtra("dob"));
            intent.putExtra("placeOfBirth", addressDetailEditScreen.getIntent().getStringExtra("placeOfBirth"));
            intent.putExtra("country", addressDetailEditScreen.getIntent().getStringExtra("country"));
            intent.putExtra("educationQualification", addressDetailEditScreen.getIntent().getStringExtra("educationQualification"));
            intent.putExtra("bloodGroup", addressDetailEditScreen.getIntent().getStringExtra("bloodGroup"));
            intent.putExtra("mobileNo", addressDetailEditScreen.getIntent().getStringExtra("mobileNo"));
            intent.putExtra("emailId", addressDetailEditScreen.getIntent().getStringExtra("emailId"));
            intent.putExtra("applicantMobileNo", addressDetailEditScreen.getIntent().getStringExtra("applicantMobileNo"));
            intent.putExtra("emergencyContactNo", addressDetailEditScreen.getIntent().getStringExtra("emergencyContactNo"));
            intent.putExtra("identificationMark1", addressDetailEditScreen.getIntent().getStringExtra("identificationMark1"));
            intent.putExtra("identificationMark2", addressDetailEditScreen.getIntent().getStringExtra("identificationMark2"));
            n4 n4Var = addressDetailEditScreen.G;
            n4 n4Var2 = null;
            if (n4Var == null) {
                cm.l.v("binding");
                n4Var = null;
            }
            intent.putExtra("presHouseNo", n4Var.L.getText().toString());
            n4 n4Var3 = addressDetailEditScreen.G;
            if (n4Var3 == null) {
                cm.l.v("binding");
                n4Var3 = null;
            }
            intent.putExtra("presStreet", n4Var3.P.getText().toString());
            n4 n4Var4 = addressDetailEditScreen.G;
            if (n4Var4 == null) {
                cm.l.v("binding");
                n4Var4 = null;
            }
            intent.putExtra("presLocation", n4Var4.N.getText().toString());
            intent.putExtra("presVillageOrTown", addressDetailEditScreen.U.getVillageOrTown());
            intent.putExtra("presSubDistrict", addressDetailEditScreen.U.getSubDistrict());
            intent.putExtra("presDistrict", addressDetailEditScreen.U.getDistrict());
            intent.putExtra("presState", addressDetailEditScreen.b2());
            intent.putExtra("presVillTown", addressDetailEditScreen.D0);
            n4 n4Var5 = addressDetailEditScreen.G;
            if (n4Var5 == null) {
                cm.l.v("binding");
                n4Var5 = null;
            }
            intent.putExtra("presPincode", n4Var5.O.getText().toString());
            n4 n4Var6 = addressDetailEditScreen.G;
            if (n4Var6 == null) {
                cm.l.v("binding");
                n4Var6 = null;
            }
            intent.putExtra("perHouseNo", n4Var6.A.getText().toString());
            n4 n4Var7 = addressDetailEditScreen.G;
            if (n4Var7 == null) {
                cm.l.v("binding");
                n4Var7 = null;
            }
            intent.putExtra("perStreet", n4Var7.D.getText().toString());
            n4 n4Var8 = addressDetailEditScreen.G;
            if (n4Var8 == null) {
                cm.l.v("binding");
                n4Var8 = null;
            }
            intent.putExtra("perLocation", n4Var8.B.getText().toString());
            intent.putExtra("permVillageOrTown", addressDetailEditScreen.V.getVillageOrTown());
            intent.putExtra("perSubDistrict", addressDetailEditScreen.V.getSubDistrict());
            intent.putExtra("perDistrict", addressDetailEditScreen.V.getDistrict());
            intent.putExtra("perState", addressDetailEditScreen.h2());
            intent.putExtra("premVillTown", addressDetailEditScreen.E0);
            n4 n4Var9 = addressDetailEditScreen.G;
            if (n4Var9 == null) {
                cm.l.v("binding");
                n4Var9 = null;
            }
            intent.putExtra("perPinCode", n4Var9.O.getText().toString());
            intent.putExtra("permanentAdd", addressDetailEditScreen.V);
            n4 n4Var10 = addressDetailEditScreen.G;
            if (n4Var10 == null) {
                cm.l.v("binding");
                n4Var10 = null;
            }
            intent.putExtra("stayMonths", String.valueOf(n4Var10.V.getText()));
            n4 n4Var11 = addressDetailEditScreen.G;
            if (n4Var11 == null) {
                cm.l.v("binding");
            } else {
                n4Var2 = n4Var11;
            }
            intent.putExtra("stayYears", String.valueOf(n4Var2.f27570t0.getText()));
            addressDetailEditScreen.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void s2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        addressDetailEditScreen.startActivity(new Intent(addressDetailEditScreen, EditLearnerAppScreen.class));
        addressDetailEditScreen.finish();
    }

    private final boolean t2() {
        ld.c m22;
        String string;
        String str;
        String b10;
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        Editable text = n4Var.f27575z.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            m22 = m2();
            string = getString(R.string.select_state);
            str = "select_state";
        } else {
            n4 n4Var3 = this.G;
            if (n4Var3 == null) {
                cm.l.v("binding");
                n4Var3 = null;
            }
            Editable text2 = n4Var3.f27574y.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                m22 = m2();
                string = getString(R.string.select_district);
                str = "select_district";
            } else {
                n4 n4Var4 = this.G;
                if (n4Var4 == null) {
                    cm.l.v("binding");
                    n4Var4 = null;
                }
                Editable text3 = n4Var4.f27573x.getText();
                cm.l.e(text3, "getText(...)");
                if (text3.length() == 0) {
                    m22 = m2();
                    string = getString(R.string.select_taluka);
                    str = "select_taluka";
                } else {
                    n4 n4Var5 = this.G;
                    if (n4Var5 == null) {
                        cm.l.v("binding");
                        n4Var5 = null;
                    }
                    Editable text4 = n4Var5.N.getText();
                    cm.l.e(text4, "getText(...)");
                    if (text4.length() == 0) {
                        m22 = m2();
                        string = getString(R.string.sel_landmark);
                        str = "select_landmark";
                    } else {
                        n4 n4Var6 = this.G;
                        if (n4Var6 == null) {
                            cm.l.v("binding");
                            n4Var6 = null;
                        }
                        Editable text5 = n4Var6.O.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() == 0) {
                            m22 = m2();
                            string = getString(R.string.enter_pincode);
                            str = "select_pincode";
                        } else {
                            n4 n4Var7 = this.G;
                            if (n4Var7 == null) {
                                cm.l.v("binding");
                                n4Var7 = null;
                            }
                            if (n4Var7.O.getText().length() >= 6) {
                                n4 n4Var8 = this.G;
                                if (n4Var8 == null) {
                                    cm.l.v("binding");
                                    n4Var8 = null;
                                }
                                Editable text6 = n4Var8.G.getText();
                                cm.l.e(text6, "getText(...)");
                                if (text6.length() == 0) {
                                    m22 = m2();
                                    string = getString(R.string.sel_p_state);
                                    str = "select_pstate";
                                } else {
                                    n4 n4Var9 = this.G;
                                    if (n4Var9 == null) {
                                        cm.l.v("binding");
                                        n4Var9 = null;
                                    }
                                    Editable text7 = n4Var9.F.getText();
                                    cm.l.e(text7, "getText(...)");
                                    if (text7.length() == 0) {
                                        m22 = m2();
                                        string = getString(R.string.sel_p_dis);
                                        str = "select_pdistrict";
                                    } else {
                                        n4 n4Var10 = this.G;
                                        if (n4Var10 == null) {
                                            cm.l.v("binding");
                                            n4Var10 = null;
                                        }
                                        Editable text8 = n4Var10.E.getText();
                                        cm.l.e(text8, "getText(...)");
                                        if (text8.length() == 0) {
                                            m22 = m2();
                                            string = getString(R.string.sel_p_tal);
                                            str = "select_ptaluka";
                                        } else {
                                            n4 n4Var11 = this.G;
                                            if (n4Var11 == null) {
                                                cm.l.v("binding");
                                                n4Var11 = null;
                                            }
                                            Editable text9 = n4Var11.B.getText();
                                            cm.l.e(text9, "getText(...)");
                                            if (text9.length() == 0) {
                                                m22 = m2();
                                                string = getString(R.string.sel_p_lm);
                                                str = "select_plandmark";
                                            } else {
                                                n4 n4Var12 = this.G;
                                                if (n4Var12 == null) {
                                                    cm.l.v("binding");
                                                    n4Var12 = null;
                                                }
                                                Editable text10 = n4Var12.C.getText();
                                                cm.l.e(text10, "getText(...)");
                                                if (text10.length() != 0) {
                                                    n4 n4Var13 = this.G;
                                                    if (n4Var13 == null) {
                                                        cm.l.v("binding");
                                                    } else {
                                                        n4Var2 = n4Var13;
                                                    }
                                                    if (n4Var2.C.getText().length() >= 6) {
                                                        return true;
                                                    }
                                                    m22 = m2();
                                                    string = getString(R.string.sel_pc_pin);
                                                    str = "select_ppin_code";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b10 = m2().b("select_pin_code", getString(R.string.enter_correct_pincode));
                            Toast.makeText(this, b10, 0).show();
                            return false;
                        }
                    }
                }
            }
        }
        b10 = m22.b(str, string);
        Toast.makeText(this, b10, 0).show();
        return false;
    }

    private final void u2() {
        n4 n4Var = this.G;
        n4 n4Var2 = null;
        if (n4Var == null) {
            cm.l.v("binding");
            n4Var = null;
        }
        n4Var.f27574y.setOnClickListener(new k(this));
        n4 n4Var3 = this.G;
        if (n4Var3 == null) {
            cm.l.v("binding");
            n4Var3 = null;
        }
        n4Var3.f27573x.setOnClickListener(new ub.l(this));
        n4 n4Var4 = this.G;
        if (n4Var4 == null) {
            cm.l.v("binding");
            n4Var4 = null;
        }
        n4Var4.M.setOnClickListener(new ub.m(this));
        n4 n4Var5 = this.G;
        if (n4Var5 == null) {
            cm.l.v("binding");
            n4Var5 = null;
        }
        n4Var5.f27569s0.setOnCheckedChangeListener(new n(this));
        n4 n4Var6 = this.G;
        if (n4Var6 == null) {
            cm.l.v("binding");
            n4Var6 = null;
        }
        n4Var6.F.setOnClickListener(new o(this));
        n4 n4Var7 = this.G;
        if (n4Var7 == null) {
            cm.l.v("binding");
            n4Var7 = null;
        }
        n4Var7.E.setOnClickListener(new ub.b(this));
        n4 n4Var8 = this.G;
        if (n4Var8 == null) {
            cm.l.v("binding");
            n4Var8 = null;
        }
        n4Var8.H.setOnClickListener(new ub.c(this));
        n4 n4Var9 = this.G;
        if (n4Var9 == null) {
            cm.l.v("binding");
            n4Var9 = null;
        }
        n4Var9.K.setOnCheckedChangeListener(new ub.d(this));
        n4 n4Var10 = this.G;
        if (n4Var10 == null) {
            cm.l.v("binding");
        } else {
            n4Var2 = n4Var10;
        }
        n4Var2.X.setOnCheckedChangeListener(new ub.e(this));
    }

    /* access modifiers changed from: private */
    public static final void v2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(addressDetailEditScreen)) {
            addressDetailEditScreen.E2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(addressDetailEditScreen.f2(), addressDetailEditScreen.m2().b("label_log_check_internet", addressDetailEditScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void w2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(addressDetailEditScreen)) {
            addressDetailEditScreen.F2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(addressDetailEditScreen.f2(), addressDetailEditScreen.m2().b("label_log_check_internet", addressDetailEditScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(AddressDetailEditScreen addressDetailEditScreen, View view) {
        cm.l.f(addressDetailEditScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(addressDetailEditScreen)) {
            addressDetailEditScreen.G2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(addressDetailEditScreen.f2(), addressDetailEditScreen.m2().b("label_log_check_internet", addressDetailEditScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(AddressDetailEditScreen addressDetailEditScreen, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(addressDetailEditScreen, "this$0");
        List list = addressDetailEditScreen.O;
        if (list != null && (!list.isEmpty())) {
            switch (i10) {
                case R.id.dl_permanent_town_rb /*2131362641*/:
                    addressDetailEditScreen.E0 = 0;
                    str = "U";
                    break;
                case R.id.dl_permanent_village_rb /*2131362642*/:
                    addressDetailEditScreen.E0 = 1;
                    str = "R";
                    break;
                default:
                    return;
            }
            addressDetailEditScreen.j2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(AddressDetailEditScreen addressDetailEditScreen, CompoundButton compoundButton, boolean z10) {
        cm.l.f(addressDetailEditScreen, "this$0");
        n4 n4Var = null;
        if (z10) {
            try {
                addressDetailEditScreen.J2();
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        } else {
            addressDetailEditScreen.V = new DlAddress("", "", "", "", "", "", "", "");
            n4 n4Var2 = addressDetailEditScreen.G;
            if (n4Var2 == null) {
                cm.l.v("binding");
                n4Var2 = null;
            }
            n4Var2.F.setText("");
            n4 n4Var3 = addressDetailEditScreen.G;
            if (n4Var3 == null) {
                cm.l.v("binding");
                n4Var3 = null;
            }
            n4Var3.E.setText("");
            n4 n4Var4 = addressDetailEditScreen.G;
            if (n4Var4 == null) {
                cm.l.v("binding");
                n4Var4 = null;
            }
            n4Var4.H.setText("");
            n4 n4Var5 = addressDetailEditScreen.G;
            if (n4Var5 == null) {
                cm.l.v("binding");
                n4Var5 = null;
            }
            n4Var5.A.setText("");
            n4 n4Var6 = addressDetailEditScreen.G;
            if (n4Var6 == null) {
                cm.l.v("binding");
                n4Var6 = null;
            }
            n4Var6.D.setText("");
            n4 n4Var7 = addressDetailEditScreen.G;
            if (n4Var7 == null) {
                cm.l.v("binding");
                n4Var7 = null;
            }
            n4Var7.B.setText("");
            n4 n4Var8 = addressDetailEditScreen.G;
            if (n4Var8 == null) {
                cm.l.v("binding");
                n4Var8 = null;
            }
            n4Var8.C.setText("");
        }
        n4 n4Var9 = addressDetailEditScreen.G;
        if (n4Var9 == null) {
            cm.l.v("binding");
            n4Var9 = null;
        }
        n4Var9.z(addressDetailEditScreen.V);
        n4 n4Var10 = addressDetailEditScreen.G;
        if (n4Var10 == null) {
            cm.l.v("binding");
        } else {
            n4Var = n4Var10;
        }
        n4Var.a();
    }

    public final void K2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void M2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final void N2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.J = clInter;
    }

    public final void O2(Context context) {
        cm.l.f(context, "<set-?>");
        this.Y = context;
    }

    public final void P2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.Z = progressDialog;
    }

    public final void Q2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void R2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f9153b0 = fVar;
    }

    public final void S2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9152a0 = cVar;
    }

    public final String b2() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("currStateCd");
        return null;
    }

    public final ClInter e2() {
        ClInter clInter = this.J;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final Context f2() {
        Context context = this.Y;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ProgressDialog g2() {
        ProgressDialog progressDialog = this.Z;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String h2() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("perStateCd");
        return null;
    }

    public final DlAddress i2() {
        return this.V;
    }

    public final DlAddress k2() {
        return this.U;
    }

    public final ld.f l2() {
        ld.f fVar = this.f9153b0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.c m2() {
        ld.c cVar = this.f9152a0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n4 x10 = n4.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        n4 n4Var = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        O2(this);
        S2(new ld.c(f2()));
        R2(new ld.f(f2()));
        N2(ClInter.f7830a.a(f2()));
        P2(new ProgressDialog(f2()));
        g2().setMessage(m2().b("label_challan_please_wait", getString(R.string.please_wait)));
        g2().setCancelable(false);
        g2().setCanceledOnTouchOutside(false);
        M2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(e2()))).a(t9.a.class));
        this.H = (c0) new u0(this).a(c0.class);
        d2();
        n2();
        V1();
        W1();
        u2();
        e.a aVar = v9.e.f17509a;
        n4 n4Var2 = this.G;
        if (n4Var2 == null) {
            cm.l.v("binding");
        } else {
            n4Var = n4Var2;
        }
        aVar.G0(this, n4Var);
    }
}
