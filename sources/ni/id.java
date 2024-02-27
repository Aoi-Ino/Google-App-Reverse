package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class id {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26872a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialCardView f26873b;

    /* renamed from: c  reason: collision with root package name */
    public final CardView f26874c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26875d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26876e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26877f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26878g;

    /* renamed from: h  reason: collision with root package name */
    public final CardView f26879h;

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f26880i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26881j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26882k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26883l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26884m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26885n;

    private id(LinearLayout linearLayout, MaterialCardView materialCardView, CardView cardView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CardView cardView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f26872a = linearLayout;
        this.f26873b = materialCardView;
        this.f26874c = cardView;
        this.f26875d = linearLayout2;
        this.f26876e = linearLayout3;
        this.f26877f = linearLayout4;
        this.f26878g = linearLayout5;
        this.f26879h = cardView2;
        this.f26880i = recyclerView;
        this.f26881j = textView;
        this.f26882k = textView2;
        this.f26883l = textView3;
        this.f26884m = textView4;
        this.f26885n = textView5;
    }

    public static id a(View view) {
        View view2 = view;
        int i10 = R.id.cv_complaint_status;
        MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_complaint_status);
        if (materialCardView != null) {
            i10 = R.id.cv_report_complaint;
            CardView cardView = (CardView) a.a(view2, R.id.cv_report_complaint);
            if (cardView != null) {
                i10 = R.id.ll_comp_history;
                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.ll_comp_history);
                if (linearLayout != null) {
                    i10 = R.id.ll_dashboard;
                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_dashboard);
                    if (linearLayout2 != null) {
                        i10 = R.id.ll_last_record;
                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_last_record);
                        if (linearLayout3 != null) {
                            i10 = R.id.ll_reg_complaint;
                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.ll_reg_complaint);
                            if (linearLayout4 != null) {
                                i10 = R.id.ll_statistics;
                                CardView cardView2 = (CardView) a.a(view2, R.id.ll_statistics);
                                if (cardView2 != null) {
                                    i10 = R.id.recycler_records;
                                    RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.recycler_records);
                                    if (recyclerView != null) {
                                        i10 = R.id.txt_traffic_dashboard;
                                        TextView textView = (TextView) a.a(view2, R.id.txt_traffic_dashboard);
                                        if (textView != null) {
                                            i10 = R.id.txt_vehicle_number;
                                            TextView textView2 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                            if (textView2 != null) {
                                                i10 = R.id.txt_violation_date;
                                                TextView textView3 = (TextView) a.a(view2, R.id.txt_violation_date);
                                                if (textView3 != null) {
                                                    i10 = R.id.txt_violation_location;
                                                    TextView textView4 = (TextView) a.a(view2, R.id.txt_violation_location);
                                                    if (textView4 != null) {
                                                        i10 = R.id.txt_violation_status;
                                                        TextView textView5 = (TextView) a.a(view2, R.id.txt_violation_status);
                                                        if (textView5 != null) {
                                                            return new id((LinearLayout) view2, materialCardView, cardView, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView2, recyclerView, textView, textView2, textView3, textView4, textView5);
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

    public static id c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.traffic_dashboard, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26872a;
    }
}
