package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class j7 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26962a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f26963b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26964c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26965d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26966e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26967f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26968g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26969h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26970i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26971j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26972k;

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f26973l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26974m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26975n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26976o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f26977p;

    private j7(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView2, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView3, TextView textView2, RecyclerView recyclerView, LinearLayout linearLayout6, TextView textView3, TextView textView4, MyTextView myTextView) {
        this.f26962a = coordinatorLayout;
        this.f26963b = linearLayout;
        this.f26964c = imageView;
        this.f26965d = textView;
        this.f26966e = linearLayout2;
        this.f26967f = linearLayout3;
        this.f26968g = imageView2;
        this.f26969h = linearLayout4;
        this.f26970i = linearLayout5;
        this.f26971j = imageView3;
        this.f26972k = textView2;
        this.f26973l = recyclerView;
        this.f26974m = linearLayout6;
        this.f26975n = textView3;
        this.f26976o = textView4;
        this.f26977p = myTextView;
    }

    public static j7 a(View view) {
        View view2 = view;
        int i10 = R.id.Recived_rc_menu;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.Recived_rc_menu);
        if (linearLayout != null) {
            i10 = R.id.black_shareicon;
            ImageView imageView = (ImageView) a.a(view2, R.id.black_shareicon);
            if (imageView != null) {
                i10 = R.id.dash_board;
                TextView textView = (TextView) a.a(view2, R.id.dash_board);
                if (textView != null) {
                    i10 = R.id.dash_board_menu;
                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.dash_board_menu);
                    if (linearLayout2 != null) {
                        i10 = R.id.linear_menu_bar;
                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.linear_menu_bar);
                        if (linearLayout3 != null) {
                            i10 = R.id.my_rc_icon;
                            ImageView imageView2 = (ImageView) a.a(view2, R.id.my_rc_icon);
                            if (imageView2 != null) {
                                i10 = R.id.nexgenarrow;
                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                if (linearLayout4 != null) {
                                    i10 = R.id.nexgenlogo;
                                    LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                    if (linearLayout5 != null) {
                                        i10 = R.id.recived_icon;
                                        ImageView imageView3 = (ImageView) a.a(view2, R.id.recived_icon);
                                        if (imageView3 != null) {
                                            i10 = R.id.recived_rc_text;
                                            TextView textView2 = (TextView) a.a(view2, R.id.recived_rc_text);
                                            if (textView2 != null) {
                                                i10 = R.id.recyclerview;
                                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.recyclerview);
                                                if (recyclerView != null) {
                                                    i10 = R.id.shared_rc_menu;
                                                    LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.shared_rc_menu);
                                                    if (linearLayout6 != null) {
                                                        i10 = R.id.shared_rc_text;
                                                        TextView textView3 = (TextView) a.a(view2, R.id.shared_rc_text);
                                                        if (textView3 != null) {
                                                            i10 = R.id.status_txt;
                                                            TextView textView4 = (TextView) a.a(view2, R.id.status_txt);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_virt_regt_cert;
                                                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.tv_virt_regt_cert);
                                                                if (myTextView != null) {
                                                                    return new j7((CoordinatorLayout) view2, linearLayout, imageView, textView, linearLayout2, linearLayout3, imageView2, linearLayout4, linearLayout5, imageView3, textView2, recyclerView, linearLayout6, textView3, textView4, myTextView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static j7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_rc_dashboard, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26962a;
    }
}
