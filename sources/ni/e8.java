package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class e8 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f26086a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f26087b;

    /* renamed from: c  reason: collision with root package name */
    public final NestedScrollView f26088c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f26089d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatEditText f26090e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f26091f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26092g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f26093h;

    /* renamed from: i  reason: collision with root package name */
    public final qd f26094i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f26095j;

    private e8(RelativeLayout relativeLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, qd qdVar, AppCompatTextView appCompatTextView3) {
        this.f26086a = relativeLayout;
        this.f26087b = recyclerView;
        this.f26088c = nestedScrollView;
        this.f26089d = appCompatTextView;
        this.f26090e = appCompatEditText;
        this.f26091f = progressBar;
        this.f26092g = myTextView;
        this.f26093h = appCompatTextView2;
        this.f26094i = qdVar;
        this.f26095j = appCompatTextView3;
    }

    public static e8 a(View view) {
        int i10 = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i10 = R.id.nestedScrollView;
            NestedScrollView nestedScrollView = (NestedScrollView) a.a(view, R.id.nestedScrollView);
            if (nestedScrollView != null) {
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
                                            return new e8((RelativeLayout) view, recyclerView, nestedScrollView, appCompatTextView, appCompatEditText, progressBar, myTextView, appCompatTextView2, a11, appCompatTextView3);
                                        }
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

    public static e8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static e8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_print_challan_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f26086a;
    }
}
