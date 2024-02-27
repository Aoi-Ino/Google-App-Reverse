package com.nic.mparivahan.Language;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Language.Modle.GetLanguageStrings;
import com.nic.mparivahan.Language.Modle.LangJSON;
import com.nic.mparivahan.Language.Modle.Language;
import com.nic.mparivahan.Language.Modle.LanguageModle;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import pl.x;
import yb.i;
import yb.j;
import yb.k;
import yb.l;

public final class ChooseLanguagScreen extends d implements l {
    public mi.a G;
    public LanguageService H;
    public ProgressDialog I;
    public Button J;
    private String K = "english";
    public ld.c L;
    public TextView M;
    public TextView N;
    public LinearLayout O;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChooseLanguagScreen f9256e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView f9257f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChooseLanguagScreen chooseLanguagScreen, RecyclerView recyclerView) {
            super(1);
            this.f9256e = chooseLanguagScreen;
            this.f9257f = recyclerView;
        }

        public final void b(LanguageModle languageModle) {
            try {
                if (this.f9256e.n1().isShowing()) {
                    this.f9256e.n1().dismiss();
                }
                this.f9256e.m1().setVisibility(0);
                this.f9256e.l1().h(this.f9256e.l1().d());
                List<Language> languages = languageModle.getLanguages();
                cm.l.d(languages, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Language.Modle.Language>");
                ArrayList arrayList = (ArrayList) languages;
                Collections.sort(arrayList);
                ChooseLanguagScreen chooseLanguagScreen = this.f9256e;
                this.f9257f.setAdapter(new zb.d(arrayList, chooseLanguagScreen, chooseLanguagScreen));
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((LanguageModle) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChooseLanguagScreen f9258e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChooseLanguagScreen chooseLanguagScreen) {
            super(1);
            this.f9258e = chooseLanguagScreen;
        }

        public final void b(String str) {
            if (this.f9258e.n1().isShowing()) {
                this.f9258e.n1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9259a;

        c(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f9259a = lVar;
        }

        public final pl.c a() {
            return this.f9259a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9259a.invoke(obj);
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

    private final void k1() {
        try {
            if (n1().isShowing()) {
                n1().dismiss();
            }
            n1().show();
            q1().i();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(ChooseLanguagScreen chooseLanguagScreen, View view) {
        cm.l.f(chooseLanguagScreen, "this$0");
        chooseLanguagScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void s1(ChooseLanguagScreen chooseLanguagScreen, View view) {
        cm.l.f(chooseLanguagScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(chooseLanguagScreen)) {
            chooseLanguagScreen.n1().show();
            mi.a q12 = chooseLanguagScreen.q1();
            String str = chooseLanguagScreen.K;
            cm.l.c(str);
            q12.j(str);
            return;
        }
        Toast.makeText(chooseLanguagScreen, chooseLanguagScreen.getString(R.string.kindly_check_your_internet_connection), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void t1(ChooseLanguagScreen chooseLanguagScreen, GetLanguageStrings getLanguageStrings) {
        Class<DashBoard> cls = DashBoard.class;
        cm.l.f(chooseLanguagScreen, "this$0");
        try {
            ld.c cVar = new ld.c(chooseLanguagScreen);
            cVar.a();
            cVar.f(chooseLanguagScreen.K);
            if (getLanguageStrings.getLangJSON().size() > 0) {
                List<LangJSON> langJSON = getLanguageStrings.getLangJSON();
                int size = langJSON.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ka.c.f13158a.m(langJSON.get(i10).getText_value());
                    String text_code = langJSON.get(i10).getText_code();
                    String str = null;
                    String obj = text_code != null ? q.B0(text_code).toString() : null;
                    String text_value = langJSON.get(i10).getText_value();
                    if (text_value != null) {
                        str = q.B0(text_value).toString();
                    }
                    cVar.g(obj, str);
                }
                chooseLanguagScreen.n1().dismiss();
                chooseLanguagScreen.startActivity(new Intent(chooseLanguagScreen, cls));
                chooseLanguagScreen.finishAffinity();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                ld.c cVar2 = new ld.c(chooseLanguagScreen);
                JSONArray jSONArray = new JSONArray(ac.a.f399a.a(chooseLanguagScreen, chooseLanguagScreen.K + ".json"));
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    String string = jSONObject.getString("text_code");
                    cm.l.e(string, "getString(...)");
                    String obj2 = q.B0(string).toString();
                    String string2 = jSONObject.getString("text_value");
                    cm.l.e(string2, "getString(...)");
                    cVar2.g(obj2, q.B0(string2).toString());
                }
                chooseLanguagScreen.n1().dismiss();
                chooseLanguagScreen.startActivity(new Intent(chooseLanguagScreen, cls));
                chooseLanguagScreen.finishAffinity();
            } catch (Exception unused) {
                chooseLanguagScreen.n1().dismiss();
            }
        }
    }

    public final void A1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final void B1(mi.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.G = aVar;
    }

    public void S(String str, int i10, String str2, String str3) {
        cm.l.f(str2, "language");
        cm.l.f(str3, "choose");
        cm.l.c(str);
        this.K = str;
        i1().setText(str2);
        j1().setText(str3);
    }

    public final Button i1() {
        Button button = this.J;
        if (button != null) {
            return button;
        }
        cm.l.v("btnContinue");
        return null;
    }

    public final TextView j1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        cm.l.v("choose_language");
        return null;
    }

    public final ld.c l1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final LinearLayout m1() {
        LinearLayout linearLayout = this.O;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("languageLayout");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final LanguageService o1() {
        LanguageService languageService = this.H;
        if (languageService != null) {
            return languageService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_choose_languag_screen);
        z1(LanguageService.f9260a.a(this));
        y1(new ProgressDialog(this));
        n1().setMessage("Please wait...");
        n1().setCancelable(false);
        n1().setCanceledOnTouchOutside(false);
        w1(new ld.c(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        View findViewById = findViewById(R.id.choose_language);
        cm.l.e(findViewById, "findViewById(...)");
        v1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.language_layout);
        cm.l.e(findViewById2, "findViewById(...)");
        x1((LinearLayout) findViewById2);
        View findViewById3 = findViewById(R.id.vahan_service_lable);
        cm.l.e(findViewById3, "findViewById(...)");
        A1((TextView) findViewById3);
        p1().setText(l1().b("choose_language", "Choose Language"));
        View findViewById4 = findViewById(R.id.btn_continue);
        cm.l.e(findViewById4, "findViewById(...)");
        u1((Button) findViewById4);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setHasFixedSize(true);
        ((AppCompatImageView) findViewById(R.id.mvvm_back)).setOnClickListener(new i(this));
        B1((mi.a) new u0((x0) this, (u0.b) new li.a(new ji.a(o1()))).a(mi.a.class));
        k1();
        q1().h().g(this, new c(new a(this, recyclerView)));
        q1().g().g(this, new c(new b(this)));
        i1().setOnClickListener(new j(this));
        q1().l().g(this, new k(this));
    }

    public final TextView p1() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        cm.l.v("vahan_service_lable");
        return null;
    }

    public final mi.a q1() {
        mi.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public void u(String str, int i10) {
        cm.l.c(str);
        this.K = str;
    }

    public final void u1(Button button) {
        cm.l.f(button, "<set-?>");
        this.J = button;
    }

    public final void v1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.M = textView;
    }

    public final void w1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void x1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.O = linearLayout;
    }

    public final void y1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void z1(LanguageService languageService) {
        cm.l.f(languageService, "<set-?>");
        this.H = languageService;
    }
}
