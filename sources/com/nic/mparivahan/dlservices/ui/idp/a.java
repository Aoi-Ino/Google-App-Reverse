package com.nic.mparivahan.dlservices.ui.idp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f22215d;

    /* renamed from: e  reason: collision with root package name */
    private final DLIdpActivity f22216e;

    /* renamed from: f  reason: collision with root package name */
    private final C0274a f22217f;

    /* renamed from: com.nic.mparivahan.dlservices.ui.idp.a$a  reason: collision with other inner class name */
    public interface C0274a {
        void i(int i10, boolean z10);
    }

    public static final class b extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final CheckBox f22218y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f22219z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.cov_check_box);
            l.e(findViewById, "findViewById(...)");
            this.f22218y = (CheckBox) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.cov_txt);
            l.e(findViewById2, "findViewById(...)");
            this.f22219z = (TextView) findViewById2;
        }

        public final CheckBox O() {
            return this.f22218y;
        }

        public final TextView P() {
            return this.f22219z;
        }
    }

    public a(ArrayList arrayList, DLIdpActivity dLIdpActivity, C0274a aVar) {
        l.f(dLIdpActivity, "mContext");
        l.f(aVar, "onItemListener");
        this.f22215d = arrayList;
        this.f22216e = dLIdpActivity;
        this.f22217f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void C(a aVar, int i10, IdpcovgradesItem idpcovgradesItem, CompoundButton compoundButton, boolean z10) {
        ArrayList t22;
        IdpcovgradesItem idpcovgradesItem2;
        l.f(aVar, "this$0");
        aVar.f22217f.i(i10, z10);
        if (idpcovgradesItem != null) {
            if (!idpcovgradesItem.getStatus()) {
                ArrayList arrayList = aVar.f22215d;
                if (arrayList != null) {
                    IdpcovgradesItem idpcovgradesItem3 = (IdpcovgradesItem) arrayList.set(i10, new IdpcovgradesItem(idpcovgradesItem.getIdpCovgrdCd(), idpcovgradesItem.getIdpcovgrdDesc(), true));
                }
                t22 = aVar.f22216e.t2();
                if (t22 != null) {
                    idpcovgradesItem2 = new IdpcovgradesItem(idpcovgradesItem.getIdpCovgrdCd(), idpcovgradesItem.getIdpcovgrdDesc(), true);
                }
                aVar.j();
            }
            ArrayList arrayList2 = aVar.f22215d;
            if (arrayList2 != null) {
                IdpcovgradesItem idpcovgradesItem4 = (IdpcovgradesItem) arrayList2.set(i10, new IdpcovgradesItem(idpcovgradesItem.getIdpCovgrdCd(), idpcovgradesItem.getIdpcovgrdDesc(), false));
            }
            t22 = aVar.f22216e.t2();
            if (t22 != null) {
                idpcovgradesItem2 = new IdpcovgradesItem(idpcovgradesItem.getIdpCovgrdCd(), idpcovgradesItem.getIdpcovgrdDesc(), false);
            }
            aVar.j();
            IdpcovgradesItem idpcovgradesItem5 = (IdpcovgradesItem) t22.set(i10, idpcovgradesItem2);
            aVar.j();
        }
    }

    /* renamed from: B */
    public void p(b bVar, int i10) {
        l.f(bVar, "holder");
        ArrayList arrayList = this.f22215d;
        IdpcovgradesItem idpcovgradesItem = arrayList != null ? (IdpcovgradesItem) arrayList.get(i10) : null;
        if (idpcovgradesItem != null) {
            bVar.P().setText(idpcovgradesItem.getIdpcovgrdDesc());
            if (idpcovgradesItem.getStatus()) {
                bVar.O().setChecked(true);
            }
        }
        bVar.O().setOnCheckedChangeListener(new uj.a(this, i10, idpcovgradesItem));
    }

    /* renamed from: D */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cov_adapter, viewGroup, false);
        l.c(inflate);
        return new b(inflate);
    }

    public final void E(ArrayList arrayList) {
        if (arrayList != null) {
            this.f22215d = arrayList;
        }
        j();
    }

    public int e() {
        ArrayList arrayList = this.f22215d;
        l.c(arrayList);
        return arrayList.size();
    }
}
