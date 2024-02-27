package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Account.Model.MparCitizenUser;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import ld.c;
import ld.g;
import nc.a;
import ni.ec;
import u8.q;
import u8.r;
import u8.s;
import u8.t;
import u8.u;
import u8.v;
import u8.w;
import v8.f;
import v9.d;
import v9.e;

public final class CreateNewMPIN extends d {
    public EditText G;
    public EditText H;
    public String I;
    public String J;
    public ImageView K;
    public ImageView L;
    public ImageView M;
    public f N;
    public SignService O;
    public g P;
    public ProgressDialog Q;
    public DatabaseHelper R;
    public c S;
    private ec T;
    private String U = "";
    public qc.b V;
    public UserBloodDetails W;

    public static final class a implements ActionMode.Callback {
        a() {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public static final class b implements ActionMode.Callback {
        b() {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(CreateNewMPIN createNewMPIN, View view) {
        l.f(createNewMPIN, "this$0");
        createNewMPIN.startActivity(new Intent(createNewMPIN, SignInScreen.class));
        createNewMPIN.finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(CreateNewMPIN createNewMPIN, View view) {
        EditText w12;
        TransformationMethod instance;
        l.f(createNewMPIN, "this$0");
        if (createNewMPIN.w1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            createNewMPIN.z1().setImageResource(R.drawable.pass_visible);
            w12 = createNewMPIN.w1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            createNewMPIN.z1().setImageResource(R.drawable.mvvm_visibility);
            w12 = createNewMPIN.w1();
            instance = PasswordTransformationMethod.getInstance();
        }
        w12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void D1(CreateNewMPIN createNewMPIN, View view) {
        EditText p12;
        TransformationMethod instance;
        l.f(createNewMPIN, "this$0");
        if (createNewMPIN.p1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            createNewMPIN.q1().setImageResource(R.drawable.pass_visible);
            p12 = createNewMPIN.p1();
            instance = HideReturnsTransformationMethod.getInstance();
        } else {
            createNewMPIN.q1().setImageResource(R.drawable.mvvm_visibility);
            p12 = createNewMPIN.p1();
            instance = PasswordTransformationMethod.getInstance();
        }
        p12.setTransformationMethod(instance);
    }

    /* access modifiers changed from: private */
    public static final void E1(CreateNewMPIN createNewMPIN, View view) {
        Context applicationContext;
        c r12;
        String q10;
        String str;
        l.f(createNewMPIN, "this$0");
        String obj = createNewMPIN.w1().getText().toString();
        String obj2 = createNewMPIN.p1().getText().toString();
        if (obj == null || obj.length() == 0) {
            applicationContext = createNewMPIN.getApplicationContext();
            r12 = createNewMPIN.r1();
            q10 = v9.f.f17510a.q();
            str = "Please enter the MPIN";
        } else if (obj.length() < 6) {
            applicationContext = createNewMPIN.getApplicationContext();
            r12 = createNewMPIN.r1();
            q10 = v9.f.f17510a.u();
            str = "Please enter the valid MPIN";
        } else if (obj2 == null || obj2.length() == 0) {
            applicationContext = createNewMPIN.getApplicationContext();
            r12 = createNewMPIN.r1();
            q10 = v9.f.f17510a.f();
            str = "Please enter the confirm MPIN";
        } else if (obj2.length() < 6) {
            applicationContext = createNewMPIN.getApplicationContext();
            r12 = createNewMPIN.r1();
            q10 = v9.f.f17510a.g();
            str = "Please enter the valid confirm MPIN";
        } else if (!l.a(obj, obj2)) {
            applicationContext = createNewMPIN.getApplicationContext();
            r12 = createNewMPIN.r1();
            q10 = v9.f.f17510a.I();
            str = "MPIN & confirm MPIN should be same";
        } else {
            d.a aVar = v9.d.f17494a;
            if (aVar.B(obj, createNewMPIN.A1().m())) {
                applicationContext = createNewMPIN.getApplicationContext();
                r12 = createNewMPIN.r1();
                q10 = v9.f.f17510a.m0();
                str = "The mPin You Have Entered Matches With the Previous mPin";
            } else if (aVar.C(obj)) {
                applicationContext = createNewMPIN.getApplicationContext();
                r12 = createNewMPIN.r1();
                q10 = v9.f.f17510a.n0();
                str = "Please choose a more diverse password./n Avoid using all the same digits.";
            } else {
                try {
                    Object j10 = new i7.d().j(createNewMPIN.s1(), MparCitizenUser.class);
                    l.e(j10, "fromJson(...)");
                    MparCitizenUser mparCitizenUser = (MparCitizenUser) j10;
                    String string = Settings.Secure.getString(createNewMPIN.getContentResolver(), "android_id");
                    a.C0190a aVar2 = nc.a.f14255a;
                    long ctzRecordId = mparCitizenUser.getCtzRecordId();
                    String v12 = createNewMPIN.v1();
                    String valueOf = String.valueOf(mparCitizenUser.getCtzDispName());
                    String valueOf2 = String.valueOf(mparCitizenUser.getCtzEmail());
                    String valueOf3 = String.valueOf(mparCitizenUser.getCtzStateCd());
                    l.c(string);
                    String valueOf4 = String.valueOf(mparCitizenUser.getCtzMobile());
                    String str2 = createNewMPIN.U;
                    ec ecVar = createNewMPIN.T;
                    if (ecVar == null) {
                        l.v("binding");
                        ecVar = null;
                    }
                    String jSONObject = aVar2.c(ctzRecordId, v12, valueOf, valueOf2, valueOf3, true, string, valueOf4, str2, ecVar.f26145e.getText().toString()).toString();
                    l.e(jSONObject, "toString(...)");
                    createNewMPIN.x1().show();
                    createNewMPIN.t1().v(jSONObject, createNewMPIN);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
        }
        Toast.makeText(applicationContext, r12.b(q10, str), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void F1(CreateNewMPIN createNewMPIN, Integer num) {
        l.f(createNewMPIN, "this$0");
        createNewMPIN.x1().dismiss();
        if (num != null && num.intValue() == 1) {
            Object j10 = new i7.d().j(createNewMPIN.s1(), MparCitizenUser.class);
            l.e(j10, "fromJson(...)");
            MparCitizenUser mparCitizenUser = (MparCitizenUser) j10;
            if (createNewMPIN.A1().t()) {
                createNewMPIN.A1().u();
                DatabaseHelper A0 = DatabaseHelper.A0(createNewMPIN);
                l.e(A0, "getInstance(...)");
                A0.R();
                A0.close();
                new ld.a(createNewMPIN).e();
                NaxpToKenService.f9438k.a(createNewMPIN);
            }
            createNewMPIN.A1().b(String.valueOf(mparCitizenUser.getCtzRecordId()), createNewMPIN.v1(), mparCitizenUser.getCtzDispName(), mparCitizenUser.getCtzEmail(), createNewMPIN.w1().getText().toString(), mparCitizenUser.getCtzStateCd(), Boolean.TRUE, Boolean.valueOf(mparCitizenUser.getCtzMpinStatus()));
            String b10 = createNewMPIN.r1().b("label_log_mpin_rest_succ", "MPIN reset successfully!");
            l.c(b10);
            createNewMPIN.m1(createNewMPIN, b10);
            return;
        }
        createNewMPIN.x1().cancel();
        Toast.makeText(createNewMPIN.getApplicationContext(), createNewMPIN.r1().b("label_log_unbl_ctrt_mpin", "Unable to create the MPIN, Please try after some time"), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void G1(CreateNewMPIN createNewMPIN, String str) {
        l.f(createNewMPIN, "this$0");
        createNewMPIN.x1().cancel();
        Toast.makeText(createNewMPIN.getApplicationContext(), createNewMPIN.r1().b("label_log_unbl_ctrt_mpin", "Unable to create the MPIN, Please try after some time"), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void n1(Dialog dialog, CreateNewMPIN createNewMPIN, View view) {
        l.f(dialog, "$dialog");
        l.f(createNewMPIN, "this$0");
        dialog.dismiss();
        createNewMPIN.startActivity(new Intent(createNewMPIN, SignInScreen.class));
        createNewMPIN.finish();
    }

    public final g A1() {
        g gVar = this.P;
        if (gVar != null) {
            return gVar;
        }
        l.v("userSessionManager");
        return null;
    }

    public final void H1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.K = imageView;
    }

    public final void I1(EditText editText) {
        l.f(editText, "<set-?>");
        this.H = editText;
    }

    public final void J1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.M = imageView;
    }

    public final void K1(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.R = databaseHelper;
    }

    public final void L1(c cVar) {
        l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
    }

    public final void N1(qc.b bVar) {
        l.f(bVar, "<set-?>");
        this.V = bVar;
    }

    public final void O1(UserBloodDetails userBloodDetails) {
        l.f(userBloodDetails, "<set-?>");
        this.W = userBloodDetails;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.I = str;
    }

    public final void Q1(EditText editText) {
        l.f(editText, "<set-?>");
        this.G = editText;
    }

    public final void R1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.Q = progressDialog;
    }

    public final void S1(SignService signService) {
        l.f(signService, "<set-?>");
        this.O = signService;
    }

    public final void T1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.L = imageView;
    }

    public final void U1(g gVar) {
        l.f(gVar, "<set-?>");
        this.P = gVar;
    }

    public final void V1(f fVar) {
        l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    public final void m1(Context context, String str) {
        l.f(context, "context");
        l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.succes_mpin);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(r1().b("btn_ok", "OK"));
        textView.setOnClickListener(new w(dialog, this));
        dialog.show();
    }

    public final ImageView o1() {
        ImageView imageView = this.K;
        if (imageView != null) {
            return imageView;
        }
        l.v("backButton");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ec c10 = ec.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.T = c10;
        ec ecVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        ec ecVar2 = this.T;
        if (ecVar2 == null) {
            l.v("binding");
            ecVar2 = null;
        }
        aVar.l0(this, ecVar2);
        L1(new c(this));
        S1(SignService.f7644a.c(this));
        View findViewById = findViewById(R.id.mpinEditText);
        l.e(findViewById, "findViewById(...)");
        Q1((EditText) findViewById);
        View findViewById2 = findViewById(R.id.confirmMpinEt);
        l.e(findViewById2, "findViewById(...)");
        I1((EditText) findViewById2);
        View findViewById3 = findViewById(R.id.showmpin);
        l.e(findViewById3, "findViewById(...)");
        T1((ImageView) findViewById3);
        View findViewById4 = findViewById(R.id.confirmShowmpin);
        l.e(findViewById4, "findViewById(...)");
        J1((ImageView) findViewById4);
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        l.e(A0, "getInstance(...)");
        K1(A0);
        R1(new ProgressDialog(this));
        x1().setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        this.U = String.valueOf(getIntent().getStringExtra("otpId"));
        U1(new g(this));
        View findViewById5 = findViewById(R.id.backButton);
        l.e(findViewById5, "findViewById(...)");
        H1((ImageView) findViewById5);
        O1(UserBloodDetails.f9372a.c(this));
        N1((qc.b) new u0((x0) this, (u0.b) new qc.a(new pc.a(u1()))).a(qc.b.class));
        o1().setOnClickListener(new q(this));
        w1().setCustomSelectionActionModeCallback(new a());
        p1().setCustomSelectionActionModeCallback(new b());
        z1().setOnClickListener(new r(this));
        q1().setOnClickListener(new s(this));
        Intent intent = getIntent();
        if (intent != null) {
            try {
                P1(String.valueOf(intent.getStringExtra("Mobile_no")));
                M1(String.valueOf(intent.getStringExtra("OTP")));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        V1((f) new u0((x0) this, (u0.b) new v8.e(new s8.b(y1()))).a(f.class));
        ec ecVar3 = this.T;
        if (ecVar3 == null) {
            l.v("binding");
        } else {
            ecVar = ecVar3;
        }
        ecVar.f26149i.setOnClickListener(new t(this));
        t1().n().g(this, new u(this));
        t1().i().g(this, new v(this));
    }

    public final EditText p1() {
        EditText editText = this.H;
        if (editText != null) {
            return editText;
        }
        l.v("confirmMpinEt");
        return null;
    }

    public final ImageView q1() {
        ImageView imageView = this.M;
        if (imageView != null) {
            return imageView;
        }
        l.v("confirmShowMpin");
        return null;
    }

    public final c r1() {
        c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final String s1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("mParivhanUser");
        return null;
    }

    public final qc.b t1() {
        qc.b bVar = this.V;
        if (bVar != null) {
            return bVar;
        }
        l.v("mUserBloodViewModel");
        return null;
    }

    public final UserBloodDetails u1() {
        UserBloodDetails userBloodDetails = this.W;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        l.v("mUserService");
        return null;
    }

    public final String v1() {
        String str = this.I;
        if (str != null) {
            return str;
        }
        l.v("mobile_number");
        return null;
    }

    public final EditText w1() {
        EditText editText = this.G;
        if (editText != null) {
            return editText;
        }
        l.v("mpinEditText");
        return null;
    }

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.Q;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final SignService y1() {
        SignService signService = this.O;
        if (signService != null) {
            return signService;
        }
        l.v("retrofitService");
        return null;
    }

    public final ImageView z1() {
        ImageView imageView = this.L;
        if (imageView != null) {
            return imageView;
        }
        l.v("showmpin");
        return null;
    }
}
