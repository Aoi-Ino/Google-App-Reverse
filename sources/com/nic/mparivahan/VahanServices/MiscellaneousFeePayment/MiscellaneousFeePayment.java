package com.nic.mparivahan.VahanServices.MiscellaneousFeePayment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.CompoundingFee.ComPayment.ComPaymentTaxActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPResponseModel;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPService.MFPService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import ni.d6;
import pl.x;

public final class MiscellaneousFeePayment extends androidx.appcompat.app.d {
    public d6 G;
    public uf.a H;
    public MFPService I;
    public h J;
    public ld.c K;
    public ProgressDialog L;
    public VahanProService M;
    public String N;
    public NrvDetails O;
    public String P;
    public String Q;
    public String R;
    private boolean S;
    private double T;
    private double U;
    private double V;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MiscellaneousFeePayment f20671e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MiscellaneousFeePayment miscellaneousFeePayment) {
            super(1);
            this.f20671e = miscellaneousFeePayment;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Integer] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPResponseModel r46) {
            /*
                r45 = this;
                r0 = r45
                ka.c$a r1 = ka.c.f13158a
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r2 = r46.getData()
                r3 = 0
                if (r2 == 0) goto L_0x0010
                java.lang.String r2 = r2.getApplNo()
                goto L_0x0011
            L_0x0010:
                r2 = r3
            L_0x0011:
                boolean r1 = r1.m(r2)
                if (r1 != 0) goto L_0x0202
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel r44 = new com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r1 = r46.getData()
                if (r1 == 0) goto L_0x0025
                java.lang.String r1 = r1.getApplNo()
                r5 = r1
                goto L_0x0026
            L_0x0025:
                r5 = r3
            L_0x0026:
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r1 = r0.f20671e
                ni.d6 r1 = r1.m1()
                android.widget.TextView r1 = r1.f25871j
                java.lang.CharSequence r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                double r6 = java.lang.Double.parseDouble(r1)
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r1 = r46.getData()
                if (r1 == 0) goto L_0x0045
                java.lang.Integer r1 = r1.getOffCd()
                goto L_0x0046
            L_0x0045:
                r1 = r3
            L_0x0046:
                cm.l.c(r1)
                int r8 = r1.intValue()
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r1 = r46.getData()
                int r9 = r1.getPurCd()
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r1 = r46.getData()
                java.lang.String r1 = r1.getRegnNo()
                java.lang.String r10 = java.lang.String.valueOf(r1)
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r1 = r46.getData()
                java.lang.String r1 = r1.getStateCd()
                java.lang.String r11 = java.lang.String.valueOf(r1)
                r4 = r44
                r4.<init>(r5, r6, r8, r9, r10, r11)
                ld.h r1 = new ld.h
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r2 = r0.f20671e
                r1.<init>(r2)
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r2 = r0.f20671e
                boolean r2 = r2.z1()
                if (r2 == 0) goto L_0x014b
                i7.d r2 = new i7.d
                r2.<init>()
                com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePayReq r15 = new com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePayReq
                java.lang.String r5 = "A"
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r4 = r46.getData()
                if (r4 == 0) goto L_0x0095
                java.lang.String r4 = r4.getApplNo()
                goto L_0x0096
            L_0x0095:
                r4 = r3
            L_0x0096:
                java.lang.String r6 = java.lang.String.valueOf(r4)
                r7 = 0
                r8 = 22
                r9 = 0
                java.lang.String r10 = ""
                java.lang.String r11 = ""
                r12 = 0
                r13 = 0
                r14 = 0
                java.lang.String r16 = ""
                r17 = 1
                java.lang.String r18 = ""
                java.lang.String r19 = ""
                r20 = 0
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                java.lang.String r21 = r4.s1()
                v9.d$a r4 = v9.d.f17494a
                java.lang.String r22 = r4.m()
                java.lang.String r23 = ""
                java.lang.String r24 = ""
                java.lang.String r25 = "48"
                java.lang.String r26 = ""
                java.lang.String r27 = ""
                r28 = 0
                r30 = 0
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                java.lang.String r31 = r4.u1()
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r4 = r4.v1()
                java.lang.String r4 = r4.getState_cd()
                java.lang.String r32 = java.lang.String.valueOf(r4)
                java.lang.String r33 = ""
                java.lang.String r34 = ""
                java.lang.String r35 = ""
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r4 = r4.v1()
                java.lang.String r4 = r4.getRc_vh_class_cd()
                if (r4 == 0) goto L_0x00f7
                int r3 = java.lang.Integer.parseInt(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            L_0x00f7:
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                java.lang.String r42 = r1.a()
                r43 = 0
                r4 = r15
                r1 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                r19 = r20
                r20 = r21
                r21 = r22
                r22 = r23
                r23 = r24
                r24 = r25
                r25 = r26
                r26 = r27
                r27 = r28
                r29 = r30
                r30 = r31
                r31 = r32
                r32 = r33
                r33 = r34
                r34 = r35
                r35 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            L_0x0136:
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r3 = r0.f20671e
                bi.h r3 = r3.y1()
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                java.lang.String r1 = r2.t(r1)
                java.lang.String r1 = r1.toString()
                r3.u(r4, r1)
                goto L_0x021c
            L_0x014b:
                i7.d r2 = new i7.d
                r2.<init>()
                com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePayReq r15 = new com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePayReq
                java.lang.String r5 = "M"
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.Data r4 = r46.getData()
                if (r4 == 0) goto L_0x015f
                java.lang.String r4 = r4.getApplNo()
                goto L_0x0160
            L_0x015f:
                r4 = r3
            L_0x0160:
                java.lang.String r6 = java.lang.String.valueOf(r4)
                r7 = 0
                r8 = 22
                r9 = 0
                java.lang.String r10 = ""
                java.lang.String r11 = ""
                r12 = 0
                r13 = 0
                r14 = 0
                java.lang.String r16 = ""
                r17 = 1
                java.lang.String r18 = ""
                java.lang.String r19 = ""
                r20 = 0
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                java.lang.String r21 = r4.s1()
                v9.d$a r4 = v9.d.f17494a
                java.lang.String r22 = r4.m()
                java.lang.String r23 = ""
                java.lang.String r24 = ""
                java.lang.String r25 = "48"
                java.lang.String r26 = ""
                java.lang.String r27 = ""
                r28 = 0
                r30 = 0
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                java.lang.String r31 = r4.u1()
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r4 = r4.v1()
                java.lang.String r4 = r4.getState_cd()
                java.lang.String r32 = java.lang.String.valueOf(r4)
                java.lang.String r33 = ""
                java.lang.String r34 = ""
                java.lang.String r35 = ""
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r4 = r0.f20671e
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r4 = r4.v1()
                java.lang.String r4 = r4.getRc_vh_class_cd()
                if (r4 == 0) goto L_0x01c1
                int r3 = java.lang.Integer.parseInt(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            L_0x01c1:
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                java.lang.String r42 = r1.a()
                r43 = 0
                r4 = r15
                r1 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                r19 = r20
                r20 = r21
                r21 = r22
                r22 = r23
                r23 = r24
                r24 = r25
                r25 = r26
                r26 = r27
                r27 = r28
                r29 = r30
                r30 = r31
                r31 = r32
                r32 = r33
                r33 = r34
                r34 = r35
                r35 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
                goto L_0x0136
            L_0x0202:
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r1 = r0.f20671e
                android.app.ProgressDialog r1 = r1.t1()
                r1.dismiss()
                com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r1 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment r2 = r0.f20671e
                com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.ApiMessage r4 = r46.getApiMessage()
                if (r4 == 0) goto L_0x0219
                java.lang.String r3 = r4.getDeveloperMessage()
            L_0x0219:
                r1.K(r2, r3)
            L_0x021c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment.a.b(com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPResponseModel):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MFPResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MiscellaneousFeePayment f20672e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MiscellaneousFeePayment miscellaneousFeePayment) {
            super(1);
            this.f20672e = miscellaneousFeePayment;
        }

        public final void b(String str) {
            this.f20672e.t1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MiscellaneousFeePayment f20673e;

        c(MiscellaneousFeePayment miscellaneousFeePayment) {
            this.f20673e = miscellaneousFeePayment;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            double d10;
            MiscellaneousFeePayment miscellaneousFeePayment;
            MiscellaneousFeePayment miscellaneousFeePayment2;
            if (this.f20673e.m1().f25864c.getText().toString().length() <= 0 || this.f20673e.m1().f25866e.getText().toString().length() <= 0) {
                d10 = 0.0d;
                if (this.f20673e.m1().f25864c.getText().toString().length() != 0 || this.f20673e.m1().f25866e.getText().toString().length() <= 0) {
                    if (this.f20673e.m1().f25864c.getText().toString().length() == 0 && this.f20673e.m1().f25866e.getText().toString().length() == 0) {
                        this.f20673e.I1(0.0d);
                    } else if (this.f20673e.m1().f25864c.getText().toString().length() > 0 && this.f20673e.m1().f25866e.getText().toString().length() == 0) {
                        MiscellaneousFeePayment miscellaneousFeePayment3 = this.f20673e;
                        miscellaneousFeePayment3.I1(Double.parseDouble(miscellaneousFeePayment3.m1().f25864c.getText().toString()));
                    } else {
                        return;
                    }
                    miscellaneousFeePayment = this.f20673e;
                    miscellaneousFeePayment.J1(d10);
                    MiscellaneousFeePayment miscellaneousFeePayment4 = this.f20673e;
                    miscellaneousFeePayment4.S1(miscellaneousFeePayment4.n1() + this.f20673e.o1());
                    this.f20673e.m1().f25871j.setText(String.valueOf(this.f20673e.x1()));
                }
                miscellaneousFeePayment2 = this.f20673e;
            } else {
                miscellaneousFeePayment2 = this.f20673e;
                d10 = Double.parseDouble(miscellaneousFeePayment2.m1().f25864c.getText().toString());
            }
            miscellaneousFeePayment2.I1(d10);
            miscellaneousFeePayment = this.f20673e;
            d10 = Double.parseDouble(miscellaneousFeePayment.m1().f25866e.getText().toString());
            miscellaneousFeePayment.J1(d10);
            MiscellaneousFeePayment miscellaneousFeePayment42 = this.f20673e;
            miscellaneousFeePayment42.S1(miscellaneousFeePayment42.n1() + this.f20673e.o1());
            this.f20673e.m1().f25871j.setText(String.valueOf(this.f20673e.x1()));
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MiscellaneousFeePayment f20674e;

        d(MiscellaneousFeePayment miscellaneousFeePayment) {
            this.f20674e = miscellaneousFeePayment;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            double d10;
            MiscellaneousFeePayment miscellaneousFeePayment;
            MiscellaneousFeePayment miscellaneousFeePayment2;
            if (this.f20674e.m1().f25866e.getText().toString().length() <= 0 || this.f20674e.m1().f25864c.getText().toString().length() <= 0) {
                d10 = 0.0d;
                if (this.f20674e.m1().f25864c.getText().toString().length() > 0 && this.f20674e.m1().f25866e.getText().toString().length() == 0) {
                    MiscellaneousFeePayment miscellaneousFeePayment3 = this.f20674e;
                    miscellaneousFeePayment3.I1(Double.parseDouble(miscellaneousFeePayment3.m1().f25864c.getText().toString()));
                } else if (this.f20674e.m1().f25864c.getText().toString().length() == 0 && this.f20674e.m1().f25866e.getText().toString().length() == 0) {
                    this.f20674e.I1(0.0d);
                } else if (this.f20674e.m1().f25864c.getText().toString().length() == 0 && this.f20674e.m1().f25866e.getText().toString().length() > 0) {
                    miscellaneousFeePayment = this.f20674e;
                } else {
                    return;
                }
                miscellaneousFeePayment2 = this.f20674e;
                miscellaneousFeePayment2.J1(d10);
                MiscellaneousFeePayment miscellaneousFeePayment4 = this.f20674e;
                miscellaneousFeePayment4.S1(miscellaneousFeePayment4.n1() + this.f20674e.o1());
                this.f20674e.m1().f25871j.setText(String.valueOf(this.f20674e.x1()));
            }
            miscellaneousFeePayment = this.f20674e;
            d10 = Double.parseDouble(miscellaneousFeePayment.m1().f25864c.getText().toString());
            miscellaneousFeePayment.I1(d10);
            miscellaneousFeePayment2 = this.f20674e;
            d10 = Double.parseDouble(miscellaneousFeePayment2.m1().f25866e.getText().toString());
            miscellaneousFeePayment2.J1(d10);
            MiscellaneousFeePayment miscellaneousFeePayment42 = this.f20674e;
            miscellaneousFeePayment42.S1(miscellaneousFeePayment42.n1() + this.f20674e.o1());
            this.f20674e.m1().f25871j.setText(String.valueOf(this.f20674e.x1()));
        }
    }

    static final class e implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20675a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f20675a = lVar;
        }

        public final pl.c a() {
            return this.f20675a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20675a.invoke(obj);
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
    public static final void A1(MiscellaneousFeePayment miscellaneousFeePayment, View view) {
        cm.l.f(miscellaneousFeePayment, "this$0");
        VUtility.Companion.v(miscellaneousFeePayment, miscellaneousFeePayment.p1().b("are_you_sure_you_want_to_leave", miscellaneousFeePayment.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void B1(MiscellaneousFeePayment miscellaneousFeePayment, View view) {
        cm.l.f(miscellaneousFeePayment, "this$0");
        Intent intent = new Intent(miscellaneousFeePayment, VahanVehicleDetailsService.class);
        intent.putExtra("RC", miscellaneousFeePayment.u1());
        intent.putExtra("RcDetails", miscellaneousFeePayment.v1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, miscellaneousFeePayment.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, miscellaneousFeePayment.l1());
        intent.putExtra(VContant.NEXGEN_addahar_address, miscellaneousFeePayment.k1());
        miscellaneousFeePayment.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C1(MiscellaneousFeePayment miscellaneousFeePayment, View view) {
        ld.c p12;
        String string;
        String str;
        cm.l.f(miscellaneousFeePayment, "this$0");
        if (miscellaneousFeePayment.m1().f25864c.getText().length() < 2) {
            p12 = miscellaneousFeePayment.p1();
            string = miscellaneousFeePayment.getString(R.string.please_enter_fee_amount);
            str = "please_enter_fee_amount";
        } else if (miscellaneousFeePayment.m1().f25866e.getText().length() < 2) {
            p12 = miscellaneousFeePayment.p1();
            string = miscellaneousFeePayment.getString(R.string.please_enter_fine_amount);
            str = "please_enter_fine_amount";
        } else if (miscellaneousFeePayment.m1().f25871j.getText().length() < 2) {
            p12 = miscellaneousFeePayment.p1();
            string = miscellaneousFeePayment.getString(R.string.please_enter_total_amount);
            str = "please_enter_total_amount";
        } else {
            try {
                miscellaneousFeePayment.t1().show();
                miscellaneousFeePayment.r1().i(new MFPRequestModel("", Double.parseDouble(miscellaneousFeePayment.m1().f25871j.getText().toString()), Integer.parseInt(miscellaneousFeePayment.s1()), Integer.parseInt(VContant.MISELL_PURPOSE_CODE), miscellaneousFeePayment.u1(), String.valueOf(miscellaneousFeePayment.v1().getState_cd())));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        Toast.makeText(miscellaneousFeePayment, p12.b(str, string), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void D1(MiscellaneousFeePayment miscellaneousFeePayment, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        cm.l.f(miscellaneousFeePayment, "this$0");
        miscellaneousFeePayment.t1().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl != null && returnUrl.length() != 0) {
            try {
                Intent intent = new Intent(miscellaneousFeePayment, ComPaymentTaxActivity.class);
                intent.putExtra("url", paymentBeforeUrlResponse.getReturnUrl());
                intent.putExtra("ServiceName", "Miscellaneous Fee Payment");
                miscellaneousFeePayment.startActivity(intent);
                miscellaneousFeePayment.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(MiscellaneousFeePayment miscellaneousFeePayment, String str) {
        cm.l.f(miscellaneousFeePayment, "this$0");
        miscellaneousFeePayment.t1().dismiss();
        if (str.equals("Error")) {
            VContant.Companion.K(miscellaneousFeePayment, miscellaneousFeePayment.getString(R.string.service_unavable_please_try));
        } else {
            VContant.Companion.K(miscellaneousFeePayment, str);
        }
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void H1(d6 d6Var) {
        cm.l.f(d6Var, "<set-?>");
        this.G = d6Var;
    }

    public final void I1(double d10) {
        this.T = d10;
    }

    public final void J1(double d10) {
        this.U = d10;
    }

    public final void K1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void L1(MFPService mFPService) {
        cm.l.f(mFPService, "<set-?>");
        this.I = mFPService;
    }

    public final void M1(uf.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void O1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void P1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Q1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.O = nrvDetails;
    }

    public final void R1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.M = vahanProService;
    }

    public final void S1(double d10) {
        this.V = d10;
    }

    public final void T1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.J = hVar;
    }

    public final String k1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String l1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final d6 m1() {
        d6 d6Var = this.G;
        if (d6Var != null) {
            return d6Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final double n1() {
        return this.T;
    }

    public final double o1() {
        return this.U;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d6 c10 = d6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        H1(c10);
        setContentView((View) m1().b());
        L1(MFPService.f20668a.b(this));
        K1(new ld.c(this));
        O1(new ProgressDialog(this));
        t1().setMessage(p1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        v9.e.f17509a.m1(this, m1());
        N1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        P1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Q1((NrvDetails) serializableExtra);
        R1(VahanProService.f21196b.b(this));
        Class<h> cls = h.class;
        T1((h) new u0((x0) this, (u0.b) new g(new wg.d(w1()))).a(cls));
        m1().f25870i.f28308i.setText(VContant.Companion.l(this, new ld.h(this)));
        m1().f25870i.f28305f.setOnClickListener(new rf.a(this));
        TextView textView = m1().f25873l;
        textView.setText(p1().b("vehicle_no", "Vehicle No.:") + ' ' + u1());
        m1().f25874m.setText(p1().b("view_vehicle_details", "View Vehicle Details"));
        m1().f25874m.setPaintFlags(m1().f25874m.getPaintFlags() | 8);
        m1().f25874m.setOnClickListener(new rf.b(this));
        M1((uf.a) new u0((x0) this, (u0.b) new tf.a(new sf.a(q1()))).a(uf.a.class));
        T1((h) new u0((x0) this, (u0.b) new g(new wg.d(w1()))).a(cls));
        m1().f25863b.setOnClickListener(new rf.c(this));
        r1().h().g(this, new e(new a(this)));
        r1().g().g(this, new e(new b(this)));
        y1().y0().g(this, new rf.d(this));
        y1().z0().g(this, new rf.e(this));
        m1().f25864c.addTextChangedListener(new c(this));
        m1().f25866e.addTextChangedListener(new d(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        cm.l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final ld.c p1() {
        ld.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final MFPService q1() {
        MFPService mFPService = this.I;
        if (mFPService != null) {
            return mFPService;
        }
        cm.l.v("mfpSaveToDraftService");
        return null;
    }

    public final uf.a r1() {
        uf.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mfpSaveToDraftViewModel");
        return null;
    }

    public final String s1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.O;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.M;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final double x1() {
        return this.V;
    }

    public final h y1() {
        h hVar = this.J;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean z1() {
        return this.S;
    }
}
