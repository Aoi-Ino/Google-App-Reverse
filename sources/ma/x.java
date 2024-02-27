package ma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.HashMap;
import ld.c;

public final class x extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13978d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13979e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13980f;

    /* renamed from: g  reason: collision with root package name */
    private String f13981g = "T";

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13982y;

        /* renamed from: z  reason: collision with root package name */
        private final RecyclerView f13983z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.vehicle_title);
            l.e(findViewById, "findViewById(...)");
            this.f13982y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.es_vahan_recyclerView);
            l.e(findViewById2, "findViewById(...)");
            this.f13983z = (RecyclerView) findViewById2;
        }

        public final TextView O() {
            return this.f13982y;
        }

        public final RecyclerView P() {
            return this.f13983z;
        }
    }

    public x(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13978d = arrayList;
        this.f13979e = context;
        this.f13980f = str;
    }

    public final String A(int i10, Context context) {
        l.f(context, "mContext");
        c cVar = new c(context);
        HashMap hashMap = new HashMap();
        hashMap.put(0, String.valueOf(cVar.b("common_services", "Common Services")));
        hashMap.put(1, String.valueOf(cVar.b("common_services", "Common Services")));
        hashMap.put(2, String.valueOf(cVar.b("commercial_services", "Commercial Services")));
        hashMap.put(3, String.valueOf(cVar.b("others_vahan", "Others")));
        return String.valueOf(hashMap.get(Integer.valueOf(i10)));
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f13978d.get(i10);
        l.e(obj, "get(...)");
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.size() > 0) {
            aVar.O().setText(A(((Enabledservice) arrayList.get(0)).getServSection(), this.f13979e));
            aVar.P().setLayoutManager(new GridLayoutManager(this.f13979e, 4));
            aVar.P().setAdapter(new w(arrayList, this.f13979e, this.f13980f.toString()));
        }
    }

    /* renamed from: C */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vahan_section_item_main, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f13978d.size();
    }
}
