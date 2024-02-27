package gk;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import java.util.ArrayList;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f23747d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f23748e;

    /* renamed from: f  reason: collision with root package name */
    private final a f23749f;

    public interface a {
        void W(int i10, String str, int i11);
    }

    /* renamed from: gk.b$b  reason: collision with other inner class name */
    public static final class C0293b extends RecyclerView.d0 {
        private final TextView A;
        private final ConstraintLayout B;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f23750y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f23751z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0293b(View view) {
            super(view);
            l.f(view, "view");
            this.f23750y = (TextView) view.findViewById(R.id.slot_numbers);
            this.f23751z = (TextView) view.findViewById(R.id.slot_time);
            this.A = (TextView) view.findViewById(R.id.slots_count);
            this.B = (ConstraintLayout) view.findViewById(R.id.item_cl);
        }

        private final void R(SlotDet slotDet) {
            int slotNo = slotDet.getSlotNo();
            TextView textView = this.f23750y;
            textView.setText("Slot " + slotNo + ':');
            this.f23751z.setText(slotDet.getTimeForDisp());
            TextView textView2 = this.A;
            textView2.setText("" + slotDet.getAvalableSeats());
        }

        public final void O(SlotDet slotDet) {
            l.f(slotDet, "item");
            R(slotDet);
        }

        public final ConstraintLayout P() {
            return this.B;
        }

        public final TextView Q() {
            return this.A;
        }
    }

    public b(Context context, ArrayList arrayList, a aVar) {
        l.f(context, "context");
        l.f(aVar, "itemListener");
        this.f23747d = context;
        this.f23748e = arrayList;
        this.f23749f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void C(b bVar, int i10, SlotDet slotDet, View view) {
        l.f(bVar, "this$0");
        bVar.f23749f.W(i10, slotDet.getQuotadt(), slotDet.getSlotNo());
    }

    /* renamed from: B */
    public void p(C0293b bVar, int i10) {
        TextView Q;
        Resources resources;
        int i11;
        l.f(bVar, "holder");
        ArrayList arrayList = this.f23748e;
        Integer num = null;
        SlotDet slotDet = arrayList != null ? (SlotDet) arrayList.get(i10) : null;
        if (slotDet != null) {
            bVar.O(slotDet);
        }
        if (slotDet != null) {
            num = Integer.valueOf(slotDet.getAvalableSeats());
        }
        l.c(num);
        if (num.intValue() > 0) {
            Q = bVar.Q();
            resources = this.f23747d.getResources();
            i11 = R.drawable.dl_slots_green;
        } else {
            Q = bVar.Q();
            resources = this.f23747d.getResources();
            i11 = R.drawable.dl_slots_red;
        }
        Q.setBackground(resources.getDrawable(i11));
        bVar.P().setOnClickListener(new a(this, i10, slotDet));
    }

    /* renamed from: D */
    public C0293b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_dl_renewal_slots, viewGroup, false);
        l.c(inflate);
        return new C0293b(inflate);
    }

    public int e() {
        ArrayList arrayList = this.f23748e;
        Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        l.c(valueOf);
        return valueOf.intValue();
    }
}
