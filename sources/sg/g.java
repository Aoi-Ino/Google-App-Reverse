package sg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import ld.c;
import v9.e;

public final class g extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f31247d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f31248e;

    /* renamed from: f  reason: collision with root package name */
    private final com.nic.mparivahan.VahanServices.VahanMultiService.a f31249f;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f31250y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f31251z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f31250y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f31251z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f31250y;
        }

        public final LinearLayout Q() {
            return this.f31251z;
        }
    }

    public g(ArrayList arrayList, Context context, com.nic.mparivahan.VahanServices.VahanMultiService.a aVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(aVar, "multiSelected");
        this.f31247d = arrayList;
        this.f31248e = context;
        this.f31249f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void C(rg.a aVar, g gVar, int i10, View view) {
        l.f(aVar, "$mModel");
        l.f(gVar, "this$0");
        if (!aVar.b()) {
            if ((VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE.equals(String.valueOf(aVar.a())) || VContant.DUPLICATE_RC_PURPOSE_CODE.equals(String.valueOf(aVar.a()))) && aVar.c()) {
                gVar.f31249f.Q(String.valueOf(aVar.a()), i10);
            }
        } else if ((VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE.equals(String.valueOf(aVar.a())) || VContant.DUPLICATE_RC_PURPOSE_CODE.equals(String.valueOf(aVar.a()))) && aVar.c()) {
            gVar.f31249f.Z(String.valueOf(aVar.a()), i10);
        }
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        new c(this.f31248e);
        Object obj = this.f31247d.get(i10);
        l.e(obj, "get(...)");
        rg.a aVar2 = (rg.a) obj;
        aVar.P().setText(e.f17509a.g2(this.f31248e, String.valueOf(aVar2.a()), "B"));
        if (!aVar2.b()) {
            E(String.valueOf(aVar2.a()), aVar);
        } else {
            F(String.valueOf(aVar2.a()), aVar);
        }
        aVar.Q().setOnClickListener(new f(aVar2, this, i10));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.multi_service_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, a aVar) {
        ImageView O;
        Resources resources;
        int i10;
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.duplicate_rc));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.addition));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.term));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.ic_con));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            O = aVar.O();
            resources = this.f31248e.getResources();
            i10 = R.drawable.rc_partucalar;
        } else if (str.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            O = aVar.O();
            resources = this.f31248e.getResources();
            i10 = R.drawable.transferofowner;
        } else {
            return;
        }
        O.setImageDrawable(resources.getDrawable(i10));
        aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
        aVar.P().setTextColor(Color.parseColor("#000000"));
    }

    public final void F(String str, a aVar) {
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.select_dup));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.select_coa));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.select_hpa));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.select_hpt));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.select_hpc));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
        } else if (str.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.O().setImageDrawable(this.f31248e.getResources().getDrawable(R.drawable.select_to));
        } else {
            return;
        }
        aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
    }

    public int e() {
        return this.f31247d.size();
    }
}
