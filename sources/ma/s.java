package ma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class s extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13955d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13956e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13957f;

    /* renamed from: g  reason: collision with root package name */
    private String f13958g = "T";

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13959y;

        /* renamed from: z  reason: collision with root package name */
        private final RecyclerView f13960z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.vehicle_title);
            l.e(findViewById, "findViewById(...)");
            this.f13959y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.es_vahan_recyclerView);
            l.e(findViewById2, "findViewById(...)");
            this.f13960z = (RecyclerView) findViewById2;
        }

        public final TextView O() {
            return this.f13959y;
        }

        public final RecyclerView P() {
            return this.f13960z;
        }
    }

    public s(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13955d = arrayList;
        this.f13956e = context;
        this.f13957f = str;
    }

    /* renamed from: A */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f13955d.get(i10);
        l.e(obj, "get(...)");
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.size() > 0) {
            aVar.O().setVisibility(8);
            aVar.P().setLayoutManager(new GridLayoutManager(this.f13956e, 4));
            aVar.P().setAdapter(new r(arrayList, this.f13956e, this.f13957f.toString()));
        }
    }

    /* renamed from: B */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vahan_section_item_main, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f13955d.size();
    }
}
