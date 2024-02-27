package cb;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import cm.l;
import com.nic.mparivahan.R;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4895a;

    /* renamed from: b  reason: collision with root package name */
    private View f4896b;

    /* renamed from: c  reason: collision with root package name */
    private c.a f4897c;

    /* renamed from: d  reason: collision with root package name */
    private Dialog f4898d;

    public t0(Context context, int i10, boolean z10) {
        TextView textView;
        this.f4895a = i10;
        View inflate = LayoutInflater.from(context).inflate(R.layout.prog_layout, (ViewGroup) null);
        this.f4896b = inflate;
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(R.id.text)) == null)) {
            textView.setText(i10);
        }
        l.c(context);
        c.a aVar = new c.a(context);
        this.f4897c = aVar;
        aVar.p(this.f4896b);
        c a10 = this.f4897c.a();
        l.e(a10, "create(...)");
        this.f4898d = a10;
        a10.setCancelable(z10);
    }

    public final void a() {
        if (this.f4898d.isShowing()) {
            this.f4898d.dismiss();
        }
    }

    public final void b() {
        this.f4898d.show();
    }
}
