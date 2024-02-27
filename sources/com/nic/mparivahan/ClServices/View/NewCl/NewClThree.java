package com.nic.mparivahan.ClServices.View.NewCl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.NewClPojo;
import com.nic.mparivahan.R;
import java.util.Calendar;
import ld.c;
import ld.f;
import ni.l6;
import pl.x;
import q9.p;
import q9.q;
import q9.r;
import q9.s;
import q9.t;
import v9.e;

public final class NewClThree extends d {
    public l6 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    public f K;
    public String L;
    private String M = "";
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
    public String f7958a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f7959b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f7960c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f7961d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f7962e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f7963f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f7964g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f7965h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f7966i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f7967j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f7968k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f7969l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f7970m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f7971n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f7972o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f7973p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f7974q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f7975r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f7976s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f7977t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f7978u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f7979v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f7980w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    public t9.a f7981x0;

    /* renamed from: y0  reason: collision with root package name */
    public ClInter f7982y0;

    /* renamed from: z0  reason: collision with root package name */
    private Calendar f7983z0 = Calendar.getInstance();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewClThree f7984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NewClThree newClThree) {
            super(1);
            this.f7984e = newClThree;
        }

        public final void b(NewClPojo newClPojo) {
            NewClThree newClThree;
            c F1;
            this.f7984e.y1().dismiss();
            try {
                if (p.o(newClPojo.getStatus_code(), "00", true)) {
                    String applicationNo = newClPojo.getNewCLAcknowledgement().get(0).getApplicationNo();
                    if (applicationNo != null) {
                        if (applicationNo.length() != 0) {
                            Intent intent = new Intent(this.f7984e, NewClSubmitScreen.class);
                            intent.putExtra("appNumber", newClPojo.getNewCLAcknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", newClPojo.getNewCLAcknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dobValue", this.f7984e.l1());
                            intent.putExtra("fatherName", newClPojo.getNewCLAcknowledgement().get(0).getFatherName());
                            intent.putExtra("clName", this.f7984e.p1() + ' ' + this.f7984e.r1() + ' ' + this.f7984e.q1());
                            intent.putExtra("stateCode", this.f7984e.G1());
                            intent.putExtra("rtoCode", this.f7984e.C1());
                            intent.putExtra("rtoName", this.f7984e.D1());
                            intent.putExtra("Mobile_no", this.f7984e.s1());
                            this.f7984e.startActivity(intent);
                            return;
                        }
                    }
                    newClThree = this.f7984e;
                    F1 = newClThree.F1();
                } else if (p.o(newClPojo.getStatus_code(), "01", true)) {
                    this.f7984e.O1(newClPojo.getStatus_desc());
                    return;
                } else {
                    newClThree = this.f7984e;
                    F1 = newClThree.F1();
                }
                newClThree.O1(F1.b("service_is_not_present", "Something went wrong, Try after some time"));
            } catch (Exception unused) {
                NewClThree newClThree2 = this.f7984e;
                newClThree2.O1(newClThree2.F1().b("service_is_not_present", "Something went wrong, Try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((NewClPojo) obj);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7985a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f7985a = lVar;
        }

        public final pl.c a() {
            return this.f7985a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7985a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void H1() {
        e2(this);
        o2(new c(x1()));
        n2(new f(x1()));
        h2(new ProgressDialog(x1()));
        y1().setMessage(F1().b("label_challan_please_wait", getString(R.string.please_wait)));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        u1().H.f25961g.setText(E1().i());
        d2(ClInter.f7830a.a(x1()));
        c2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(w1()))).a(t9.a.class));
        p2(String.valueOf(getIntent().getStringExtra("state_code")));
        l2(String.valueOf(getIntent().getStringExtra("rto_code")));
        m2(String.valueOf(getIntent().getStringExtra("rto_name")));
        W1(String.valueOf(getIntent().getStringExtra("clFirstName")));
        if (p.p(getIntent().getStringExtra("clMiddleName"), "", false, 2, (Object) null)) {
            this.M = "";
        } else {
            this.M = String.valueOf(getIntent().getStringExtra("clMiddleName"));
        }
        X1(String.valueOf(getIntent().getStringExtra("clLastName")));
        a2(String.valueOf(getIntent().getStringExtra("clRelation")));
        i2(String.valueOf(getIntent().getStringExtra("relFirstName")));
        k2(String.valueOf(getIntent().getStringExtra("relMiddleName")));
        j2(String.valueOf(getIntent().getStringExtra("relLastName")));
        Q1(String.valueOf(getIntent().getStringExtra("appDob")));
        U1(String.valueOf(getIntent().getStringExtra("clEdu")));
        T1(String.valueOf(getIntent().getStringExtra("clBlood")));
        Z1(String.valueOf(getIntent().getStringExtra("clPhone")));
        V1(String.valueOf(getIntent().getStringExtra("clEmail")));
        Y1(String.valueOf(getIntent().getStringExtra("clMobile")));
        S1(String.valueOf(getIntent().getStringExtra("clAlterMobile")));
        f2(String.valueOf(getIntent().getStringExtra("mark1")));
        g2(String.valueOf(getIntent().getStringExtra("mark2")));
        R1(String.valueOf(getIntent().getStringExtra("appGender")));
        this.f7971n0 = String.valueOf(getIntent().getStringExtra("presHouseNo"));
        this.f7972o0 = String.valueOf(getIntent().getStringExtra("presStreet"));
        this.f7973p0 = String.valueOf(getIntent().getStringExtra("presLocation"));
        this.f7974q0 = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
        this.f7975r0 = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
        this.f7976s0 = String.valueOf(getIntent().getStringExtra("presDistrict"));
        this.f7977t0 = String.valueOf(getIntent().getStringExtra("presState"));
        this.f7978u0 = String.valueOf(getIntent().getStringExtra("presPincode"));
        this.f7963f0 = String.valueOf(getIntent().getStringExtra("perHouseNo"));
        this.f7964g0 = String.valueOf(getIntent().getStringExtra("perStreet"));
        this.f7965h0 = String.valueOf(getIntent().getStringExtra("perLocation"));
        this.f7966i0 = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
        this.f7967j0 = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
        this.f7968k0 = String.valueOf(getIntent().getStringExtra("perDistrict"));
        this.f7969l0 = String.valueOf(getIntent().getStringExtra("perState"));
        this.f7970m0 = String.valueOf(getIntent().getStringExtra("perPinCode"));
        this.f7979v0 = String.valueOf(getIntent().getStringExtra("presVillageOrTownName"));
        this.f7980w0 = String.valueOf(getIntent().getStringExtra("permVillageOrTownName"));
    }

    private final boolean I1() {
        c F1;
        String string;
        String str;
        Editable text = u1().C.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            F1 = F1();
            string = getString(R.string.enter_institute_name);
            str = "enter_institute_name";
        } else if (u1().C.getText().length() < 3) {
            F1 = F1();
            string = getString(R.string.enter_valid_institute_name);
            str = "enter_valid_institute_name";
        } else {
            Editable text2 = u1().f27274y.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                F1 = F1();
                string = getString(R.string.enter_certificate_number);
                str = "enter_certificate_number";
            } else if (u1().f27274y.getText().length() < 3) {
                F1 = F1();
                string = getString(R.string.enter_valid_certificate_name);
                str = "enter_valid_certificate_name";
            } else {
                Editable text3 = u1().E.getText();
                cm.l.e(text3, "getText(...)");
                if (text3.length() == 0) {
                    F1 = F1();
                    string = getString(R.string.place_of_issue);
                    str = "place_of_issue";
                } else if (u1().E.getText().length() < 3) {
                    F1 = F1();
                    string = getString(R.string.valid_place_of_issue);
                    str = "valid_place_of_issue";
                } else {
                    CharSequence text4 = u1().G.getText();
                    cm.l.e(text4, "getText(...)");
                    if (text4.length() == 0) {
                        F1 = F1();
                        string = getString(R.string.enter_issue_date);
                        str = "enter_issue_date";
                    } else {
                        Editable text5 = u1().D.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() == 0) {
                            F1 = F1();
                            string = getString(R.string.enter_certification_no);
                            str = "enter_certification_no";
                        } else if (u1().D.getText().length() < 3) {
                            F1 = F1();
                            string = getString(R.string.valid_cert_number);
                            str = "valid_cert_number";
                        } else {
                            Editable text6 = u1().A.getText();
                            cm.l.e(text6, "getText(...)");
                            if (text6.length() == 0) {
                                F1 = F1();
                                string = getString(R.string.enter_doctor_name);
                                str = "enter_doctor_name";
                            } else if (u1().A.getText().length() < 3) {
                                F1 = F1();
                                string = getString(R.string.valid_enter_doctor_name);
                                str = "valid_enter_doctor_name";
                            } else {
                                Editable text7 = u1().f27275z.getText();
                                cm.l.e(text7, "getText(...)");
                                if (text7.length() == 0) {
                                    F1 = F1();
                                    string = getString(R.string.clinic_name);
                                    str = "clinic_name";
                                } else if (u1().f27275z.getText().length() < 3) {
                                    F1 = F1();
                                    string = getString(R.string.valid_clinic_name);
                                    str = "valid_clinic_name";
                                } else if (u1().f27273x.isChecked()) {
                                    return true;
                                } else {
                                    F1 = F1();
                                    string = getString(R.string.confirm_declaration);
                                    str = "confirm_declaration";
                                }
                            }
                        }
                    }
                }
            }
        }
        Toast.makeText(this, F1.b(str, string), 0).show();
        return false;
    }

    private final void J1() {
        u1().G.setOnClickListener(new s(this, new r(this)));
        u1().f27272w.setOnClickListener(new t(this));
    }

    /* access modifiers changed from: private */
    public static final void K1(NewClThree newClThree, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(newClThree, "this$0");
        newClThree.f7983z0.set(1, i10);
        newClThree.f7983z0.set(2, i11);
        newClThree.f7983z0.set(5, i12);
        CharSequence format = DateFormat.format("dd", newClThree.f7983z0.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", newClThree.f7983z0.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", newClThree.f7983z0.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        TextView textView = newClThree.u1().G;
        textView.setText(((String) format) + '-' + ((String) format2) + '-' + ((String) format3));
    }

    /* access modifiers changed from: private */
    public static final void L1(NewClThree newClThree, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(newClThree, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(newClThree, onDateSetListener, newClThree.f7983z0.get(1), newClThree.f7983z0.get(2), newClThree.f7983z0.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void M1(NewClThree newClThree, View view) {
        NewClThree newClThree2 = newClThree;
        cm.l.f(newClThree2, "this$0");
        if (newClThree.I1()) {
            try {
                newClThree.y1().show();
                t9.a v12 = newClThree.v1();
                String G1 = newClThree.G1();
                String C1 = newClThree.C1();
                String str = newClThree2.f7977t0;
                cm.l.c(str);
                String str2 = newClThree2.f7969l0;
                cm.l.c(str2);
                String str3 = newClThree2.f7976s0;
                cm.l.c(str3);
                String str4 = newClThree2.f7968k0;
                cm.l.c(str4);
                String str5 = newClThree2.f7975r0;
                cm.l.c(str5);
                String str6 = newClThree2.f7967j0;
                cm.l.c(str6);
                String str7 = newClThree2.f7971n0;
                cm.l.c(str7);
                String str8 = newClThree2.f7963f0;
                cm.l.c(str8);
                String str9 = newClThree2.f7972o0;
                cm.l.c(str9);
                String str10 = newClThree2.f7964g0;
                cm.l.c(str10);
                String str11 = newClThree2.f7978u0;
                cm.l.c(str11);
                String str12 = newClThree2.f7970m0;
                cm.l.c(str12);
                String str13 = str12;
                String str14 = newClThree2.f7974q0;
                cm.l.c(str14);
                String str15 = str14;
                String str16 = newClThree2.f7966i0;
                cm.l.c(str16);
                String str17 = str16;
                String str18 = newClThree2.f7979v0;
                cm.l.c(str18);
                String str19 = str18;
                String str20 = newClThree2.f7980w0;
                cm.l.c(str20);
                String p12 = newClThree.p1();
                String str21 = str20;
                String str22 = newClThree2.M;
                String str23 = str22;
                v12.u(newClThree, G1, C1, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str13, str15, str17, str19, str21, p12, str23, newClThree.q1(), newClThree.t1(), newClThree.z1(), newClThree.B1(), newClThree.A1(), newClThree.m1(), newClThree.l1(), newClThree.o1(), newClThree.n1(), newClThree.s1());
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void N1(NewClThree newClThree, View view) {
        cm.l.f(newClThree, "this$0");
        newClThree.finish();
    }

    /* access modifiers changed from: private */
    public final void O1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new q(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void P1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String A1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("relLastName");
        return null;
    }

    public final String B1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("relMiddleName");
        return null;
    }

    public final String C1() {
        String str = this.f7961d0;
        if (str != null) {
            return str;
        }
        cm.l.v("rto_code");
        return null;
    }

    public final String D1() {
        String str = this.f7962e0;
        if (str != null) {
            return str;
        }
        cm.l.v("rto_name");
        return null;
    }

    public final f E1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final c F1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String G1() {
        String str = this.f7960c0;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void b2(l6 l6Var) {
        cm.l.f(l6Var, "<set-?>");
        this.G = l6Var;
    }

    public final void c2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.f7981x0 = aVar;
    }

    public final void d2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.f7982y0 = clInter;
    }

    public final void e2(Context context) {
        cm.l.f(context, "<set-?>");
        this.H = context;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.f7958a0 = str;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.f7959b0 = str;
    }

    public final void h2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void i2(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void j2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void k2(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String l1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("appDob");
        return null;
    }

    public final void l2(String str) {
        cm.l.f(str, "<set-?>");
        this.f7961d0 = str;
    }

    public final String m1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("appGender");
        return null;
    }

    public final void m2(String str) {
        cm.l.f(str, "<set-?>");
        this.f7962e0 = str;
    }

    public final String n1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("clBlood");
        return null;
    }

    public final void n2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final String o1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("clEdu");
        return null;
    }

    public final void o2(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l6 x10 = l6.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        b2(x10);
        setContentView(u1().m());
        H1();
        J1();
        e.f17509a.t1(this, u1());
        v1().r().g(this, new b(new a(this)));
        u1().H.f25959e.setOnClickListener(new p(this));
    }

    public final String p1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("clFirstName");
        return null;
    }

    public final void p2(String str) {
        cm.l.f(str, "<set-?>");
        this.f7960c0 = str;
    }

    public final String q1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("clLastName");
        return null;
    }

    public final String r1() {
        return this.M;
    }

    public final String s1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("clMobile");
        return null;
    }

    public final String t1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("clRelation");
        return null;
    }

    public final l6 u1() {
        l6 l6Var = this.G;
        if (l6Var != null) {
            return l6Var;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final t9.a v1() {
        t9.a aVar = this.f7981x0;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mClDlViewModel");
        return null;
    }

    public final ClInter w1() {
        ClInter clInter = this.f7982y0;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final Context x1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String z1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("relFirstName");
        return null;
    }
}
