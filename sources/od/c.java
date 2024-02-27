package od;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.AddContactScreen;
import com.nic.mparivahan.Sos.SModle.MparSosContact;
import java.util.ArrayList;
import java.util.HashMap;

public final class c extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f14486d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f14487e;

    /* renamed from: f  reason: collision with root package name */
    private final AddContactScreen f14488f;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;

        /* renamed from: y  reason: collision with root package name */
        private final ImageView f14489y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f14490z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.update);
            l.e(findViewById, "findViewById(...)");
            this.f14489y = (ImageView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.delet);
            l.e(findViewById2, "findViewById(...)");
            this.f14490z = (ImageView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.full_name);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.phone_number);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.relation_name);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
        }

        public final ImageView O() {
            return this.f14490z;
        }

        public final TextView P() {
            return this.A;
        }

        public final TextView Q() {
            return this.B;
        }

        public final TextView R() {
            return this.C;
        }

        public final ImageView S() {
            return this.f14489y;
        }
    }

    public c(ArrayList arrayList, HashMap hashMap, AddContactScreen addContactScreen) {
        l.f(arrayList, "contactlist");
        l.f(hashMap, "relationMasterHashMap");
        l.f(addContactScreen, "addContact");
        this.f14486d = arrayList;
        this.f14487e = hashMap;
        this.f14488f = addContactScreen;
    }

    /* access modifiers changed from: private */
    public static final void E(c cVar, int i10, View view) {
        l.f(cVar, "this$0");
        cVar.f14488f.w1(i10, ((MparSosContact) cVar.f14486d.get(i10)).getSoscRecordId());
    }

    /* access modifiers changed from: private */
    public static final void F(c cVar, int i10, View view) {
        l.f(cVar, "this$0");
        AddContactScreen addContactScreen = cVar.f14488f;
        Integer valueOf = Integer.valueOf(i10);
        Object obj = cVar.f14486d.get(i10);
        l.e(obj, "get(...)");
        addContactScreen.x1(valueOf, (MparSosContact) obj);
    }

    public final int C() {
        return this.f14486d.size();
    }

    /* renamed from: D */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            if (String.valueOf(((MparSosContact) this.f14486d.get(i10)).getSoscStatus()).equals("1")) {
                String soscName = ((MparSosContact) this.f14486d.get(i10)).getSoscName();
                String soscMobile = ((MparSosContact) this.f14486d.get(i10)).getSoscMobile();
                aVar.P().setText(soscName.toString());
                aVar.Q().setText(soscMobile.toString());
                TextView R = aVar.R();
                R.setText(" (" + ((String) this.f14487e.get(Integer.valueOf(((MparSosContact) this.f14486d.get(i10)).getSoscRelation()))) + ')');
                aVar.O().setOnClickListener(new a(this, i10));
                aVar.S().setOnClickListener(new b(this, i10));
            }
        } catch (Exception e10) {
            Log.e("AdapterEoor", e10.toString());
        }
    }

    /* renamed from: G */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_list_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void H(int i10) {
        this.f14486d.remove(i10);
        n(i10);
        m(i10, this.f14486d.size());
    }

    public int e() {
        return this.f14486d.size();
    }
}
