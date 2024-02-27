package gd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplFlowStatus;
import java.util.ArrayList;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f11848d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f11849e;

    /* renamed from: f  reason: collision with root package name */
    private final dd.b f11850f;

    /* renamed from: g  reason: collision with root package name */
    private int f11851g;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f11852y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f11853z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.app_ser_no);
            l.e(findViewById, "findViewById(...)");
            this.f11852y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.app_status_name);
            l.e(findViewById2, "findViewById(...)");
            this.f11853z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.app_status_status);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
        }

        public final TextView O() {
            return this.f11852y;
        }

        public final TextView P() {
            return this.f11853z;
        }

        public final TextView Q() {
            return this.A;
        }
    }

    public b(ArrayList arrayList, Context context, dd.b bVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(bVar, "mOpenScreen");
        this.f11848d = arrayList;
        this.f11849e = context;
        this.f11850f = bVar;
    }

    /* access modifiers changed from: private */
    public static final void C(a aVar, b bVar, ApplFlowStatus applFlowStatus, int i10, View view) {
        l.f(aVar, "$holder");
        l.f(bVar, "this$0");
        l.f(applFlowStatus, "$mModel");
        if (l.a(aVar.Q().getText(), bVar.f11849e.getString(R.string.proceed_new))) {
            bVar.f11850f.H(Integer.valueOf(applFlowStatus.getAcCd()), i10, applFlowStatus.getTrCd());
        }
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        TextView Q;
        Context context;
        int i11;
        l.f(aVar, "holder");
        Object obj = this.f11848d.get(i10);
        l.e(obj, "get(...)");
        ApplFlowStatus applFlowStatus = (ApplFlowStatus) obj;
        aVar.P().setText(applFlowStatus.getAcDesc());
        if (this.f11851g != 0 || !p.o(applFlowStatus.getStatus(), "Pending", true)) {
            if (p.o(applFlowStatus.getStatus(), "Completed", true)) {
                aVar.Q().setText("Completed");
                aVar.Q().setTextColor(androidx.core.content.a.c(this.f11849e, R.color.green));
                aVar.O().setBackgroundResource(R.drawable.circle_blue);
                Q = aVar.O();
                context = this.f11849e;
                i11 = R.color.blue_color;
            } else {
                aVar.Q().setText(applFlowStatus.getStatus());
                aVar.O().setBackgroundResource(R.drawable.circle_white_gray);
                aVar.O().setTextColor(androidx.core.content.a.c(this.f11849e, R.color.white));
                Q = aVar.Q();
                context = this.f11849e;
                i11 = R.color.gray;
            }
            Q.setTextColor(androidx.core.content.a.c(context, i11));
        } else {
            aVar.Q().setText(this.f11849e.getString(R.string.proceed_new));
            aVar.Q().setTextColor(androidx.core.content.a.c(this.f11849e, R.color.never_mix));
            aVar.O().setBackgroundResource(R.drawable.circle_white_gray);
            aVar.O().setTextColor(androidx.core.content.a.c(this.f11849e, R.color.white));
            this.f11851g++;
        }
        aVar.Q().setOnClickListener(new a(aVar, this, applFlowStatus, i10));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_status_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f11848d.size();
    }
}
