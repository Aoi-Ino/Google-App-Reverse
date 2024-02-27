package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25556a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f25557b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f25558c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f25559d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25560e;

    /* renamed from: f  reason: collision with root package name */
    public final qd f25561f;

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f25562g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25563h;

    private bc(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, LinearLayout linearLayout2, qd qdVar, RecyclerView recyclerView, TextView textView) {
        this.f25556a = coordinatorLayout;
        this.f25557b = linearLayout;
        this.f25558c = appCompatButton;
        this.f25559d = appCompatButton2;
        this.f25560e = linearLayout2;
        this.f25561f = qdVar;
        this.f25562g = recyclerView;
        this.f25563h = textView;
    }

    public static bc a(View view) {
        int i10 = R.id.elg_dl_services;
        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.elg_dl_services);
        if (linearLayout != null) {
            i10 = R.id.reset_button;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.reset_button);
            if (appCompatButton != null) {
                i10 = R.id.submit_button;
                AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.submit_button);
                if (appCompatButton2 != null) {
                    i10 = R.id.submit_layout;
                    LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.submit_layout);
                    if (linearLayout2 != null) {
                        i10 = R.id.topHolder;
                        View a10 = a.a(view, R.id.topHolder);
                        if (a10 != null) {
                            qd a11 = qd.a(a10);
                            i10 = R.id.vahan_recyclerView;
                            RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.vahan_recyclerView);
                            if (recyclerView != null) {
                                i10 = R.id.vahan_title;
                                TextView textView = (TextView) a.a(view, R.id.vahan_title);
                                if (textView != null) {
                                    return new bc((CoordinatorLayout) view, linearLayout, appCompatButton, appCompatButton2, linearLayout2, a11, recyclerView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static bc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static bc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.multiservicelayout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25556a;
    }
}
