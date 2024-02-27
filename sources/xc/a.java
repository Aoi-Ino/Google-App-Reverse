package xc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f18252d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f18253e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f18254f;

    /* renamed from: xc.a$a  reason: collision with other inner class name */
    public static final class C0239a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private TextView f18255y;

        /* renamed from: z  reason: collision with root package name */
        private TextView f18256z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0239a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.title_txt);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f18255y = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.desc_txt);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f18256z = (TextView) findViewById2;
        }

        public final TextView O() {
            return this.f18256z;
        }

        public final TextView P() {
            return this.f18255y;
        }
    }

    public a(Context context, ArrayList arrayList, ArrayList arrayList2) {
        l.f(context, "context");
        this.f18252d = context;
        this.f18253e = arrayList;
        this.f18254f = arrayList2;
    }

    /* renamed from: A */
    public void p(C0239a aVar, int i10) {
        l.f(aVar, "holder");
        TextView P = aVar.P();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 + 1);
        sb2.append(". ");
        ArrayList arrayList = this.f18253e;
        l.c(arrayList);
        sb2.append((String) arrayList.get(i10));
        P.setText(sb2.toString());
        TextView O = aVar.O();
        ArrayList arrayList2 = this.f18254f;
        l.c(arrayList2);
        O.setText((CharSequence) arrayList2.get(i10));
    }

    /* renamed from: B */
    public C0239a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alert_list_custom_items, viewGroup, false);
        l.e(inflate, "inflate(...)");
        return new C0239a(inflate);
    }

    public int e() {
        ArrayList arrayList = this.f18253e;
        l.c(arrayList);
        return arrayList.size();
    }
}
