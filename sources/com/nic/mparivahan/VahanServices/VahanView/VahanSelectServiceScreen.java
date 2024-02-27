package com.nic.mparivahan.VahanServices.VahanView;

import ai.a6;
import ai.b6;
import ai.c6;
import ai.d5;
import ai.d6;
import ai.e5;
import ai.f5;
import ai.g5;
import ai.h5;
import ai.i5;
import ai.j5;
import ai.k5;
import ai.l5;
import ai.m5;
import ai.n5;
import ai.o5;
import ai.p5;
import ai.q5;
import ai.r5;
import ai.s5;
import ai.t5;
import ai.u5;
import ai.v5;
import ai.w5;
import ai.x5;
import ai.y5;
import ai.z5;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.EgblityStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import km.f;
import ni.e9;
import v9.e;

public final class VahanSelectServiceScreen extends d {
    public e9 G;
    public String H;
    public NrvDetails I;
    public ProgressDialog J;
    public h K;
    public VahanProService L;
    public ld.h M;
    private String N = "0";
    private String O = "0";
    private HashMap P = new HashMap();
    public String Q;
    private String R = "0";

    /* access modifiers changed from: private */
    public static final void C2(Dialog dialog, VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(dialog, "$d");
        l.f(vahanSelectServiceScreen, "this$0");
        dialog.dismiss();
        vahanSelectServiceScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(dialog, "$d");
        l.f(vahanSelectServiceScreen, "this$0");
        dialog.dismiss();
        vahanSelectServiceScreen.R1().show();
        vahanSelectServiceScreen.W1().i(vahanSelectServiceScreen, String.valueOf(vahanSelectServiceScreen.T1().getState_cd()));
    }

    /* access modifiers changed from: private */
    public static final void M1(Dialog dialog, Context context, String str, VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(dialog, "$d");
        l.f(context, "$context");
        l.f(str, "$rc_number");
        l.f(vahanSelectServiceScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, VahanProcessWithAdhar.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", vahanSelectServiceScreen.P);
        intent.putExtra("RcDetails", vahanSelectServiceScreen.T1());
        intent.putExtra("off_code", vahanSelectServiceScreen.R);
        context.startActivity(intent);
        vahanSelectServiceScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, Context context, String str, VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(dialog, "$d");
        l.f(context, "$context");
        l.f(str, "$rc_number");
        l.f(vahanSelectServiceScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, VahanGenerateOTPScreen.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", vahanSelectServiceScreen.P);
        intent.putExtra("Mobile_no", vahanSelectServiceScreen.Q1());
        intent.putExtra("RcDetails", vahanSelectServiceScreen.T1());
        intent.putExtra("off_code", vahanSelectServiceScreen.R);
        context.startActivity(intent);
        vahanSelectServiceScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void X1(VahanSelectServiceScreen vahanSelectServiceScreen, String str) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (str != null) {
            try {
                if (str.length() != 0) {
                    vahanSelectServiceScreen.R = vahanSelectServiceScreen.T1().getRc_off_cd();
                    vahanSelectServiceScreen.P1().f26111p.setText(String.valueOf(vahanSelectServiceScreen.T1().getRc_c_state()));
                    vahanSelectServiceScreen.t2(str.toString());
                    vahanSelectServiceScreen.W1().L(vahanSelectServiceScreen, vahanSelectServiceScreen.S1());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        vahanSelectServiceScreen.P1().f26111p.setText(String.valueOf(vahanSelectServiceScreen.T1().getRc_c_state()));
        vahanSelectServiceScreen.R = vahanSelectServiceScreen.T1().getRc_off_cd();
        vahanSelectServiceScreen.W1().L(vahanSelectServiceScreen, vahanSelectServiceScreen.S1());
    }

    /* access modifiers changed from: private */
    public static final void Y1(VahanSelectServiceScreen vahanSelectServiceScreen, String str) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().dismiss();
        vahanSelectServiceScreen.P1().f26110o.setEnabled(false);
        vahanSelectServiceScreen.B2(vahanSelectServiceScreen, vahanSelectServiceScreen.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void Z1(VahanSelectServiceScreen vahanSelectServiceScreen, EgblityStatus egblityStatus) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().dismiss();
        try {
            if (egblityStatus.getIsduprc()) {
                vahanSelectServiceScreen.P1().f26098c.setVisibility(0);
            }
            if (egblityStatus.getIshpa()) {
                vahanSelectServiceScreen.P1().f26099d.setVisibility(0);
            }
            if (egblityStatus.getIshpc()) {
                vahanSelectServiceScreen.P1().f26100e.setVisibility(0);
            }
            if (egblityStatus.getIshpt()) {
                vahanSelectServiceScreen.P1().f26101f.setVisibility(0);
            }
            if (egblityStatus.getIsca()) {
                vahanSelectServiceScreen.P1().f26097b.setVisibility(0);
            }
            if (egblityStatus.getIsto()) {
                vahanSelectServiceScreen.P1().f26107l.setVisibility(8);
            }
            if (egblityStatus.getIsrcparticular()) {
                vahanSelectServiceScreen.P1().f26103h.setVisibility(0);
            }
            if (egblityStatus.getIsnoc()) {
                vahanSelectServiceScreen.P1().f26102g.setVisibility(0);
            }
        } catch (Exception unused) {
            vahanSelectServiceScreen.P1().f26110o.setEnabled(false);
            vahanSelectServiceScreen.P1().f26110o.setAlpha(0.5f);
        }
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanSelectServiceScreen vahanSelectServiceScreen, String str) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().dismiss();
        Log.e("Result--> Error", str.toString());
        vahanSelectServiceScreen.P1().f26110o.setEnabled(false);
        vahanSelectServiceScreen.P1().f26110o.setAlpha(0.5f);
        vahanSelectServiceScreen.B2(vahanSelectServiceScreen, vahanSelectServiceScreen.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "Issue of duplicate RC";
            vahanSelectServiceScreen.O = VContant.DUPLICATE_RC_CODE;
            vahanSelectServiceScreen.P.put(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.DUPLICATE_RC)) {
            vahanSelectServiceScreen.P.remove(VContant.DUPLICATE_RC);
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "Hypothecation addition";
            vahanSelectServiceScreen.O = VContant.HYPOTHECATION_ADDITION_CODE;
            vahanSelectServiceScreen.P.put(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            vahanSelectServiceScreen.P.remove(VContant.HYPOTHECATION_ADDITION);
        }
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "Hypothecation contribution";
            vahanSelectServiceScreen.O = VContant.HYPOTHECATION_CONTINUATION_CODE;
            vahanSelectServiceScreen.P.put(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            vahanSelectServiceScreen.P.remove(VContant.HYPOTHECATION_CONTINUATION);
        }
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "Hypothecation termination";
            vahanSelectServiceScreen.O = VContant.HYPOTHICATION_TERMINATION_CODE;
            vahanSelectServiceScreen.P.put(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            vahanSelectServiceScreen.P.remove(VContant.HYPOTHICATION_TERMINATION);
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "Change of address in RC";
            vahanSelectServiceScreen.O = VContant.CHANGE_OF_ADDRESS_CODE;
            vahanSelectServiceScreen.P.put(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            vahanSelectServiceScreen.P.remove(VContant.CHANGE_OF_ADDRESS);
        }
    }

    /* access modifiers changed from: private */
    public static final void g2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "Transfer of ownership";
            vahanSelectServiceScreen.O = VContant.TRANFER_OF_OWNERSHIP_CODE;
            vahanSelectServiceScreen.P.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            vahanSelectServiceScreen.P.remove(VContant.TRANFER_OF_OWNERSHIP);
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(true);
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
            vahanSelectServiceScreen.N = "RC Particular";
            vahanSelectServiceScreen.O = VContant.RCPARTICULAR_CODE;
            vahanSelectServiceScreen.P.put(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.RCPARTICULAR)) {
            vahanSelectServiceScreen.P.remove(VContant.RCPARTICULAR);
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(VahanSelectServiceScreen vahanSelectServiceScreen, CompoundButton compoundButton, boolean z10) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (z10) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
            vahanSelectServiceScreen.N = VContant.NOC;
            vahanSelectServiceScreen.O = VContant.NOC_CODE;
            vahanSelectServiceScreen.P.put(VContant.NOC, VContant.NOC_CODE);
        } else if (!z10 && vahanSelectServiceScreen.P.containsKey(VContant.NOC)) {
            vahanSelectServiceScreen.P.remove(VContant.NOC);
        }
    }

    /* access modifiers changed from: private */
    public static final void j2(VahanSelectServiceScreen vahanSelectServiceScreen, vahanOnlineCheck vahanonlinecheck) {
        l.f(vahanSelectServiceScreen, "this$0");
        try {
            vahanSelectServiceScreen.R1().dismiss();
            vahanSelectServiceScreen.A2(vahanonlinecheck.getService_auth_mode().toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void k2(VahanSelectServiceScreen vahanSelectServiceScreen, String str) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().dismiss();
        vahanSelectServiceScreen.B2(vahanSelectServiceScreen, vahanSelectServiceScreen.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void l2(VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void m2(VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.r2();
    }

    /* access modifiers changed from: private */
    public static final void n2(VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().show();
        String rc_chasi_no = vahanSelectServiceScreen.T1().getRc_chasi_no();
        vahanSelectServiceScreen.W1().q1(vahanSelectServiceScreen, String.valueOf(vahanSelectServiceScreen.T1().getRc_regn_no()), String.valueOf(rc_chasi_no != null ? rc_chasi_no.subSequence(String.valueOf(vahanSelectServiceScreen.T1().getRc_chasi_no()).length() - 5, String.valueOf(vahanSelectServiceScreen.T1().getRc_chasi_no()).length()) : null), String.valueOf(vahanSelectServiceScreen.T1().getState_cd()), VContant.Companion.f(vahanSelectServiceScreen.P));
    }

    /* access modifiers changed from: private */
    public static final void o2(VahanSelectServiceScreen vahanSelectServiceScreen, String str) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().dismiss();
        if (str != null) {
            try {
                if (p.o(str, "200", true)) {
                    if (vahanSelectServiceScreen.P1().f26098c.getVisibility() == 0) {
                        if (!vahanSelectServiceScreen.P1().f26098c.isChecked()) {
                        }
                        vahanSelectServiceScreen.G1(vahanSelectServiceScreen, "You have chosen only 1 service Click Add to select more. Click Proceed to move ahead with current selection.", 1);
                        return;
                    }
                    if ((vahanSelectServiceScreen.P1().f26107l.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26107l.isChecked()) && ((vahanSelectServiceScreen.P1().f26099d.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26099d.isChecked()) && ((vahanSelectServiceScreen.P1().f26101f.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26101f.isChecked()) && ((vahanSelectServiceScreen.P1().f26100e.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26100e.isChecked()) && ((vahanSelectServiceScreen.P1().f26097b.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26097b.isChecked()) && ((vahanSelectServiceScreen.P1().f26103h.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26103h.isChecked()) && (vahanSelectServiceScreen.P1().f26102g.getVisibility() != 0 || !vahanSelectServiceScreen.P1().f26102g.isChecked()))))))) {
                        vahanSelectServiceScreen.G1(vahanSelectServiceScreen, "Unable to proceed your request, Please try after some time!", 0);
                        return;
                    }
                    vahanSelectServiceScreen.G1(vahanSelectServiceScreen, "You have chosen only 1 service Click Add to select more. Click Proceed to move ahead with current selection.", 1);
                    return;
                }
                vahanSelectServiceScreen.B2(vahanSelectServiceScreen, vahanSelectServiceScreen.getString(R.string.service_unavable_please_try));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            vahanSelectServiceScreen.B2(vahanSelectServiceScreen, vahanSelectServiceScreen.getString(R.string.service_unavable_please_try));
        }
    }

    /* access modifiers changed from: private */
    public static final void p2(VahanSelectServiceScreen vahanSelectServiceScreen, String str) {
        l.f(vahanSelectServiceScreen, "this$0");
        vahanSelectServiceScreen.R1().dismiss();
        vahanSelectServiceScreen.B2(vahanSelectServiceScreen, str.toString());
    }

    /* access modifiers changed from: private */
    public static final void q2(VahanSelectServiceScreen vahanSelectServiceScreen, View view) {
        l.f(vahanSelectServiceScreen, "this$0");
        if (vahanSelectServiceScreen.P1().f26098c.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26098c.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26097b.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26097b.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26107l.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26107l.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26099d.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26099d.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26100e.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26100e.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26101f.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26101f.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26103h.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26103h.setChecked(false);
        }
        if (vahanSelectServiceScreen.P1().f26102g.getVisibility() == 0) {
            vahanSelectServiceScreen.P1().f26102g.setChecked(false);
        }
    }

    private final void r2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A2(String str) {
        String S1;
        l.f(str, "check_string");
        try {
            Iterable<String> l02 = q.l0(q.B0(p.v(q.B0(p.v(str, '<', ' ', false, 4, (Object) null)).toString(), '>', ' ', false, 4, (Object) null)).toString(), new String[]{"&"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(r.s(l02, 10));
            for (String B0 : l02) {
                arrayList.add(q.B0(B0).toString());
            }
            if (arrayList.size() > 1) {
                String obj = q.B0((String) arrayList.get(0)).toString();
                String obj2 = q.B0((String) arrayList.get(1)).toString();
                Log.e("step41", obj);
                Log.e("step42", obj2);
                String obj3 = q.B0(new f("\\s").b(p.v(obj, '(', ' ', false, 4, (Object) null), "")).toString();
                String obj4 = q.B0(new f("\\s").b(p.v(obj3, ')', ' ', false, 4, (Object) null), "")).toString();
                String obj5 = q.B0(new f("\\s").b(p.v(obj2, '(', ' ', false, 4, (Object) null), "")).toString();
                String obj6 = q.B0(new f("\\s").b(p.v(obj5, ')', ' ', false, 4, (Object) null), "")).toString();
                Iterable<String> l03 = q.l0(obj4, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList(r.s(l03, 10));
                for (String B02 : l03) {
                    arrayList2.add(q.B0(B02).toString());
                }
                Iterable<String> l04 = q.l0(obj6, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList(r.s(l04, 10));
                for (String B03 : l04) {
                    arrayList3.add(q.B0(B03).toString());
                }
                Log.e("step43", obj3);
                Log.e("step5", obj4);
                Log.e("stepM4", obj5);
                Log.e("stepM5", obj6);
                if (arrayList2.contains("0")) {
                    if (arrayList3.contains("0")) {
                        Log.e("condition--> ", "condition-->1");
                        S1 = S1();
                        L1(this, S1);
                    }
                }
                if (arrayList2.contains(q.B0(O1(this.P)).toString()) && arrayList3.contains(q.B0(O1(this.P)).toString())) {
                    Log.e("condition--> ", "condition-->2");
                    S1 = S1();
                    L1(this, S1);
                } else if (arrayList2.contains("0") && arrayList3.contains(q.B0(O1(this.P)).toString())) {
                    Log.e("condition--> ", "condition-->3");
                    S1 = S1();
                    L1(this, S1);
                } else if (!arrayList2.contains(q.B0(O1(this.P)).toString()) || !arrayList3.contains("0")) {
                    if (arrayList2.contains("0")) {
                        if (!arrayList3.contains(q.B0(O1(this.P)).toString())) {
                            Log.e("condition--> ", "condition-->5");
                            Intent intent = new Intent(this, VahanProcessWithAdhar.class);
                            intent.putExtra("RC", S1());
                            intent.putExtra("map", this.P);
                            intent.putExtra("RcDetails", T1());
                            intent.putExtra("off_code", this.R);
                            startActivity(intent);
                            finish();
                        }
                    }
                    if (arrayList2.contains(q.B0(O1(this.P)).toString()) || !arrayList3.contains("0")) {
                        Log.e("condition--> ", "condition-->7");
                        return;
                    }
                    Log.e("condition--> ", "condition-->6");
                    Intent intent2 = new Intent(this, VahanGenerateOTPScreen.class);
                    intent2.putExtra("RC", S1());
                    intent2.putExtra("map", this.P);
                    intent2.putExtra("Mobile_no", Q1());
                    intent2.putExtra("RcDetails", T1());
                    intent2.putExtra("off_code", this.R);
                    startActivity(intent2);
                    finish();
                } else {
                    Log.e("condition--> ", "condition-->4");
                    S1 = S1();
                    L1(this, S1);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void B2(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new p5(dialog, this));
        dialog.show();
    }

    public final void G1(Context context, String str, int i10) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.process);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.close);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.btnHolderLl);
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.cancel);
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) findViewById6;
        ((TextView) findViewById3).setText(str);
        if (i10 == 0) {
            textView2.setVisibility(8);
            textView3.setVisibility(0);
            linearLayout.setVisibility(8);
        } else {
            linearLayout2.setVisibility(0);
            textView2.setVisibility(0);
            textView3.setVisibility(8);
            linearLayout.setVisibility(0);
            textView.setText("Add");
            textView.setBackground(getResources().getDrawable(R.drawable.background_shape_blue));
        }
        textView.setOnClickListener(new s5(dialog));
        linearLayout2.setOnClickListener(new t5(dialog));
        textView3.setOnClickListener(new u5(dialog));
        textView2.setOnClickListener(new v5(dialog, this));
        dialog.show();
    }

    public final void L1(Context context, String str) {
        l.f(context, "context");
        l.f(str, "rc_number");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.process_with_Adhar);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.process_with_mobile);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setOnClickListener(new q5(dialog, context, str, this));
        ((TextView) findViewById2).setOnClickListener(new r5(dialog, context, str, this));
        dialog.show();
    }

    public final String O1(HashMap hashMap) {
        l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            return VContant.DUPLICATE_RC_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            return "500";
        }
        if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            return VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            return VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            return VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            return VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE;
        }
        return hashMap.containsKey(VContant.RCPARTICULAR) ? VContant.RCPARTICULAR_PURPOSE_CODE : "500";
    }

    public final e9 P1() {
        e9 e9Var = this.G;
        if (e9Var != null) {
            return e9Var;
        }
        l.v("binding");
        return null;
    }

    public final String Q1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("mobile_number");
        return null;
    }

    public final ProgressDialog R1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String S1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails T1() {
        NrvDetails nrvDetails = this.I;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService U1() {
        VahanProService vahanProService = this.L;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final ld.h V1() {
        ld.h hVar = this.M;
        if (hVar != null) {
            return hVar;
        }
        l.v("session");
        return null;
    }

    public final h W1() {
        h hVar = this.K;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_select_service_screen);
        e9 c10 = e9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        s2(c10);
        setContentView((View) P1().b());
        e.f17509a.r2(this, P1());
        x2(VahanProService.f21196b.b(this));
        u2(new ProgressDialog(this));
        R1().setMessage("Please wait...");
        R1().setCancelable(false);
        R1().setCanceledOnTouchOutside(false);
        z2((h) new u0((x0) this, (u0.b) new g(new wg.d(U1()))).a(h.class));
        v2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        w2((NrvDetails) serializableExtra);
        y2(new ld.h(this));
        P1().f26112q.setText(S1());
        P1().f26113r.setText(VContant.Companion.l(this, V1()));
        W1().s0().g(this, new d5(this));
        W1().t0().g(this, new f5(this));
        W1().Z0().g(this, new g5(this));
        W1().a1().g(this, new h5(this));
        try {
            if (p.o(V1().c(), VContant.DUPLICATE_RC_CODE, true)) {
                P1().f26098c.setChecked(true);
                this.P.put(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
            }
            if (p.o(V1().c(), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                P1().f26099d.setChecked(true);
                this.P.put(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
            }
            if (p.o(V1().c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                P1().f26100e.setChecked(true);
                this.P.put(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
            }
            if (p.o(V1().c(), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                P1().f26101f.setChecked(true);
                this.P.put(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
            }
            if (p.o(V1().c(), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
                P1().f26097b.setChecked(true);
                this.P.put(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
            }
            if (p.o(V1().c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                P1().f26107l.setChecked(true);
                this.P.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
            }
            if (p.o(V1().c(), VContant.RCPARTICULAR_CODE, true)) {
                P1().f26103h.setChecked(true);
                this.P.put(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
            }
            if (p.o(V1().c(), VContant.NOC_CODE, true)) {
                P1().f26102g.setChecked(true);
                this.P.put(VContant.NOC, VContant.NOC_CODE);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String state_cd = T1().getState_cd();
        if (state_cd == null || state_cd.length() == 0) {
            textView = P1().f26111p;
            str = "--";
        } else {
            if (P1().f26111p.getText().length() == 0) {
                textView = P1().f26111p;
                str = String.valueOf(T1().getState_cd());
            }
            P1().f26106k.f28305f.setOnClickListener(new i5(this));
            P1().f26106k.f28306g.setOnClickListener(new j5(this));
            P1().f26110o.setOnClickListener(new k5(this));
            W1().e1().g(this, new l5(this));
            W1().f1().g(this, new m5(this));
            P1().f26108m.setOnClickListener(new n5(this));
            W1().X().g(this, new o5(this));
            W1().Y().g(this, new w5(this));
            P1().f26098c.setOnCheckedChangeListener(new x5(this));
            P1().f26099d.setOnCheckedChangeListener(new y5(this));
            P1().f26100e.setOnCheckedChangeListener(new z5(this));
            P1().f26101f.setOnCheckedChangeListener(new a6(this));
            P1().f26097b.setOnCheckedChangeListener(new b6(this));
            P1().f26107l.setOnCheckedChangeListener(new c6(this));
            P1().f26103h.setOnCheckedChangeListener(new d6(this));
            P1().f26102g.setOnCheckedChangeListener(new e5(this));
        }
        textView.setText(str);
        P1().f26106k.f28305f.setOnClickListener(new i5(this));
        P1().f26106k.f28306g.setOnClickListener(new j5(this));
        P1().f26110o.setOnClickListener(new k5(this));
        W1().e1().g(this, new l5(this));
        W1().f1().g(this, new m5(this));
        P1().f26108m.setOnClickListener(new n5(this));
        W1().X().g(this, new o5(this));
        W1().Y().g(this, new w5(this));
        P1().f26098c.setOnCheckedChangeListener(new x5(this));
        P1().f26099d.setOnCheckedChangeListener(new y5(this));
        P1().f26100e.setOnCheckedChangeListener(new z5(this));
        P1().f26101f.setOnCheckedChangeListener(new a6(this));
        P1().f26097b.setOnCheckedChangeListener(new b6(this));
        P1().f26107l.setOnCheckedChangeListener(new c6(this));
        P1().f26103h.setOnCheckedChangeListener(new d6(this));
        P1().f26102g.setOnCheckedChangeListener(new e5(this));
    }

    public final void s2(e9 e9Var) {
        l.f(e9Var, "<set-?>");
        this.G = e9Var;
    }

    public final void t2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void u2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void v2(String str) {
        l.f(str, "<set-?>");
        this.H = str;
    }

    public final void w2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.I = nrvDetails;
    }

    public final void x2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.L = vahanProService;
    }

    public final void y2(ld.h hVar) {
        l.f(hVar, "<set-?>");
        this.M = hVar;
    }

    public final void z2(h hVar) {
        l.f(hVar, "<set-?>");
        this.K = hVar;
    }
}
