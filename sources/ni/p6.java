package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class p6 {
    public final TextView A;
    public final LinearLayout B;

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f27934a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f27935b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27936c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27937d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f27938e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f27939f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f27940g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f27941h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f27942i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f27943j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f27944k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f27945l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f27946m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f27947n;

    /* renamed from: o  reason: collision with root package name */
    public final ProgressBar f27948o;

    /* renamed from: p  reason: collision with root package name */
    public final RecyclerView f27949p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f27950q;

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f27951r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f27952s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f27953t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f27954u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f27955v;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f27956w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f27957x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f27958y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f27959z;

    private p6(CoordinatorLayout coordinatorLayout, ImageView imageView, TextView textView, LinearLayout linearLayout, EditText editText, EditText editText2, EditText editText3, ImageView imageView2, EditText editText4, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, ProgressBar progressBar, RecyclerView recyclerView, TextView textView2, ImageView imageView3, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout7) {
        this.f27934a = coordinatorLayout;
        this.f27935b = imageView;
        this.f27936c = textView;
        this.f27937d = linearLayout;
        this.f27938e = editText;
        this.f27939f = editText2;
        this.f27940g = editText3;
        this.f27941h = imageView2;
        this.f27942i = editText4;
        this.f27943j = linearLayout2;
        this.f27944k = linearLayout3;
        this.f27945l = linearLayout4;
        this.f27946m = linearLayout5;
        this.f27947n = linearLayout6;
        this.f27948o = progressBar;
        this.f27949p = recyclerView;
        this.f27950q = textView2;
        this.f27951r = imageView3;
        this.f27952s = myTextView;
        this.f27953t = myTextView2;
        this.f27954u = myTextView3;
        this.f27955v = myTextView4;
        this.f27956w = myTextView5;
        this.f27957x = myTextView6;
        this.f27958y = textView3;
        this.f27959z = textView4;
        this.A = textView5;
        this.B = linearLayout7;
    }

    public static p6 a(View view) {
        View view2 = view;
        int i10 = R.id.date_img;
        ImageView imageView = (ImageView) a.a(view2, R.id.date_img);
        if (imageView != null) {
            i10 = R.id.date_textview;
            TextView textView = (TextView) a.a(view2, R.id.date_textview);
            if (textView != null) {
                i10 = R.id.delet_icon;
                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.delet_icon);
                if (linearLayout != null) {
                    i10 = R.id.dobDateMain;
                    EditText editText = (EditText) a.a(view2, R.id.dobDateMain);
                    if (editText != null) {
                        i10 = R.id.dobMonthMain;
                        EditText editText2 = (EditText) a.a(view2, R.id.dobMonthMain);
                        if (editText2 != null) {
                            i10 = R.id.dobYearMain;
                            EditText editText3 = (EditText) a.a(view2, R.id.dobYearMain);
                            if (editText3 != null) {
                                i10 = R.id.download_dl;
                                ImageView imageView2 = (ImageView) a.a(view2, R.id.download_dl);
                                if (imageView2 != null) {
                                    i10 = R.id.et_search_dl;
                                    EditText editText4 = (EditText) a.a(view2, R.id.et_search_dl);
                                    if (editText4 != null) {
                                        i10 = R.id.inner_parent;
                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.inner_parent);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.linear_parent;
                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.linear_parent);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.ll_search_dl;
                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.ll_search_dl);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.nexgenarrow;
                                                    LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                                    if (linearLayout5 != null) {
                                                        i10 = R.id.nexgenlogo;
                                                        LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                                        if (linearLayout6 != null) {
                                                            i10 = R.id.progress_bar;
                                                            ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.progress_bar);
                                                            if (progressBar != null) {
                                                                i10 = R.id.rc_new_design;
                                                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.rc_new_design);
                                                                if (recyclerView != null) {
                                                                    i10 = R.id.rc_number;
                                                                    TextView textView2 = (TextView) a.a(view2, R.id.rc_number);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.refresh;
                                                                        ImageView imageView3 = (ImageView) a.a(view2, R.id.refresh);
                                                                        if (imageView3 != null) {
                                                                            i10 = R.id.tv_add_dl;
                                                                            MyTextView myTextView = (MyTextView) a.a(view2, R.id.tv_add_dl);
                                                                            if (myTextView != null) {
                                                                                i10 = R.id.tv_alert_list;
                                                                                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.tv_alert_list);
                                                                                if (myTextView2 != null) {
                                                                                    i10 = R.id.tv_dl_no;
                                                                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.tv_dl_no);
                                                                                    if (myTextView3 != null) {
                                                                                        i10 = R.id.tv_dob;
                                                                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_dob);
                                                                                        if (myTextView4 != null) {
                                                                                            i10 = R.id.tv_driv_lic;
                                                                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.tv_driv_lic);
                                                                                            if (myTextView5 != null) {
                                                                                                i10 = R.id.tv_my_vehicle_list;
                                                                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.tv_my_vehicle_list);
                                                                                                if (myTextView6 != null) {
                                                                                                    i10 = R.id.tv_vehicle_no;
                                                                                                    TextView textView3 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                                    if (textView3 != null) {
                                                                                                        i10 = R.id.vahan_service_lable;
                                                                                                        TextView textView4 = (TextView) a.a(view2, R.id.vahan_service_lable);
                                                                                                        if (textView4 != null) {
                                                                                                            i10 = R.id.viewdetails;
                                                                                                            TextView textView5 = (TextView) a.a(view2, R.id.viewdetails);
                                                                                                            if (textView5 != null) {
                                                                                                                i10 = R.id.virtual_dl_view;
                                                                                                                LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.virtual_dl_view);
                                                                                                                if (linearLayout7 != null) {
                                                                                                                    return new p6((CoordinatorLayout) view2, imageView, textView, linearLayout, editText, editText2, editText3, imageView2, editText4, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, progressBar, recyclerView, textView2, imageView3, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView3, textView4, textView5, linearLayout7);
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

    public static p6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static p6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_new_dl_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f27934a;
    }
}
