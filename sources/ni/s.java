package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f28479a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f28480b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatEditText f28481c;

    /* renamed from: d  reason: collision with root package name */
    public final NestedScrollView f28482d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28483e;

    /* renamed from: f  reason: collision with root package name */
    public final qd f28484f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28485g;

    private s(NestedScrollView nestedScrollView, RecyclerView recyclerView, AppCompatEditText appCompatEditText, NestedScrollView nestedScrollView2, MyTextView myTextView, qd qdVar, MyTextView myTextView2) {
        this.f28479a = nestedScrollView;
        this.f28480b = recyclerView;
        this.f28481c = appCompatEditText;
        this.f28482d = nestedScrollView2;
        this.f28483e = myTextView;
        this.f28484f = qdVar;
        this.f28485g = myTextView2;
    }

    public static s a(View view) {
        int i10 = R.id.challanListRv;
        RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.challanListRv);
        if (recyclerView != null) {
            i10 = R.id.numberEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.numberEt);
            if (appCompatEditText != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i10 = R.id.searchTv;
                MyTextView myTextView = (MyTextView) a.a(view, R.id.searchTv);
                if (myTextView != null) {
                    i10 = R.id.topHolder;
                    View a10 = a.a(view, R.id.topHolder);
                    if (a10 != null) {
                        qd a11 = qd.a(a10);
                        i10 = R.id.tv_view_challan;
                        MyTextView myTextView2 = (MyTextView) a.a(view, R.id.tv_view_challan);
                        if (myTextView2 != null) {
                            return new s(nestedScrollView, recyclerView, appCompatEditText, nestedScrollView, myTextView, a11, myTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static s c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_available_fancy_number_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public NestedScrollView b() {
        return this.f28479a;
    }
}
