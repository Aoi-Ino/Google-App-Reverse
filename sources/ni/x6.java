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

public final class x6 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f29330a;

    /* renamed from: b  reason: collision with root package name */
    public final NestedScrollView f29331b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f29332c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f29333d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatEditText f29334e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f29335f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f29336g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f29337h;

    /* renamed from: i  reason: collision with root package name */
    public final qd f29338i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f29339j;

    private x6(RelativeLayout relativeLayout, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatEditText appCompatEditText, ProgressBar progressBar, MyTextView myTextView, AppCompatTextView appCompatTextView2, qd qdVar, AppCompatTextView appCompatTextView3) {
        this.f29330a = relativeLayout;
        this.f29331b = nestedScrollView;
        this.f29332c = appCompatTextView;
        this.f29333d = recyclerView;
        this.f29334e = appCompatEditText;
        this.f29335f = progressBar;
        this.f29336g = myTextView;
        this.f29337h = appCompatTextView2;
        this.f29338i = qdVar;
        this.f29339j = appCompatTextView3;
    }

    public static x6 a(View view) {
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
                                            return new x6((RelativeLayout) view, nestedScrollView, appCompatTextView, recyclerView, appCompatEditText, progressBar, myTextView, appCompatTextView2, a11, appCompatTextView3);
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

    public static x6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static x6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_notice_search_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f29330a;
    }
}
