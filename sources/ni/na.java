package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class na {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f27670a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f27671b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f27672c;

    /* renamed from: d  reason: collision with root package name */
    public final NestedScrollView f27673d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27674e;

    /* renamed from: f  reason: collision with root package name */
    public final qd f27675f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27676g;

    private na(NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, NestedScrollView nestedScrollView2, TextView textView, qd qdVar, TextView textView2) {
        this.f27670a = nestedScrollView;
        this.f27671b = appCompatTextView;
        this.f27672c = recyclerView;
        this.f27673d = nestedScrollView2;
        this.f27674e = textView;
        this.f27675f = qdVar;
        this.f27676g = textView2;
    }

    public static na a(View view) {
        int i10 = R.id.docTitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.docTitle);
        if (appCompatTextView != null) {
            i10 = R.id.recyclerview;
            RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.recyclerview);
            if (recyclerView != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i10 = R.id.status_txt;
                TextView textView = (TextView) a.a(view, R.id.status_txt);
                if (textView != null) {
                    i10 = R.id.topHolder;
                    View a10 = a.a(view, R.id.topHolder);
                    if (a10 != null) {
                        qd a11 = qd.a(a10);
                        i10 = R.id.virtualRcTv;
                        TextView textView2 = (TextView) a.a(view, R.id.virtualRcTv);
                        if (textView2 != null) {
                            return new na(nestedScrollView, appCompatTextView, recyclerView, nestedScrollView, textView, a11, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static na c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static na d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.doc_virtual_rc, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public NestedScrollView b() {
        return this.f27670a;
    }
}
