package e9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Citizen.Models.MparViolationFeedback;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ld.c;

public final class d extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f11108d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f11109e;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f11110y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f11111z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.acc_feedback);
            l.e(findViewById, "findViewById(...)");
            this.f11110y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.acc_feedback_date);
            l.e(findViewById2, "findViewById(...)");
            this.f11111z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.acc_feedback_id);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.tv_feedback);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
        }

        public final TextView O() {
            return this.f11110y;
        }

        public final TextView P() {
            return this.f11111z;
        }

        public final TextView Q() {
            return this.B;
        }

        public final TextView R() {
            return this.A;
        }
    }

    public d(ArrayList arrayList, Context context) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        this.f11108d = arrayList;
        this.f11109e = context;
    }

    public final String A(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        aVar.Q().setText(new c(this.f11109e).b("Document_type_Text", "Feedback"));
        Object obj = this.f11108d.get(i10);
        l.e(obj, "get(...)");
        MparViolationFeedback mparViolationFeedback = (MparViolationFeedback) obj;
        aVar.O().setText(mparViolationFeedback.getFeedbackRemarks());
        TextView R = aVar.R();
        R.setText("Feedback " + (i10 + 1));
        if (mparViolationFeedback.getFeedbackCreatedAt().length() > 8) {
            TextView P = aVar.P();
            String substring = p.w(mparViolationFeedback.getFeedbackCreatedAt(), "T", " ", false, 4, (Object) null).substring(0, 16);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            P.setText(A(substring));
        }
    }

    /* renamed from: C */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.get_acc_feedback, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f11108d.size();
    }
}
