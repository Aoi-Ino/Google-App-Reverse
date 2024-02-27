package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class wa {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29222a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29223b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29224c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f29225d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f29226e;

    private wa(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f29222a = linearLayout;
        this.f29223b = textView;
        this.f29224c = textView2;
        this.f29225d = linearLayout2;
        this.f29226e = recyclerView;
    }

    public static wa a(View view) {
        int i10 = R.id.ev_end_date;
        TextView textView = (TextView) a.a(view, R.id.ev_end_date);
        if (textView != null) {
            i10 = R.id.ev_start_date;
            TextView textView2 = (TextView) a.a(view, R.id.ev_start_date);
            if (textView2 != null) {
                i10 = R.id.image_search;
                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.image_search);
                if (linearLayout != null) {
                    i10 = R.id.lv_acc_list;
                    RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.lv_acc_list);
                    if (recyclerView != null) {
                        return new wa((LinearLayout) view, textView, textView2, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static wa c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_accident_report_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29222a;
    }
}
