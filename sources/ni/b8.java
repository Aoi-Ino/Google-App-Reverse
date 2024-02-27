package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class b8 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25476a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25477b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25478c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25479d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25480e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25481f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25482g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25483h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25484i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f25485j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f25486k;

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f25487l;

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f25488m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25489n;

    /* renamed from: o  reason: collision with root package name */
    public final View f25490o;

    private b8(CoordinatorLayout coordinatorLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView4, LinearLayout linearLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, RelativeLayout relativeLayout, TextView textView5, View view) {
        this.f25476a = coordinatorLayout;
        this.f25477b = textView;
        this.f25478c = linearLayout;
        this.f25479d = imageView;
        this.f25480e = textView2;
        this.f25481f = textView3;
        this.f25482g = linearLayout2;
        this.f25483h = linearLayout3;
        this.f25484i = textView4;
        this.f25485j = linearLayout4;
        this.f25486k = recyclerView;
        this.f25487l = recyclerView2;
        this.f25488m = relativeLayout;
        this.f25489n = textView5;
        this.f25490o = view;
    }

    public static b8 a(View view) {
        View view2 = view;
        int i10 = R.id.clear_all;
        TextView textView = (TextView) a.a(view2, R.id.clear_all);
        if (textView != null) {
            i10 = R.id.dl_rec_search;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.dl_rec_search);
            if (linearLayout != null) {
                i10 = R.id.iv_image;
                ImageView imageView = (ImageView) a.a(view2, R.id.iv_image);
                if (imageView != null) {
                    i10 = R.id.lableService;
                    TextView textView2 = (TextView) a.a(view2, R.id.lableService);
                    if (textView2 != null) {
                        i10 = R.id.my_transations;
                        TextView textView3 = (TextView) a.a(view2, R.id.my_transations);
                        if (textView3 != null) {
                            i10 = R.id.nexgenarrow;
                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                            if (linearLayout2 != null) {
                                i10 = R.id.nexgenlogo;
                                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                if (linearLayout3 != null) {
                                    i10 = R.id.nofounf;
                                    TextView textView4 = (TextView) a.a(view2, R.id.nofounf);
                                    if (textView4 != null) {
                                        i10 = R.id.rc_rec_search;
                                        LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.rc_rec_search);
                                        if (linearLayout4 != null) {
                                            i10 = R.id.rec_dl_recycler;
                                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.rec_dl_recycler);
                                            if (recyclerView != null) {
                                                i10 = R.id.rec_rc_recycler;
                                                RecyclerView recyclerView2 = (RecyclerView) a.a(view2, R.id.rec_rc_recycler);
                                                if (recyclerView2 != null) {
                                                    i10 = R.id.rl_notransaction;
                                                    RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.rl_notransaction);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.title_name;
                                                        TextView textView5 = (TextView) a.a(view2, R.id.title_name);
                                                        if (textView5 != null) {
                                                            i10 = R.id.view;
                                                            View a10 = a.a(view2, R.id.view);
                                                            if (a10 != null) {
                                                                return new b8((CoordinatorLayout) view2, textView, linearLayout, imageView, textView2, textView3, linearLayout2, linearLayout3, textView4, linearLayout4, recyclerView, recyclerView2, relativeLayout, textView5, a10);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static b8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_dashboard, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25476a;
    }
}
