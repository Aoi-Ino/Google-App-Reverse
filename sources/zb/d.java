package zb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm.u;
import com.nic.mparivahan.Language.Modle.Language;
import com.nic.mparivahan.R;
import gl.t;
import java.util.ArrayList;
import ld.c;
import yb.l;

public final class d extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18997d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18998e;

    /* renamed from: f  reason: collision with root package name */
    private final l f18999f;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final ImageView f19000y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f19001z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            cm.l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.image);
            cm.l.e(findViewById, "findViewById(...)");
            this.f19000y = (ImageView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.ll_select);
            cm.l.e(findViewById2, "findViewById(...)");
            this.f19001z = (LinearLayout) findViewById2;
        }

        public final ImageView O() {
            return this.f19000y;
        }

        public final LinearLayout P() {
            return this.f19001z;
        }
    }

    public d(ArrayList arrayList, Context context, l lVar) {
        cm.l.f(arrayList, "language_modle");
        cm.l.f(context, "context");
        cm.l.f(lVar, "mLanguageClickInterface");
        this.f18997d = arrayList;
        this.f18998e = context;
        this.f18999f = lVar;
    }

    /* access modifiers changed from: private */
    public static final void C(d dVar, Language language, int i10, u uVar, a aVar, View view) {
        l lVar;
        String str;
        String str2;
        l lVar2;
        String str3;
        String str4;
        String str5;
        l lVar3;
        String str6;
        String str7;
        cm.l.f(dVar, "this$0");
        cm.l.f(language, "$ItemsViewModel");
        cm.l.f(uVar, "$languageKeySession");
        cm.l.f(aVar, "$holder");
        dVar.f18999f.u(language.getLangCode(), i10);
        if (language.getLangId() == 2) {
            ((c) uVar.f20234e).h(language.getLangCode());
            dVar.E(i10, dVar.f18997d.size());
            t.p(dVar.f18998e).i(R.drawable.english).c(aVar.O());
            lVar3 = dVar.f18999f;
            str6 = language.getLangCode().toString();
            str7 = "Choose Language";
        } else {
            if (language.getLangId() == 10) {
                ((c) uVar.f20234e).h(language.getLangCode());
                dVar.E(i10, dVar.f18997d.size());
                t.p(dVar.f18998e).i(R.drawable.gujarati).c(aVar.O());
                lVar2 = dVar.f18999f;
                str3 = language.getLangCode().toString();
                str4 = "ગુજરાતીમાં ચાલુ રાખો";
                str5 = "ભાષા પસંદ કરો";
            } else if (language.getLangId() == 9) {
                ((c) uVar.f20234e).h(language.getLangCode());
                dVar.E(i10, dVar.f18997d.size());
                t.p(dVar.f18998e).i(R.drawable.kannada).c(aVar.O());
                lVar3 = dVar.f18999f;
                str6 = language.getLangCode().toString();
                str7 = "ಭಾಷೆಯನ್ನು ಆರಿಸಿ";
            } else if (language.getLangId() == 6) {
                ((c) uVar.f20234e).h(language.getLangCode());
                dVar.E(i10, dVar.f18997d.size());
                t.p(dVar.f18998e).i(R.drawable.malayalam).c(aVar.O());
                lVar2 = dVar.f18999f;
                str3 = language.getLangCode().toString();
                str4 = "ഇംഗ്ലീഷിൽ തുടരുക";
                str5 = "ഭാഷ തിരഞ്ഞെടുക്കുക";
            } else if (language.getLangId() == 4) {
                ((c) uVar.f20234e).h(language.getLangCode());
                dVar.E(i10, dVar.f18997d.size());
                t.p(dVar.f18998e).i(R.drawable.marathi).c(aVar.O());
                lVar2 = dVar.f18999f;
                str3 = language.getLangCode().toString();
                str4 = "मराठीत सुरू ठेवा";
                str5 = "भाषा निवडा";
            } else if (language.getLangId() == 11) {
                return;
            } else {
                if (language.getLangId() == 3) {
                    ((c) uVar.f20234e).h(language.getLangCode());
                    dVar.E(i10, dVar.f18997d.size());
                    t.p(dVar.f18998e).i(R.drawable.punjabi).c(aVar.O());
                    lVar3 = dVar.f18999f;
                    str6 = language.getLangCode().toString();
                    str7 = "ਭਾਸ਼ਾ ਚੁਣੋ";
                } else {
                    if (language.getLangId() == 7) {
                        ((c) uVar.f20234e).h(language.getLangCode());
                        dVar.E(i10, dVar.f18997d.size());
                        t.p(dVar.f18998e).i(R.drawable.tamil).c(aVar.O());
                        lVar = dVar.f18999f;
                        str = language.getLangCode().toString();
                        str2 = "తమిళంలో కొనసాగండి";
                    } else if (language.getLangId() == 8) {
                        ((c) uVar.f20234e).h(language.getLangCode());
                        dVar.E(i10, dVar.f18997d.size());
                        t.p(dVar.f18998e).i(R.drawable.telugu).c(aVar.O());
                        lVar2 = dVar.f18999f;
                        str3 = language.getLangCode().toString();
                        str4 = "తెలుగులోనే కొనసాగించండి";
                        str5 = "భాషను ఎంచుకోండి";
                    } else if (language.getLangId() == 12) {
                        ((c) uVar.f20234e).h(language.getLangCode());
                        dVar.E(i10, dVar.f18997d.size());
                        t.p(dVar.f18998e).i(R.drawable.asmiya).c(aVar.O());
                        lVar2 = dVar.f18999f;
                        str3 = language.getLangCode().toString();
                        str4 = "অসমীয়াত অব্যাহত ৰাখক";
                        str5 = "ভাষা বাছক";
                    } else if (language.getLangId() == 1) {
                        ((c) uVar.f20234e).h(language.getLangCode());
                        dVar.E(i10, dVar.f18997d.size());
                        t.p(dVar.f18998e).i(R.drawable.hindi).c(aVar.O());
                        lVar2 = dVar.f18999f;
                        str3 = language.getLangCode().toString();
                        str4 = "हिंदी में जारी रखें";
                        str5 = "भाषा चुनें";
                    } else if (language.getLangId() == 5) {
                        ((c) uVar.f20234e).h(language.getLangCode());
                        dVar.E(i10, dVar.f18997d.size());
                        t.p(dVar.f18998e).i(R.drawable.bangla).c(aVar.O());
                        lVar2 = dVar.f18999f;
                        str3 = language.getLangCode().toString();
                        str4 = "বাংলায় চালিয়ে যান";
                        str5 = "ভাষা নির্বাচন করুন";
                    } else if (language.getLangId() == 7) {
                        ((c) uVar.f20234e).h(language.getLangCode());
                        dVar.E(i10, dVar.f18997d.size());
                        t.p(dVar.f18998e).i(R.drawable.tamil).c(aVar.O());
                        lVar = dVar.f18999f;
                        str = language.getLangCode().toString();
                        str2 = "இந்தியில் தொடரவும்";
                    } else {
                        return;
                    }
                    lVar.S(str, i10, str2, "மொழியைத் தேர்ந்தெடுக்கவும்");
                    return;
                }
            }
            lVar2.S(str3, i10, str4, str5);
            return;
        }
        lVar3.S(str6, i10, "Continue in English", str7);
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        cm.l.f(aVar, "holder");
        u uVar = new u();
        uVar.f20234e = new c(this.f18998e);
        Object obj = this.f18997d.get(i10);
        cm.l.e(obj, "get(...)");
        Language language = (Language) obj;
        t.p(this.f18998e).k(q.B0(language.getLangIcon()).toString()).e(R.drawable.language_placeholder).c(aVar.O());
        if (p.p(((c) uVar.f20234e).c(), language.getLangCode(), false, 2, (Object) null)) {
            F(aVar, String.valueOf(((c) uVar.f20234e).c()), i10);
        }
        aVar.P().setOnClickListener(new c(this, language, i10, uVar, aVar));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        cm.l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.language_item, viewGroup, false);
        cm.l.c(inflate);
        return new a(inflate);
    }

    public final void E(int i10, int i11) {
        j();
    }

    public final void F(a aVar, String str, int i10) {
        cm.l.f(aVar, "holder");
        cm.l.f(str, "lang_code");
        if (p.o(str, "english", true)) {
            t.p(this.f18998e).i(R.drawable.english).c(aVar.O());
            this.f18999f.S(str, i10, "Continue in English", "Choose Language");
        }
        if (p.o(str, "gujarati", true)) {
            t.p(this.f18998e).i(R.drawable.gujarati).c(aVar.O());
            this.f18999f.S(str, i10, "ગુજરાતીમાં ચાલુ રાખો", "ભાષા પસંદ કરો");
        }
        if (p.o(str, "asamiya", true)) {
            t.p(this.f18998e).i(R.drawable.asmiya).c(aVar.O());
            this.f18999f.S(str, i10, "অসমীয়াত অব্যাহত ৰাখক", "Choose Language");
        }
        if (p.o(str, "bengali", true)) {
            t.p(this.f18998e).i(R.drawable.bangla).c(aVar.O());
            this.f18999f.S(str, i10, "বাংলায় চালিয়ে যান", "ভাষা নির্বাচন করুন");
        }
        if (p.o(str, "hindi", true)) {
            t.p(this.f18998e).i(R.drawable.hindi).c(aVar.O());
            this.f18999f.S(str, i10, "हिंदी में जारी रखें", "भाषा चुनें");
        }
        if (p.o(str, "tamil", true)) {
            t.p(this.f18998e).i(R.drawable.tamil).c(aVar.O());
            this.f18999f.S(str, i10, "తమిళంలో కొనసాగండి", "மொழியைத் தேர்ந்தெடுக்கவும்");
        }
        if (p.o(str, "malayalam", true)) {
            t.p(this.f18998e).i(R.drawable.malayalam).c(aVar.O());
            this.f18999f.S(str, i10, "ഇംഗ്ലീഷിൽ തുടരുക", "ഭാഷ തിരഞ്ഞെടുക്കുക");
        }
        if (p.o(str, "marathi", true)) {
            t.p(this.f18998e).i(R.drawable.marathi).c(aVar.O());
            this.f18999f.S(str, i10, "मराठी में जारी रखें", "भाषा चुनें");
        }
        if (p.o(str, "telugu", true)) {
            t.p(this.f18998e).i(R.drawable.telugu).c(aVar.O());
            this.f18999f.S(str, i10, "తెలుగులోనే కొనసాగించండి", "భాషను ఎంచుకోండి");
        }
    }

    public int e() {
        return this.f18997d.size();
    }
}
