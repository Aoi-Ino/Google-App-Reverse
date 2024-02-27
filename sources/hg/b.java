package hg;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty;
import java.util.ArrayList;
import java.util.HashMap;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f24090d;

    /* renamed from: e  reason: collision with root package name */
    private final RenewalOfPermitAcitivty f24091e;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final CheckBox f24092y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.region_check);
            l.e(findViewById, "findViewById(...)");
            this.f24092y = (CheckBox) findViewById;
        }

        public final CheckBox O() {
            return this.f24092y;
        }
    }

    public b(ArrayList arrayList, RenewalOfPermitAcitivty renewalOfPermitAcitivty) {
        l.f(arrayList, "contactlist");
        l.f(renewalOfPermitAcitivty, "renewalPermit");
        this.f24090d = arrayList;
        this.f24091e = renewalOfPermitAcitivty;
    }

    /* access modifiers changed from: private */
    public static final void C(b bVar, int i10, CompoundButton compoundButton, boolean z10) {
        l.f(bVar, "this$0");
        bVar.f24091e.h2(i10, z10 ? 1 : 0);
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            Log.e("Status", String.valueOf(((HashMap) this.f24090d.get(i10)).get("Status")));
            aVar.O().setText(String.valueOf((String) ((HashMap) this.f24090d.get(i10)).get("Regin")));
            aVar.O().setOnCheckedChangeListener(new a(this, i10));
        } catch (Exception e10) {
            Log.e("AdapterError", e10.toString());
        }
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.renewal_region_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f24090d.size();
    }
}
