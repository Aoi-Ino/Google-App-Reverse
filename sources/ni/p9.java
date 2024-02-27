package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class p9 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27998a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f27999b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f28000c;

    /* renamed from: d  reason: collision with root package name */
    public final rc f28001d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28002e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f28003f;

    private p9(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, rc rcVar, MyTextView myTextView, ProgressBar progressBar) {
        this.f27998a = linearLayout;
        this.f27999b = recyclerView;
        this.f28000c = linearLayout2;
        this.f28001d = rcVar;
        this.f28002e = myTextView;
        this.f28003f = progressBar;
    }

    public static p9 a(View view) {
        int i10 = R.id.doc_list;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.doc_list);
        if (recyclerView != null) {
            i10 = R.id.elg_dl_services;
            LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.elg_dl_services);
            if (linearLayout != null) {
                i10 = R.id.include3;
                View a10 = a.a(view, R.id.include3);
                if (a10 != null) {
                    rc a11 = rc.a(a10);
                    i10 = R.id.myApplicationNo;
                    MyTextView myTextView = (MyTextView) a.a(view, R.id.myApplicationNo);
                    if (myTextView != null) {
                        i10 = R.id.pb_es;
                        ProgressBar progressBar = (ProgressBar) a.a(view, R.id.pb_es);
                        if (progressBar != null) {
                            return new p9((LinearLayout) view, recyclerView, linearLayout, a11, myTextView, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static p9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_view_doc_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27998a;
    }
}
