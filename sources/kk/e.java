package kk;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.c;
import androidx.fragment.app.h;
import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.List;

public final class e extends h {
    public static final a A0 = new a((g) null);

    /* renamed from: x0  reason: collision with root package name */
    private final List f24709x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    private String f24710y0;

    /* renamed from: z0  reason: collision with root package name */
    private b f24711z0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e a(String str, List list) {
            l.f(list, "items");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("items", (ArrayList) list);
            bundle.putString("title", str);
            e eVar = new e();
            eVar.K1(bundle);
            return eVar;
        }
    }

    public interface b {
        void a(String str, int i10);
    }

    /* access modifiers changed from: private */
    public static final void m2(e eVar, DialogInterface dialogInterface, int i10) {
        l.f(eVar, "this$0");
        b bVar = eVar.f24711z0;
        if (bVar != null) {
            l.c(bVar);
            bVar.a((String) eVar.f24709x0.get(i10), i10);
        }
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
        Bundle u10 = u();
        l.c(u10);
        ArrayList<String> stringArrayList = u10.getStringArrayList("items");
        if (stringArrayList != null) {
            this.f24709x0.clear();
            this.f24709x0.addAll(stringArrayList);
        }
        this.f24710y0 = u10.getString("title");
    }

    public Dialog d2(Bundle bundle) {
        c.a aVar = new c.a(D1());
        if (!TextUtils.isEmpty(this.f24710y0)) {
            aVar.o(this.f24710y0);
        }
        aVar.f((CharSequence[]) this.f24709x0.toArray(new String[0]), new d(this));
        c a10 = aVar.a();
        l.e(a10, "create(...)");
        return a10;
    }

    public final void n2(b bVar) {
        this.f24711z0 = bVar;
    }
}
