package com.nic.mparivahan.NewDlScreen.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import ec.a0;
import ec.b0;
import java.util.ArrayList;
import ld.c;
import ld.f;
import ni.w1;
import v9.e;

public final class NewDLAddressDetailsActivity extends d {
    private w1 G;
    private ArrayList H = new ArrayList();
    public c I;
    public f J;
    private String K = "";
    private String L = "";

    private final void h1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            l.c(parcelableArrayListExtra);
            this.H = parcelableArrayListExtra;
        }
        if (getIntent().hasExtra("llNo")) {
            String stringExtra = getIntent().getStringExtra("llNo");
            l.c(stringExtra);
            this.K = stringExtra;
        }
        if (getIntent().hasExtra("dob")) {
            String stringExtra2 = getIntent().getStringExtra("dob");
            l.c(stringExtra2);
            this.L = stringExtra2;
        }
        if (this.H.size() > 0) {
            m1(this.H);
        }
    }

    private final void j1() {
        o1(new f(this));
        n1(new c(this));
        w1 w1Var = this.G;
        w1 w1Var2 = null;
        if (w1Var == null) {
            l.v("binding");
            w1Var = null;
        }
        w1Var.U.f28452f.setText(i1().i());
        w1 w1Var3 = this.G;
        if (w1Var3 == null) {
            l.v("binding");
            w1Var3 = null;
        }
        w1Var3.f29133s0.setEnabled(false);
        w1 w1Var4 = this.G;
        if (w1Var4 == null) {
            l.v("binding");
            w1Var4 = null;
        }
        w1Var4.f29132r0.setEnabled(false);
        w1 w1Var5 = this.G;
        if (w1Var5 == null) {
            l.v("binding");
            w1Var5 = null;
        }
        w1Var5.f29115a0.setEnabled(false);
        w1 w1Var6 = this.G;
        if (w1Var6 == null) {
            l.v("binding");
            w1Var6 = null;
        }
        w1Var6.L.setFocusable(false);
        w1 w1Var7 = this.G;
        if (w1Var7 == null) {
            l.v("binding");
            w1Var7 = null;
        }
        w1Var7.P.setFocusable(false);
        w1 w1Var8 = this.G;
        if (w1Var8 == null) {
            l.v("binding");
            w1Var8 = null;
        }
        w1Var8.N.setFocusable(false);
        w1 w1Var9 = this.G;
        if (w1Var9 == null) {
            l.v("binding");
            w1Var9 = null;
        }
        w1Var9.O.setFocusable(false);
        w1 w1Var10 = this.G;
        if (w1Var10 == null) {
            l.v("binding");
            w1Var10 = null;
        }
        w1Var10.f29134t0.setFocusable(false);
        w1 w1Var11 = this.G;
        if (w1Var11 == null) {
            l.v("binding");
            w1Var11 = null;
        }
        w1Var11.V.setFocusable(false);
        w1 w1Var12 = this.G;
        if (w1Var12 == null) {
            l.v("binding");
            w1Var12 = null;
        }
        w1Var12.X.setEnabled(false);
        w1 w1Var13 = this.G;
        if (w1Var13 == null) {
            l.v("binding");
            w1Var13 = null;
        }
        w1Var13.K.setEnabled(false);
        w1 w1Var14 = this.G;
        if (w1Var14 == null) {
            l.v("binding");
            w1Var14 = null;
        }
        w1Var14.J.setEnabled(false);
        w1 w1Var15 = this.G;
        if (w1Var15 == null) {
            l.v("binding");
            w1Var15 = null;
        }
        w1Var15.I.setEnabled(false);
        w1 w1Var16 = this.G;
        if (w1Var16 == null) {
            l.v("binding");
            w1Var16 = null;
        }
        w1Var16.Y.setOnClickListener(new a0(this));
        w1 w1Var17 = this.G;
        if (w1Var17 == null) {
            l.v("binding");
            w1Var17 = null;
        }
        w1Var17.U.f28448b.setOnClickListener(new b0(this));
        w1 w1Var18 = this.G;
        if (w1Var18 == null) {
            l.v("binding");
            w1Var18 = null;
        }
        w1Var18.A.setFocusable(false);
        w1 w1Var19 = this.G;
        if (w1Var19 == null) {
            l.v("binding");
            w1Var19 = null;
        }
        w1Var19.D.setFocusable(false);
        w1 w1Var20 = this.G;
        if (w1Var20 == null) {
            l.v("binding");
            w1Var20 = null;
        }
        w1Var20.B.setFocusable(false);
        w1 w1Var21 = this.G;
        if (w1Var21 == null) {
            l.v("binding");
        } else {
            w1Var2 = w1Var21;
        }
        w1Var2.C.setFocusable(false);
    }

    /* access modifiers changed from: private */
    public static final void k1(NewDLAddressDetailsActivity newDLAddressDetailsActivity, View view) {
        l.f(newDLAddressDetailsActivity, "this$0");
        Intent intent = new Intent(newDLAddressDetailsActivity, NewCovActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", newDLAddressDetailsActivity.H);
        intent.putExtra("llNo", newDLAddressDetailsActivity.K);
        intent.putExtra("dob", newDLAddressDetailsActivity.L);
        newDLAddressDetailsActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void l1(NewDLAddressDetailsActivity newDLAddressDetailsActivity, View view) {
        l.f(newDLAddressDetailsActivity, "this$0");
        newDLAddressDetailsActivity.onBackPressed();
    }

    private final void m1(ArrayList arrayList) {
        EditText editText;
        w1 w1Var = null;
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresState().get(0).getPresStateName())) {
            w1 w1Var2 = this.G;
            if (w1Var2 == null) {
                l.v("binding");
                w1Var2 = null;
            }
            w1Var2.f29137y.setText(((LLDetailsResultModal) arrayList.get(0)).getPresState().get(0).getPresStateName());
        } else {
            w1 w1Var3 = this.G;
            if (w1Var3 == null) {
                l.v("binding");
                w1Var3 = null;
            }
            w1Var3.f29137y.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresDistrict().get(0).getPresDistName())) {
            w1 w1Var4 = this.G;
            if (w1Var4 == null) {
                l.v("binding");
                w1Var4 = null;
            }
            w1Var4.f29136x.setText(((LLDetailsResultModal) arrayList.get(0)).getPresDistrict().get(0).getPresDistName());
        } else {
            w1 w1Var5 = this.G;
            if (w1Var5 == null) {
                l.v("binding");
                w1Var5 = null;
            }
            w1Var5.f29136x.setText("NA");
        }
        String str = "";
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresSubDistrict().get(0).getPresSubDistName())) {
            w1 w1Var6 = this.G;
            if (w1Var6 == null) {
                l.v("binding");
                w1Var6 = null;
            }
            w1Var6.f29138z.setText(((LLDetailsResultModal) arrayList.get(0)).getPresSubDistrict().get(0).getPresSubDistName());
        } else {
            w1 w1Var7 = this.G;
            if (w1Var7 == null) {
                l.v("binding");
                w1Var7 = null;
            }
            w1Var7.f29138z.setText(str);
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresVillageOrTown())) {
            if (l.a(((LLDetailsResultModal) arrayList.get(0)).getPresVillageOrTown(), "1")) {
                w1 w1Var8 = this.G;
                if (w1Var8 == null) {
                    l.v("binding");
                    w1Var8 = null;
                }
                w1Var8.f29132r0.setChecked(true);
            } else {
                w1 w1Var9 = this.G;
                if (w1Var9 == null) {
                    l.v("binding");
                    w1Var9 = null;
                }
                w1Var9.f29115a0.setChecked(false);
            }
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresCity().get(0).getPresVillName())) {
            w1 w1Var10 = this.G;
            if (w1Var10 == null) {
                l.v("binding");
                w1Var10 = null;
            }
            w1Var10.M.setText(((LLDetailsResultModal) arrayList.get(0)).getPresCity().get(0).getPresVillName());
        } else {
            w1 w1Var11 = this.G;
            if (w1Var11 == null) {
                l.v("binding");
                w1Var11 = null;
            }
            w1Var11.M.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresHouseNo())) {
            w1 w1Var12 = this.G;
            if (w1Var12 == null) {
                l.v("binding");
                w1Var12 = null;
            }
            w1Var12.L.setText(((LLDetailsResultModal) arrayList.get(0)).getPresHouseNo());
        } else {
            w1 w1Var13 = this.G;
            if (w1Var13 == null) {
                l.v("binding");
                w1Var13 = null;
            }
            w1Var13.L.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresStreet())) {
            w1 w1Var14 = this.G;
            if (w1Var14 == null) {
                l.v("binding");
                w1Var14 = null;
            }
            w1Var14.P.setText(((LLDetailsResultModal) arrayList.get(0)).getPresStreet());
        } else {
            w1 w1Var15 = this.G;
            if (w1Var15 == null) {
                l.v("binding");
                w1Var15 = null;
            }
            w1Var15.P.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresLocation())) {
            w1 w1Var16 = this.G;
            if (w1Var16 == null) {
                l.v("binding");
                w1Var16 = null;
            }
            w1Var16.N.setText(((LLDetailsResultModal) arrayList.get(0)).getPresLocation());
        } else {
            w1 w1Var17 = this.G;
            if (w1Var17 == null) {
                l.v("binding");
                w1Var17 = null;
            }
            w1Var17.N.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresPinCode())) {
            w1 w1Var18 = this.G;
            if (w1Var18 == null) {
                l.v("binding");
                w1Var18 = null;
            }
            w1Var18.O.setText(((LLDetailsResultModal) arrayList.get(0)).getPresPinCode());
        } else {
            w1 w1Var19 = this.G;
            if (w1Var19 == null) {
                l.v("binding");
                w1Var19 = null;
            }
            w1Var19.O.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresStayYears())) {
            w1 w1Var20 = this.G;
            if (w1Var20 == null) {
                l.v("binding");
                w1Var20 = null;
            }
            w1Var20.f29134t0.setText(((LLDetailsResultModal) arrayList.get(0)).getPresStayYears());
        } else {
            w1 w1Var21 = this.G;
            if (w1Var21 == null) {
                l.v("binding");
                w1Var21 = null;
            }
            w1Var21.f29134t0.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresStayMonths())) {
            w1 w1Var22 = this.G;
            if (w1Var22 == null) {
                l.v("binding");
                w1Var22 = null;
            }
            w1Var22.V.setText(((LLDetailsResultModal) arrayList.get(0)).getPresStayMonths());
        } else {
            w1 w1Var23 = this.G;
            if (w1Var23 == null) {
                l.v("binding");
                w1Var23 = null;
            }
            w1Var23.V.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPresSameAsPerm())) {
            w1 w1Var24 = this.G;
            if (w1Var24 == null) {
                l.v("binding");
                w1Var24 = null;
            }
            w1Var24.X.setChecked(p.o(((LLDetailsResultModal) arrayList.get(0)).getPresSameAsPerm(), "true", true));
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermState().get(0).getPermStateName())) {
            w1 w1Var25 = this.G;
            if (w1Var25 == null) {
                l.v("binding");
                w1Var25 = null;
            }
            w1Var25.G.setText(((LLDetailsResultModal) arrayList.get(0)).getPermState().get(0).getPermStateName());
        } else {
            w1 w1Var26 = this.G;
            if (w1Var26 == null) {
                l.v("binding");
                w1Var26 = null;
            }
            w1Var26.G.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermDistrict().get(0).getPermDistName())) {
            w1 w1Var27 = this.G;
            if (w1Var27 == null) {
                l.v("binding");
                w1Var27 = null;
            }
            w1Var27.F.setText(((LLDetailsResultModal) arrayList.get(0)).getPermDistrict().get(0).getPermDistName());
        } else {
            w1 w1Var28 = this.G;
            if (w1Var28 == null) {
                l.v("binding");
                w1Var28 = null;
            }
            w1Var28.F.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermSubDistrict().get(0).getPermSubDistName())) {
            w1 w1Var29 = this.G;
            if (w1Var29 == null) {
                l.v("binding");
                w1Var29 = null;
            }
            w1Var29.E.setText(((LLDetailsResultModal) arrayList.get(0)).getPermSubDistrict().get(0).getPermSubDistName());
        } else {
            w1 w1Var30 = this.G;
            if (w1Var30 == null) {
                l.v("binding");
                w1Var30 = null;
            }
            w1Var30.E.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermVillageOrTown())) {
            if (l.a(((LLDetailsResultModal) arrayList.get(0)).getPermVillageOrTown(), "1")) {
                w1 w1Var31 = this.G;
                if (w1Var31 == null) {
                    l.v("binding");
                    w1Var31 = null;
                }
                w1Var31.J.setChecked(true);
            } else {
                w1 w1Var32 = this.G;
                if (w1Var32 == null) {
                    l.v("binding");
                    w1Var32 = null;
                }
                w1Var32.I.setChecked(false);
            }
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermCity().get(0).getPermVillName())) {
            w1 w1Var33 = this.G;
            if (w1Var33 == null) {
                l.v("binding");
                w1Var33 = null;
            }
            w1Var33.H.setText(((LLDetailsResultModal) arrayList.get(0)).getPermCity().get(0).getPermVillName());
        } else {
            w1 w1Var34 = this.G;
            if (w1Var34 == null) {
                l.v("binding");
                w1Var34 = null;
            }
            w1Var34.H.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermHouseNo())) {
            w1 w1Var35 = this.G;
            if (w1Var35 == null) {
                l.v("binding");
                w1Var35 = null;
            }
            w1Var35.A.setText(((LLDetailsResultModal) arrayList.get(0)).getPermHouseNo());
        } else {
            w1 w1Var36 = this.G;
            if (w1Var36 == null) {
                l.v("binding");
                w1Var36 = null;
            }
            w1Var36.A.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermStreet())) {
            w1 w1Var37 = this.G;
            if (w1Var37 == null) {
                l.v("binding");
                w1Var37 = null;
            }
            w1Var37.D.setText(((LLDetailsResultModal) arrayList.get(0)).getPermStreet());
        } else {
            w1 w1Var38 = this.G;
            if (w1Var38 == null) {
                l.v("binding");
                w1Var38 = null;
            }
            w1Var38.D.setText("NA");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermLocation())) {
            w1 w1Var39 = this.G;
            if (w1Var39 == null) {
                l.v("binding");
                w1Var39 = null;
            }
            editText = w1Var39.B;
            str = ((LLDetailsResultModal) arrayList.get(0)).getPermLocation();
        } else {
            w1 w1Var40 = this.G;
            if (w1Var40 == null) {
                l.v("binding");
                w1Var40 = null;
            }
            editText = w1Var40.B;
        }
        editText.setText(str);
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LLDetailsResultModal) arrayList.get(0)).getPermPinCode())) {
            w1 w1Var41 = this.G;
            if (w1Var41 == null) {
                l.v("binding");
            } else {
                w1Var = w1Var41;
            }
            w1Var.C.setText(((LLDetailsResultModal) arrayList.get(0)).getPermPinCode());
            return;
        }
        w1 w1Var42 = this.G;
        if (w1Var42 == null) {
            l.v("binding");
        } else {
            w1Var = w1Var42;
        }
        w1Var.C.setText("NA");
    }

    public final f i1() {
        f fVar = this.J;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void n1(c cVar) {
        l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void o1(f fVar) {
        l.f(fVar, "<set-?>");
        this.J = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w1 x10 = w1.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        this.G = x10;
        w1 w1Var = null;
        if (x10 == null) {
            l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = e.f17509a;
        w1 w1Var2 = this.G;
        if (w1Var2 == null) {
            l.v("binding");
        } else {
            w1Var = w1Var2;
        }
        aVar.o0(this, w1Var);
        h1();
        j1();
    }
}
