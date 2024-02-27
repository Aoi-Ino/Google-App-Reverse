package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class h7 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26633a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f26634b;

    /* renamed from: c  reason: collision with root package name */
    public final qd f26635c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f26636d;

    private h7(LinearLayout linearLayout, RecyclerView recyclerView, qd qdVar, AppCompatTextView appCompatTextView) {
        this.f26633a = linearLayout;
        this.f26634b = recyclerView;
        this.f26635c = qdVar;
        this.f26636d = appCompatTextView;
    }

    public static h7 a(View view) {
        int i10 = R.id.pendingTransactionRv;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.pendingTransactionRv);
        if (recyclerView != null) {
            i10 = R.id.topHolder;
            View a10 = a.a(view, R.id.topHolder);
            if (a10 != null) {
                qd a11 = qd.a(a10);
                AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.topTitleTv);
                if (appCompatTextView != null) {
                    return new h7((LinearLayout) view, recyclerView, a11, appCompatTextView);
                }
                i10 = R.id.topTitleTv;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static h7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_pending_transaction_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26633a;
    }
}
