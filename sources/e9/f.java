package e9;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Citizen.Models.Content;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class f extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f11114d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f11115e;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f11116y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f11117z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.record_type);
            l.e(findViewById, "findViewById(...)");
            this.f11116y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.record_count);
            l.e(findViewById2, "findViewById(...)");
            this.f11117z = (TextView) findViewById2;
        }

        public final TextView O() {
            return this.f11117z;
        }

        public final TextView P() {
            return this.f11116y;
        }
    }

    public f(ArrayList arrayList, Context context) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        this.f11114d = arrayList;
        this.f11115e = context;
    }

    /* renamed from: A */
    public void p(a aVar, int i10) {
        TextView P;
        String str;
        l.f(aVar, "holder");
        Object obj = this.f11114d.get(i10);
        l.e(obj, "get(...)");
        Content content = (Content) obj;
        aVar.O().setText(String.valueOf(content.getRecordCount()));
        aVar.P().setText(content.getRecordName());
        if (l.a(content.getRecordName(), "PENDING")) {
            P = aVar.P();
            str = "#FD6D35";
        } else {
            P = aVar.P();
            str = "#19A15F";
        }
        P.setTextColor(Color.parseColor(str));
        aVar.O().setTextColor(Color.parseColor(str));
    }

    /* renamed from: B */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dashboard_records, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f11114d.size();
    }
}
