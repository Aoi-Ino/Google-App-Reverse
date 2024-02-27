package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto;
import java.io.Serializable;
import java.util.ArrayList;
import ni.z6;
import se.b;
import se.c;
import se.e;
import se.f;
import se.g;
import se.h;
import te.a;

public final class PassangerResultActivity extends d {
    public z6 G;
    private ArrayList H = new ArrayList();
    public a I;
    private String J = "";

    /* access modifiers changed from: private */
    public static final void n1(u uVar, RadioButton radioButton, RadioButton radioButton2, CompoundButton compoundButton, boolean z10) {
        l.f(uVar, "$genderSelect");
        l.f(radioButton, "$femail");
        l.f(radioButton2, "$other");
        if (z10) {
            uVar.f20234e = "Male";
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void o1(u uVar, RadioButton radioButton, RadioButton radioButton2, CompoundButton compoundButton, boolean z10) {
        l.f(uVar, "$genderSelect");
        l.f(radioButton, "$mail");
        l.f(radioButton2, "$other");
        if (z10) {
            uVar.f20234e = "Female";
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void p1(u uVar, RadioButton radioButton, RadioButton radioButton2, CompoundButton compoundButton, boolean z10) {
        l.f(uVar, "$genderSelect");
        l.f(radioButton, "$mail");
        l.f(radioButton2, "$femail");
        if (z10) {
            uVar.f20234e = "Other";
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r1(EditText editText, EditText editText2, EditText editText3, PassangerResultActivity passangerResultActivity, u uVar, View view) {
        String str;
        l.f(editText, "$full_name");
        l.f(editText2, "$ageEt");
        l.f(editText3, "$address_edit");
        l.f(passangerResultActivity, "this$0");
        l.f(uVar, "$genderSelect");
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        String obj3 = editText3.getText().toString();
        if (obj.length() < 4) {
            str = "Please enter the valid Name";
        } else if (obj2.length() < 1) {
            str = "Please enter the Age";
        } else if (obj3.length() < 4) {
            str = "Please enter the valid Address";
        } else if (Integer.parseInt(passangerResultActivity.J) > passangerResultActivity.H.size()) {
            passangerResultActivity.H.add(new VaSplPassengerdto(obj3, Integer.parseInt(obj2), (String) uVar.f20234e, obj, passangerResultActivity.H.size() + 1));
            passangerResultActivity.s1().j();
            passangerResultActivity.t1().f29692g.setVisibility(0);
            passangerResultActivity.t1().f29698m.setVisibility(8);
            editText.setText("");
            editText2.setText("");
            editText3.setText("");
            str = "Passanger Sucessfully Added in the List";
        } else {
            return;
        }
        Toast.makeText(passangerResultActivity, str, 0).show();
    }

    /* access modifiers changed from: private */
    public static final void u1(PassangerResultActivity passangerResultActivity, View view) {
        l.f(passangerResultActivity, "this$0");
        if (Integer.parseInt(passangerResultActivity.J) > passangerResultActivity.H.size()) {
            passangerResultActivity.m1(passangerResultActivity);
        }
    }

    /* access modifiers changed from: private */
    public static final void v1(PassangerResultActivity passangerResultActivity, View view) {
        l.f(passangerResultActivity, "this$0");
        Intent intent = new Intent();
        intent.putExtra("input", passangerResultActivity.H);
        passangerResultActivity.setResult(78, intent);
    }

    public final void m1(Context context) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.add_passanger_diloge);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        u uVar = new u();
        uVar.f20234e = "Male";
        View findViewById = dialog.findViewById(R.id.full_name);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.EditText");
        View findViewById2 = dialog.findViewById(R.id.ageEt);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.EditText");
        View findViewById3 = dialog.findViewById(R.id.address);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        View findViewById4 = dialog.findViewById(R.id.mail);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton = (RadioButton) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.femail);
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton2 = (RadioButton) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.other);
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton3 = (RadioButton) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.closebutton);
        l.d(findViewById7, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById8 = dialog.findViewById(R.id.save_button);
        l.d(findViewById8, "null cannot be cast to non-null type android.widget.LinearLayout");
        radioButton.setOnCheckedChangeListener(new se.d(uVar, radioButton2, radioButton3));
        radioButton2.setOnCheckedChangeListener(new e(uVar, radioButton, radioButton3));
        radioButton3.setOnCheckedChangeListener(new f(uVar, radioButton, radioButton2));
        ((LinearLayout) findViewById7).setOnClickListener(new g(dialog));
        ((LinearLayout) findViewById8).setOnClickListener(new h((EditText) findViewById, (EditText) findViewById2, (EditText) findViewById3, this, uVar));
        dialog.show();
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("input", this.H);
        setResult(78, intent);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_passanger_result);
        z6 c10 = z6.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        x1(c10);
        setContentView((View) t1().b());
        t1().f29696k.setText("Add Passanger List");
        t1().f29692g.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.H.clear();
        Serializable serializableExtra = getIntent().getSerializableExtra("PassagerList");
        l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto> }");
        this.H = (ArrayList) serializableExtra;
        this.J = String.valueOf(getIntent().getStringExtra("SeatingCap"));
        w1(new a(this.H, this));
        t1().f29692g.setAdapter(s1());
        if (this.H.size() > 0) {
            t1().f29692g.setVisibility(0);
            t1().f29698m.setVisibility(8);
        }
        t1().f29691f.setOnClickListener(new b(this));
        t1().f29693h.setOnClickListener(new c(this));
    }

    public final a s1() {
        a aVar = this.I;
        if (aVar != null) {
            return aVar;
        }
        l.v("adapter");
        return null;
    }

    public final z6 t1() {
        z6 z6Var = this.G;
        if (z6Var != null) {
            return z6Var;
        }
        l.v("binding");
        return null;
    }

    public final void w1(a aVar) {
        l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final void x1(z6 z6Var) {
        l.f(z6Var, "<set-?>");
        this.G = z6Var;
    }
}
