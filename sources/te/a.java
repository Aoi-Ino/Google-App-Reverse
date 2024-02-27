package te;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f31332d;

    /* renamed from: e  reason: collision with root package name */
    private final PassangerResultActivity f31333e;

    /* renamed from: te.a$a  reason: collision with other inner class name */
    public static final class C0354a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;

        /* renamed from: y  reason: collision with root package name */
        private final ImageView f31334y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f31335z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0354a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.update);
            l.e(findViewById, "findViewById(...)");
            this.f31334y = (ImageView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.delet);
            l.e(findViewById2, "findViewById(...)");
            this.f31335z = (ImageView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.full_name);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.phone_number);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.relation_name);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.age);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.gender);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
        }

        public final TextView O() {
            return this.D;
        }

        public final TextView P() {
            return this.A;
        }

        public final TextView Q() {
            return this.E;
        }

        public final TextView R() {
            return this.B;
        }
    }

    public a(ArrayList arrayList, PassangerResultActivity passangerResultActivity) {
        l.f(arrayList, "contactlist");
        l.f(passangerResultActivity, "addContact");
        this.f31332d = arrayList;
        this.f31333e = passangerResultActivity;
    }

    /* renamed from: A */
    public void p(C0354a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            String passengerName = ((VaSplPassengerdto) this.f31332d.get(i10)).getPassengerName();
            String passengerAddress = ((VaSplPassengerdto) this.f31332d.get(i10)).getPassengerAddress();
            aVar.P().setText(String.valueOf(passengerName));
            TextView R = aVar.R();
            R.setText("Address: " + passengerAddress);
            aVar.O().setText(String.valueOf(((VaSplPassengerdto) this.f31332d.get(i10)).getPassengerAge()));
            aVar.Q().setText(String.valueOf(((VaSplPassengerdto) this.f31332d.get(i10)).getPassengerGender()));
        } catch (Exception e10) {
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: B */
    public C0354a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.passanger_list_item, viewGroup, false);
        l.c(inflate);
        return new C0354a(inflate);
    }

    public int e() {
        return this.f31332d.size();
    }
}
