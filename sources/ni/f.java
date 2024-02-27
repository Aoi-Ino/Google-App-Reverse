package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26154a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f26155b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialCardView f26156c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f26157d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26158e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26159f;

    /* renamed from: g  reason: collision with root package name */
    public final dc f26160g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26161h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26162i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26163j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26164k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26165l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26166m;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f26167n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26168o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26169p;

    private f(LinearLayout linearLayout, ProgressBar progressBar, MaterialCardView materialCardView, CardView cardView, TextView textView, TextView textView2, dc dcVar, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, RecyclerView recyclerView, TextView textView6, TextView textView7) {
        this.f26154a = linearLayout;
        this.f26155b = progressBar;
        this.f26156c = materialCardView;
        this.f26157d = cardView;
        this.f26158e = textView;
        this.f26159f = textView2;
        this.f26160g = dcVar;
        this.f26161h = linearLayout2;
        this.f26162i = linearLayout3;
        this.f26163j = linearLayout4;
        this.f26164k = textView3;
        this.f26165l = textView4;
        this.f26166m = textView5;
        this.f26167n = recyclerView;
        this.f26168o = textView6;
        this.f26169p = textView7;
    }

    public static f a(View view) {
        View view2 = view;
        int i10 = R.id.acc_hist_progress;
        ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.acc_hist_progress);
        if (progressBar != null) {
            i10 = R.id.cv_complaint_status;
            MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_complaint_status);
            if (materialCardView != null) {
                i10 = R.id.cv_report_complaint;
                CardView cardView = (CardView) a.a(view2, R.id.cv_report_complaint);
                if (cardView != null) {
                    i10 = R.id.ev_end_date;
                    TextView textView = (TextView) a.a(view2, R.id.ev_end_date);
                    if (textView != null) {
                        i10 = R.id.ev_start_date;
                        TextView textView2 = (TextView) a.a(view2, R.id.ev_start_date);
                        if (textView2 != null) {
                            i10 = R.id.header_acc_history;
                            View a10 = a.a(view2, R.id.header_acc_history);
                            if (a10 != null) {
                                dc a11 = dc.a(a10);
                                i10 = R.id.ll_comp_history;
                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.ll_comp_history);
                                if (linearLayout != null) {
                                    i10 = R.id.ll_dashboard;
                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_dashboard);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.ll_reg_complaint;
                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_reg_complaint);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.logo_dashboard;
                                            TextView textView3 = (TextView) a.a(view2, R.id.logo_dashboard);
                                            if (textView3 != null) {
                                                i10 = R.id.logo_reg_acc_repo;
                                                TextView textView4 = (TextView) a.a(view2, R.id.logo_reg_acc_repo);
                                                if (textView4 != null) {
                                                    i10 = R.id.logo_repo_acc_hist;
                                                    TextView textView5 = (TextView) a.a(view2, R.id.logo_repo_acc_hist);
                                                    if (textView5 != null) {
                                                        i10 = R.id.lv_acc_list;
                                                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.lv_acc_list);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.tv_acc_repo_hist;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.tv_acc_repo_hist);
                                                            if (textView6 != null) {
                                                                i10 = R.id.txt_view_details;
                                                                TextView textView7 = (TextView) a.a(view2, R.id.txt_view_details);
                                                                if (textView7 != null) {
                                                                    return new f((LinearLayout) view2, progressBar, materialCardView, cardView, textView, textView2, a11, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, recyclerView, textView6, textView7);
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

    public static f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_accident_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26154a;
    }
}
