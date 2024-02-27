package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class qa {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28268a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f28269b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatEditText f28270c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f28271d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28272e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f28273f;

    /* renamed from: g  reason: collision with root package name */
    public final qd f28274g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f28275h;

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f28276i;

    private qa(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, qd qdVar, AppCompatTextView appCompatTextView3, RecyclerView recyclerView) {
        this.f28268a = scrollView;
        this.f28269b = appCompatTextView;
        this.f28270c = appCompatEditText;
        this.f28271d = progressBar;
        this.f28272e = myTextView;
        this.f28273f = appCompatTextView2;
        this.f28274g = qdVar;
        this.f28275h = appCompatTextView3;
        this.f28276i = recyclerView;
    }

    public static qa a(View view) {
        int i10 = R.id.noChallanFoundTv;
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
                                    i10 = R.id.transactionStatusRv;
                                    RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.transactionStatusRv);
                                    if (recyclerView != null) {
                                        return new qa((ScrollView) view, appCompatTextView, appCompatEditText, progressBar, myTextView, appCompatTextView2, a11, appCompatTextView3, recyclerView);
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

    public static qa c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static qa d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.echallan_payment_transcation_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28268a;
    }
}
