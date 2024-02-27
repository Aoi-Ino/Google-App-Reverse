package og;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import java.util.ArrayList;
import ka.c;
import wd.l0;

public final class f0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f30040d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f30041e;

    /* renamed from: f  reason: collision with root package name */
    private final l0 f30042f;

    public static final class a extends RecyclerView.d0 {
        private LinearLayout A;
        private final TextView B;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f30043y;

        /* renamed from: z  reason: collision with root package name */
        private ProgressBar f30044z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.rc_number);
            l.e(findViewById, "findViewById(...)");
            this.f30043y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.progress_bar);
            l.e(findViewById2, "findViewById(...)");
            this.f30044z = (ProgressBar) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.vehicle_linear);
            l.e(findViewById3, "findViewById(...)");
            this.A = (LinearLayout) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.txtGoForAvailable);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
        }

        public final TextView O() {
            return this.f30043y;
        }

        public final TextView P() {
            return this.B;
        }

        public final LinearLayout Q() {
            return this.A;
        }
    }

    public f0(ArrayList arrayList, Context context, l0 l0Var) {
        l.f(arrayList, "rc_details");
        l.f(context, "context");
        l.f(l0Var, "getNUmber");
        this.f30040d = arrayList;
        this.f30041e = context;
        this.f30042f = l0Var;
    }

    /* access modifiers changed from: private */
    public static final void E(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F(AppCompatEditText appCompatEditText, Context context, Dialog dialog, f0 f0Var, String str, int i10, View view) {
        l.f(appCompatEditText, "$chassi_number");
        l.f(context, "$context");
        l.f(dialog, "$d");
        l.f(f0Var, "this$0");
        l.f(str, "$rc_number");
        Editable text = appCompatEditText.getText();
        Integer valueOf = text != null ? Integer.valueOf(text.length()) : null;
        l.c(valueOf);
        if (valueOf.intValue() < 5) {
            Toast.makeText(context, "Please enter the Chassi number", 0).show();
            return;
        }
        dialog.dismiss();
        f0Var.f30042f.a0(str, i10, String.valueOf(appCompatEditText.getText()));
    }

    /* access modifiers changed from: private */
    public static final void H(f0 f0Var, int i10, u uVar, View view) {
        l.f(f0Var, "this$0");
        l.f(uVar, "$rc_numer");
        NrvDetails nrvDetails = ((Document) f0Var.f30040d.get(i10)).getNrvDetails();
        String valueOf = String.valueOf(nrvDetails != null ? nrvDetails.getRc_chasi_no() : null);
        if (!c.f13158a.m(valueOf)) {
            String substring = valueOf.substring(valueOf.length() - 5, valueOf.length());
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            f0Var.f30042f.a0((String) uVar.f20234e, i10, substring);
            return;
        }
        f0Var.D(f0Var.f30041e, (String) uVar.f20234e, i10);
    }

    public final void D(Context context, String str, int i10) {
        l.f(context, "context");
        l.f(str, "rc_number");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_chassi_no_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View findViewById = dialog.findViewById(R.id.vehicle_number);
        l.d(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        View findViewById2 = dialog.findViewById(R.id.chassi_number);
        l.d(findViewById2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText");
        View findViewById3 = dialog.findViewById(R.id.okbuttondismiss);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById4 = dialog.findViewById(R.id.close);
        l.d(findViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        ((LinearLayoutCompat) findViewById4).setOnClickListener(new d0(dialog));
        ((AppCompatTextView) findViewById).setText(str);
        ((LinearLayout) findViewById3).setOnClickListener(new e0((AppCompatEditText) findViewById2, context, dialog, this, str, i10));
        dialog.show();
    }

    /* renamed from: G */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        try {
            aVar.P().setText(new ld.c(this.f30041e).b("title_dl_serv_go_aval", this.f30041e.getString(R.string.go_for_available_services)));
            u uVar = new u();
            uVar.f20234e = ((Document) this.f30040d.get(i10)).getRc();
            aVar.O().setText(((String) uVar.f20234e).toString());
            aVar.Q().setOnClickListener(new c0(this, i10, uVar));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: I */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_vehicle_service, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f30040d.size();
    }
}
