package com.nic.mparivahan.VahanServices.updateMobileNo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import cm.u;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import di.q;
import di.r;
import di.s;
import di.t;
import di.v;
import di.w;
import di.y;
import di.z;
import java.util.Calendar;
import ni.f9;
import pl.x;
import v9.e;

public final class VahanUpdateMobileActivity extends d {
    private f9 G;
    public di.a H;
    public UpdateMobileNoService I;
    /* access modifiers changed from: private */
    public ProgressDialog J;
    private String K = "";
    private String L = "";
    public ld.c M;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanUpdateMobileActivity f21644e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanUpdateMobileActivity vahanUpdateMobileActivity) {
            super(1);
            this.f21644e = vahanUpdateMobileActivity;
        }

        public final void b(UpdateMobileUserDetails updateMobileUserDetails) {
            ProgressDialog p12 = this.f21644e.J;
            ProgressDialog progressDialog = null;
            if (p12 == null) {
                cm.l.v("dialog");
                p12 = null;
            }
            if (p12.isShowing()) {
                ProgressDialog p13 = this.f21644e.J;
                if (p13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = p13;
                }
                progressDialog.dismiss();
            }
            Intent intent = new Intent(this.f21644e, VahanConfirmUpdateMobileActivity.class);
            intent.putExtra("isAadharEnable", updateMobileUserDetails.getRenderAdharDtls());
            if (updateMobileUserDetails.getOwnerDetailEntity() != null && updateMobileUserDetails.getOwnerDetailEntity().size() > 0) {
                intent.putExtra("regNo", updateMobileUserDetails.getOwnerDetailEntity().get(0).getRegn_no());
                intent.putExtra("stateCd", updateMobileUserDetails.getOwnerDetailEntity().get(0).getState_cd());
                intent.putExtra("stateName", updateMobileUserDetails.getOwnerDetailEntity().get(0).getState_name());
                intent.putExtra("ownerName", updateMobileUserDetails.getOwnerDetailEntity().get(0).getOwner_name());
            }
            if (updateMobileUserDetails.getVtOwnerIdentitificationEntity() != null && updateMobileUserDetails.getVtOwnerIdentitificationEntity().size() > 0) {
                if (updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getMobile_no() != null) {
                    intent.putExtra("mobileNo", updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getMobile_no());
                } else {
                    intent.putExtra("mobileNo", "");
                }
                if (updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getAadhar_no() != null) {
                    intent.putExtra("aadharNo", updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getAadhar_no());
                } else {
                    intent.putExtra("aadharNo", "");
                }
                if (updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getEmail_id() != null) {
                    intent.putExtra("emailId", updateMobileUserDetails.getVtOwnerIdentitificationEntity().get(0).getEmail_id());
                } else {
                    intent.putExtra("emailId", "");
                }
            }
            this.f21644e.startActivity(intent);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateMobileUserDetails) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanUpdateMobileActivity f21645e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanUpdateMobileActivity vahanUpdateMobileActivity) {
            super(1);
            this.f21645e = vahanUpdateMobileActivity;
        }

        public final void b(String str) {
            ProgressDialog p12 = this.f21645e.J;
            ProgressDialog progressDialog = null;
            if (p12 == null) {
                cm.l.v("dialog");
                p12 = null;
            }
            if (p12.isShowing()) {
                ProgressDialog p13 = this.f21645e.J;
                if (p13 == null) {
                    cm.l.v("dialog");
                } else {
                    progressDialog = p13;
                }
                progressDialog.dismiss();
            }
            VahanUpdateMobileActivity vahanUpdateMobileActivity = this.f21645e;
            vahanUpdateMobileActivity.J1(vahanUpdateMobileActivity, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21646a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21646a = lVar;
        }

        public final pl.c a() {
            return this.f21646a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21646a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A1(VahanUpdateMobileActivity vahanUpdateMobileActivity, View view) {
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        vahanUpdateMobileActivity.C1();
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void C1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new z(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void D1(u uVar, u uVar2, VahanUpdateMobileActivity vahanUpdateMobileActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        vahanUpdateMobileActivity.K = sb4.toString();
        f9 f9Var = vahanUpdateMobileActivity.G;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        AppCompatEditText appCompatEditText = f9Var.f26319i;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatEditText.setText(sb5.toString());
    }

    private final void E1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new y(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void F1(u uVar, u uVar2, VahanUpdateMobileActivity vahanUpdateMobileActivity, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        vahanUpdateMobileActivity.L = sb4.toString();
        f9 f9Var = vahanUpdateMobileActivity.G;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        AppCompatEditText appCompatEditText = f9Var.f26323m;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatEditText.setText(sb5.toString());
    }

    /* access modifiers changed from: private */
    public final void J1(Context context, String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        ld.c cVar = new ld.c(context);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(cVar.b("btn_ok", "ok"));
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new w(dialog));
        textView2.setOnClickListener(new di.x(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r0 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
        if (r0 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012d, code lost:
        if (r0 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0170, code lost:
        if (r0 == null) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean M1() {
        /*
            r7 = this;
            ni.f9 r0 = r7.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            android.text.Editable r0 = r0.getText()
            r3 = 0
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0047
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0022
            cm.l.v(r2)
            r0 = r1
        L_0x0022:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            ld.c r4 = r7.r1()
            r5 = 2132018753(0x7f140641, float:1.9675822E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_REG"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            cm.l.v(r2)
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26318h
        L_0x0043:
            r0.requestFocus()
            return r3
        L_0x0047:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x004f
            cm.l.v(r2)
            r0 = r1
        L_0x004f:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r4 = 4
            if (r0 >= r4) goto L_0x007e
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0068
            cm.l.v(r2)
            r0 = r1
        L_0x0068:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26318h
            ld.c r4 = r7.r1()
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r6 = "Please enter vehicle number.Minimum 4 & maximum 10 character with no special character"
            java.lang.String r4 = r4.b(r5, r6)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0040
            goto L_0x003c
        L_0x007e:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0086
            cm.l.v(r2)
            r0 = r1
        L_0x0086:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00be
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00be
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x009c
            cm.l.v(r2)
            r0 = r1
        L_0x009c:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            ld.c r4 = r7.r1()
            r5 = 2132018724(0x7f140624, float:1.9675763E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "PLEASE_ENTER_CHASSI"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00ba
        L_0x00b6:
            cm.l.v(r2)
            goto L_0x00bb
        L_0x00ba:
            r1 = r0
        L_0x00bb:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26313c
            goto L_0x0043
        L_0x00be:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00c6
            cm.l.v(r2)
            r0 = r1
        L_0x00c6:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r4 = 2132018203(0x7f14041b, float:1.9674706E38)
            r5 = 5
            if (r0 >= r5) goto L_0x00fa
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00e2
            cm.l.v(r2)
            r0 = r1
        L_0x00e2:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26313c
            ld.c r5 = r7.r1()
            java.lang.String r6 = "INVALID_CHASSI"
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x00ba
            goto L_0x00b6
        L_0x00fa:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0102
            cm.l.v(r2)
            r0 = r1
        L_0x0102:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0138
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0138
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0118
            cm.l.v(r2)
            r0 = r1
        L_0x0118:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            ld.c r5 = r7.r1()
            java.lang.String r6 = "label_challan_enter_engine_no"
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r4 = r5.b(r6, r4)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0133
        L_0x012f:
            cm.l.v(r2)
            goto L_0x0134
        L_0x0133:
            r1 = r0
        L_0x0134:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26315e
            goto L_0x0043
        L_0x0138:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0140
            cm.l.v(r2)
            r0 = r1
        L_0x0140:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            if (r0 >= r5) goto L_0x0173
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0158
            cm.l.v(r2)
            r0 = r1
        L_0x0158:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26315e
            ld.c r4 = r7.r1()
            r5 = 2132018204(0x7f14041c, float:1.9674708E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "INVALID_ENGINE"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0133
            goto L_0x012f
        L_0x0173:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x017b
            cm.l.v(r2)
            r0 = r1
        L_0x017b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26319i
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x01b4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b4
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x0191
            cm.l.v(r2)
            r0 = r1
        L_0x0191:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26319i
            ld.c r4 = r7.r1()
            r5 = 2132018752(0x7f140640, float:1.967582E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "REG_DATE"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01af
            cm.l.v(r2)
            goto L_0x01b0
        L_0x01af:
            r1 = r0
        L_0x01b0:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26319i
            goto L_0x0043
        L_0x01b4:
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01bc
            cm.l.v(r2)
            r0 = r1
        L_0x01bc:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26323m
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01f5
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01d2
            cm.l.v(r2)
            r0 = r1
        L_0x01d2:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f26323m
            ld.c r4 = r7.r1()
            r5 = 2132018754(0x7f140642, float:1.9675824E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "REG_UPTO"
            java.lang.String r4 = r4.b(r6, r5)
            r0.setError(r4)
            ni.f9 r0 = r7.G
            if (r0 != 0) goto L_0x01f0
            cm.l.v(r2)
            goto L_0x01f1
        L_0x01f0:
            r1 = r0
        L_0x01f1:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f26323m
            goto L_0x0043
        L_0x01f5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity.M1():boolean");
    }

    private final void u1() {
        f9 f9Var = this.G;
        f9 f9Var2 = null;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        this.K = String.valueOf(f9Var.f26319i.getText());
        f9 f9Var3 = this.G;
        if (f9Var3 == null) {
            cm.l.v("binding");
            f9Var3 = null;
        }
        this.L = String.valueOf(f9Var3.f26323m.getText());
        I1((di.a) new u0((x0) this, (u0.b) new bi.c(new wg.c(s1()))).a(di.a.class));
        f9 f9Var4 = this.G;
        if (f9Var4 == null) {
            cm.l.v("binding");
            f9Var4 = null;
        }
        f9Var4.f26319i.setFocusable(0);
        f9 f9Var5 = this.G;
        if (f9Var5 == null) {
            cm.l.v("binding");
            f9Var5 = null;
        }
        f9Var5.f26323m.setFocusable(0);
        f9 f9Var6 = this.G;
        if (f9Var6 == null) {
            cm.l.v("binding");
            f9Var6 = null;
        }
        f9Var6.f26324n.f28305f.setOnClickListener(new q(this));
        f9 f9Var7 = this.G;
        if (f9Var7 == null) {
            cm.l.v("binding");
            f9Var7 = null;
        }
        f9Var7.f26324n.f28306g.setOnClickListener(new r(this));
        f9 f9Var8 = this.G;
        if (f9Var8 == null) {
            cm.l.v("binding");
            f9Var8 = null;
        }
        f9Var8.f26317g.setOnClickListener(new s(this));
        f9 f9Var9 = this.G;
        if (f9Var9 == null) {
            cm.l.v("binding");
            f9Var9 = null;
        }
        f9Var9.f26316f.setOnClickListener(new t(this));
        t1().h().g(this, new c(new a(this)));
        t1().g().g(this, new c(new b(this)));
        f9 f9Var10 = this.G;
        if (f9Var10 == null) {
            cm.l.v("binding");
            f9Var10 = null;
        }
        f9Var10.f26323m.setOnClickListener(new di.u(this));
        f9 f9Var11 = this.G;
        if (f9Var11 == null) {
            cm.l.v("binding");
        } else {
            f9Var2 = f9Var11;
        }
        f9Var2.f26319i.setOnClickListener(new v(this));
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanUpdateMobileActivity vahanUpdateMobileActivity, View view) {
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        vahanUpdateMobileActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanUpdateMobileActivity vahanUpdateMobileActivity, View view) {
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        vahanUpdateMobileActivity.B1();
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanUpdateMobileActivity vahanUpdateMobileActivity, View view) {
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        if (vahanUpdateMobileActivity.M1()) {
            ProgressDialog progressDialog = vahanUpdateMobileActivity.J;
            f9 f9Var = null;
            if (progressDialog == null) {
                cm.l.v("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            di.a t12 = vahanUpdateMobileActivity.t1();
            f9 f9Var2 = vahanUpdateMobileActivity.G;
            if (f9Var2 == null) {
                cm.l.v("binding");
                f9Var2 = null;
            }
            String obj = q.B0(String.valueOf(f9Var2.f26318h.getText())).toString();
            f9 f9Var3 = vahanUpdateMobileActivity.G;
            if (f9Var3 == null) {
                cm.l.v("binding");
                f9Var3 = null;
            }
            String obj2 = q.B0(String.valueOf(f9Var3.f26313c.getText())).toString();
            f9 f9Var4 = vahanUpdateMobileActivity.G;
            if (f9Var4 == null) {
                cm.l.v("binding");
            } else {
                f9Var = f9Var4;
            }
            t12.k(obj, obj2, q.B0(String.valueOf(f9Var.f26315e.getText())).toString(), vahanUpdateMobileActivity.K, vahanUpdateMobileActivity.L);
        }
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanUpdateMobileActivity vahanUpdateMobileActivity, View view) {
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        vahanUpdateMobileActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanUpdateMobileActivity vahanUpdateMobileActivity, View view) {
        cm.l.f(vahanUpdateMobileActivity, "this$0");
        vahanUpdateMobileActivity.E1();
    }

    public final void G1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void H1(UpdateMobileNoService updateMobileNoService) {
        cm.l.f(updateMobileNoService, "<set-?>");
        this.I = updateMobileNoService;
    }

    public final void I1(di.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_update_mobile);
        f9 c10 = f9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        ProgressDialog progressDialog = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        f9 f9Var = this.G;
        if (f9Var == null) {
            cm.l.v("binding");
            f9Var = null;
        }
        aVar.S2(this, f9Var);
        G1(new ld.c(this));
        H1(UpdateMobileNoService.f21190a.b(this));
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.J = progressDialog2;
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.J;
        if (progressDialog3 == null) {
            cm.l.v("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.J;
        if (progressDialog4 == null) {
            cm.l.v("dialog");
        } else {
            progressDialog = progressDialog4;
        }
        progressDialog.setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        u1();
    }

    public final ld.c r1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final UpdateMobileNoService s1() {
        UpdateMobileNoService updateMobileNoService = this.I;
        if (updateMobileNoService != null) {
            return updateMobileNoService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final di.a t1() {
        di.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
