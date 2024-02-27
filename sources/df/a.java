package df;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f22769d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f22770e;

    /* renamed from: df.a$a  reason: collision with other inner class name */
    public static final class C0282a extends RecyclerView.d0 {
        private final MyTextView A;
        private final MyTextView B;

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f22771y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f22772z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0282a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.tv_reg_no);
            l.e(findViewById, "findViewById(...)");
            this.f22771y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.booking_fee);
            l.e(findViewById2, "findViewById(...)");
            this.f22772z = (MyTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.category);
            l.e(findViewById3, "findViewById(...)");
            this.A = (MyTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.number_type);
            l.e(findViewById4, "findViewById(...)");
            this.B = (MyTextView) findViewById4;
        }

        public final MyTextView O() {
            return this.f22772z;
        }

        public final MyTextView P() {
            return this.A;
        }

        public final MyTextView Q() {
            return this.B;
        }

        public final MyTextView R() {
            return this.f22771y;
        }
    }

    public a(Context context, ArrayList arrayList) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        this.f22769d = context;
        this.f22770e = arrayList;
    }

    public final void A(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f22770e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    public final void B(List list) {
        l.f(list, "searchList");
        this.f22770e.addAll(list);
        j();
    }

    public final void C(ArrayList arrayList) {
        l.f(arrayList, "searchList");
        this.f22770e.clear();
        j();
    }

    /* renamed from: D */
    public void p(C0282a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f22770e.get(i10);
        l.e(obj, "get(...)");
        Data data = (Data) obj;
        aVar.R().setText(data.getReg_no());
        aVar.O().setText(String.valueOf(data.getBooking_fee()));
        aVar.Q().setText(data.getNumber_type());
        aVar.P().setText(data.getCategory());
    }

    /* renamed from: E */
    public C0282a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.available_fancy_numbers, viewGroup, false);
        l.c(inflate);
        return new C0282a(inflate);
    }

    public int e() {
        return this.f22770e.size();
    }

    public long f(int i10) {
        return (long) i10;
    }

    public int g(int i10) {
        return i10;
    }
}
