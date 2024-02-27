package l9;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.ClServices.Pojo.ClApplFlowStatus;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13450d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13451e;

    /* renamed from: f  reason: collision with root package name */
    private final dd.b f13452f;

    /* renamed from: g  reason: collision with root package name */
    private int f13453g;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13454y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f13455z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.app_ser_no);
            l.e(findViewById, "findViewById(...)");
            this.f13454y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.app_status_name);
            l.e(findViewById2, "findViewById(...)");
            this.f13455z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.app_status_status);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
        }

        public final TextView O() {
            return this.f13454y;
        }

        public final TextView P() {
            return this.f13455z;
        }

        public final TextView Q() {
            return this.A;
        }
    }

    public b(ArrayList arrayList, Context context, dd.b bVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(bVar, "mOpenScreen");
        this.f13450d = arrayList;
        this.f13451e = context;
        this.f13452f = bVar;
    }

    /* access modifiers changed from: private */
    public static final void C(a aVar, b bVar, ClApplFlowStatus clApplFlowStatus, int i10, View view) {
        l.f(aVar, "$holder");
        l.f(bVar, "this$0");
        l.f(clApplFlowStatus, "$mModel");
        if (l.a(aVar.Q().getText(), bVar.f13451e.getString(R.string.proceed_new))) {
            Log.d("clickValue", String.valueOf(clApplFlowStatus.getTrCd()));
            bVar.f13452f.H(Integer.valueOf(clApplFlowStatus.getAcCd()), i10, clApplFlowStatus.getTrCd());
        }
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        TextView Q;
        Context context;
        int i11;
        l.f(aVar, "holder");
        Object obj = this.f13450d.get(i10);
        l.e(obj, "get(...)");
        ClApplFlowStatus clApplFlowStatus = (ClApplFlowStatus) obj;
        aVar.P().setText(clApplFlowStatus.getAcDesc());
        if (this.f13453g != 0 || !p.o(clApplFlowStatus.getStatus(), "Pending", true)) {
            if (p.o(clApplFlowStatus.getStatus(), "Completed", true)) {
                aVar.Q().setText("Completed");
                aVar.Q().setTextColor(androidx.core.content.a.c(this.f13451e, R.color.green));
                aVar.O().setBackgroundResource(R.drawable.circle_blue);
                Q = aVar.O();
                context = this.f13451e;
                i11 = R.color.blue_color;
            } else {
                aVar.Q().setText(clApplFlowStatus.getStatus());
                aVar.O().setBackgroundResource(R.drawable.circle_white_gray);
                aVar.O().setTextColor(androidx.core.content.a.c(this.f13451e, R.color.white));
                Q = aVar.Q();
                context = this.f13451e;
                i11 = R.color.gray;
            }
            Q.setTextColor(androidx.core.content.a.c(context, i11));
        } else {
            aVar.Q().setText(this.f13451e.getString(R.string.proceed_new));
            aVar.Q().setTextColor(androidx.core.content.a.c(this.f13451e, R.color.never_mix));
            aVar.O().setBackgroundResource(R.drawable.circle_white_gray);
            aVar.O().setTextColor(androidx.core.content.a.c(this.f13451e, R.color.white));
            this.f13453g++;
        }
        aVar.Q().setOnClickListener(new a(aVar, this, clApplFlowStatus, i10));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_status_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f13450d.size();
    }
}
