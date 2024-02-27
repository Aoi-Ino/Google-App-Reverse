package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class wc {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f29231a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f29232b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f29233c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f29234d;

    /* renamed from: e  reason: collision with root package name */
    public final NestedScrollView f29235e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f29236f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatEditText f29237g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f29238h;

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f29239i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f29240j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f29241k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f29242l;

    /* renamed from: m  reason: collision with root package name */
    public final qd f29243m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f29244n;

    private wc(RelativeLayout relativeLayout, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView3, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView4, ProgressBar progressBar, MyTextView myTextView, LinearLayout linearLayout, AppCompatTextView appCompatTextView5, qd qdVar, AppCompatTextView appCompatTextView6) {
        this.f29231a = relativeLayout;
        this.f29232b = appCompatTextView;
        this.f29233c = recyclerView;
        this.f29234d = appCompatTextView2;
        this.f29235e = nestedScrollView;
        this.f29236f = appCompatTextView3;
        this.f29237g = appCompatEditText;
        this.f29238h = appCompatTextView4;
        this.f29239i = progressBar;
        this.f29240j = myTextView;
        this.f29241k = linearLayout;
        this.f29242l = appCompatTextView5;
        this.f29243m = qdVar;
        this.f29244n = appCompatTextView6;
    }

    public static wc a(View view) {
        View view2 = view;
        int i10 = R.id.allTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.allTv);
        if (appCompatTextView != null) {
            i10 = R.id.challanListRv;
            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.challanListRv);
            if (recyclerView != null) {
                i10 = R.id.disposeTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.disposeTv);
                if (appCompatTextView2 != null) {
                    i10 = R.id.nestedScrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) a.a(view2, R.id.nestedScrollView);
                    if (nestedScrollView != null) {
                        i10 = R.id.noChallanFoundTv;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.noChallanFoundTv);
                        if (appCompatTextView3 != null) {
                            i10 = R.id.numberEt;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.numberEt);
                            if (appCompatEditText != null) {
                                i10 = R.id.pendingTv;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.pendingTv);
                                if (appCompatTextView4 != null) {
                                    i10 = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.progressBar);
                                    if (progressBar != null) {
                                        i10 = R.id.searchTv;
                                        MyTextView myTextView = (MyTextView) a.a(view2, R.id.searchTv);
                                        if (myTextView != null) {
                                            i10 = R.id.tabBarLl;
                                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.tabBarLl);
                                            if (linearLayout != null) {
                                                i10 = R.id.titleTv;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                                if (appCompatTextView5 != null) {
                                                    i10 = R.id.topHolder;
                                                    View a10 = a.a(view2, R.id.topHolder);
                                                    if (a10 != null) {
                                                        qd a11 = qd.a(a10);
                                                        i10 = R.id.totalChallanCountTv;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.totalChallanCountTv);
                                                        if (appCompatTextView6 != null) {
                                                            return new wc((RelativeLayout) view2, appCompatTextView, recyclerView, appCompatTextView2, nestedScrollView, appCompatTextView3, appCompatEditText, appCompatTextView4, progressBar, myTextView, linearLayout, appCompatTextView5, a11, appCompatTextView6);
                                                        }
                                                    }
                                                }
                                            }
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

    public static wc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static wc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.search_challan_status_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f29231a;
    }
}
