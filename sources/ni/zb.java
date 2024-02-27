package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class zb {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f29765a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29766b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29767c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f29768d;

    private zb(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, qd qdVar) {
        this.f29765a = coordinatorLayout;
        this.f29766b = textView;
        this.f29767c = textView2;
        this.f29768d = qdVar;
    }

    public static zb a(View view) {
        int i10 = R.id.confirm_txt;
        TextView textView = (TextView) a.a(view, R.id.confirm_txt);
        if (textView != null) {
            i10 = R.id.ok_button;
            TextView textView2 = (TextView) a.a(view, R.id.ok_button);
            if (textView2 != null) {
                i10 = R.id.topHolder;
                View a10 = a.a(view, R.id.topHolder);
                if (a10 != null) {
                    return new zb((CoordinatorLayout) view, textView, textView2, qd.a(a10));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static zb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static zb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.multiservice_confirmation, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f29765a;
    }
}
