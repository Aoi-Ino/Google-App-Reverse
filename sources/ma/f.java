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
import com.nic.mparivahan.Dashboard.NoticeViewMoreActivity;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import ld.c;
import v9.e;

public final class f extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13908d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13909e;

    /* renamed from: f  reason: collision with root package name */
    private String f13910f;

    /* renamed from: g  reason: collision with root package name */
    private String f13911g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13912y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13913z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13912y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13913z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13912y;
        }

        public final LinearLayout Q() {
            return this.f13913z;
        }
    }

    public f(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13908d = arrayList;
        this.f13909e = context;
        this.f13910f = str;
    }

    /* access modifiers changed from: private */
    public static final void C(int i10, f fVar, Enabledservice enabledservice, View view) {
        l.f(fVar, "this$0");
        l.f(enabledservice, "$mModel");
        if (i10 == 3) {
            Intent intent = new Intent(fVar.f13909e, NoticeViewMoreActivity.class);
            intent.putExtra("state_code", fVar.f13910f);
            fVar.f13909e.startActivity(intent);
            return;
        }
        fVar.E(enabledservice.getServCode(), fVar.f13909e, enabledservice.getServName());
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f13908d.get(i10);
        l.e(obj, "get(...)");
        Enabledservice enabledservice = (Enabledservice) obj;
        aVar.P().setText(e.f17509a.M(this.f13909e, enabledservice.getServCode(), enabledservice.getServName()));
        if (l.a(this.f13911g, "T") && i10 == 3) {
            aVar.P().setText(new c(this.f13909e).b("label_view_more", "View More"));
            enabledservice.setServCode("0");
            aVar.O().setImageDrawable(this.f13909e.getResources().getDrawable(R.drawable.ic_view));
        }
        F(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new e(i10, this, enabledservice));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, Context context, String str2) {
        l.f(str, "service_code");
        l.f(context, "context");
        l.f(str2, "servName");
        Class<NoticeSearch> cls = NoticeSearch.class;
        if (l.a(str, "111")) {
            Intent intent = new Intent(this.f13909e, cls);
            intent.putExtra("serviceName", str2);
            this.f13909e.startActivity(intent);
        }
        if (l.a(str, "112")) {
            Intent intent2 = new Intent(this.f13909e, cls);
            intent2.putExtra("serviceName", str2);
            this.f13909e.startActivity(intent2);
        }
        if (l.a(str, "113")) {
            Intent intent3 = new Intent(this.f13909e, cls);
            intent3.putExtra("serviceName", str2);
            this.f13909e.startActivity(intent3);
        }
        if (l.a(str, "114")) {
            Intent intent4 = new Intent(this.f13909e, cls);
            intent4.putExtra("serviceName", str2);
            this.f13909e.startActivity(intent4);
        }
        if (l.a(str, "115")) {
            Intent intent5 = new Intent(this.f13909e, cls);
            intent5.putExtra("serviceName", str2);
            this.f13909e.startActivity(intent5);
        }
    }

    public final void F(String str, a aVar) {
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals("111")) {
            aVar.O().setImageDrawable(this.f13909e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (str.equals("112")) {
            aVar.O().setImageDrawable(this.f13909e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("113")) {
            aVar.O().setImageDrawable(this.f13909e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (str.equals("114")) {
            aVar.O().setImageDrawable(this.f13909e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("115")) {
            aVar.O().setImageDrawable(this.f13909e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    public int e() {
        if (this.f13908d.size() > 3) {
            this.f13911g = "T";
            return 4;
        }
        this.f13911g = "F";
        return this.f13908d.size();
    }
}
