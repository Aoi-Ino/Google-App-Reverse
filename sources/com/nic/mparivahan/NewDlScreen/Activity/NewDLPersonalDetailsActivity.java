package com.nic.mparivahan.NewDlScreen.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import ec.c0;
import ec.d0;
import java.util.ArrayList;
import ld.c;
import ld.f;
import ni.r2;
import v9.e;
import wj.a;

public final class NewDLPersonalDetailsActivity extends d {
    private r2 G;
    private ArrayList H = new ArrayList();
    private ArrayList I = new ArrayList();
    public c J;
    public f K;
    private String L = "";
    private String M = "";

    private final void h1(String str) {
        this.I.add(0, new Relationship("0", "Select Relation"));
        this.I.add(1, new Relationship("F", "Father"));
        this.I.add(2, new Relationship("M", "Mother"));
        this.I.add(3, new Relationship("H", "Husband"));
        this.I.add(4, new Relationship("G", "Guardian"));
        int size = this.I.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            if (p.o(((Relationship) this.I.get(i11)).getRelationCode(), str, true)) {
                i10 = i11;
            }
        }
        a aVar = new a(this, this.I);
        r2 r2Var = this.G;
        r2 r2Var2 = null;
        if (r2Var == null) {
            l.v("binding");
            r2Var = null;
        }
        r2Var.Q.setAdapter(aVar);
        r2 r2Var3 = this.G;
        if (r2Var3 == null) {
            l.v("binding");
        } else {
            r2Var2 = r2Var3;
        }
        r2Var2.Q.setSelection(i10);
    }

    private final void i1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            l.c(parcelableArrayListExtra);
            this.H = parcelableArrayListExtra;
        }
        if (getIntent().hasExtra("llNo")) {
            String stringExtra = getIntent().getStringExtra("llNo");
            l.c(stringExtra);
            this.L = stringExtra;
        }
        if (getIntent().hasExtra("dob")) {
            String stringExtra2 = getIntent().getStringExtra("dob");
            l.c(stringExtra2);
            this.M = stringExtra2;
        }
        if (this.H.size() > 0) {
            n1(this.H);
        }
    }

    private final void k1() {
        p1(new f(this));
        o1(new c(this));
        r2 r2Var = this.G;
        r2 r2Var2 = null;
        if (r2Var == null) {
            l.v("binding");
            r2Var = null;
        }
        r2Var.N.f28452f.setText(j1().i());
        r2 r2Var3 = this.G;
        if (r2Var3 == null) {
            l.v("binding");
            r2Var3 = null;
        }
        r2Var3.f28339z.setFocusable(false);
        r2 r2Var4 = this.G;
        if (r2Var4 == null) {
            l.v("binding");
            r2Var4 = null;
        }
        r2Var4.B.setFocusable(false);
        r2 r2Var5 = this.G;
        if (r2Var5 == null) {
            l.v("binding");
            r2Var5 = null;
        }
        r2Var5.A.setFocusable(false);
        r2 r2Var6 = this.G;
        if (r2Var6 == null) {
            l.v("binding");
            r2Var6 = null;
        }
        r2Var6.f28333j0.setFocusable(false);
        r2 r2Var7 = this.G;
        if (r2Var7 == null) {
            l.v("binding");
            r2Var7 = null;
        }
        r2Var7.f28335l0.setFocusable(false);
        r2 r2Var8 = this.G;
        if (r2Var8 == null) {
            l.v("binding");
            r2Var8 = null;
        }
        r2Var8.f28334k0.setFocusable(false);
        r2 r2Var9 = this.G;
        if (r2Var9 == null) {
            l.v("binding");
            r2Var9 = null;
        }
        r2Var9.f28324a0.setFocusable(false);
        r2 r2Var10 = this.G;
        if (r2Var10 == null) {
            l.v("binding");
            r2Var10 = null;
        }
        r2Var10.M.setEnabled(false);
        r2 r2Var11 = this.G;
        if (r2Var11 == null) {
            l.v("binding");
            r2Var11 = null;
        }
        r2Var11.M.setClickable(false);
        r2 r2Var12 = this.G;
        if (r2Var12 == null) {
            l.v("binding");
            r2Var12 = null;
        }
        r2Var12.E.setFocusable(false);
        r2 r2Var13 = this.G;
        if (r2Var13 == null) {
            l.v("binding");
            r2Var13 = null;
        }
        r2Var13.F.setFocusable(false);
        r2 r2Var14 = this.G;
        if (r2Var14 == null) {
            l.v("binding");
            r2Var14 = null;
        }
        r2Var14.D.setFocusable(false);
        r2 r2Var15 = this.G;
        if (r2Var15 == null) {
            l.v("binding");
            r2Var15 = null;
        }
        r2Var15.J.setFocusable(false);
        r2 r2Var16 = this.G;
        if (r2Var16 == null) {
            l.v("binding");
            r2Var16 = null;
        }
        r2Var16.f28338y.setFocusable(false);
        r2 r2Var17 = this.G;
        if (r2Var17 == null) {
            l.v("binding");
            r2Var17 = null;
        }
        r2Var17.H.setFocusable(false);
        r2 r2Var18 = this.G;
        if (r2Var18 == null) {
            l.v("binding");
            r2Var18 = null;
        }
        r2Var18.I.setFocusable(false);
        r2 r2Var19 = this.G;
        if (r2Var19 == null) {
            l.v("binding");
            r2Var19 = null;
        }
        r2Var19.O.setEnabled(false);
        r2 r2Var20 = this.G;
        if (r2Var20 == null) {
            l.v("binding");
            r2Var20 = null;
        }
        r2Var20.L.setEnabled(false);
        r2 r2Var21 = this.G;
        if (r2Var21 == null) {
            l.v("binding");
            r2Var21 = null;
        }
        r2Var21.R.setEnabled(false);
        r2 r2Var22 = this.G;
        if (r2Var22 == null) {
            l.v("binding");
            r2Var22 = null;
        }
        r2Var22.Q.setEnabled(false);
        r2 r2Var23 = this.G;
        if (r2Var23 == null) {
            l.v("binding");
            r2Var23 = null;
        }
        r2Var23.G.setFocusable(false);
        r2 r2Var24 = this.G;
        if (r2Var24 == null) {
            l.v("binding");
            r2Var24 = null;
        }
        r2Var24.C.setFocusable(false);
        r2 r2Var25 = this.G;
        if (r2Var25 == null) {
            l.v("binding");
            r2Var25 = null;
        }
        r2Var25.f28336w.setOnClickListener(new c0(this));
        r2 r2Var26 = this.G;
        if (r2Var26 == null) {
            l.v("binding");
        } else {
            r2Var2 = r2Var26;
        }
        r2Var2.N.f28448b.setOnClickListener(new d0(this));
    }

    /* access modifiers changed from: private */
    public static final void l1(NewDLPersonalDetailsActivity newDLPersonalDetailsActivity, View view) {
        l.f(newDLPersonalDetailsActivity, "this$0");
        Intent intent = new Intent(newDLPersonalDetailsActivity, NewDLAddressDetailsActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", newDLPersonalDetailsActivity.H);
        intent.putExtra("llNo", newDLPersonalDetailsActivity.L);
        intent.putExtra("dob", newDLPersonalDetailsActivity.M);
        newDLPersonalDetailsActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void m1(NewDLPersonalDetailsActivity newDLPersonalDetailsActivity, View view) {
        l.f(newDLPersonalDetailsActivity, "this$0");
        newDLPersonalDetailsActivity.onBackPressed();
    }

    private final void n1(ArrayList arrayList) {
        RadioButton radioButton;
        r2 r2Var = null;
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getFname())) {
            r2 r2Var2 = this.G;
            if (r2Var2 == null) {
                l.v("binding");
                r2Var2 = null;
            }
            r2Var2.f28339z.setText(((LLDetailsResultModal) arrayList.get(0)).getFname());
        } else {
            r2 r2Var3 = this.G;
            if (r2Var3 == null) {
                l.v("binding");
                r2Var3 = null;
            }
            r2Var3.f28339z.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getMname())) {
            r2 r2Var4 = this.G;
            if (r2Var4 == null) {
                l.v("binding");
                r2Var4 = null;
            }
            r2Var4.B.setText(((LLDetailsResultModal) arrayList.get(0)).getMname());
        } else {
            r2 r2Var5 = this.G;
            if (r2Var5 == null) {
                l.v("binding");
                r2Var5 = null;
            }
            r2Var5.B.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getLname())) {
            r2 r2Var6 = this.G;
            if (r2Var6 == null) {
                l.v("binding");
                r2Var6 = null;
            }
            r2Var6.A.setText(((LLDetailsResultModal) arrayList.get(0)).getLname());
        } else {
            r2 r2Var7 = this.G;
            if (r2Var7 == null) {
                l.v("binding");
                r2Var7 = null;
            }
            r2Var7.A.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getRelationType().get(0).getRelationCode())) {
            r2 r2Var8 = this.G;
            if (r2Var8 == null) {
                l.v("binding");
                r2Var8 = null;
            }
            r2Var8.P.setText(((LLDetailsResultModal) arrayList.get(0)).getRelationType().get(0).getRelationDesc() + " 's Name");
            h1(((LLDetailsResultModal) arrayList.get(0)).getRelationType().get(0).getRelationCode());
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getSwdfName())) {
            r2 r2Var9 = this.G;
            if (r2Var9 == null) {
                l.v("binding");
                r2Var9 = null;
            }
            r2Var9.f28333j0.setText(((LLDetailsResultModal) arrayList.get(0)).getSwdfName());
        } else {
            r2 r2Var10 = this.G;
            if (r2Var10 == null) {
                l.v("binding");
                r2Var10 = null;
            }
            r2Var10.f28333j0.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getSwdmName())) {
            r2 r2Var11 = this.G;
            if (r2Var11 == null) {
                l.v("binding");
                r2Var11 = null;
            }
            r2Var11.f28335l0.setText(((LLDetailsResultModal) arrayList.get(0)).getSwdmName());
        } else {
            r2 r2Var12 = this.G;
            if (r2Var12 == null) {
                l.v("binding");
                r2Var12 = null;
            }
            r2Var12.f28335l0.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getSwdlName())) {
            r2 r2Var13 = this.G;
            if (r2Var13 == null) {
                l.v("binding");
                r2Var13 = null;
            }
            r2Var13.f28334k0.setText(((LLDetailsResultModal) arrayList.get(0)).getSwdlName());
        } else {
            r2 r2Var14 = this.G;
            if (r2Var14 == null) {
                l.v("binding");
                r2Var14 = null;
            }
            r2Var14.f28334k0.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getNewFullName())) {
            r2 r2Var15 = this.G;
            if (r2Var15 == null) {
                l.v("binding");
                r2Var15 = null;
            }
            r2Var15.f28324a0.setText(((LLDetailsResultModal) arrayList.get(0)).getNewFullName());
        } else {
            r2 r2Var16 = this.G;
            if (r2Var16 == null) {
                l.v("binding");
                r2Var16 = null;
            }
            r2Var16.f28324a0.setText("NA");
        }
        int genderCode = ((LLDetailsResultModal) arrayList.get(0)).getGender().get(0).getGenderCode();
        if (genderCode == 1) {
            r2 r2Var17 = this.G;
            if (r2Var17 == null) {
                l.v("binding");
                r2Var17 = null;
            }
            radioButton = r2Var17.O;
        } else if (genderCode != 2) {
            r2 r2Var18 = this.G;
            if (r2Var18 == null) {
                l.v("binding");
                r2Var18 = null;
            }
            radioButton = r2Var18.R;
        } else {
            r2 r2Var19 = this.G;
            if (r2Var19 == null) {
                l.v("binding");
                r2Var19 = null;
            }
            radioButton = r2Var19.L;
        }
        radioButton.setChecked(true);
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getDateOfBirth())) {
            r2 r2Var20 = this.G;
            if (r2Var20 == null) {
                l.v("binding");
                r2Var20 = null;
            }
            r2Var20.f28337x.setText(((LLDetailsResultModal) arrayList.get(0)).getDateOfBirth());
        } else {
            r2 r2Var21 = this.G;
            if (r2Var21 == null) {
                l.v("binding");
                r2Var21 = null;
            }
            r2Var21.f28337x.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPlaceOfBirth())) {
            r2 r2Var22 = this.G;
            if (r2Var22 == null) {
                l.v("binding");
                r2Var22 = null;
            }
            r2Var22.C.setText(((LLDetailsResultModal) arrayList.get(0)).getPlaceOfBirth());
        } else {
            r2 r2Var23 = this.G;
            if (r2Var23 == null) {
                l.v("binding");
                r2Var23 = null;
            }
            r2Var23.C.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getCountryOfBirth().get(0).getCountryOfBirthName())) {
            r2 r2Var24 = this.G;
            if (r2Var24 == null) {
                l.v("binding");
                r2Var24 = null;
            }
            r2Var24.E.setText(((LLDetailsResultModal) arrayList.get(0)).getCountryOfBirth().get(0).getCountryOfBirthName());
        } else {
            r2 r2Var25 = this.G;
            if (r2Var25 == null) {
                l.v("binding");
                r2Var25 = null;
            }
            r2Var25.E.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getEduQual().get(0).getQualDesc())) {
            r2 r2Var26 = this.G;
            if (r2Var26 == null) {
                l.v("binding");
                r2Var26 = null;
            }
            r2Var26.F.setText(((LLDetailsResultModal) arrayList.get(0)).getEduQual().get(0).getQualDesc());
        } else {
            r2 r2Var27 = this.G;
            if (r2Var27 == null) {
                l.v("binding");
                r2Var27 = null;
            }
            r2Var27.F.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getBloodGroup().get(0).getBloodGroupDesc())) {
            r2 r2Var28 = this.G;
            if (r2Var28 == null) {
                l.v("binding");
                r2Var28 = null;
            }
            r2Var28.D.setText(((LLDetailsResultModal) arrayList.get(0)).getBloodGroup().get(0).getBloodGroupDesc());
        } else {
            r2 r2Var29 = this.G;
            if (r2Var29 == null) {
                l.v("binding");
                r2Var29 = null;
            }
            r2Var29.D.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getEmail())) {
            r2 r2Var30 = this.G;
            if (r2Var30 == null) {
                l.v("binding");
                r2Var30 = null;
            }
            r2Var30.G.setText(((LLDetailsResultModal) arrayList.get(0)).getEmail());
        } else {
            r2 r2Var31 = this.G;
            if (r2Var31 == null) {
                l.v("binding");
                r2Var31 = null;
            }
            r2Var31.G.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getMobileNumber())) {
            r2 r2Var32 = this.G;
            if (r2Var32 == null) {
                l.v("binding");
                r2Var32 = null;
            }
            r2Var32.J.setText(((LLDetailsResultModal) arrayList.get(0)).getMobileNumber());
        } else {
            r2 r2Var33 = this.G;
            if (r2Var33 == null) {
                l.v("binding");
                r2Var33 = null;
            }
            r2Var33.J.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getAlternatemobileNumber())) {
            r2 r2Var34 = this.G;
            if (r2Var34 == null) {
                l.v("binding");
                r2Var34 = null;
            }
            r2Var34.f28338y.setText(((LLDetailsResultModal) arrayList.get(0)).getAlternatemobileNumber());
        } else {
            r2 r2Var35 = this.G;
            if (r2Var35 == null) {
                l.v("binding");
                r2Var35 = null;
            }
            r2Var35.f28338y.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getIdMarks1())) {
            r2 r2Var36 = this.G;
            if (r2Var36 == null) {
                l.v("binding");
                r2Var36 = null;
            }
            r2Var36.H.setText(((LLDetailsResultModal) arrayList.get(0)).getIdMarks1());
        } else {
            r2 r2Var37 = this.G;
            if (r2Var37 == null) {
                l.v("binding");
                r2Var37 = null;
            }
            r2Var37.H.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getIdMarks2())) {
            r2 r2Var38 = this.G;
            if (r2Var38 == null) {
                l.v("binding");
            } else {
                r2Var = r2Var38;
            }
            r2Var.I.setText(((LLDetailsResultModal) arrayList.get(0)).getIdMarks2());
            return;
        }
        r2 r2Var39 = this.G;
        if (r2Var39 == null) {
            l.v("binding");
        } else {
            r2Var = r2Var39;
        }
        r2Var.I.setText("NA");
    }

    public final f j1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void o1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r2 x10 = r2.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        r2 r2Var = null;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = e.f17509a;
        r2 r2Var2 = this.G;
        if (r2Var2 == null) {
            l.v("binding");
        } else {
            r2Var = r2Var2;
        }
        aVar.t0(this, r2Var);
        i1();
        k1();
    }

    public final void p1(f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }
}
