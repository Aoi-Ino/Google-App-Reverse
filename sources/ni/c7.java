package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class c7 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f25629a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f25630b;

    /* renamed from: c  reason: collision with root package name */
    public final dc f25631c;

    private c7(RelativeLayout relativeLayout, LinearLayout linearLayout, dc dcVar) {
        this.f25629a = relativeLayout;
        this.f25630b = linearLayout;
        this.f25631c = dcVar;
    }

    public static c7 a(View view) {
        int i10 = R.id.id_dupdl_summit;
        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.id_dupdl_summit);
        if (linearLayout != null) {
            i10 = R.id.mHeader;
            View a10 = a.a(view, R.id.mHeader);
            if (a10 != null) {
                return new c7((RelativeLayout) view, linearLayout, dc.a(a10));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static c7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_payment_receipt, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f25629a;
    }
}
