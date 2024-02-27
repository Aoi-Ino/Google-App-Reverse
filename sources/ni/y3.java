package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f29439a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f29440b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f29441c;

    /* renamed from: d  reason: collision with root package name */
    public final NestedScrollView f29442d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f29443e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f29444f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f29445g;

    private y3(NestedScrollView nestedScrollView, MyTextView myTextView, RecyclerView recyclerView, NestedScrollView nestedScrollView2, qd qdVar, TextView textView, TextView textView2) {
        this.f29439a = nestedScrollView;
        this.f29440b = myTextView;
        this.f29441c = recyclerView;
        this.f29442d = nestedScrollView2;
        this.f29443e = qdVar;
        this.f29444f = textView;
        this.f29445g = textView2;
    }

    public static y3 a(View view) {
        int i10 = R.id.body_type_text;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.body_type_text);
        if (myTextView != null) {
            i10 = R.id.challanListRv;
            RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.challanListRv);
            if (recyclerView != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i10 = R.id.topHolder;
                View a10 = a.a(view, R.id.topHolder);
                if (a10 != null) {
                    qd a11 = qd.a(a10);
                    i10 = R.id.vehicleNumberTv;
                    TextView textView = (TextView) a.a(view, R.id.vehicleNumberTv);
                    if (textView != null) {
                        i10 = R.id.vehicle_view;
                        TextView textView2 = (TextView) a.a(view, R.id.vehicle_view);
                        if (textView2 != null) {
                            return new y3(nestedScrollView, myTextView, recyclerView, nestedScrollView, a11, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static y3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static y3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_download_checkpost_tax_receipt_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public NestedScrollView b() {
        return this.f29439a;
    }
}
