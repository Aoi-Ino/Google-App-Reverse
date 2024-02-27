package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class jd {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f27029a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27030b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f27031c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27032d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27033e;

    /* renamed from: f  reason: collision with root package name */
    public final qd f27034f;

    private jd(CoordinatorLayout coordinatorLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, qd qdVar) {
        this.f27029a = coordinatorLayout;
        this.f27030b = textView;
        this.f27031c = constraintLayout;
        this.f27032d = textView2;
        this.f27033e = textView3;
        this.f27034f = qdVar;
    }

    public static jd a(View view) {
        int i10 = R.id.confirm_txt;
        TextView textView = (TextView) a.a(view, R.id.confirm_txt);
        if (textView != null) {
            i10 = R.id.container_cl;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, R.id.container_cl);
            if (constraintLayout != null) {
                i10 = R.id.home;
                TextView textView2 = (TextView) a.a(view, R.id.home);
                if (textView2 != null) {
                    i10 = R.id.ok_button;
                    TextView textView3 = (TextView) a.a(view, R.id.ok_button);
                    if (textView3 != null) {
                        i10 = R.id.topHolder;
                        View a10 = a.a(view, R.id.topHolder);
                        if (a10 != null) {
                            return new jd((CoordinatorLayout) view, textView, constraintLayout, textView2, textView3, qd.a(a10));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static jd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static jd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.tranfer_of_owner_ship_confirmation_seller, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f27029a;
    }
}
