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

public final class pa {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28004a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f28005b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatEditText f28006c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f28007d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f28008e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28009f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f28010g;

    /* renamed from: h  reason: collision with root package name */
    public final qd f28011h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f28012i;

    private pa(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, RecyclerView recyclerView, MyTextView myTextView, AppCompatTextView appCompatTextView2, qd qdVar, AppCompatTextView appCompatTextView3) {
        this.f28004a = scrollView;
        this.f28005b = appCompatTextView;
        this.f28006c = appCompatEditText;
        this.f28007d = progressBar;
        this.f28008e = recyclerView;
        this.f28009f = myTextView;
        this.f28010g = appCompatTextView2;
        this.f28011h = qdVar;
        this.f28012i = appCompatTextView3;
    }

    public static pa a(View view) {
        int i10 = R.id.noChallanFoundTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.noChallanFoundTv);
        if (appCompatTextView != null) {
            i10 = R.id.numberEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.numberEt);
            if (appCompatEditText != null) {
                i10 = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) a.a(view, R.id.progressBar);
                if (progressBar != null) {
                    i10 = R.id.reprintReceiptRv;
                    RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.reprintReceiptRv);
                    if (recyclerView != null) {
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
                                        return new pa((ScrollView) view, appCompatTextView, appCompatEditText, progressBar, recyclerView, myTextView, appCompatTextView2, a11, appCompatTextView3);
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

    public static pa c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static pa d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.echallan_payment_reprint_receipt_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28004a;
    }
}
