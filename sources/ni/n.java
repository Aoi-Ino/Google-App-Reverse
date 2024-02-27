package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f27504a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f27505b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f27506c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f27507d;

    private n(CoordinatorLayout coordinatorLayout, qd qdVar, MyTextView myTextView, RecyclerView recyclerView) {
        this.f27504a = coordinatorLayout;
        this.f27505b = qdVar;
        this.f27506c = myTextView;
        this.f27507d = recyclerView;
    }

    public static n a(View view) {
        int i10 = R.id.applicationStatusHeader;
        View a10 = a.a(view, R.id.applicationStatusHeader);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            int i11 = R.id.idLayoutTitle;
            MyTextView myTextView = (MyTextView) a.a(view, R.id.idLayoutTitle);
            if (myTextView != null) {
                i11 = R.id.list_item;
                RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.list_item);
                if (recyclerView != null) {
                    return new n((CoordinatorLayout) view, a11, myTextView, recyclerView);
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static n d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_appl_status_application_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f27504a;
    }
}
