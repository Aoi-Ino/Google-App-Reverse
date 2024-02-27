package com.nic.mparivahan.ClServices.View;

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
import bm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import java.util.ArrayList;
import java.util.List;
import jj.c0;
import kk.e;
import ni.d0;
import p9.a0;
import p9.e0;
import p9.f0;
import p9.n;
import p9.o;
import p9.p;
import p9.q;
import p9.r;
import p9.s;
import p9.t;
import p9.v;
import p9.w;
import p9.y;
import p9.z;
import pl.x;

public final class ChangeOfAddressCl extends androidx.appcompat.app.d {
    public d0 G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    /* access modifiers changed from: private */
    public String U = "";
    /* access modifiers changed from: private */
    public List V;
    /* access modifiers changed from: private */
    public List W;
    /* access modifiers changed from: private */
    public List X;
    /* access modifiers changed from: private */
    public List Y;
    /* access modifiers changed from: private */
    public List Z;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public List f7848a0;

    /* renamed from: b0  reason: collision with root package name */
    private DlAddress f7849b0 = new DlAddress("", "", "", "", "", "", "", "");

    /* renamed from: c0  reason: collision with root package name */
    private DlAddress f7850c0 = new DlAddress("", "", "", "", "", "", "", "");
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public c0 f7851d0;

    /* renamed from: e0  reason: collision with root package name */
    public t9.a f7852e0;

    /* renamed from: f0  reason: collision with root package name */
    public ClInter f7853f0;

    /* renamed from: g0  reason: collision with root package name */
    public ld.f f7854g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f7855h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f7856i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f7857j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f7858k0 = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7859e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChangeOfAddressCl changeOfAddressCl) {
            super(1);
            this.f7859e = changeOfAddressCl;
        }

        public final void b(DistResponse distResponse) {
            try {
                this.f7859e.o2().dismiss();
                if (cm.l.a(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    this.f7859e.V = distResponse.getDistMaster();
                    this.f7859e.W = distResponse.getDistMaster();
                    return;
                }
                ChangeOfAddressCl changeOfAddressCl = this.f7859e;
                changeOfAddressCl.a3(changeOfAddressCl.v2().b("no_details", this.f7859e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
                ChangeOfAddressCl changeOfAddressCl2 = this.f7859e;
                changeOfAddressCl2.a3(changeOfAddressCl2.v2().b("service_is_not_present", this.f7859e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DistResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7860e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChangeOfAddressCl changeOfAddressCl) {
            super(1);
            this.f7860e = changeOfAddressCl;
        }

        public final void b(TalukaResponse talukaResponse) {
            ChangeOfAddressCl changeOfAddressCl;
            ld.c v22;
            String str;
            String string;
            try {
                this.f7860e.o2().dismiss();
                String str2 = null;
                if (!cm.l.a(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (talukaResponse != null) {
                        str2 = talukaResponse.getStatusCode();
                    }
                    if (cm.l.a(str2, "01")) {
                        changeOfAddressCl = this.f7860e;
                        v22 = changeOfAddressCl.v2();
                        str = "no_taluka_found";
                        string = "";
                    } else {
                        changeOfAddressCl = this.f7860e;
                        v22 = changeOfAddressCl.v2();
                        str = "no_details";
                        string = this.f7860e.getString(R.string.unable_to_get_details);
                    }
                    changeOfAddressCl.a3(v22.b(str, string));
                } else if (cm.l.a(this.f7860e.U, "dl-renewal-current-address")) {
                    this.f7860e.X = talukaResponse.getTakulaMaster();
                } else {
                    this.f7860e.Y = talukaResponse.getTakulaMaster();
                }
                Log.e("dl_taluka", talukaResponse.toString());
            } catch (Exception unused) {
                ChangeOfAddressCl changeOfAddressCl2 = this.f7860e;
                changeOfAddressCl2.a3(changeOfAddressCl2.v2().b("service_is_not_present", this.f7860e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TalukaResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7861e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChangeOfAddressCl changeOfAddressCl) {
            super(1);
            this.f7861e = changeOfAddressCl;
        }

        public final void b(VillageOrTownResponse villageOrTownResponse) {
            ChangeOfAddressCl changeOfAddressCl;
            String str;
            try {
                this.f7861e.o2().dismiss();
                String str2 = null;
                if (!cm.l.a(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    if (villageOrTownResponse != null) {
                        str2 = villageOrTownResponse.getStatusCode();
                    }
                    if (cm.l.a(str2, "01")) {
                        changeOfAddressCl = this.f7861e;
                        str = "No Taluka / Block found for selected District";
                    } else {
                        changeOfAddressCl = this.f7861e;
                        str = "No Village/Town found for selected Taluka/Block";
                    }
                    changeOfAddressCl.a3(str);
                } else if (cm.l.a(this.f7861e.U, "dl-renewal-current-address")) {
                    this.f7861e.Z = villageOrTownResponse.getVillageMaster();
                } else {
                    this.f7861e.f7848a0 = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                ChangeOfAddressCl changeOfAddressCl2 = this.f7861e;
                changeOfAddressCl2.a3(changeOfAddressCl2.v2().b("service_is_not_present", this.f7861e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VillageOrTownResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7862e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ChangeOfAddressCl changeOfAddressCl) {
            super(1);
            this.f7862e = changeOfAddressCl;
        }

        public final void b(ServiceSubmitResponse serviceSubmitResponse) {
            ChangeOfAddressCl changeOfAddressCl;
            ld.c v22;
            Log.d("addResponse", serviceSubmitResponse.toString());
            try {
                if (p.o(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        changeOfAddressCl = this.f7862e;
                        v22 = changeOfAddressCl.v2();
                    } else {
                        try {
                            Intent intent = new Intent(this.f7862e, ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", this.f7862e.f2());
                            intent.putExtra("dobValue", this.f7862e.g2());
                            intent.putExtra("fatherName", this.f7862e.h2());
                            intent.putExtra("clName", this.f7862e.b2());
                            intent.putExtra("clPhoto", this.f7862e.c2());
                            intent.putExtra("stateCode", this.f7862e.w2());
                            intent.putExtra("rtoCode", this.f7862e.s2());
                            intent.putExtra("rtoName", this.f7862e.t2());
                            intent.putExtra("Mobile_no", this.f7862e.n2());
                            intent.putExtra("address", this.f7862e.a2()).toString();
                            intent.putExtra("issuing_authority", this.f7862e.i2()).toString();
                            intent.putExtra("validity", this.f7862e.y2()).toString();
                            intent.putExtra("cl_Status", this.f7862e.d2()).toString();
                            this.f7862e.startActivity(intent);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                } else if (p.o(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    this.f7862e.a3(serviceSubmitResponse.getStatus_desc());
                    return;
                } else {
                    changeOfAddressCl = this.f7862e;
                    v22 = changeOfAddressCl.v2();
                }
                changeOfAddressCl.a3(v22.b("service_is_not_present", "Something went wrong, Try after some time"));
            } catch (Exception unused2) {
                ChangeOfAddressCl changeOfAddressCl2 = this.f7862e;
                changeOfAddressCl2.a3(changeOfAddressCl2.v2().b("service_is_not_present", "Something went wrong, Try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ServiceSubmitResponse) obj);
            return x.f30437a;
        }
    }

    public static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7863a;

        e(ChangeOfAddressCl changeOfAddressCl) {
            this.f7863a = changeOfAddressCl;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
            if (r0 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
            r3 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
            if (r0 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r0.get(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r0 = r4.f7863a
                java.lang.String r0 = r0.U
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                r3 = 0
                if (r1 == 0) goto L_0x0069
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r0 = r4.f7863a
                java.util.List r0 = r0.V
                if (r0 == 0) goto L_0x0026
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r6
                if (r6 == 0) goto L_0x0026
                java.lang.String r6 = r6.getDistCode()
                goto L_0x0027
            L_0x0026:
                r6 = r3
            L_0x0027:
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r0 = r4.f7863a
                ni.d0 r0 = r0.j2()
                android.widget.EditText r0 = r0.f25844x
                r0.setText(r5)
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                ni.d0 r5 = r5.j2()
                android.widget.EditText r5 = r5.f25844x
                r5.setContentDescription(r6)
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.r2()
                r5.setDistrict(r6)
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                r5.W1()
                if (r6 == 0) goto L_0x00bd
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                android.app.ProgressDialog r0 = r5.o2()
                r0.dismiss()
                jj.c0 r0 = r5.f7851d0
                if (r0 != 0) goto L_0x0060
            L_0x005c:
                cm.l.v(r2)
                goto L_0x0061
            L_0x0060:
                r3 = r0
            L_0x0061:
                java.lang.String r5 = r5.w2()
                r3.n(r5, r6)
                goto L_0x00bd
            L_0x0069:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00bd
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r0 = r4.f7863a
                java.util.List r0 = r0.W
                if (r0 == 0) goto L_0x0086
                java.lang.Object r6 = r0.get(r6)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r6 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r6
                if (r6 == 0) goto L_0x0086
                java.lang.String r6 = r6.getDistCode()
                goto L_0x0087
            L_0x0086:
                r6 = r3
            L_0x0087:
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r0 = r4.f7863a
                ni.d0 r0 = r0.j2()
                android.widget.EditText r0 = r0.E
                r0.setText(r5)
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                ni.d0 r5 = r5.j2()
                android.widget.EditText r5 = r5.E
                r5.setContentDescription(r6)
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                com.nic.mparivahan.dlservices.data.model.DlAddress r5 = r5.p2()
                r5.setDistrict(r6)
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                r5.Y1()
                if (r6 == 0) goto L_0x00bd
                com.nic.mparivahan.ClServices.View.ChangeOfAddressCl r5 = r4.f7863a
                android.app.ProgressDialog r0 = r5.o2()
                r0.dismiss()
                jj.c0 r0 = r5.f7851d0
                if (r0 != 0) goto L_0x0060
                goto L_0x005c
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ChangeOfAddressCl.e.a(java.lang.String, int):void");
        }
    }

    public static final class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f7865b;

        f(ChangeOfAddressCl changeOfAddressCl, u uVar) {
            this.f7864a = changeOfAddressCl;
            this.f7865b = uVar;
        }

        public void a(String str, int i10) {
            EditText editText;
            StringBuilder sb2;
            EditText editText2;
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            String str2 = null;
            if (cm.l.a(this.f7864a.U, "dl-renewal-current-address")) {
                List E1 = this.f7864a.X;
                if (!(E1 == null || (talukaMasterItem2 = (TalukaMasterItem) E1.get(i10)) == null)) {
                    str2 = talukaMasterItem2.getSubDistcode();
                }
                this.f7864a.j2().f25842w.setText(str);
                this.f7864a.j2().f25842w.setContentDescription(str2);
                this.f7864a.r2().setSubDistrict(str2);
                this.f7864a.e2((String) this.f7865b.f20234e);
                editText = this.f7864a.j2().M;
                sb2 = new StringBuilder();
                sb2.append(this.f7864a.j2().f25842w.getText());
                sb2.append(", ");
                sb2.append(this.f7864a.j2().f25844x.getText());
                sb2.append(", ");
                editText2 = this.f7864a.j2().f25846y;
            } else {
                List H1 = this.f7864a.Y;
                if (!(H1 == null || (talukaMasterItem = (TalukaMasterItem) H1.get(i10)) == null)) {
                    str2 = talukaMasterItem.getSubDistcode();
                }
                this.f7864a.j2().D.setText(str);
                this.f7864a.j2().D.setContentDescription(str2);
                this.f7864a.p2().setSubDistrict(str2);
                this.f7864a.q2((String) this.f7865b.f20234e);
                editText = this.f7864a.j2().A;
                sb2 = new StringBuilder();
                sb2.append(this.f7864a.j2().D.getText());
                sb2.append(", ");
                sb2.append(this.f7864a.j2().E.getText());
                sb2.append(", ");
                editText2 = this.f7864a.j2().F;
            }
            sb2.append(editText2.getText());
            editText.setText(sb2.toString());
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressCl f7866a;

        g(ChangeOfAddressCl changeOfAddressCl) {
            this.f7866a = changeOfAddressCl;
        }

        public void a(String str, int i10) {
            DlAddress p22;
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            String str2 = null;
            if (cm.l.a(this.f7866a.U, "dl-renewal-current-address")) {
                List F1 = this.f7866a.Z;
                if (!(F1 == null || (villageOrTownMasterItem2 = (VillageOrTownMasterItem) F1.get(i10)) == null)) {
                    str2 = villageOrTownMasterItem2.getVillageCode();
                }
                this.f7866a.j2().L.setText(str);
                this.f7866a.j2().L.setContentDescription(str2);
                p22 = this.f7866a.r2();
            } else {
                List I1 = this.f7866a.f7848a0;
                if (!(I1 == null || (villageOrTownMasterItem = (VillageOrTownMasterItem) I1.get(i10)) == null)) {
                    str2 = villageOrTownMasterItem.getVillageCode();
                }
                this.f7866a.j2().G.setText(str);
                this.f7866a.j2().G.setContentDescription(str2);
                p22 = this.f7866a.p2();
            }
            p22.setVillageOrTown(str2);
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7867a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f7867a = lVar;
        }

        public final pl.c a() {
            return this.f7867a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7867a.invoke(obj);
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

    public ChangeOfAddressCl() {
    }

    private final boolean A2() {
        ld.c v22;
        String string;
        String str;
        String b10;
        Editable text = j2().f25846y.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            v22 = v2();
            string = getString(R.string.select_state);
            str = "select_state";
        } else {
            Editable text2 = j2().f25844x.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                v22 = v2();
                string = getString(R.string.select_district);
                str = "select_district";
            } else {
                Editable text3 = j2().f25842w.getText();
                cm.l.e(text3, "getText(...)");
                if (text3.length() == 0) {
                    v22 = v2();
                    string = getString(R.string.select_taluka);
                    str = "select_taluka";
                } else {
                    Editable text4 = j2().M.getText();
                    cm.l.e(text4, "getText(...)");
                    if (text4.length() == 0) {
                        v22 = v2();
                        string = getString(R.string.sel_landmark);
                        str = "select_landmark";
                    } else {
                        Editable text5 = j2().N.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() == 0) {
                            v22 = v2();
                            string = getString(R.string.enter_pincode);
                            str = "select_pincode";
                        } else {
                            if (j2().N.getText().length() >= 6) {
                                Editable text6 = j2().F.getText();
                                cm.l.e(text6, "getText(...)");
                                if (text6.length() == 0) {
                                    v22 = v2();
                                    string = getString(R.string.sel_p_state);
                                    str = "select_pstate";
                                } else {
                                    Editable text7 = j2().E.getText();
                                    cm.l.e(text7, "getText(...)");
                                    if (text7.length() == 0) {
                                        v22 = v2();
                                        string = getString(R.string.sel_p_dis);
                                        str = "select_pdistrict";
                                    } else {
                                        Editable text8 = j2().D.getText();
                                        cm.l.e(text8, "getText(...)");
                                        if (text8.length() == 0) {
                                            v22 = v2();
                                            string = getString(R.string.sel_p_tal);
                                            str = "select_ptaluka";
                                        } else {
                                            Editable text9 = j2().A.getText();
                                            cm.l.e(text9, "getText(...)");
                                            if (text9.length() == 0) {
                                                v22 = v2();
                                                string = getString(R.string.sel_p_lm);
                                                str = "select_plandmark";
                                            } else {
                                                Editable text10 = j2().B.getText();
                                                cm.l.e(text10, "getText(...)");
                                                if (text10.length() != 0) {
                                                    if (j2().B.getText().length() >= 6) {
                                                        return true;
                                                    }
                                                    v22 = v2();
                                                    string = getString(R.string.sel_pc_pin);
                                                    str = "select_ppin_code";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b10 = v2().b("select_pin_code", getString(R.string.enter_correct_pincode));
                            Toast.makeText(this, b10, 0).show();
                            return false;
                        }
                    }
                }
            }
        }
        b10 = v22.b(str, string);
        Toast.makeText(this, b10, 0).show();
        return false;
    }

    private final void B2() {
        j2().C0.setOnClickListener(new y(this));
        j2().X.f29577d.setOnClickListener(new e0(this));
        j2().W.f25959e.setOnClickListener(new f0(this));
        j2().f25827h0.setOnClickListener(new p9.m(this));
        j2().f25846y.setOnClickListener(new n(this));
        j2().f25844x.setOnClickListener(new o(this));
        j2().f25842w.setOnClickListener(new p(this));
        j2().L.setOnClickListener(new q(this));
        j2().E0.setOnCheckedChangeListener(new r(this));
        j2().F.setOnClickListener(new s(this));
        j2().E.setOnClickListener(new z(this));
        j2().D.setOnClickListener(new a0(this));
        j2().G.setOnClickListener(new p9.b0(this));
        j2().J.setOnCheckedChangeListener(new p9.c0(this));
        j2().f25826g0.setOnCheckedChangeListener(new p9.d0(this));
    }

    /* access modifiers changed from: private */
    public static final void C2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            changeOfAddressCl.V2("dl-renewal-current-address");
        } else {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            changeOfAddressCl.W2("dl-renewal-current-address");
        } else {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void E2(ChangeOfAddressCl changeOfAddressCl, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(changeOfAddressCl, "this$0");
        List list = changeOfAddressCl.X;
        if (list != null && (!list.isEmpty())) {
            if (i10 == R.id.town_rb) {
                str = "U";
            } else if (i10 == R.id.village_rb) {
                str = "R";
            } else {
                return;
            }
            changeOfAddressCl.e2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void F2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            Toast.makeText(changeOfAddressCl.m2(), "Please Check Your Internet connection", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void G2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            changeOfAddressCl.U2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void H2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            changeOfAddressCl.V2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void I2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            changeOfAddressCl.W2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void J2(ChangeOfAddressCl changeOfAddressCl, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(changeOfAddressCl, "this$0");
        List list = changeOfAddressCl.Y;
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
            changeOfAddressCl.q2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void K2(ChangeOfAddressCl changeOfAddressCl, CompoundButton compoundButton, boolean z10) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (z10) {
            try {
                changeOfAddressCl.c3();
                changeOfAddressCl.j2().F.setEnabled(false);
                changeOfAddressCl.j2().E.setEnabled(false);
                changeOfAddressCl.j2().D.setEnabled(false);
                changeOfAddressCl.j2().G.setEnabled(false);
                changeOfAddressCl.j2().A.setEnabled(false);
                changeOfAddressCl.j2().f25848z.setEnabled(false);
                changeOfAddressCl.j2().C.setEnabled(false);
                changeOfAddressCl.j2().B.setEnabled(false);
            } catch (Exception unused) {
                return;
            }
        } else {
            changeOfAddressCl.j2().F.setEnabled(true);
            changeOfAddressCl.j2().E.setEnabled(true);
            changeOfAddressCl.j2().D.setEnabled(true);
            changeOfAddressCl.j2().G.setEnabled(true);
            changeOfAddressCl.j2().A.setEnabled(true);
            changeOfAddressCl.j2().f25848z.setEnabled(true);
            changeOfAddressCl.j2().C.setEnabled(true);
            changeOfAddressCl.j2().B.setEnabled(true);
            changeOfAddressCl.f7850c0 = new DlAddress("", "", "", "", "", "", "", "");
            changeOfAddressCl.j2().E.setText("");
            changeOfAddressCl.j2().D.setText("");
            changeOfAddressCl.j2().G.setText("");
            changeOfAddressCl.j2().A.setText("");
            changeOfAddressCl.j2().f25848z.setText("");
            changeOfAddressCl.j2().C.setText("");
            changeOfAddressCl.j2().B.setText("");
        }
        changeOfAddressCl.j2().z(changeOfAddressCl.f7850c0);
        changeOfAddressCl.j2().a();
    }

    /* access modifiers changed from: private */
    public static final void L2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        Intent intent = new Intent(changeOfAddressCl, ClDetailsTop.class);
        intent.putExtra("dlValue", changeOfAddressCl.f2());
        intent.putExtra("dobValue", changeOfAddressCl.g2());
        intent.putExtra("fatherName", changeOfAddressCl.h2());
        intent.putExtra("clName", changeOfAddressCl.b2());
        intent.putExtra("clPhoto", changeOfAddressCl.c2());
        intent.putExtra("address", changeOfAddressCl.f7855h0).toString();
        intent.putExtra("issuing_authority", changeOfAddressCl.f7856i0).toString();
        intent.putExtra("validity", changeOfAddressCl.f7857j0).toString();
        intent.putExtra("cl_Status", changeOfAddressCl.f7858k0).toString();
        changeOfAddressCl.startActivity(intent);
        changeOfAddressCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void M2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        changeOfAddressCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void N2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        changeOfAddressCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void O2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else if (changeOfAddressCl.A2()) {
            changeOfAddressCl.X2(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
        }
    }

    /* access modifiers changed from: private */
    public static final void P2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            Toast.makeText(changeOfAddressCl.m2(), "Please Check Your Internet connection", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl)) {
            changeOfAddressCl.U2("dl-renewal-current-address");
        } else {
            Toast.makeText(changeOfAddressCl.m2(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    private final void R2() {
        j2().X.f29580g.setText(u2().i());
        j2().X.f29581h.setPaintFlags(j2().X.f29581h.getPaintFlags() | 8);
        j2().X.f29581h.setText(q.B0(f2().toString()).toString());
        j2().X.f29581h.setOnClickListener(new t(this));
    }

    /* access modifiers changed from: private */
    public static final void S2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        try {
            Intent intent = new Intent(changeOfAddressCl, ClDetailsTop.class);
            intent.putExtra("dlValue", changeOfAddressCl.f2());
            intent.putExtra("dobValue", changeOfAddressCl.g2());
            intent.putExtra("fatherName", changeOfAddressCl.h2());
            intent.putExtra("clName", changeOfAddressCl.b2());
            intent.putExtra("clPhoto", changeOfAddressCl.c2());
            intent.putExtra("address", changeOfAddressCl.f7855h0).toString();
            intent.putExtra("issuing_authority", changeOfAddressCl.f7856i0).toString();
            intent.putExtra("validity", changeOfAddressCl.f7857j0).toString();
            intent.putExtra("cl_Status", changeOfAddressCl.f7858k0).toString();
            changeOfAddressCl.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void T1() {
        this.f7851d0 = (c0) new u0(this).a(c0.class);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            c0 c0Var = this.f7851d0;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.g(w2());
            return;
        }
        Toast.makeText(getApplicationContext(), v2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void T2(ChangeOfAddressCl changeOfAddressCl, View view) {
        cm.l.f(changeOfAddressCl, "this$0");
        changeOfAddressCl.finish();
    }

    private final void U1() {
        c0 c0Var = this.f7851d0;
        c0 c0Var2 = null;
        if (c0Var == null) {
            cm.l.v("viewModel");
            c0Var = null;
        }
        c0Var.h().g(this, new h(new a(this)));
        c0 c0Var3 = this.f7851d0;
        if (c0Var3 == null) {
            cm.l.v("viewModel");
            c0Var3 = null;
        }
        c0Var3.k().g(this, new h(new b(this)));
        c0 c0Var4 = this.f7851d0;
        if (c0Var4 == null) {
            cm.l.v("viewModel");
        } else {
            c0Var2 = c0Var4;
        }
        c0Var2.l().g(this, new h(new c(this)));
        k2().l().g(this, new w(this));
        k2().s().g(this, new h(new d(this)));
    }

    private final void U2(String str) {
        try {
            this.U = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.U, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.V;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.W;
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
    public static final void V1(ChangeOfAddressCl changeOfAddressCl, String str) {
        cm.l.f(changeOfAddressCl, "this$0");
        changeOfAddressCl.o2().dismiss();
        String b10 = changeOfAddressCl.v2().b("label_unable_details", changeOfAddressCl.getString(R.string.unable_to_get_details));
        cm.l.c(b10);
        changeOfAddressCl.a3(b10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (j2().f25828i0.isChecked() != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void V2(java.lang.String r7) {
        /*
            r6 = this;
            r6.U = r7     // Catch:{ Exception -> 0x00a1 }
            cm.u r7 = new cm.u     // Catch:{ Exception -> 0x00a1 }
            r7.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = ""
            r7.f20234e = r0     // Catch:{ Exception -> 0x00a1 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a1 }
            r0.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r1 = r6.U     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "dl-renewal-current-address"
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "R"
            java.lang.String r3 = "U"
            r4 = 0
            if (r1 == 0) goto L_0x0055
            java.util.List r1 = r6.X     // Catch:{ Exception -> 0x00a1 }
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
            ni.d0 r1 = r6.j2()     // Catch:{ Exception -> 0x00a1 }
            android.widget.RadioButton r1 = r1.f25828i0     // Catch:{ Exception -> 0x00a1 }
            boolean r1 = r1.isChecked()     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            r7.f20234e = r2     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0088
        L_0x0055:
            java.util.List r1 = r6.Y     // Catch:{ Exception -> 0x00a1 }
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
            ni.d0 r1 = r6.j2()     // Catch:{ Exception -> 0x00a1 }
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
            com.nic.mparivahan.ClServices.View.ChangeOfAddressCl$f r1 = new com.nic.mparivahan.ClServices.View.ChangeOfAddressCl$f     // Catch:{ Exception -> 0x00a1 }
            r1.<init>(r6, r7)     // Catch:{ Exception -> 0x00a1 }
            r0.n2(r1)     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ChangeOfAddressCl.V2(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void W1() {
        j2().f25842w.setText("");
        j2().f25842w.setHint(v2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.X = q.i();
        X1();
        X1();
    }

    private final void W2(String str) {
        try {
            this.U = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.U, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.Z;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.f7848a0;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Village/Town", arrayList);
            a10.k2(F0(), "VillageTownPicker");
            a10.n2(new g(this));
        } catch (Exception unused) {
        }
    }

    private final void X1() {
        j2().L.setText("");
        j2().L.setHint(v2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.Z = q.i();
    }

    private final void X2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(v2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(v2().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(v2().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new p9.u(dialog));
        textView.setOnClickListener(new v(this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public final void Y1() {
        j2().D.setText("");
        j2().D.setHint(v2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.Y = q.i();
        Z1();
    }

    /* access modifiers changed from: private */
    public static final void Y2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void Z1() {
        j2().G.setText("");
        j2().G.setHint(v2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.f7848a0 = q.i();
    }

    /* access modifiers changed from: private */
    public static final void Z2(ChangeOfAddressCl changeOfAddressCl, View view) {
        ChangeOfAddressCl changeOfAddressCl2 = changeOfAddressCl;
        cm.l.f(changeOfAddressCl2, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressCl2)) {
            t9.a k22 = changeOfAddressCl.k2();
            String w22 = changeOfAddressCl.w2();
            String s22 = changeOfAddressCl.s2();
            String obj = changeOfAddressCl.j2().f25848z.getText().toString();
            String obj2 = changeOfAddressCl.j2().O.getText().toString();
            String obj3 = changeOfAddressCl.j2().A.getText().toString();
            String obj4 = changeOfAddressCl.j2().N.getText().toString();
            String obj5 = changeOfAddressCl.j2().f25848z.getText().toString();
            String obj6 = changeOfAddressCl.j2().C.getText().toString();
            String obj7 = changeOfAddressCl.j2().M.getText().toString();
            String obj8 = changeOfAddressCl.j2().N.getText().toString();
            String district = changeOfAddressCl2.f7850c0.getDistrict();
            String str = district;
            cm.l.c(district);
            String villageOrTown = changeOfAddressCl2.f7850c0.getVillageOrTown();
            String str2 = villageOrTown;
            cm.l.c(villageOrTown);
            String district2 = changeOfAddressCl2.f7849b0.getDistrict();
            String str3 = district2;
            cm.l.c(district2);
            String villageOrTown2 = changeOfAddressCl2.f7849b0.getVillageOrTown();
            String str4 = villageOrTown2;
            cm.l.c(villageOrTown2);
            t9.a aVar = k22;
            String subDistrict = changeOfAddressCl2.f7850c0.getSubDistrict();
            String str5 = subDistrict;
            cm.l.c(subDistrict);
            String subDistrict2 = changeOfAddressCl2.f7849b0.getSubDistrict();
            cm.l.c(subDistrict2);
            t9.a aVar2 = aVar;
            aVar2.h(changeOfAddressCl, w22, s22, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, str, str2, str3, str4, str5, subDistrict2, "553", changeOfAddressCl.f2(), changeOfAddressCl.g2());
            return;
        }
        Toast.makeText(changeOfAddressCl.getApplicationContext(), changeOfAddressCl.v2().b("label_log_check_internet", changeOfAddressCl2.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public final void a3(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new p9.x(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void b3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void c3() {
        try {
            j2().E.setText(j2().f25844x.getText());
            j2().D.setText(j2().f25842w.getText());
            j2().G.setText(j2().L.getText());
            j2().f25848z.setText(j2().K.getText());
            j2().C.setText(j2().O.getText());
            j2().A.setText(j2().M.getText());
            j2().B.setText(j2().N.getText());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void e2(String str) {
        try {
            String obj = j2().f25842w.getContentDescription().toString();
            X1();
            o2().dismiss();
            c0 c0Var = this.f7851d0;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.o(w2(), j2().f25844x.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void q2(String str) {
        try {
            String obj = j2().D.getContentDescription().toString();
            Z1();
            c0 c0Var = this.f7851d0;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.o(w2(), j2().E.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    private final void z2() {
        d0 x10 = d0.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        i3(x10);
        setContentView(j2().m());
        l3(this);
        r3(new ld.c(m2()));
        q3(new ld.f(m2()));
        n3(new ProgressDialog(m2()));
        o2().setMessage(v2().b("label_challan_please_wait", getString(R.string.please_wait)));
        o2().setCancelable(false);
        o2().setCanceledOnTouchOutside(false);
        try {
            g3(String.valueOf(getIntent().getStringExtra("dobValue")));
            f3(String.valueOf(getIntent().getStringExtra("dlValue")));
            h3(String.valueOf(getIntent().getStringExtra("fatherName")));
            d3(String.valueOf(getIntent().getStringExtra("clName")));
            e3(String.valueOf(getIntent().getStringExtra("clPhoto")));
            o3(String.valueOf(getIntent().getStringExtra("rtoCode")));
            p3(String.valueOf(getIntent().getStringExtra("rtoName")));
            s3(String.valueOf(getIntent().getStringExtra("stateCode")));
            t3(String.valueOf(getIntent().getStringExtra("stateName")));
            m3(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            j2().f25846y.setText(x2());
            j2().F.setText(x2());
            TextView textView = j2().f25829j0;
            textView.setText(v2().b("CL_NO", "CL No.") + ' ' + f2());
            j2().W.f25961g.setText(u2().i());
            this.f7855h0 = String.valueOf(getIntent().getStringExtra("address"));
            this.f7856i0 = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.f7857j0 = String.valueOf(getIntent().getStringExtra("validity"));
            this.f7858k0 = String.valueOf(getIntent().getStringExtra("cl_Status"));
            String c22 = c2();
            if (c22 != null) {
                if (c22.length() != 0) {
                    j2().W.f25960f.setVisibility(0);
                    j2().W.f25956b.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(c2()));
                    k3(ClInter.f7830a.a(m2()));
                    j3((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(l2()))).a(t9.a.class));
                }
            }
            j2().W.f25960f.setVisibility(8);
        } catch (Exception unused) {
        }
        k3(ClInter.f7830a.a(m2()));
        j3((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(l2()))).a(t9.a.class));
    }

    public final String a2() {
        return this.f7855h0;
    }

    public final String b2() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("clName");
        return null;
    }

    public final String c2() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("clPhoto");
        return null;
    }

    public final String d2() {
        return this.f7858k0;
    }

    public final void d3(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void e3(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final String f2() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("dlValue");
        return null;
    }

    public final void f3(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final String g2() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("dobValue");
        return null;
    }

    public final void g3(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final String h2() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("fatherName");
        return null;
    }

    public final void h3(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final String i2() {
        return this.f7856i0;
    }

    public final void i3(d0 d0Var) {
        cm.l.f(d0Var, "<set-?>");
        this.G = d0Var;
    }

    public final d0 j2() {
        d0 d0Var = this.G;
        if (d0Var != null) {
            return d0Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final void j3(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f7852e0 = aVar;
    }

    public final t9.a k2() {
        t9.a aVar = this.f7852e0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final void k3(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.f7853f0 = clInter;
    }

    public final ClInter l2() {
        ClInter clInter = this.f7853f0;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final void l3(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final Context m2() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void m3(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final String n2() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("Mobile_no");
        return null;
    }

    public final void n3(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final ProgressDialog o2() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void o3(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z2();
        T1();
        U1();
        B2();
        R2();
        v9.e.f17509a.w(this, j2());
        j2().X.f29577d.setOnClickListener(new p9.l(this));
    }

    public final DlAddress p2() {
        return this.f7850c0;
    }

    public final void p3(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void q3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f7854g0 = fVar;
    }

    public final DlAddress r2() {
        return this.f7849b0;
    }

    public final void r3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final String s2() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoCode");
        return null;
    }

    public final void s3(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String t2() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("rtoName");
        return null;
    }

    public final void t3(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final ld.f u2() {
        ld.f fVar = this.f7854g0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.c v2() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String w2() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCode");
        return null;
    }

    public final String x2() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("stateName");
        return null;
    }

    public final String y2() {
        return this.f7857j0;
    }
}
