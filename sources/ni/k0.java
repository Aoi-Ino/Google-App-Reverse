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

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27056a;

    /* renamed from: b  reason: collision with root package name */
    public final NestedScrollView f27057b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f27058c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f27059d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatEditText f27060e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f27061f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f27062g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27063h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f27064i;

    /* renamed from: j  reason: collision with root package name */
    public final qd f27065j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f27066k;

    private k0(RelativeLayout relativeLayout, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, LinearLayout linearLayout, AppCompatTextView appCompatTextView2, qd qdVar, AppCompatTextView appCompatTextView3) {
        this.f27056a = relativeLayout;
        this.f27057b = nestedScrollView;
        this.f27058c = appCompatTextView;
        this.f27059d = recyclerView;
        this.f27060e = appCompatEditText;
        this.f27061f = progressBar;
        this.f27062g = myTextView;
        this.f27063h = linearLayout;
        this.f27064i = appCompatTextView2;
        this.f27065j = qdVar;
        this.f27066k = appCompatTextView3;
    }

    public static k0 a(View view) {
        int i10 = R.id.nestedScrollView;
        NestedScrollView nestedScrollView = (NestedScrollView) a.a(view, R.id.nestedScrollView);
        if (nestedScrollView != null) {
            i10 = R.id.noNoticeFoundTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.noNoticeFoundTv);
            if (appCompatTextView != null) {
                i10 = R.id.noticeListRv;
                RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.noticeListRv);
                if (recyclerView != null) {
                    i10 = R.id.numberEt;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.numberEt);
                    if (appCompatEditText != null) {
                        i10 = R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) a.a(view, R.id.progressBar);
                        if (progressBar != null) {
                            i10 = R.id.searchTv;
                            MyTextView myTextView = (MyTextView) a.a(view, R.id.searchTv);
                            if (myTextView != null) {
                                i10 = R.id.tabBarLl;
                                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.tabBarLl);
                                if (linearLayout != null) {
                                    i10 = R.id.titleTv;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view, R.id.titleTv);
                                    if (appCompatTextView2 != null) {
                                        i10 = R.id.topHolder;
                                        View a10 = a.a(view, R.id.topHolder);
                                        if (a10 != null) {
                                            qd a11 = qd.a(a10);
                                            i10 = R.id.totalNoticeCountTv;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view, R.id.totalNoticeCountTv);
                                            if (appCompatTextView3 != null) {
                                                return new k0((RelativeLayout) view, nestedScrollView, appCompatTextView, recyclerView, appCompatEditText, progressBar, myTextView, linearLayout, appCompatTextView2, a11, appCompatTextView3);
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

    public static k0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static k0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_check_post_search_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27056a;
    }
}
