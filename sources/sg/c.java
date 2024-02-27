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
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;
import java.util.ArrayList;
import v9.e;

public final class c extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f31231d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f31232e;

    /* renamed from: f  reason: collision with root package name */
    private final com.nic.mparivahan.VahanServices.VahanMultiService.a f31233f;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f31234y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f31235z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f31234y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f31235z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f31234y;
        }

        public final LinearLayout Q() {
            return this.f31235z;
        }
    }

    public c(ArrayList arrayList, Context context, com.nic.mparivahan.VahanServices.VahanMultiService.a aVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(aVar, "multiSelected");
        this.f31231d = arrayList;
        this.f31232e = context;
        this.f31233f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void C(ServiceList serviceList, c cVar, int i10, View view) {
        l.f(serviceList, "$mModel");
        l.f(cVar, "this$0");
        boolean selectService = serviceList.getSelectService();
        com.nic.mparivahan.VahanServices.VahanMultiService.a aVar = cVar.f31233f;
        String valueOf = String.valueOf(serviceList.getPurposeCode());
        if (!selectService) {
            aVar.Q(valueOf, i10);
        } else {
            aVar.Z(valueOf, i10);
        }
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        new ld.c(this.f31232e);
        Object obj = this.f31231d.get(i10);
        l.e(obj, "get(...)");
        ServiceList serviceList = (ServiceList) obj;
        aVar.P().setText(e.f17509a.f2(this.f31232e, String.valueOf(serviceList.getPurposeCode()), " "));
        if (!serviceList.getSelectService()) {
            E(String.valueOf(serviceList.getPurposeCode()), aVar);
        } else {
            F(String.valueOf(serviceList.getPurposeCode()), aVar);
        }
        aVar.Q().setOnClickListener(new b(serviceList, this, i10));
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
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.duplicate_rc));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.addition));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.term));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.ic_con));
            aVar.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            aVar.P().setTextColor(Color.parseColor("#000000"));
        }
        if (str.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            O = aVar.O();
            resources = this.f31232e.getResources();
            i10 = R.drawable.rc_partucalar;
        } else if (str.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            O = aVar.O();
            resources = this.f31232e.getResources();
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
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.select_dup));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.select_coa));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.select_hpa));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.select_hpt));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.select_hpc));
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
        } else if (str.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            aVar.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            aVar.O().setImageDrawable(this.f31232e.getResources().getDrawable(R.drawable.select_to));
        } else {
            return;
        }
        aVar.P().setTextColor(Color.parseColor("#FFFFFF"));
    }

    public int e() {
        return this.f31231d.size();
    }
}
