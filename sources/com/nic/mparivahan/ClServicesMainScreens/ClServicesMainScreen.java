package com.nic.mparivahan.ClServicesMainScreens;

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
import androidx.databinding.h;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import ld.c;
import ld.f;
import ni.a1;
import t9.a;
import u9.a0;
import u9.b0;
import u9.w;
import u9.x;
import u9.y;
import u9.z;
import v9.e;

public final class ClServicesMainScreen extends d {
    private a1 G;
    public Context H;
    public ProgressDialog I;
    public c J;
    public f K;
    public a L;
    public ClInter M;
    private Calendar N = Calendar.getInstance();

    /* access modifiers changed from: private */
    public static final void A1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void l1() {
    }

    private final void s1() {
        B1(new c(p1()));
        G1(new f(p1()));
        F1(new ProgressDialog(this));
        q1().setMessage(n1().b("label_challan_please_wait", getString(R.string.please_wait)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        a1 a1Var = this.G;
        if (a1Var == null) {
            l.v("clServiceBinding");
            a1Var = null;
        }
        a1Var.F.setText(r1().i());
        D1(ClInter.f7830a.a(p1()));
        C1((a) new u0((x0) this, (u0.b) new m9.a(new n9.a(o1()))).a(a.class));
    }

    private final void t1() {
        x xVar = new x(this);
        a1 a1Var = this.G;
        a1 a1Var2 = null;
        if (a1Var == null) {
            l.v("clServiceBinding");
            a1Var = null;
        }
        a1Var.B.setOnClickListener(new y(this, xVar));
        a1 a1Var3 = this.G;
        if (a1Var3 == null) {
            l.v("clServiceBinding");
            a1Var3 = null;
        }
        a1Var3.f25172x.setOnClickListener(new z(this));
        a1 a1Var4 = this.G;
        if (a1Var4 == null) {
            l.v("clServiceBinding");
        } else {
            a1Var2 = a1Var4;
        }
        a1Var2.f25173y.setOnClickListener(new a0(this));
    }

    /* access modifiers changed from: private */
    public static final void u1(ClServicesMainScreen clServicesMainScreen, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(clServicesMainScreen, "this$0");
        clServicesMainScreen.N.set(1, i10);
        clServicesMainScreen.N.set(2, i11);
        clServicesMainScreen.N.set(5, i12);
        CharSequence format = DateFormat.format("dd", clServicesMainScreen.N.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", clServicesMainScreen.N.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", clServicesMainScreen.N.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        a1 a1Var = clServicesMainScreen.G;
        if (a1Var == null) {
            l.v("clServiceBinding");
            a1Var = null;
        }
        TextView textView = a1Var.B;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void v1(ClServicesMainScreen clServicesMainScreen, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(clServicesMainScreen, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(clServicesMainScreen, onDateSetListener, clServicesMainScreen.N.get(1), clServicesMainScreen.N.get(2), clServicesMainScreen.N.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void w1(ClServicesMainScreen clServicesMainScreen, View view) {
        l.f(clServicesMainScreen, "this$0");
        a1 a1Var = clServicesMainScreen.G;
        a1 a1Var2 = null;
        if (a1Var == null) {
            l.v("clServiceBinding");
            a1Var = null;
        }
        a1Var.A.setText("");
        a1 a1Var3 = clServicesMainScreen.G;
        if (a1Var3 == null) {
            l.v("clServiceBinding");
        } else {
            a1Var2 = a1Var3;
        }
        a1Var2.B.setText("");
    }

    /* access modifiers changed from: private */
    public static final void x1(ClServicesMainScreen clServicesMainScreen, View view) {
        c n12;
        String string;
        String str;
        l.f(clServicesMainScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(clServicesMainScreen)) {
            a1 a1Var = clServicesMainScreen.G;
            a1 a1Var2 = null;
            if (a1Var == null) {
                l.v("clServiceBinding");
                a1Var = null;
            }
            Editable text = a1Var.A.getText();
            l.e(text, "getText(...)");
            if (text.length() == 0) {
                n12 = clServicesMainScreen.n1();
                string = clServicesMainScreen.getString(R.string.pls_enter_conductor_driving_license_number);
                str = "pls_enter_con_lic_number";
            } else {
                a1 a1Var3 = clServicesMainScreen.G;
                if (a1Var3 == null) {
                    l.v("clServiceBinding");
                    a1Var3 = null;
                }
                if (a1Var3.A.getText().length() < 10) {
                    n12 = clServicesMainScreen.n1();
                    string = clServicesMainScreen.getString(R.string.validate_message_dl);
                    str = "dl_validation_msg";
                } else {
                    a1 a1Var4 = clServicesMainScreen.G;
                    if (a1Var4 == null) {
                        l.v("clServiceBinding");
                        a1Var4 = null;
                    }
                    CharSequence text2 = a1Var4.B.getText();
                    l.e(text2, "getText(...)");
                    if (text2.length() == 0) {
                        n12 = clServicesMainScreen.n1();
                        string = clServicesMainScreen.getString(R.string.please_enter_bd);
                        str = "please_enter_bd";
                    } else {
                        Intent intent = new Intent(clServicesMainScreen, ClDetails.class);
                        a1 a1Var5 = clServicesMainScreen.G;
                        if (a1Var5 == null) {
                            l.v("clServiceBinding");
                            a1Var5 = null;
                        }
                        intent.putExtra("dlValue", q.B0(a1Var5.A.getText().toString()).toString());
                        a1 a1Var6 = clServicesMainScreen.G;
                        if (a1Var6 == null) {
                            l.v("clServiceBinding");
                        } else {
                            a1Var2 = a1Var6;
                        }
                        intent.putExtra("dobValue", clServicesMainScreen.m1(a1Var2.B.getText().toString()));
                        clServicesMainScreen.startActivity(intent);
                        return;
                    }
                }
            }
            clServicesMainScreen.z1(n12.b(str, string));
            return;
        }
        Toast.makeText(clServicesMainScreen.p1(), clServicesMainScreen.n1().b("label_log_check_internet", clServicesMainScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void y1(ClServicesMainScreen clServicesMainScreen, View view) {
        l.f(clServicesMainScreen, "this$0");
        clServicesMainScreen.finish();
    }

    private final void z1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(n1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n1().b("btn_ok", "OK"));
        textView.setOnClickListener(new b0(dialog));
        dialog.show();
    }

    public final void B1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void C1(a aVar) {
        l.f(aVar, "<set-?>");
        this.L = aVar;
    }

    public final void D1(ClInter clInter) {
        l.f(clInter, "<set-?>");
        this.M = clInter;
    }

    public final void E1(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    public final void F1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void G1(f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final String m1(String str) {
        l.f(str, "date");
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(str));
            l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return m1(str);
        }
    }

    public final c n1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final ClInter o1() {
        ClInter clInter = this.M;
        if (clInter != null) {
            return clInter;
        }
        l.v("mClInter");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E1(this);
        h f10 = androidx.databinding.f.f(this, R.layout.activity_cl_services_ms);
        l.e(f10, "setContentView(...)");
        this.G = (a1) f10;
        s1();
        t1();
        l1();
        e.a aVar = e.f17509a;
        a1 a1Var = this.G;
        a1 a1Var2 = null;
        if (a1Var == null) {
            l.v("clServiceBinding");
            a1Var = null;
        }
        aVar.d0(this, a1Var);
        a1 a1Var3 = this.G;
        if (a1Var3 == null) {
            l.v("clServiceBinding");
        } else {
            a1Var2 = a1Var3;
        }
        a1Var2.D.setOnClickListener(new w(this));
    }

    public final Context p1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final f r1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }
}
