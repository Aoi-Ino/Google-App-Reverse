package pg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f30353d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f30354e;

    /* renamed from: pg.a$a  reason: collision with other inner class name */
    public static final class C0331a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private TextView f30355y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0331a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.service_txt);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f30355y = (TextView) findViewById;
        }

        public final TextView O() {
            return this.f30355y;
        }
    }

    public a(Context context, ArrayList arrayList) {
        l.f(context, "context");
        this.f30353d = context;
        this.f30354e = arrayList;
    }

    /* renamed from: A */
    public void p(C0331a aVar, int i10) {
        l.f(aVar, "holder");
        TextView O = aVar.O();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 + 1);
        sb2.append(". ");
        VContant.Companion companion = VContant.Companion;
        Context context = this.f30353d;
        ArrayList arrayList = this.f30354e;
        l.c(arrayList);
        Object obj = arrayList.get(i10);
        l.e(obj, "get(...)");
        sb2.append(companion.I(context, (String) obj));
        O.setText(sb2.toString());
    }

    /* renamed from: B */
    public C0331a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alert_list_item, viewGroup, false);
        l.e(inflate, "inflate(...)");
        return new C0331a(inflate);
    }

    public int e() {
        ArrayList arrayList = this.f30354e;
        l.c(arrayList);
        return arrayList.size();
    }
}
