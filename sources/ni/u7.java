package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class u7 {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f28848a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f28849b;

    /* renamed from: c  reason: collision with root package name */
    public final NestedScrollView f28850c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f28851d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28852e;

    private u7(NestedScrollView nestedScrollView, RecyclerView recyclerView, NestedScrollView nestedScrollView2, qd qdVar, MyTextView myTextView) {
        this.f28848a = nestedScrollView;
        this.f28849b = recyclerView;
        this.f28850c = nestedScrollView2;
        this.f28851d = qdVar;
        this.f28852e = myTextView;
    }

    public static u7 a(View view) {
        int i10 = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            i10 = R.id.topHolder;
            View a10 = a.a(view, R.id.topHolder);
            if (a10 != null) {
                qd a11 = qd.a(a10);
                i10 = R.id.tv_view_challan;
                MyTextView myTextView = (MyTextView) a.a(view, R.id.tv_view_challan);
                if (myTextView != null) {
                    return new u7(nestedScrollView, recyclerView, nestedScrollView, a11, myTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static u7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static u7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_runnning_auction_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public NestedScrollView b() {
        return this.f28848a;
    }
}
