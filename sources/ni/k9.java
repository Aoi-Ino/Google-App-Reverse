package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class k9 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27123a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f27124b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f27125c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatEditText f27126d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f27127e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f27128f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f27129g;

    /* renamed from: h  reason: collision with root package name */
    public final qd f27130h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f27131i;

    private k9(RelativeLayout relativeLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, qd qdVar, AppCompatTextView appCompatTextView3) {
        this.f27123a = relativeLayout;
        this.f27124b = recyclerView;
        this.f27125c = appCompatTextView;
        this.f27126d = appCompatEditText;
        this.f27127e = progressBar;
        this.f27128f = myTextView;
        this.f27129g = appCompatTextView2;
        this.f27130h = qdVar;
        this.f27131i = appCompatTextView3;
    }

    public static k9 a(View view) {
        int i10 = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i10 = R.id.noChallanFoundTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.noChallanFoundTv);
            if (appCompatTextView != null) {
                i10 = R.id.numberEt;
                AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.numberEt);
                if (appCompatEditText != null) {
                    i10 = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) a.a(view, R.id.progressBar);
                    if (progressBar != null) {
                        i10 = R.id.searchTv;
                        MyTextView myTextView = (MyTextView) a.a(view, R.id.searchTv);
                        if (myTextView != null) {
                            i10 = R.id.titleTv;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view, R.id.titleTv);
                            if (appCompatTextView2 != null) {
                                i10 = R.id.topHolder;
                                View a10 = a.a(view, R.id.topHolder);
                                if (a10 != null) {
                                    qd a11 = qd.a(a10);
                                    i10 = R.id.totalChallanCountTv;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view, R.id.totalChallanCountTv);
                                    if (appCompatTextView3 != null) {
                                        return new k9((RelativeLayout) view, recyclerView, appCompatTextView, appCompatEditText, progressBar, myTextView, appCompatTextView2, a11, appCompatTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static k9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static k9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_verify_payment_challan_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27123a;
    }
}
