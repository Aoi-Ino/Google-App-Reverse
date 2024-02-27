package com.nic.mparivahan.VahanServices.RenewalOfPermit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.TempDetailsModel;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.RPDataModel;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataServices.RPDataService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.ArrayList;
import ni.p7;
import pl.x;

public final class RenewalOfPermitMainScreen extends androidx.appcompat.app.d {
    public p7 G;
    public kg.a H;
    public RPDataService I;
    public ProgressDialog J;
    public qe.b K;
    public DuplicateFitnessService L;
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
    public ld.c X;
    public String Y;
    public NrvDetails Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f20722a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f20723b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f20724c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f20725d0;

    /* renamed from: e0  reason: collision with root package name */
    private RPDataModel f20726e0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20727e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            super(1);
            this.f20727e = renewalOfPermitMainScreen;
        }

        public final void b(CalValidity calValidity) {
            this.f20727e.s1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                Data data = calValidity.getData();
                Object goodsType = data != null ? data.getGoodsType() : null;
                cm.l.d(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) goodsType;
                arrayList.add(0, "Select Goods");
                this.f20727e.k1().f27964e.setAdapter(new re.b(this.f20727e, arrayList));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CalValidity) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20728e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            super(1);
            this.f20728e = renewalOfPermitMainScreen;
        }

        public final void b(TempDetailsModel tempDetailsModel) {
            Log.e("tempRenew223", "entered in temp");
            try {
                this.f20728e.s1().dismiss();
                ApiMessage apiMessage = tempDetailsModel.getApiMessage();
                if (apiMessage != null && apiMessage.getStatusCode() == 200) {
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data = tempDetailsModel.getData();
                    Object obj = null;
                    ArrayList<String> natureOfGoods = data != null ? data.getNatureOfGoods() : null;
                    if (natureOfGoods != null) {
                        natureOfGoods.add(0, "Select Nature of Goods");
                    }
                    this.f20728e.k1().f27967h.setAdapter(new re.b(this.f20728e, natureOfGoods));
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data2 = tempDetailsModel.getData();
                    if ((data2 != null ? data2.getGoodsType() : null) == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(0, "Select Goods");
                        this.f20728e.k1().f27964e.setAdapter(new re.b(this.f20728e, arrayList));
                        return;
                    }
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data3 = tempDetailsModel.getData();
                    if (data3 != null) {
                        obj = data3.getGoodsType();
                    }
                    cm.l.d(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ArrayList arrayList2 = (ArrayList) obj;
                    arrayList2.add(0, "Select Goods");
                    this.f20728e.k1().f27964e.setAdapter(new re.b(this.f20728e, arrayList2));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TempDetailsModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20729e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            super(1);
            this.f20729e = renewalOfPermitMainScreen;
        }

        public final void b(String str) {
            this.f20729e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20730e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            super(1);
            this.f20730e = renewalOfPermitMainScreen;
        }

        public final void b(RPDataModel rPDataModel) {
            try {
                this.f20730e.s1().dismiss();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.ApiMessage apiMessage = rPDataModel.getApiMessage();
                String str = null;
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    VContant.Companion companion = VContant.Companion;
                    RenewalOfPermitMainScreen renewalOfPermitMainScreen = this.f20730e;
                    com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.ApiMessage apiMessage2 = rPDataModel.getApiMessage();
                    if (apiMessage2 != null) {
                        str = apiMessage2.getMessage();
                    }
                    companion.M(renewalOfPermitMainScreen, str);
                    this.f20730e.k1().f27966g.setEnabled(false);
                    this.f20730e.k1().f27983x.setEnabled(false);
                    return;
                }
                this.f20730e.b2(rPDataModel);
                RenewalOfPermitMainScreen renewalOfPermitMainScreen2 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data = rPDataModel.getData();
                renewalOfPermitMainScreen2.W1(String.valueOf(data != null ? data.getPmtNo() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen3 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data2 = rPDataModel.getData();
                renewalOfPermitMainScreen3.d2(String.valueOf(data2 != null ? data2.getValidFrom() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen4 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data3 = rPDataModel.getData();
                renewalOfPermitMainScreen4.e2(String.valueOf(data3 != null ? data3.getValidUpto() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen5 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data4 = rPDataModel.getData();
                renewalOfPermitMainScreen5.V1(String.valueOf(data4 != null ? Integer.valueOf(data4.getPmtType()) : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen6 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data5 = rPDataModel.getData();
                renewalOfPermitMainScreen6.U1(String.valueOf(data5 != null ? Integer.valueOf(data5.getPmtCatg()) : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen7 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data6 = rPDataModel.getData();
                renewalOfPermitMainScreen7.f2(String.valueOf(data6 != null ? data6.getPeriodMode() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen8 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data7 = rPDataModel.getData();
                renewalOfPermitMainScreen8.T1(String.valueOf(data7 != null ? Integer.valueOf(data7.getPeriod()) : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen9 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data8 = rPDataModel.getData();
                renewalOfPermitMainScreen9.R1(String.valueOf(data8 != null ? data8.getAllotmentOffice() : null));
                RenewalOfPermitMainScreen renewalOfPermitMainScreen10 = this.f20730e;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data9 = rPDataModel.getData();
                renewalOfPermitMainScreen10.c2(String.valueOf(data9 != null ? Integer.valueOf(data9.getServiceType()) : null));
                EditText editText = this.f20730e.k1().f27974o;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data10 = rPDataModel.getData();
                editText.setText(data10 != null ? data10.getPmtNo() : null);
                EditText editText2 = this.f20730e.k1().f27978s;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data11 = rPDataModel.getData();
                editText2.setText(data11 != null ? data11.getValidFrom() : null);
                EditText editText3 = this.f20730e.k1().f27980u;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data12 = rPDataModel.getData();
                editText3.setText(data12 != null ? data12.getValidUpto() : null);
                TextView textView = this.f20730e.k1().f27970k;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data13 = rPDataModel.getData();
                textView.setText(String.valueOf(data13 != null ? Integer.valueOf(data13.getPeriod()) : null));
                ArrayList arrayList = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data14 = rPDataModel.getData();
                arrayList.add(0, String.valueOf(data14 != null ? data14.getPermitTypeDescr() : null));
                this.f20730e.k1().f27977r.setAdapter(new re.b(this.f20730e, arrayList));
                ArrayList arrayList2 = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data15 = rPDataModel.getData();
                arrayList2.add(0, String.valueOf(data15 != null ? data15.getPermitCatgDescr() : null));
                this.f20730e.k1().f27973n.setAdapter(new re.b(this.f20730e, arrayList2));
                ArrayList arrayList3 = new ArrayList();
                VContant.Companion companion2 = VContant.Companion;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data16 = rPDataModel.getData();
                arrayList3.add(0, companion2.w(String.valueOf(data16 != null ? data16.getPeriodMode() : null)));
                this.f20730e.k1().L.setAdapter(new re.b(this.f20730e, arrayList3));
                TextView textView2 = this.f20730e.k1().f27970k;
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data17 = rPDataModel.getData();
                textView2.setText(String.valueOf(data17 != null ? Integer.valueOf(data17.getPeriod()) : null));
                ArrayList arrayList4 = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data18 = rPDataModel.getData();
                arrayList4.add(0, String.valueOf(data18 != null ? data18.getAllotmentOffice() : null));
                this.f20730e.k1().f27962c.setAdapter(new re.b(this.f20730e, arrayList4));
                ArrayList arrayList5 = new ArrayList();
                com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data data19 = rPDataModel.getData();
                if (data19 != null) {
                    str = data19.getServiceTypeDescr();
                }
                arrayList5.add(0, String.valueOf(str));
                this.f20730e.k1().F.setAdapter(new re.b(this.f20730e, arrayList5));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((RPDataModel) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20731e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            super(1);
            this.f20731e = renewalOfPermitMainScreen;
        }

        public final void b(String str) {
            this.f20731e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20732e;

        f(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            this.f20732e = renewalOfPermitMainScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            RenewalOfPermitMainScreen renewalOfPermitMainScreen = this.f20732e;
            renewalOfPermitMainScreen.P1(renewalOfPermitMainScreen.k1().f27967h.getSelectedItem().toString());
            if (this.f20732e.k1().f27967h.getSelectedItemPosition() != 0) {
                this.f20732e.s1().show();
                qe.b l12 = this.f20732e.l1();
                RenewalOfPermitMainScreen renewalOfPermitMainScreen2 = this.f20732e;
                l12.h(renewalOfPermitMainScreen2, renewalOfPermitMainScreen2.k1().f27967h.getSelectedItem().toString(), String.valueOf(this.f20732e.y1().getState_cd()));
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20733e;

        g(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            this.f20733e = renewalOfPermitMainScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            EditText editText;
            int i11;
            cm.l.f(view, "view");
            RenewalOfPermitMainScreen renewalOfPermitMainScreen = this.f20733e;
            renewalOfPermitMainScreen.N1(renewalOfPermitMainScreen.k1().f27964e.getSelectedItem().toString());
            if (p.o(this.f20733e.n1(), "other", true)) {
                editText = this.f20733e.k1().f27963d;
                i11 = 0;
            } else {
                editText = this.f20733e.k1().f27963d;
                i11 = 8;
            }
            editText.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RenewalOfPermitMainScreen f20734e;

        h(RenewalOfPermitMainScreen renewalOfPermitMainScreen) {
            this.f20734e = renewalOfPermitMainScreen;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            RenewalOfPermitMainScreen renewalOfPermitMainScreen = this.f20734e;
            renewalOfPermitMainScreen.R1(renewalOfPermitMainScreen.k1().f27962c.getSelectedItem().toString());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20735a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f20735a = lVar;
        }

        public final pl.c a() {
            return this.f20735a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20735a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void F1(RenewalOfPermitMainScreen renewalOfPermitMainScreen, View view) {
        cm.l.f(renewalOfPermitMainScreen, "this$0");
        VUtility.Companion.v(renewalOfPermitMainScreen, renewalOfPermitMainScreen.o1().b("are_you_sure_you_want_to_leave", renewalOfPermitMainScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void G1(RenewalOfPermitMainScreen renewalOfPermitMainScreen, View view) {
        cm.l.f(renewalOfPermitMainScreen, "this$0");
        Intent intent = new Intent(renewalOfPermitMainScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", renewalOfPermitMainScreen.x1());
        intent.putExtra("RcDetails", renewalOfPermitMainScreen.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, renewalOfPermitMainScreen.f20725d0);
        intent.putExtra(VContant.NEXGEN_addahar_name, renewalOfPermitMainScreen.j1());
        intent.putExtra(VContant.NEXGEN_addahar_address, renewalOfPermitMainScreen.i1());
        renewalOfPermitMainScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0113, code lost:
        r5 = r5.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H1(com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen r6, android.view.View r7) {
        /*
            java.lang.String r7 = "NA"
            java.lang.String r0 = "RcDetails"
            java.lang.String r1 = "this$0"
            cm.l.f(r6, r1)
            ni.p7 r1 = r6.k1()
            android.widget.Spinner r1 = r1.f27967h
            int r1 = r1.getSelectedItemPosition()
            r2 = 2132018796(0x7f14066c, float:1.9675909E38)
            java.lang.String r3 = "please_select_nature_of_goods"
            r4 = 0
            if (r1 != 0) goto L_0x0030
        L_0x001b:
            ld.c r7 = r6.o1()
            java.lang.String r0 = r6.getString(r2)
            java.lang.String r7 = r7.b(r3, r0)
        L_0x0027:
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r4)
            r6.show()
            goto L_0x0184
        L_0x0030:
            ni.p7 r1 = r6.k1()
            android.widget.Spinner r1 = r1.f27964e
            int r1 = r1.getSelectedItemPosition()
            if (r1 != 0) goto L_0x003d
            goto L_0x001b
        L_0x003d:
            ni.p7 r1 = r6.k1()
            android.widget.Spinner r1 = r1.f27964e
            java.lang.Object r1 = r1.getSelectedItem()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "other"
            r3 = 1
            boolean r1 = km.p.o(r1, r2, r3)
            if (r1 == 0) goto L_0x0073
            ni.p7 r1 = r6.k1()
            android.widget.EditText r1 = r1.f27963d
            int r1 = r1.length()
            r5 = 3
            if (r1 >= r5) goto L_0x0073
            ld.c r7 = r6.o1()
            r0 = 2132018736(0x7f140630, float:1.9675787E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "please_enter_goods_details"
            java.lang.String r7 = r7.b(r1, r0)
            goto L_0x0027
        L_0x0073:
            java.lang.String r1 = r6.w1()     // Catch:{ Exception -> 0x0184 }
            if (r1 == 0) goto L_0x0184
            boolean r1 = km.p.q(r1)     // Catch:{ Exception -> 0x0184 }
            if (r1 == 0) goto L_0x0081
            goto L_0x0184
        L_0x0081:
            ni.p7 r1 = r6.k1()     // Catch:{ Exception -> 0x0184 }
            android.widget.Spinner r1 = r1.f27967h     // Catch:{ Exception -> 0x0184 }
            java.lang.Object r1 = r1.getSelectedItem()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0184 }
            r6.P1(r1)     // Catch:{ Exception -> 0x0184 }
            ni.p7 r1 = r6.k1()     // Catch:{ Exception -> 0x0184 }
            android.widget.Spinner r1 = r1.f27964e     // Catch:{ Exception -> 0x0184 }
            java.lang.Object r1 = r1.getSelectedItem()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0184 }
            r6.N1(r1)     // Catch:{ Exception -> 0x0184 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0184 }
            java.lang.Class<com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty> r4 = com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty.class
            r1.<init>(r6, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "permitNo"
            java.lang.String r5 = r6.w1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "permitValidFrom"
            java.lang.String r5 = r6.C1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "permitValidUpto"
            java.lang.String r5 = r6.D1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "permitType"
            java.lang.String r5 = r6.v1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "permitCategory"
            java.lang.String r5 = r6.u1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "yearlyMode"
            java.lang.String r5 = r6.E1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "period"
            java.lang.String r5 = r6.t1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "allotOffice"
            java.lang.String r5 = r6.r1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "serviceType"
            java.lang.String r5 = r6.B1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "natureOfGoods"
            java.lang.String r5 = r6.p1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "goods"
            java.lang.String r5 = r6.n1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "region"
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.RPDataModel r5 = r6.f20726e0     // Catch:{ Exception -> 0x0184 }
            if (r5 == 0) goto L_0x011e
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.Data r5 = r5.getData()     // Catch:{ Exception -> 0x0184 }
            if (r5 == 0) goto L_0x011e
            com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.VmRegionDetailsDto r5 = r5.getVmRegionDetailsDto()     // Catch:{ Exception -> 0x0184 }
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r4 = r6.y1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r0, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "RC"
            java.lang.String r5 = r6.x1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x0184 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r4 = r6.y1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r0, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r0 = "off_code"
            java.lang.String r4 = r6.q1()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r0, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r0 = "Face_Less_Staus"
            boolean r4 = r6.f20725d0     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r0, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r0 = "aadhaarName"
            r1.putExtra(r0, r7)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r0 = "aadhaarAddress"
            r1.putExtra(r0, r7)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r7 = r6.n1()     // Catch:{ Exception -> 0x0184 }
            boolean r7 = km.p.o(r7, r2, r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r0 = "otherGoods"
            if (r7 == 0) goto L_0x0171
            ni.p7 r7 = r6.k1()     // Catch:{ Exception -> 0x0184 }
            android.widget.EditText r7 = r7.f27963d     // Catch:{ Exception -> 0x0184 }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0184 }
        L_0x016d:
            r1.putExtra(r0, r7)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0174
        L_0x0171:
            java.lang.String r7 = " "
            goto L_0x016d
        L_0x0174:
            java.lang.String r7 = "regNo"
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r6.y1()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r0 = r0.getRc_regn_no()     // Catch:{ Exception -> 0x0184 }
            r1.putExtra(r7, r0)     // Catch:{ Exception -> 0x0184 }
            r6.startActivity(r1)     // Catch:{ Exception -> 0x0184 }
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen.H1(com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen, android.view.View):void");
    }

    public final kg.a A1() {
        kg.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("rpDataViewModel");
        return null;
    }

    public final String B1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("servicesType");
        return null;
    }

    public final String C1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("validFrom");
        return null;
    }

    public final String D1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("validUpto");
        return null;
    }

    public final String E1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("yearlyMode");
        return null;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20724c0 = str;
    }

    public final void J1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20723b0 = str;
    }

    public final void K1(p7 p7Var) {
        cm.l.f(p7Var, "<set-?>");
        this.G = p7Var;
    }

    public final void L1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.K = bVar;
    }

    public final void M1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.L = duplicateFitnessService;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void O1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.f20722a0 = str;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void S1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void Y1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.Z = nrvDetails;
    }

    public final void Z1(RPDataService rPDataService) {
        cm.l.f(rPDataService, "<set-?>");
        this.I = rPDataService;
    }

    public final void a2(kg.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final void b2(RPDataModel rPDataModel) {
        this.f20726e0 = rPDataModel;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void d2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void e2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final String i1() {
        String str = this.f20724c0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String j1() {
        String str = this.f20723b0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final p7 k1() {
        p7 p7Var = this.G;
        if (p7Var != null) {
            return p7Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final qe.b l1() {
        qe.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService m1() {
        DuplicateFitnessService duplicateFitnessService = this.L;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        cm.l.v("fitnessService");
        return null;
    }

    public final String n1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("goods");
        return null;
    }

    public final ld.c o1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, o1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p7 c10 = p7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        K1(c10);
        setContentView((View) k1().b());
        Z1(RPDataService.f20705a.b(this));
        M1(DuplicateFitnessService.f20591a.b(this));
        O1(new ld.c(this));
        v9.e.f17509a.O2(this, k1());
        S1(new ProgressDialog(this));
        s1().setMessage(o1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.f20725d0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        X1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Y1((NrvDetails) serializableExtra);
        k1().f27963d.setVisibility(0);
        k1().I.f28305f.setOnClickListener(new gg.e(this));
        O1(new ld.c(this));
        TextView textView = k1().J;
        textView.setText(o1().b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        k1().K.setText(o1().b("view_vehicle_details", "View Vehicle Details"));
        k1().K.setPaintFlags(k1().K.getPaintFlags() | 8);
        k1().K.setOnClickListener(new gg.f(this));
        a2((kg.a) new u0((x0) this, (u0.b) new jg.a(new ig.a(z1()))).a(kg.a.class));
        L1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(m1()))).a(qe.b.class));
        try {
            s1().show();
            l1().H(this, x1(), y1().getState_cd(), String.valueOf(y1().getRc_off_cd()));
            A1().g(x1(), String.valueOf(y1().getState_cd()), String.valueOf(y1().getRc_off_cd()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        l1().D().g(this, new i(new b(this)));
        l1().E().g(this, new i(new c(this)));
        A1().i().g(this, new i(new d(this)));
        A1().h().g(this, new i(new e(this)));
        k1().f27967h.setOnItemSelectedListener(new f(this));
        k1().f27964e.setOnItemSelectedListener(new g(this));
        k1().f27962c.setOnItemSelectedListener(new h(this));
        l1().r().g(this, new i(new a(this)));
        k1().f27966g.setOnClickListener(new gg.g(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        cm.l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, o1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String p1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("natureOfGOods");
        return null;
    }

    public final String q1() {
        String str = this.f20722a0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String r1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("office");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("period");
        return null;
    }

    public final String u1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("permitCategory");
        return null;
    }

    public final String v1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("permitType");
        return null;
    }

    public final String w1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("pmtNo");
        return null;
    }

    public final String x1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.Z;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final RPDataService z1() {
        RPDataService rPDataService = this.I;
        if (rPDataService != null) {
            return rPDataService;
        }
        cm.l.v("rpDataService");
        return null;
    }
}
