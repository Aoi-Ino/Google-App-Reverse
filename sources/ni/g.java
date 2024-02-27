package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class g {
    public final TextView A;
    public final TextView B;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26389a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f26390b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialCardView f26391c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f26392d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f26393e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26394f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f26395g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26396h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26397i;

    /* renamed from: j  reason: collision with root package name */
    public final dc f26398j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageButton f26399k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageButton f26400l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26401m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f26402n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f26403o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26404p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26405q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26406r;

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f26407s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatSpinner f26408t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatButton f26409u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f26410v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f26411w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f26412x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f26413y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f26414z;

    private g(LinearLayout linearLayout, ProgressBar progressBar, MaterialCardView materialCardView, CardView cardView, EditText editText, TextView textView, EditText editText2, TextView textView2, EditText editText3, dc dcVar, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout5, AppCompatSpinner appCompatSpinner, AppCompatButton appCompatButton, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.f26389a = linearLayout;
        this.f26390b = progressBar;
        this.f26391c = materialCardView;
        this.f26392d = cardView;
        this.f26393e = editText;
        this.f26394f = textView;
        this.f26395g = editText2;
        this.f26396h = textView2;
        this.f26397i = editText3;
        this.f26398j = dcVar;
        this.f26399k = imageButton;
        this.f26400l = imageButton2;
        this.f26401m = linearLayout2;
        this.f26402n = linearLayout3;
        this.f26403o = linearLayout4;
        this.f26404p = textView3;
        this.f26405q = textView4;
        this.f26406r = textView5;
        this.f26407s = linearLayout5;
        this.f26408t = appCompatSpinner;
        this.f26409u = appCompatButton;
        this.f26410v = textView6;
        this.f26411w = textView7;
        this.f26412x = textView8;
        this.f26413y = textView9;
        this.f26414z = textView10;
        this.A = textView11;
        this.B = textView12;
    }

    public static g a(View view) {
        View view2 = view;
        int i10 = R.id.acc_progress_bar;
        ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.acc_progress_bar);
        if (progressBar != null) {
            i10 = R.id.cv_complaint_status;
            MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_complaint_status);
            if (materialCardView != null) {
                i10 = R.id.cv_report_complaint;
                CardView cardView = (CardView) a.a(view2, R.id.cv_report_complaint);
                if (cardView != null) {
                    i10 = R.id.editTextTextPersonName11;
                    EditText editText = (EditText) a.a(view2, R.id.editTextTextPersonName11);
                    if (editText != null) {
                        i10 = R.id.ev_calender_picker;
                        TextView textView = (TextView) a.a(view2, R.id.ev_calender_picker);
                        if (textView != null) {
                            i10 = R.id.ev_location;
                            EditText editText2 = (EditText) a.a(view2, R.id.ev_location);
                            if (editText2 != null) {
                                i10 = R.id.ev_time_picker;
                                TextView textView2 = (TextView) a.a(view2, R.id.ev_time_picker);
                                if (textView2 != null) {
                                    i10 = R.id.ev_vehicle_no;
                                    EditText editText3 = (EditText) a.a(view2, R.id.ev_vehicle_no);
                                    if (editText3 != null) {
                                        i10 = R.id.header_acc_report;
                                        View a10 = a.a(view2, R.id.header_acc_report);
                                        if (a10 != null) {
                                            dc a11 = dc.a(a10);
                                            i10 = R.id.ibImagePicker;
                                            ImageButton imageButton = (ImageButton) a.a(view2, R.id.ibImagePicker);
                                            if (imageButton != null) {
                                                i10 = R.id.ibVideoPicker;
                                                ImageButton imageButton2 = (ImageButton) a.a(view2, R.id.ibVideoPicker);
                                                if (imageButton2 != null) {
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
                                                                            i10 = R.id.parent_layout;
                                                                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.parent_layout);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.spn_state;
                                                                                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a.a(view2, R.id.spn_state);
                                                                                if (appCompatSpinner != null) {
                                                                                    i10 = R.id.submit_acc_report;
                                                                                    AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.submit_acc_report);
                                                                                    if (appCompatButton != null) {
                                                                                        i10 = R.id.tv_comment;
                                                                                        TextView textView6 = (TextView) a.a(view2, R.id.tv_comment);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.tv_date;
                                                                                            TextView textView7 = (TextView) a.a(view2, R.id.tv_date);
                                                                                            if (textView7 != null) {
                                                                                                i10 = R.id.tv_location;
                                                                                                TextView textView8 = (TextView) a.a(view2, R.id.tv_location);
                                                                                                if (textView8 != null) {
                                                                                                    i10 = R.id.tv_note;
                                                                                                    TextView textView9 = (TextView) a.a(view2, R.id.tv_note);
                                                                                                    if (textView9 != null) {
                                                                                                        i10 = R.id.tv_state;
                                                                                                        TextView textView10 = (TextView) a.a(view2, R.id.tv_state);
                                                                                                        if (textView10 != null) {
                                                                                                            i10 = R.id.tv_time;
                                                                                                            TextView textView11 = (TextView) a.a(view2, R.id.tv_time);
                                                                                                            if (textView11 != null) {
                                                                                                                i10 = R.id.tv_vehicle_no;
                                                                                                                TextView textView12 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                                                if (textView12 != null) {
                                                                                                                    return new g((LinearLayout) view2, progressBar, materialCardView, cardView, editText, textView, editText2, textView2, editText3, a11, imageButton, imageButton2, linearLayout, linearLayout2, linearLayout3, textView3, textView4, textView5, linearLayout4, appCompatSpinner, appCompatButton, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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

    public static g c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_accident_report, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26389a;
    }
}
