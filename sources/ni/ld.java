package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class ld {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f27366a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27367b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27368c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f27369d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27370e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27371f;

    /* renamed from: g  reason: collision with root package name */
    public final qd f27372g;

    private ld(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, qd qdVar) {
        this.f27366a = coordinatorLayout;
        this.f27367b = textView;
        this.f27368c = textView2;
        this.f27369d = constraintLayout;
        this.f27370e = textView3;
        this.f27371f = textView4;
        this.f27372g = qdVar;
    }

    public static ld a(View view) {
        int i10 = R.id.appl_status_link;
        TextView textView = (TextView) a.a(view, R.id.appl_status_link);
        if (textView != null) {
            i10 = R.id.confirm_txt;
            TextView textView2 = (TextView) a.a(view, R.id.confirm_txt);
            if (textView2 != null) {
                i10 = R.id.container_cl;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, R.id.container_cl);
                if (constraintLayout != null) {
                    i10 = R.id.ok_button;
                    TextView textView3 = (TextView) a.a(view, R.id.ok_button);
                    if (textView3 != null) {
                        i10 = R.id.save_as_image;
                        TextView textView4 = (TextView) a.a(view, R.id.save_as_image);
                        if (textView4 != null) {
                            i10 = R.id.topHolder;
                            View a10 = a.a(view, R.id.topHolder);
                            if (a10 != null) {
                                return new ld((CoordinatorLayout) view, textView, textView2, constraintLayout, textView3, textView4, qd.a(a10));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ld c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ld d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_confirmation_faceless, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f27366a;
    }
}
