package com.nic.mparivahan.VahanServices.VahanView;

import ai.a0;
import ai.i;
import ai.j;
import ai.k;
import ai.m;
import ai.n;
import ai.o;
import ai.p;
import ai.q;
import ai.r;
import ai.s;
import ai.t;
import ai.u;
import ai.v;
import ai.w;
import ai.x;
import ai.y;
import ai.z;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ChangeOfAddressConfirmation;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import ld.c;
import ni.w8;
import og.b0;
import og.g;
import v9.e;

public final class VahanChangeOfAddress extends d {
    public String G;
    public NrvDetails H;
    public w8 I;
    public h J;
    public VahanProService K;
    public ProgressDialog L;
    private Calendar M = Calendar.getInstance();
    public ChaangeOfAddressStatus N;
    private String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    private boolean T;
    public c U;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanChangeOfAddress f21457e;

        a(VahanChangeOfAddress vahanChangeOfAddress) {
            this.f21457e = vahanChangeOfAddress;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21457e.E1().K.getSelectedItemPosition() != 0) {
                this.f21457e.J1().show();
                Object selectedItem = this.f21457e.E1().K.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21457e.O1().h1(this.f21457e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanChangeOfAddress f21458e;

        b(VahanChangeOfAddress vahanChangeOfAddress) {
            this.f21458e = vahanChangeOfAddress;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21458e.E1().E.getSelectedItemPosition() != 0) {
                this.f21458e.J1().show();
                Object selectedItem = this.f21458e.E1().E.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21458e.O1().i1(this.f21458e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(Dialog dialog, VahanChangeOfAddress vahanChangeOfAddress, View view) {
        l.f(dialog, "$d");
        l.f(vahanChangeOfAddress, "this$0");
        dialog.dismiss();
        vahanChangeOfAddress.finish();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void P1(VahanChangeOfAddress vahanChangeOfAddress, View view) {
        l.f(vahanChangeOfAddress, "this$0");
        Intent intent = new Intent(vahanChangeOfAddress, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanChangeOfAddress.K1());
        intent.putExtra("RcDetails", vahanChangeOfAddress.L1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanChangeOfAddress.T);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanChangeOfAddress.D1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanChangeOfAddress.C1());
        vahanChangeOfAddress.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void Q1(VahanChangeOfAddress vahanChangeOfAddress, View view) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.z1(vahanChangeOfAddress, vahanChangeOfAddress.H1().b("are_you_sure_you_want_to_leave", vahanChangeOfAddress.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void R1(VahanChangeOfAddress vahanChangeOfAddress, DistictModle distictModle) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            vahanChangeOfAddress.E1().D.setAdapter(new g(vahanChangeOfAddress, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void S1(VahanChangeOfAddress vahanChangeOfAddress, String str) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void T1(VahanChangeOfAddress vahanChangeOfAddress, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.M.set(1, i10);
        vahanChangeOfAddress.M.set(2, i11);
        vahanChangeOfAddress.M.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanChangeOfAddress.M.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanChangeOfAddress.M.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanChangeOfAddress.M.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanChangeOfAddress.n2(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanChangeOfAddress.E1().Q.setText(simpleDateFormat.format(vahanChangeOfAddress.M.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void U1(VahanChangeOfAddress vahanChangeOfAddress, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(vahanChangeOfAddress, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanChangeOfAddress, onDateSetListener, vahanChangeOfAddress.M.get(1), vahanChangeOfAddress.M.get(2), vahanChangeOfAddress.M.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void V1(VahanChangeOfAddress vahanChangeOfAddress, View view) {
        String str;
        Toast makeText;
        VahanChangeOfAddress vahanChangeOfAddress2 = vahanChangeOfAddress;
        l.f(vahanChangeOfAddress2, "this$0");
        String obj = vahanChangeOfAddress.E1().f29199g.getText().toString();
        String obj2 = vahanChangeOfAddress.E1().f29200h.getText().toString();
        String obj3 = vahanChangeOfAddress.E1().f29202j.getText().toString();
        String obj4 = vahanChangeOfAddress.E1().f29201i.getText().toString();
        String obj5 = vahanChangeOfAddress.E1().f29217y.getText().toString();
        String obj6 = vahanChangeOfAddress.E1().f29218z.getText().toString();
        String obj7 = vahanChangeOfAddress.E1().B.getText().toString();
        String obj8 = vahanChangeOfAddress.E1().A.getText().toString();
        if (vahanChangeOfAddress.E1().Q.getText().length() < 2) {
            str = "Please select the date";
        } else {
            if (obj.length() >= 2) {
                if (obj3.length() >= 3) {
                    String str2 = obj2;
                    if (obj2.length() >= 3) {
                        if (vahanChangeOfAddress.E1().K.getSelectedItemPosition() == 0) {
                            str = "Please select the new current address state";
                        } else if (vahanChangeOfAddress.E1().f29198f.getSelectedItemPosition() == 0) {
                            str = "Please select the new current address district";
                        } else {
                            String str3 = obj4;
                            if (obj4.length() >= 6) {
                                if (obj5.length() >= 3) {
                                    if (obj6.length() >= 3) {
                                        if (obj7.length() >= 3) {
                                            if (vahanChangeOfAddress.E1().E.getSelectedItemPosition() == 0) {
                                                str = "Please select the new permanent address state";
                                            } else if (vahanChangeOfAddress.E1().D.getSelectedItemPosition() == 0) {
                                                str = "Please select the new permanent address district";
                                            } else if (obj8.length() >= 6) {
                                                try {
                                                    Object selectedItem = vahanChangeOfAddress.E1().K.getSelectedItem();
                                                    l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                                                    Object selectedItem2 = vahanChangeOfAddress.E1().E.getSelectedItem();
                                                    l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                                                    Object selectedItem3 = vahanChangeOfAddress.E1().f29198f.getSelectedItem();
                                                    l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                                                    Object selectedItem4 = vahanChangeOfAddress.E1().D.getSelectedItem();
                                                    l.d(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                                                    vahanChangeOfAddress.J1().show();
                                                    vahanChangeOfAddress.O1().g(vahanChangeOfAddress, obj, obj3, str2, String.valueOf(((DistictModleItem) selectedItem3).getDist_cd()), str3, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString(), vahanChangeOfAddress.G1(), obj5, obj7, obj6, String.valueOf(((DistictModleItem) selectedItem4).getDist_cd()), str3, ((String) ((VahanStateModleSubList) selectedItem2).get(0)).toString(), vahanChangeOfAddress.K1(), String.valueOf(vahanChangeOfAddress.L1().getState_cd()), vahanChangeOfAddress.I1());
                                                    return;
                                                } catch (Exception unused) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            makeText = Toast.makeText(vahanChangeOfAddress2, "Please enter the valid PinCode", 0);
                            makeText.show();
                        }
                    }
                    makeText = Toast.makeText(vahanChangeOfAddress2, "Please enter the valid landmark", 0);
                    makeText.show();
                }
                makeText = Toast.makeText(vahanChangeOfAddress2, "Please enter the Village/Town/City", 0);
                makeText.show();
            }
            makeText = Toast.makeText(vahanChangeOfAddress2, "Please enter the valid house no", 0);
            makeText.show();
        }
        makeText = Toast.makeText(vahanChangeOfAddress2, str, 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void W1(VahanChangeOfAddress vahanChangeOfAddress, ChaangeOfAddressStatus chaangeOfAddressStatus) {
        VahanChangeOfAddress vahanChangeOfAddress2 = vahanChangeOfAddress;
        l.f(vahanChangeOfAddress2, "this$0");
        vahanChangeOfAddress.J1().dismiss();
        try {
            l.c(chaangeOfAddressStatus);
            vahanChangeOfAddress.m2(chaangeOfAddressStatus);
            ChaangeOfAddressStatus copy$default = vahanChangeOfAddress2.T ? ChaangeOfAddressStatus.copy$default(vahanChangeOfAddress.F1(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, new ld.h(vahanChangeOfAddress2).a(), 33554431, (Object) null) : ChaangeOfAddressStatus.copy$default(vahanChangeOfAddress.F1(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, " ", 33554431, (Object) null);
            String str = chaangeOfAddressStatus.getAppl_no().toString();
            Intent intent = new Intent(vahanChangeOfAddress2, ChangeOfAddressConfirmation.class);
            intent.putExtra(VContant.APP_NO, str);
            intent.putExtra("COV", copy$default);
            intent.putExtra("state_code", vahanChangeOfAddress.L1().getState_cd());
            intent.putExtra("rc_number", vahanChangeOfAddress.K1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
            intent.putExtra("off_code", vahanChangeOfAddress.I1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, vahanChangeOfAddress2.T);
            intent.putExtra("RC", vahanChangeOfAddress.K1());
            intent.putExtra("RcDetails", vahanChangeOfAddress.L1());
            intent.putExtra(VContant.NEXGEN_addahar_name, vahanChangeOfAddress.D1());
            intent.putExtra(VContant.NEXGEN_addahar_address, vahanChangeOfAddress.C1());
            vahanChangeOfAddress2.startActivity(intent);
            vahanChangeOfAddress.finish();
        } catch (Exception e10) {
            e10.printStackTrace();
            vahanChangeOfAddress2.h2(vahanChangeOfAddress2, "Unable to submit your request. please try again later!");
        }
    }

    /* access modifiers changed from: private */
    public static final void X1(VahanChangeOfAddress vahanChangeOfAddress, String str) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
        vahanChangeOfAddress.h2(vahanChangeOfAddress, "Unable to submit your request. please try again later!");
    }

    /* access modifiers changed from: private */
    public static final void Y1(VahanChangeOfAddress vahanChangeOfAddress, View view) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.g2();
    }

    /* access modifiers changed from: private */
    public static final void Z1(VahanChangeOfAddress vahanChangeOfAddress, View view) {
        ImageView imageView;
        int i10;
        l.f(vahanChangeOfAddress, "this$0");
        if (vahanChangeOfAddress.E1().f29196d.getVisibility() == 0) {
            vahanChangeOfAddress.E1().f29196d.setVisibility(8);
            imageView = vahanChangeOfAddress.E1().f29205m;
            i10 = R.drawable.ic_arrow_down;
        } else {
            vahanChangeOfAddress.E1().f29196d.setVisibility(0);
            imageView = vahanChangeOfAddress.E1().f29205m;
            i10 = R.drawable.ic_arrow_up;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanChangeOfAddress vahanChangeOfAddress, View view) {
        ImageView imageView;
        int i10;
        l.f(vahanChangeOfAddress, "this$0");
        if (vahanChangeOfAddress.E1().f29214v.getVisibility() == 0) {
            vahanChangeOfAddress.E1().f29214v.setVisibility(8);
            imageView = vahanChangeOfAddress.E1().f29206n;
            i10 = R.drawable.ic_arrow_down;
        } else {
            vahanChangeOfAddress.E1().f29214v.setVisibility(0);
            imageView = vahanChangeOfAddress.E1().f29206n;
            i10 = R.drawable.ic_arrow_up;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanChangeOfAddress vahanChangeOfAddress, CompoundButton compoundButton, boolean z10) {
        l.f(vahanChangeOfAddress, "this$0");
        if (z10) {
            String obj = vahanChangeOfAddress.E1().f29199g.getText().toString();
            String obj2 = vahanChangeOfAddress.E1().f29200h.getText().toString();
            String obj3 = vahanChangeOfAddress.E1().f29202j.getText().toString();
            String obj4 = vahanChangeOfAddress.E1().f29201i.getText().toString();
            if (!(obj == null || obj.length() == 0)) {
                vahanChangeOfAddress.E1().f29217y.setText(obj);
            }
            if (!(obj2 == null || obj2.length() == 0)) {
                vahanChangeOfAddress.E1().f29218z.setText(obj2);
            }
            if (!(obj3 == null || obj3.length() == 0)) {
                vahanChangeOfAddress.E1().B.setText(obj3);
            }
            if (!(obj4 == null || obj4.length() == 0)) {
                vahanChangeOfAddress.E1().A.setText(obj4);
            }
            if (vahanChangeOfAddress.E1().f29198f.getSelectedItemPosition() > 0) {
                vahanChangeOfAddress.E1().D.setSelection(vahanChangeOfAddress.E1().f29198f.getSelectedItemPosition());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanChangeOfAddress vahanChangeOfAddress, VahanStateModle vahanStateModle) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            vahanChangeOfAddress.E1().K.setAdapter(new b0(vahanChangeOfAddress, vahanStateModle));
            try {
                int N1 = vahanChangeOfAddress.N1(String.valueOf(vahanChangeOfAddress.L1().getState_cd()), vahanStateModle);
                vahanChangeOfAddress.E1().K.setSelection(N1);
                vahanChangeOfAddress.E1().K.setEnabled(false);
                vahanChangeOfAddress.E1().E.setAdapter(new b0(vahanChangeOfAddress, vahanStateModle));
                vahanChangeOfAddress.E1().E.setSelection(N1);
                vahanChangeOfAddress.E1().E.setEnabled(false);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanChangeOfAddress vahanChangeOfAddress, String str) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanChangeOfAddress vahanChangeOfAddress, DistictModle distictModle) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            vahanChangeOfAddress.E1().f29198f.setAdapter(new g(vahanChangeOfAddress, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(VahanChangeOfAddress vahanChangeOfAddress, String str) {
        l.f(vahanChangeOfAddress, "this$0");
        vahanChangeOfAddress.J1().dismiss();
    }

    private final void g2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void i2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String C1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String D1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final w8 E1() {
        w8 w8Var = this.I;
        if (w8Var != null) {
            return w8Var;
        }
        l.v("binding");
        return null;
    }

    public final ChaangeOfAddressStatus F1() {
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.N;
        if (chaangeOfAddressStatus != null) {
            return chaangeOfAddressStatus;
        }
        l.v("change_ofAddress");
        return null;
    }

    public final String G1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("formated_date");
        return null;
    }

    public final c H1() {
        c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String I1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String K1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails L1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService M1() {
        VahanProService vahanProService = this.K;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final int N1(String str, VahanStateModle vahanStateModle) {
        l.f(str, "State_code");
        l.f(vahanStateModle, "list");
        Iterator it = vahanStateModle.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (q.B0(((String) vahanStateModleSubList.get(0)).toString()).toString().equals(str)) {
                return vahanStateModle.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final h O1() {
        h hVar = this.J;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void h2(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new r(dialog));
        dialog.show();
    }

    public final void j2(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void l2(w8 w8Var) {
        l.f(w8Var, "<set-?>");
        this.I = w8Var;
    }

    public final void m2(ChaangeOfAddressStatus chaangeOfAddressStatus) {
        l.f(chaangeOfAddressStatus, "<set-?>");
        this.N = chaangeOfAddressStatus;
    }

    public final void n2(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void o2(c cVar) {
        l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public void onBackPressed() {
        z1(this, H1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_change_of_address);
        w8 c10 = w8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        l2(c10);
        setContentView((View) E1().b());
        e.f17509a.s2(this, E1());
        o2(new c(this));
        t2(VahanProService.f21196b.b(this));
        q2(new ProgressDialog(this));
        J1().setMessage("Please wait...");
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        u2((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(M1()))).a(h.class));
        r2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        s2((NrvDetails) serializableExtra);
        p2(String.valueOf(getIntent().getStringExtra("off_code")));
        k2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        j2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.T = booleanExtra;
        if (booleanExtra) {
            E1().I.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.T;
        LinearLayout linearLayout = E1().I.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        o2(new c(this));
        TextView textView = E1().S;
        textView.setText(H1().b("vehicle_no", "Vehicle No.:") + ' ' + K1());
        E1().f29195c.setText(L1().getRc_present_address());
        E1().C.setText(L1().getRc_permanent_address());
        this.O = L1().getState_cd();
        E1().T.setText(H1().b("view_vehicle_details", "View Vehicle Details"));
        E1().T.setPaintFlags(E1().T.getPaintFlags() | 8);
        E1().T.setOnClickListener(new ai.h(this));
        E1().O.f28305f.setOnClickListener(new z(this));
        E1().O.f28306g.setOnClickListener(new a0(this));
        try {
            J1().show();
            O1().V0(this);
        } catch (Exception unused) {
        }
        E1().f29205m.setOnClickListener(new i(this));
        E1().f29206n.setOnClickListener(new j(this));
        E1().J.setOnCheckedChangeListener(new k(this));
        Spinner spinner = E1().K;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        Spinner spinner2 = E1().E;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new b(this));
        }
        O1().U0().g(this, new ai.l(this));
        O1().W0().g(this, new m(this));
        O1().D().g(this, new n(this));
        O1().E().g(this, new o(this));
        O1().F().g(this, new s(this));
        O1().G().g(this, new t(this));
        E1().Q.setOnClickListener(new v(this, new u(this)));
        E1().N.setOnClickListener(new w(this));
        O1().w().g(this, new x(this));
        O1().x().g(this, new y(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        z1(this, H1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void q2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void r2(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void s2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void t2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.K = vahanProService;
    }

    public final void u2(h hVar) {
        l.f(hVar, "<set-?>");
        this.J = hVar;
    }

    public final void z1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new p(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new q(dialog));
        dialog.show();
    }
}
