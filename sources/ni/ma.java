package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.R;
import k1.a;

public final class ma {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f27459a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27460b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27461c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27462d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27463e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27464f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f27465g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27466h;

    /* renamed from: i  reason: collision with root package name */
    public final NestedScrollView f27467i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27468j;

    /* renamed from: k  reason: collision with root package name */
    public final qd f27469k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27470l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f27471m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27472n;

    private ma(NestedScrollView nestedScrollView, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, NestedScrollView nestedScrollView2, TextView textView6, qd qdVar, TextView textView7, LinearLayout linearLayout2, TextView textView8) {
        this.f27459a = nestedScrollView;
        this.f27460b = textView;
        this.f27461c = linearLayout;
        this.f27462d = textView2;
        this.f27463e = textView3;
        this.f27464f = textView4;
        this.f27465g = imageView;
        this.f27466h = textView5;
        this.f27467i = nestedScrollView2;
        this.f27468j = textView6;
        this.f27469k = qdVar;
        this.f27470l = textView7;
        this.f27471m = linearLayout2;
        this.f27472n = textView8;
    }

    public static ma a(View view) {
        View view2 = view;
        int i10 = R.id.address;
        TextView textView = (TextView) a.a(view2, R.id.address);
        if (textView != null) {
            i10 = R.id.dlHolder;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.dlHolder);
            if (linearLayout != null) {
                i10 = R.id.dlNo;
                TextView textView2 = (TextView) a.a(view2, R.id.dlNo);
                if (textView2 != null) {
                    i10 = R.id.issue_date;
                    TextView textView3 = (TextView) a.a(view2, R.id.issue_date);
                    if (textView3 != null) {
                        i10 = R.id.ntValidUpTodate;
                        TextView textView4 = (TextView) a.a(view2, R.id.ntValidUpTodate);
                        if (textView4 != null) {
                            i10 = R.id.option_menu;
                            ImageView imageView = (ImageView) a.a(view2, R.id.option_menu);
                            if (imageView != null) {
                                i10 = R.id.owner_name;
                                TextView textView5 = (TextView) a.a(view2, R.id.owner_name);
                                if (textView5 != null) {
                                    NestedScrollView nestedScrollView = (NestedScrollView) view2;
                                    i10 = R.id.status_txt;
                                    TextView textView6 = (TextView) a.a(view2, R.id.status_txt);
                                    if (textView6 != null) {
                                        i10 = R.id.topHolder;
                                        View a10 = a.a(view2, R.id.topHolder);
                                        if (a10 != null) {
                                            qd a11 = qd.a(a10);
                                            i10 = R.id.trValidUpto;
                                            TextView textView7 = (TextView) a.a(view2, R.id.trValidUpto);
                                            if (textView7 != null) {
                                                i10 = R.id.transport_layout;
                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.transport_layout);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.virtualRcTv;
                                                    TextView textView8 = (TextView) a.a(view2, R.id.virtualRcTv);
                                                    if (textView8 != null) {
                                                        return new ma(nestedScrollView, textView, linearLayout, textView2, textView3, textView4, imageView, textView5, nestedScrollView, textView6, a11, textView7, linearLayout2, textView8);
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

    public static ma c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ma d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.doc_virtual_dl, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public NestedScrollView b() {
        return this.f27459a;
    }
}
