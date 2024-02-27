package bb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f4537d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f4538e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4539f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4540g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4541h;

    /* renamed from: bb.a$a  reason: collision with other inner class name */
    public static final class C0087a extends RecyclerView.d0 {
        private final View A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f4542y;

        /* renamed from: z  reason: collision with root package name */
        private final ImageView f4543z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0087a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.steps_text);
            l.e(findViewById, "findViewById(...)");
            this.f4542y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.steps_image);
            l.e(findViewById2, "findViewById(...)");
            this.f4543z = (ImageView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.paymentView);
            l.e(findViewById3, "findViewById(...)");
            this.A = findViewById3;
        }

        public final TextView O() {
            return this.f4542y;
        }

        public final View P() {
            return this.A;
        }

        public final ImageView Q() {
            return this.f4543z;
        }
    }

    public a(ArrayList arrayList, Context context, int i10, int i11, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "name");
        this.f4537d = arrayList;
        this.f4538e = context;
        this.f4539f = i10;
        this.f4540g = i11;
        this.f4541h = str;
    }

    /* renamed from: A */
    public void p(C0087a aVar, int i10) {
        ImageView Q;
        int i11;
        View P;
        int i12;
        View P2;
        LinearLayout.LayoutParams layoutParams;
        l.f(aVar, "holder");
        Object obj = this.f4537d.get(i10);
        l.e(obj, "get(...)");
        String str = (String) obj;
        if (l.a(this.f4541h, str)) {
            Q = aVar.Q();
            i11 = R.drawable.blacktwo;
        } else if (i10 < this.f4539f - 1) {
            Q = aVar.Q();
            i11 = R.drawable.check;
        } else {
            Q = aVar.Q();
            i11 = R.drawable.black;
        }
        Q.setBackgroundResource(i11);
        if (i10 == this.f4537d.size() - 1) {
            P = aVar.P();
            i12 = 8;
        } else {
            P = aVar.P();
            i12 = 0;
        }
        P.setVisibility(i12);
        if (this.f4537d.size() == 2) {
            aVar.P().setLayoutParams(new LinearLayout.LayoutParams((this.f4540g / 2) + 30, 6));
        } else {
            if (this.f4537d.size() == 3) {
                P2 = aVar.P();
                layoutParams = new LinearLayout.LayoutParams((this.f4540g / 4) - 60, 6);
            } else {
                P2 = aVar.P();
                layoutParams = new LinearLayout.LayoutParams(80, 6);
            }
            P2.setLayoutParams(layoutParams);
        }
        try {
            aVar.O().setText(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: B */
    public C0087a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.steps_layout, viewGroup, false);
        l.c(inflate);
        return new C0087a(inflate);
    }

    public int e() {
        return this.f4537d.size();
    }
}
