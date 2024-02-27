package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.Currentlist;
import java.util.ArrayList;
import wd.e1;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f30011d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f30012e;

    /* renamed from: f  reason: collision with root package name */
    private final e1 f30013f;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f30014y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f30015z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById, "findViewById(...)");
            this.f30014y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.vehicle_linear);
            l.e(findViewById2, "findViewById(...)");
            this.f30015z = (LinearLayout) findViewById2;
        }

        public final LinearLayout O() {
            return this.f30015z;
        }

        public final TextView P() {
            return this.f30014y;
        }
    }

    public b(ArrayList arrayList, Context context, e1 e1Var) {
        l.f(arrayList, "appList");
        l.f(context, "context");
        l.f(e1Var, "updateDashboardRc");
        this.f30011d = arrayList;
        this.f30012e = context;
        this.f30013f = e1Var;
    }

    /* access modifiers changed from: private */
    public static final void C(b bVar, u uVar, int i10, u uVar2, View view) {
        l.f(bVar, "this$0");
        l.f(uVar, "$app_no");
        l.f(uVar2, "$rc_number");
        try {
            bVar.f30013f.x((String) uVar.f20234e, i10, (String) uVar2.f20234e);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            u uVar = new u();
            uVar.f20234e = ((Currentlist) this.f30011d.get(i10)).getApplnolist().get(0).getAppl_no();
            u uVar2 = new u();
            uVar2.f20234e = ((Currentlist) this.f30011d.get(i10)).getApplnolist().get(0).getRegno();
            aVar.P().setText((CharSequence) uVar.f20234e);
            aVar.O().setOnClickListener(new a(this, uVar, i10, uVar2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.application_list_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f30011d.size();
    }
}
