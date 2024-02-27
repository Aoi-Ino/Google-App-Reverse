package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class q8 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28202a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f28203b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f28204c;

    /* renamed from: d  reason: collision with root package name */
    public final dc f28205d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f28206e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f28207f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f28208g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f28209h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f28210i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f28211j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f28212k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f28213l;

    /* renamed from: m  reason: collision with root package name */
    public final ProgressBar f28214m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f28215n;

    private q8(LinearLayout linearLayout, TextView textView, TextView textView2, dc dcVar, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, RecyclerView recyclerView, TextView textView6, ProgressBar progressBar, TextView textView7) {
        this.f28202a = linearLayout;
        this.f28203b = textView;
        this.f28204c = textView2;
        this.f28205d = dcVar;
        this.f28206e = linearLayout2;
        this.f28207f = linearLayout3;
        this.f28208g = linearLayout4;
        this.f28209h = textView3;
        this.f28210i = textView4;
        this.f28211j = textView5;
        this.f28212k = recyclerView;
        this.f28213l = textView6;
        this.f28214m = progressBar;
        this.f28215n = textView7;
    }

    public static q8 a(View view) {
        View view2 = view;
        int i10 = R.id.ev_end_date;
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
                                i10 = R.id.logo_compl_hist;
                                TextView textView3 = (TextView) a.a(view2, R.id.logo_compl_hist);
                                if (textView3 != null) {
                                    i10 = R.id.logo_dashboard;
                                    TextView textView4 = (TextView) a.a(view2, R.id.logo_dashboard);
                                    if (textView4 != null) {
                                        i10 = R.id.logo_reg_compln;
                                        TextView textView5 = (TextView) a.a(view2, R.id.logo_reg_compln);
                                        if (textView5 != null) {
                                            i10 = R.id.lv_complaint_list;
                                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.lv_complaint_list);
                                            if (recyclerView != null) {
                                                i10 = R.id.title_compn_hist;
                                                TextView textView6 = (TextView) a.a(view2, R.id.title_compn_hist);
                                                if (textView6 != null) {
                                                    i10 = R.id.traffic_his_progress;
                                                    ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.traffic_his_progress);
                                                    if (progressBar != null) {
                                                        i10 = R.id.txt_view_details;
                                                        TextView textView7 = (TextView) a.a(view2, R.id.txt_view_details);
                                                        if (textView7 != null) {
                                                            return new q8((LinearLayout) view2, textView, textView2, a11, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, recyclerView, textView6, progressBar, textView7);
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

    public static q8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static q8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_traffic_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f28202a;
    }
}
