package com.nic.mparivahan.VahanServices;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentModel;
import java.util.List;
import ld.c;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final List f21589d;

    /* renamed from: e  reason: collision with root package name */
    private final C0271a f21590e;

    /* renamed from: f  reason: collision with root package name */
    private final c f21591f;

    /* renamed from: com.nic.mparivahan.VahanServices.a$a  reason: collision with other inner class name */
    public interface C0271a {
        void z(int i10, boolean z10);
    }

    public static final class b extends RecyclerView.d0 implements View.OnClickListener {
        private final TextView A;
        private final CardView B;
        private final C0271a C;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f21592y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f21593z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, C0271a aVar) {
            super(view);
            l.f(view, "itemView");
            l.f(aVar, "onItemListener");
            View findViewById = view.findViewById(R.id.slot_Number);
            l.e(findViewById, "findViewById(...)");
            this.f21592y = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.slot_time);
            l.e(findViewById2, "findViewById(...)");
            this.f21593z = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_seats);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.slot_cardView);
            l.e(findViewById4, "findViewById(...)");
            this.B = (CardView) findViewById4;
            this.C = aVar;
            view.setOnClickListener(this);
        }

        public final TextView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f21592y;
        }

        public final TextView Q() {
            return this.f21593z;
        }

        public void onClick(View view) {
            l.f(view, "view");
            this.C.z(k(), this.B.getCardBackgroundColor().equals(Integer.valueOf(androidx.core.content.a.c(this.f3622e.getContext(), R.color.dateRed))));
        }
    }

    public a(List list, C0271a aVar, c cVar) {
        l.f(list, "slots");
        l.f(aVar, "onItemListener");
        l.f(cVar, "langSess");
        this.f21589d = list;
        this.f21590e = aVar;
        this.f21591f = cVar;
    }

    /* renamed from: A */
    public void p(b bVar, int i10) {
        l.f(bVar, "holder");
        TextView P = bVar.P();
        P.setText(this.f21591f.b("label_slot", "Slot") + ' ' + (i10 + 1));
        bVar.O().setText(((SlotAppointmentModel) this.f21589d.get(i10)).getAvail_seats());
        bVar.Q().setText(((SlotAppointmentModel) this.f21589d.get(i10)).getSlot());
    }

    /* renamed from: B */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_slot_list, viewGroup, false);
        l.e(inflate, "inflate(...)");
        return new b(inflate, this.f21590e);
    }

    public int e() {
        return this.f21589d.size();
    }
}
