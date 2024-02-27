package com.nic.mparivahan.Sos;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.NetworkServices.SOSService;
import com.nic.mparivahan.Sos.SModle.ContactSaveSucess;
import com.nic.mparivahan.Sos.SModle.ContactUpdate;
import com.nic.mparivahan.Sos.SModle.DeletResult;
import com.nic.mparivahan.Sos.SModle.GetRelationMaster;
import com.nic.mparivahan.Sos.SModle.MparRelation;
import com.nic.mparivahan.Sos.SModle.MparSosContact;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import md.i;
import md.j;
import md.k;
import md.n;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class AddContactScreen extends androidx.appcompat.app.d {
    public qd.a G;
    private SOSService H;
    public MovableFloatingActionButton I;
    public RecyclerView J;
    public ld.g K;
    public ProgressDialog L;
    private int M;
    public od.c N;
    private HashMap O = new HashMap();
    public ArrayList P;
    private ArrayList Q = new ArrayList();
    private HashMap R = new HashMap();
    public LinearLayout S;
    public LinearLayout T;
    public LinearLayout U;
    private ni.h V;
    public ld.c W;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9603e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AddContactScreen addContactScreen) {
            super(1);
            this.f9603e = addContactScreen;
        }

        public final void b(String str) {
            if (this.f9603e.F1().isShowing()) {
                this.f9603e.F1().dismiss();
            }
            Log.e("error", str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AddContactScreen addContactScreen) {
            super(1);
            this.f9604e = addContactScreen;
        }

        public final void b(DeletResult deletResult) {
            AddContactScreen addContactScreen;
            ld.c K1;
            String str;
            String str2;
            Log.e("delet -- >", deletResult.toString());
            if (p.o(deletResult.getStatusCode().toString(), "SOS001", true)) {
                this.f9604e.F1().dismiss();
                this.f9604e.B1().H(this.f9604e.G1());
                if (this.f9604e.B1().C() == 0) {
                    this.f9604e.z1().setVisibility(0);
                    this.f9604e.I1().setVisibility(8);
                } else if (this.f9604e.B1().C() >= 5) {
                    this.f9604e.I1().setVisibility(4);
                    this.f9604e.y1().setVisibility(4);
                } else {
                    this.f9604e.I1().setVisibility(0);
                    this.f9604e.y1().setVisibility(0);
                }
                addContactScreen = this.f9604e;
                K1 = addContactScreen.K1();
                str = "label_contact_removed_successfully";
                str2 = "Contact removed successfully";
            } else {
                this.f9604e.F1().dismiss();
                addContactScreen = this.f9604e;
                K1 = addContactScreen.K1();
                str = "label_contact_failed_to_remove";
                str2 = "Failed to remove the contact";
            }
            Toast.makeText(addContactScreen, K1.b(str, str2), 0).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DeletResult) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9605e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AddContactScreen addContactScreen) {
            super(1);
            this.f9605e = addContactScreen;
        }

        public final void b(GetRelationMaster getRelationMaster) {
            if (p.o(getRelationMaster.getStatusCode(), "MSTR001", true)) {
                AddContactScreen addContactScreen = this.f9605e;
                List<MparRelation> mparRelation = getRelationMaster.getMparRelation();
                cm.l.d(mparRelation, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Sos.SModle.MparRelation>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Sos.SModle.MparRelation> }");
                addContactScreen.e2((ArrayList) mparRelation);
                Iterator it = this.f9605e.C1().iterator();
                while (it.hasNext()) {
                    MparRelation mparRelation2 = (MparRelation) it.next();
                    Log.e("item", mparRelation2.getRelName());
                    this.f9605e.J1().put(Integer.valueOf(mparRelation2.getRelId()), mparRelation2.getRelName());
                }
                this.f9605e.C1().add(0, new MparRelation(0, String.valueOf(this.f9605e.K1().b("label_select_relation", "Select Relation")), 0));
            }
            this.f9605e.M1().h(Long.parseLong(this.f9605e.L1().k()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetRelationMaster) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9606e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddContactScreen addContactScreen) {
            super(1);
            this.f9606e = addContactScreen;
        }

        public final void b(String str) {
            this.f9606e.F1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9607e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddContactScreen addContactScreen) {
            super(1);
            this.f9607e = addContactScreen;
        }

        public final void b(String str) {
            this.f9607e.F1().dismiss();
            try {
                this.f9607e.D1().clear();
                JSONObject jSONObject = new JSONObject(str.toString());
                if (jSONObject.has("statusCode")) {
                    String string = jSONObject.getString("statusCode");
                    if (p.o(string.toString(), "SOS001", true)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("sosContacts");
                        int length = jSONArray.length() - 1;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                int i11 = jSONObject2.getInt("soscRecordId");
                                String string2 = jSONObject2.getString("soscCreatedAt");
                                int i12 = jSONObject2.getInt("soscCtzId");
                                String string3 = jSONObject2.getString("soscMobile");
                                String string4 = jSONObject2.getString("soscName");
                                int i13 = jSONObject2.getInt("soscRelation");
                                int i14 = jSONObject2.getInt("soscStatus");
                                String string5 = jSONObject2.getString("soscUpdatedAt");
                                if (i14 == 1) {
                                    Log.e("ContactListMaster --> ", VContant.DUPLICATE_RC_PURPOSE_CODE);
                                    cm.l.c(string2);
                                    cm.l.c(string3);
                                    cm.l.c(string4);
                                    cm.l.c(string5);
                                    this.f9607e.D1().add(new MparSosContact(string2, i12, string3, string4, i11, i13, i14, string5));
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        if (this.f9607e.D1().size() > 0) {
                            Log.e("ContactListMaster --> ", "1");
                            this.f9607e.z1().setVisibility(8);
                            this.f9607e.A1().setVisibility(0);
                            this.f9607e.I1().setVisibility(0);
                            AddContactScreen addContactScreen = this.f9607e;
                            addContactScreen.d2(new od.c(addContactScreen.D1(), this.f9607e.J1(), this.f9607e));
                            this.f9607e.A1().setAdapter(this.f9607e.B1());
                            if (this.f9607e.D1().size() >= 5) {
                                this.f9607e.y1().setVisibility(4);
                                return;
                            }
                            return;
                        }
                        this.f9607e.y1().setVisibility(0);
                        this.f9607e.A1().setVisibility(8);
                        this.f9607e.I1().setVisibility(8);
                        this.f9607e.z1().setVisibility(0);
                    } else if (p.o(string, "SOS099", true)) {
                        this.f9607e.z1().setVisibility(0);
                        this.f9607e.y1().setVisibility(0);
                        this.f9607e.A1().setVisibility(8);
                        this.f9607e.I1().setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9608e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AddContactScreen addContactScreen) {
            super(1);
            this.f9608e = addContactScreen;
        }

        public final void b(String str) {
            this.f9608e.F1().dismiss();
            Log.e("error", str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AddContactScreen f9609e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AddContactScreen addContactScreen) {
            super(1);
            this.f9609e = addContactScreen;
        }

        public final void b(ContactSaveSucess contactSaveSucess) {
            AddContactScreen addContactScreen;
            String statusDesc;
            if (p.o(contactSaveSucess.getStatusCode().toString(), "SOS001", true)) {
                AddContactScreen addContactScreen2 = this.f9609e;
                Toast.makeText(addContactScreen2, addContactScreen2.K1().b("label_contact_added_successfully", "Contact details added successfully"), 0).show();
                this.f9609e.M1().h(Long.parseLong(this.f9609e.L1().k()));
                return;
            }
            if (p.o(contactSaveSucess.getStatusCode().toString(), "SOS006", true)) {
                this.f9609e.F1().dismiss();
                addContactScreen = this.f9609e;
                statusDesc = contactSaveSucess.getStatusDesc().toString();
            } else if (p.o(contactSaveSucess.getStatusCode(), "SOS005", true)) {
                this.f9609e.F1().dismiss();
                addContactScreen = this.f9609e;
                statusDesc = contactSaveSucess.getStatusDesc();
            } else {
                this.f9609e.F1().dismiss();
                AddContactScreen addContactScreen3 = this.f9609e;
                addContactScreen3.Y1(addContactScreen3.K1().b("label_unable_add_contact", "Unable to add the contact details, Please try after some time!"));
                return;
            }
            addContactScreen.Y1(statusDesc);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ContactSaveSucess) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9610a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f9610a = lVar;
        }

        public final pl.c a() {
            return this.f9610a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9610a.invoke(obj);
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
    public static final void N1(AddContactScreen addContactScreen, View view) {
        cm.l.f(addContactScreen, "this$0");
        addContactScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void O1(AddContactScreen addContactScreen, View view) {
        cm.l.f(addContactScreen, "this$0");
        addContactScreen.t1(addContactScreen);
    }

    /* access modifiers changed from: private */
    public static final void P1(AddContactScreen addContactScreen, String str) {
        cm.l.f(addContactScreen, "this$0");
        addContactScreen.F1().dismiss();
        Log.e("error", str.toString());
    }

    /* access modifiers changed from: private */
    public static final void Q1(AddContactScreen addContactScreen, ContactUpdate contactUpdate) {
        cm.l.f(addContactScreen, "this$0");
        if (p.o(contactUpdate.getStatusCode().toString(), "SOS001", true)) {
            Toast.makeText(addContactScreen, addContactScreen.K1().b("label_contact_updated_successfully", "Contact details updated successfully"), 0).show();
            addContactScreen.M1().h(Long.parseLong(addContactScreen.L1().k()));
        } else if (p.o(contactUpdate.getStatusCode(), "SOS005", true)) {
            if (addContactScreen.F1().isShowing()) {
                addContactScreen.F1().dismiss();
            }
            addContactScreen.Y1(contactUpdate.getStatusDesc());
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(AddContactScreen addContactScreen, String str) {
        cm.l.f(addContactScreen, "this$0");
        if (addContactScreen.F1().isShowing()) {
            addContactScreen.F1().dismiss();
        }
        Toast.makeText(addContactScreen, addContactScreen.K1().b("label_contact_failed_to_remove", "Failed to remove the contact"), 0).show();
    }

    private final void S1(Dialog dialog, Context context, String str, String str2, String str3, String str4, String str5) {
        cm.l.c(context);
        Context context2 = context;
        Dialog dialog2 = new Dialog(context);
        dialog2.setContentView(R.layout.confirmation_dialog);
        Window window = dialog2.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog2.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog2.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog2.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog2.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(K1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(K1().b("button_proceed", "Proceed"));
        textView2.setText(K1().b("button_cancel", "Cancel"));
        String str6 = str;
        ((TextView) findViewById).setText(str);
        textView2.setOnClickListener(new md.d(dialog2));
        textView.setOnClickListener(new md.e(dialog2, dialog, this, str2, str3, str4, str5));
        dialog2.show();
    }

    private final void T1(Context context, String str, int i10, int i11) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(K1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(K1().b("button_proceed", "Proceed"));
        textView2.setText(K1().b("button_cancel", "Cancel"));
        ((TextView) findViewById).setText(str);
        textView2.setOnClickListener(new md.b(dialog));
        textView.setOnClickListener(new md.c(dialog, this, i11));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void V1(Dialog dialog, Dialog dialog2, AddContactScreen addContactScreen, String str, String str2, String str3, String str4, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dialog2, "$mDialog");
        cm.l.f(addContactScreen, "this$0");
        cm.l.f(str, "$soscRecordId");
        cm.l.f(str2, "$mobile_no");
        cm.l.f(str3, "$name");
        cm.l.f(str4, "$reltion_contact");
        dialog.dismiss();
        dialog2.dismiss();
        addContactScreen.F1().show();
        addContactScreen.M1().u(Long.parseLong(str), Long.parseLong(addContactScreen.L1().k()), str2, str3, str4);
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, AddContactScreen addContactScreen, int i10, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(addContactScreen, "this$0");
        dialog.dismiss();
        addContactScreen.F1().show();
        addContactScreen.M1().g(String.valueOf(i10));
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void m2(EditText editText, EditText editText2, AddContactScreen addContactScreen, Spinner spinner, Dialog dialog, MparSosContact mparSosContact, View view) {
        ld.c K1;
        String str;
        String str2;
        cm.l.f(editText, "$full_name");
        cm.l.f(editText2, "$phone_number");
        cm.l.f(addContactScreen, "this$0");
        cm.l.f(spinner, "$select_spinner");
        cm.l.f(dialog, "$d");
        cm.l.f(mparSosContact, "$mcontact");
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        if (obj.length() < 3) {
            K1 = addContactScreen.K1();
            str = "please_enter_valid_name";
            str2 = "Please enter the valid name";
        } else if (obj2.length() < 10) {
            K1 = addContactScreen.K1();
            str = "label_log_entr_vali_mobno";
            str2 = "Please enter the valid mobile number";
        } else if (spinner.getSelectedItemPosition() == 0) {
            K1 = addContactScreen.K1();
            str = "label_please_select_relation";
            str2 = "Please select the relation";
        } else {
            Object selectedItem = spinner.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Sos.SModle.MparRelation");
            addContactScreen.S1(dialog, addContactScreen, addContactScreen.K1().b("label_want_to_proceed", addContactScreen.getString(R.string.are_you_want_to_proceed)), String.valueOf(mparSosContact.getSoscRecordId()), obj2, obj, String.valueOf(((MparRelation) selectedItem).getRelId()));
            return;
        }
        Toast.makeText(addContactScreen, K1.b(str, str2), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void n2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void v1(EditText editText, EditText editText2, AddContactScreen addContactScreen, Spinner spinner, Dialog dialog, View view) {
        ld.c K1;
        String str;
        String str2;
        Toast makeText;
        String b10;
        cm.l.f(editText, "$full_name");
        cm.l.f(editText2, "$phone_number");
        cm.l.f(addContactScreen, "this$0");
        cm.l.f(spinner, "$select_spinner");
        cm.l.f(dialog, "$d");
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        if (obj.length() < 3) {
            K1 = addContactScreen.K1();
            str = "please_enter_valid_name";
            str2 = "Please enter the valid name";
        } else if (obj2.length() < 10) {
            b10 = addContactScreen.K1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number");
            makeText = Toast.makeText(addContactScreen, b10, 0);
            makeText.show();
        } else if (!t8.c.f16582a.q(obj2)) {
            makeText = Toast.makeText(addContactScreen.getApplicationContext(), addContactScreen.K1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 1);
            makeText.show();
        } else if (spinner.getSelectedItemPosition() == 0) {
            K1 = addContactScreen.K1();
            str = "label_please_select_relation";
            str2 = "Please select the relation";
        } else {
            Object selectedItem = spinner.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Sos.SModle.MparRelation");
            addContactScreen.F1().show();
            addContactScreen.M1().t(Long.parseLong(addContactScreen.L1().k()), obj, obj2, String.valueOf(((MparRelation) selectedItem).getRelId()));
            dialog.dismiss();
            return;
        }
        b10 = K1.b(str, str2);
        makeText = Toast.makeText(addContactScreen, b10, 0);
        makeText.show();
    }

    public final RecyclerView A1() {
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            return recyclerView;
        }
        cm.l.v("contactRecyclerView");
        return null;
    }

    public final od.c B1() {
        od.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("contactadapter");
        return null;
    }

    public final ArrayList C1() {
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("list");
        return null;
    }

    public final ArrayList D1() {
        return this.Q;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.U;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("nexgenarrow");
        return null;
    }

    public final ProgressDialog F1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final int G1() {
        return this.M;
    }

    public final int H1(ArrayList arrayList, HashMap hashMap, int i10) {
        cm.l.f(arrayList, "list");
        cm.l.f(hashMap, "relationMasterHashMap");
        try {
            return arrayList.indexOf(new MparRelation(i10, String.valueOf(hashMap.get(Integer.valueOf(i10))), 1));
        } catch (Exception unused) {
            return 0;
        }
    }

    public final LinearLayout I1() {
        LinearLayout linearLayout = this.T;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("recycle_linear");
        return null;
    }

    public final HashMap J1() {
        return this.O;
    }

    public final ld.c K1() {
        ld.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ld.g L1() {
        ld.g gVar = this.K;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final qd.a M1() {
        qd.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("sosViewModle");
        return null;
    }

    public final void Y1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(K1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(K1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new j(dialog));
        dialog.show();
    }

    public final void a2(MovableFloatingActionButton movableFloatingActionButton) {
        cm.l.f(movableFloatingActionButton, "<set-?>");
        this.I = movableFloatingActionButton;
    }

    public final void b2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.S = linearLayout;
    }

    public final void c2(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.J = recyclerView;
    }

    public final void d2(od.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void e2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.P = arrayList;
    }

    public final void f2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.U = linearLayout;
    }

    public final void g2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void h2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.T = linearLayout;
    }

    public final void i2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void j2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.K = gVar;
    }

    public final void k2(qd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.G = aVar;
    }

    public final void l2(Context context, MparSosContact mparSosContact) {
        cm.l.f(mparSosContact, "mcontact");
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.update_contact_details);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.save_button);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById2 = dialog.findViewById(R.id.closebutton);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById3 = dialog.findViewById(R.id.full_name);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.phone_number);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.select_spinner);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.Spinner");
        Spinner spinner = (Spinner) findViewById5;
        String soscName = mparSosContact.getSoscName();
        String soscMobile = mparSosContact.getSoscMobile();
        editText.setText(soscName.toString());
        editText2.setText(soscMobile.toString());
        View findViewById6 = dialog.findViewById(R.id.tv_name);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(K1().b("label_name", "Name"));
        ((TextView) dialog.findViewById(R.id.tv_phone_no)).setText(K1().b("label_phone_number", "Phone Number"));
        ((TextView) dialog.findViewById(R.id.tv_relation)).setText(K1().b("label_relation", "Relation"));
        ((TextView) dialog.findViewById(R.id.tv_update)).setText(K1().b("btn_Update", "Update"));
        ((TextView) dialog.findViewById(R.id.tv_close)).setText(K1().b("btn_dl_serv_close", "Close"));
        C1().add(0, new MparRelation(0, String.valueOf(K1().b("label_select_relation", "Select Relation")), 0));
        spinner.setAdapter(new od.d(this, C1()));
        spinner.setSelection(H1(C1(), this.O, mparSosContact.getSoscRelation()));
        ((LinearLayout) findViewById2).setOnClickListener(new md.m(dialog));
        ((LinearLayout) findViewById).setOnClickListener(new n(editText, editText2, this, spinner, dialog, mparSosContact));
        dialog.show();
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ni.h c10 = ni.h.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.V = c10;
        SOSService sOSService = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        i2(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        ni.h hVar = this.V;
        if (hVar == null) {
            cm.l.v("binding");
            hVar = null;
        }
        aVar.r(this, hVar);
        this.H = SOSService.f9615a.b(this);
        View findViewById = findViewById(R.id.add_person_fab);
        cm.l.e(findViewById, "findViewById(...)");
        a2((MovableFloatingActionButton) findViewById);
        View findViewById2 = findViewById(R.id.contactRecyclerView);
        cm.l.e(findViewById2, "findViewById(...)");
        c2((RecyclerView) findViewById2);
        View findViewById3 = findViewById(R.id.add_to_contact_linear);
        cm.l.e(findViewById3, "findViewById(...)");
        b2((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.recycle_linear);
        cm.l.e(findViewById4, "findViewById(...)");
        h2((LinearLayout) findViewById4);
        View findViewById5 = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById5, "findViewById(...)");
        f2((LinearLayout) findViewById5);
        A1().setLayoutManager(new LinearLayoutManager(this, 1, false));
        j2(new ld.g(this));
        g2(new ProgressDialog(this));
        F1().setMessage(K1().b("label_challan_please_wait", "Please wait..."));
        F1().setCancelable(false);
        F1().setCanceledOnTouchOutside(false);
        E1().setOnClickListener(new md.a(this));
        y1().setOnClickListener(new md.f(this));
        SOSService sOSService2 = this.H;
        if (sOSService2 == null) {
            cm.l.v("sosService");
        } else {
            sOSService = sOSService2;
        }
        k2((qd.a) new u0((x0) this, (u0.b) new qd.b(new pd.a(sOSService))).a(qd.a.class));
        F1().show();
        M1().q();
        M1().o().g(this, new h(new c(this)));
        M1().p().g(this, new h(new d(this)));
        M1().m().g(this, new h(new e(this)));
        M1().n().g(this, new h(new f(this)));
        M1().j().g(this, new h(new g(this)));
        M1().i().g(this, new md.g(this));
        M1().r().g(this, new md.h(this));
        M1().s().g(this, new h(new a(this)));
        M1().k().g(this, new h(new b(this)));
        M1().l().g(this, new i(this));
    }

    public final void t1(Context context) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.save_contact_diloge);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.save_button);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById2 = dialog.findViewById(R.id.closebutton);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById3 = dialog.findViewById(R.id.full_name);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.phone_number);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.select_spinner);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.Spinner");
        Spinner spinner = (Spinner) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.tv_name);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(K1().b("label_name", "Name"));
        editText.setHint(K1().b("label_log_entr_name", "Name"));
        ((TextView) dialog.findViewById(R.id.tv_phone_no)).setText(K1().b("label_phone_number", "Phone Number"));
        editText2.setHint(K1().b("label_log_entr_mob_no", "Please enter the mobile number"));
        ((TextView) dialog.findViewById(R.id.tv_relation)).setText(K1().b("label_relation", "Relation"));
        ((TextView) dialog.findViewById(R.id.tv_save)).setText(K1().b("label_save", "Save"));
        ((TextView) dialog.findViewById(R.id.tv_close)).setText(K1().b("btn_dl_serv_close", "Close"));
        spinner.setAdapter(new od.d(this, C1()));
        ((LinearLayout) findViewById2).setOnClickListener(new k(dialog));
        ((LinearLayout) findViewById).setOnClickListener(new md.l(editText, editText2, this, spinner, dialog));
        dialog.show();
    }

    public void w1(int i10, int i11) {
        this.M = i10;
        T1(this, K1().b("label_want_to_proceed", getString(R.string.are_you_want_to_proceed)), i10, i11);
    }

    public void x1(Integer num, MparSosContact mparSosContact) {
        cm.l.f(mparSosContact, "mcontact");
        l2(this, mparSosContact);
    }

    public final MovableFloatingActionButton y1() {
        MovableFloatingActionButton movableFloatingActionButton = this.I;
        if (movableFloatingActionButton != null) {
            return movableFloatingActionButton;
        }
        cm.l.v("addContactFloatingButton");
        return null;
    }

    public final LinearLayout z1() {
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("add_to_contact_linear");
        return null;
    }
}
