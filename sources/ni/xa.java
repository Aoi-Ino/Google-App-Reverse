package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class xa {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29395a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29396b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29397c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f29398d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f29399e;

    private xa(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f29395a = linearLayout;
        this.f29396b = textView;
        this.f29397c = textView2;
        this.f29398d = linearLayout2;
        this.f29399e = recyclerView;
    }

    public static xa a(View view) {
        int i10 = R.id.ev_end_date;
        TextView textView = (TextView) a.a(view, R.id.ev_end_date);
        if (textView != null) {
            i10 = R.id.ev_start_date;
            TextView textView2 = (TextView) a.a(view, R.id.ev_start_date);
            if (textView2 != null) {
                i10 = R.id.image_search;
                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.image_search);
                if (linearLayout != null) {
                    i10 = R.id.lv_complaint_list;
                    RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.lv_complaint_list);
                    if (recyclerView != null) {
                        return new xa((LinearLayout) view, textView, textView2, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static xa c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_complaint_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29395a;
    }
}
