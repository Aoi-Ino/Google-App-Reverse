package pg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import java.util.ArrayList;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f30356d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f30357e;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private TextView f30358y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.service_txt);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f30358y = (TextView) findViewById;
        }

        public final TextView O() {
            return this.f30358y;
        }
    }

    public b(Context context, ArrayList arrayList) {
        l.f(context, "context");
        this.f30356d = context;
        this.f30357e = arrayList;
    }

    /* renamed from: A */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        TextView O = aVar.O();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 + 1);
        sb2.append(". ");
        ArrayList arrayList = this.f30357e;
        l.c(arrayList);
        sb2.append(((NonUploaded) arrayList.get(i10)).getCatName());
        O.setText(sb2.toString());
    }

    /* renamed from: B */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alert_list_item, viewGroup, false);
        l.e(inflate, "inflate(...)");
        return new a(inflate);
    }

    public int e() {
        ArrayList arrayList = this.f30357e;
        l.c(arrayList);
        return arrayList.size();
    }
}
