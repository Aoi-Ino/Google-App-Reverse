package ma;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.DPTNotice.NoticeSearch;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import v9.e;

public final class h extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13916d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13917e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13918f;

    /* renamed from: g  reason: collision with root package name */
    private String f13919g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13920y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13921z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13920y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13921z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13920y;
        }

        public final LinearLayout Q() {
            return this.f13921z;
        }
    }

    public h(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13916d = arrayList;
        this.f13917e = context;
        this.f13918f = str;
    }

    /* access modifiers changed from: private */
    public static final void C(h hVar, Enabledservice enabledservice, View view) {
        l.f(hVar, "this$0");
        l.f(enabledservice, "$mModel");
        hVar.E(enabledservice.getServCode(), enabledservice.getServName().toString());
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f13916d.get(i10);
        l.e(obj, "get(...)");
        Enabledservice enabledservice = (Enabledservice) obj;
        aVar.P().setText(e.f17509a.M(this.f13917e, enabledservice.getServCode(), enabledservice.getServName()));
        F(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new g(this, enabledservice));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, String str2) {
        l.f(str, "service_code");
        l.f(str2, "service_name");
        Class<NoticeSearch> cls = NoticeSearch.class;
        if (l.a(str, "111")) {
            Intent intent = new Intent(this.f13917e, cls);
            intent.putExtra("serviceName", str2);
            this.f13917e.startActivity(intent);
        }
        if (l.a(str, "112")) {
            Intent intent2 = new Intent(this.f13917e, cls);
            intent2.putExtra("serviceName", str2);
            this.f13917e.startActivity(intent2);
        }
        if (l.a(str, "113")) {
            Intent intent3 = new Intent(this.f13917e, cls);
            intent3.putExtra("serviceName", str2);
            this.f13917e.startActivity(intent3);
        }
        if (l.a(str, "114")) {
            Intent intent4 = new Intent(this.f13917e, cls);
            intent4.putExtra("serviceName", str2);
            this.f13917e.startActivity(intent4);
        }
        if (l.a(str, "115")) {
            Intent intent5 = new Intent(this.f13917e, cls);
            intent5.putExtra("serviceName", str2);
            this.f13917e.startActivity(intent5);
        }
    }

    public final void F(String str, a aVar) {
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (l.a(str, "111")) {
            aVar.O().setImageDrawable(this.f13917e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (l.a(str, "112")) {
            aVar.O().setImageDrawable(this.f13917e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (l.a(str, "113")) {
            aVar.O().setImageDrawable(this.f13917e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (l.a(str, "114")) {
            aVar.O().setImageDrawable(this.f13917e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (l.a(str, "115")) {
            aVar.O().setImageDrawable(this.f13917e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    public int e() {
        return this.f13916d.size();
    }
}
