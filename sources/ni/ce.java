package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class ce {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25789a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f25790b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25791c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f25792d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f25793e;

    private ce(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, qd qdVar, MyTextView myTextView) {
        this.f25789a = linearLayout;
        this.f25790b = recyclerView;
        this.f25791c = textView;
        this.f25792d = qdVar;
        this.f25793e = myTextView;
    }

    public static ce a(View view) {
        int i10 = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i10 = R.id.noChallanFoundTv;
            TextView textView = (TextView) a.a(view, R.id.noChallanFoundTv);
            if (textView != null) {
                i10 = R.id.topHolder;
                View a10 = a.a(view, R.id.topHolder);
                if (a10 != null) {
                    qd a11 = qd.a(a10);
                    i10 = R.id.tv_view_challan;
                    MyTextView myTextView = (MyTextView) a.a(view, R.id.tv_view_challan);
                    if (myTextView != null) {
                        return new ce((LinearLayout) view, recyclerView, textView, a11, myTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ce c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ce d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.view_rc_challan, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25789a;
    }
}
