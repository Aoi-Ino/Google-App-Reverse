package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26170a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26171b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26172c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f26173d;

    private f0(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, qd qdVar) {
        this.f26170a = coordinatorLayout;
        this.f26171b = textView;
        this.f26172c = textView2;
        this.f26173d = qdVar;
    }

    public static f0 a(View view) {
        int i10 = R.id.confirm_txt;
        TextView textView = (TextView) a.a(view, R.id.confirm_txt);
        if (textView != null) {
            i10 = R.id.ok_button;
            TextView textView2 = (TextView) a.a(view, R.id.ok_button);
            if (textView2 != null) {
                i10 = R.id.topHolder;
                View a10 = a.a(view, R.id.topHolder);
                if (a10 != null) {
                    return new f0((CoordinatorLayout) view, textView, textView2, qd.a(a10));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static f0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_change_of_address_confirmation, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26170a;
    }
}
