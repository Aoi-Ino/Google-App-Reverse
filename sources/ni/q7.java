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
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class q7 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final LinearLayout F;

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f28176a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatSpinner f28177b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f28178c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f28179d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f28180e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f28181f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f28182g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f28183h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatEditText f28184i;

    /* renamed from: j  reason: collision with root package name */
    public final dc f28185j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageButton f28186k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageButton f28187l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28188m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f28189n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f28190o;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f28191p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f28192q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f28193r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f28194s;

    /* renamed from: t  reason: collision with root package name */
    public final ConstraintLayout f28195t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatSpinner f28196u;

    /* renamed from: v  reason: collision with root package name */
    public final ProgressBar f28197v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28198w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f28199x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f28200y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f28201z;

    private q7(ConstraintLayout constraintLayout, AppCompatSpinner appCompatSpinner, TextView textView, AppCompatButton appCompatButton, EditText editText, TextView textView2, EditText editText2, EditText editText3, AppCompatEditText appCompatEditText, dc dcVar, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, ConstraintLayout constraintLayout2, AppCompatSpinner appCompatSpinner2, ProgressBar progressBar, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, LinearLayout linearLayout5) {
        this.f28176a = constraintLayout;
        this.f28177b = appCompatSpinner;
        this.f28178c = textView;
        this.f28179d = appCompatButton;
        this.f28180e = editText;
        this.f28181f = textView2;
        this.f28182g = editText2;
        this.f28183h = editText3;
        this.f28184i = appCompatEditText;
        this.f28185j = dcVar;
        this.f28186k = imageButton;
        this.f28187l = imageButton2;
        this.f28188m = linearLayout;
        this.f28189n = linearLayout2;
        this.f28190o = linearLayout3;
        this.f28191p = linearLayout4;
        this.f28192q = textView3;
        this.f28193r = textView4;
        this.f28194s = textView5;
        this.f28195t = constraintLayout2;
        this.f28196u = appCompatSpinner2;
        this.f28197v = progressBar;
        this.f28198w = textView6;
        this.f28199x = textView7;
        this.f28200y = textView8;
        this.f28201z = textView9;
        this.A = textView10;
        this.B = textView11;
        this.C = textView12;
        this.D = textView13;
        this.E = textView14;
        this.F = linearLayout5;
    }

    public static q7 a(View view) {
        View view2 = view;
        int i10 = R.id.app_option;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a.a(view2, R.id.app_option);
        if (appCompatSpinner != null) {
            i10 = R.id.camera;
            TextView textView = (TextView) a.a(view2, R.id.camera);
            if (textView != null) {
                i10 = R.id.complain_reg;
                AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.complain_reg);
                if (appCompatButton != null) {
                    i10 = R.id.editTextTextPersonName11;
                    EditText editText = (EditText) a.a(view2, R.id.editTextTextPersonName11);
                    if (editText != null) {
                        i10 = R.id.ev_calender_picker;
                        TextView textView2 = (TextView) a.a(view2, R.id.ev_calender_picker);
                        if (textView2 != null) {
                            i10 = R.id.ev_location;
                            EditText editText2 = (EditText) a.a(view2, R.id.ev_location);
                            if (editText2 != null) {
                                i10 = R.id.ev_time_picker;
                                EditText editText3 = (EditText) a.a(view2, R.id.ev_time_picker);
                                if (editText3 != null) {
                                    i10 = R.id.ev_vehicle_no;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.ev_vehicle_no);
                                    if (appCompatEditText != null) {
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
                                                    i10 = R.id.image_Linear;
                                                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.image_Linear);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.ll_comp_history;
                                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_comp_history);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.ll_dashboard;
                                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_dashboard);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.ll_reg_complaint;
                                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.ll_reg_complaint);
                                                                if (linearLayout4 != null) {
                                                                    i10 = R.id.logo_compl_hist;
                                                                    TextView textView3 = (TextView) a.a(view2, R.id.logo_compl_hist);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.logo_dashboard;
                                                                        TextView textView4 = (TextView) a.a(view2, R.id.logo_dashboard);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.logo_reg_compln;
                                                                            TextView textView5 = (TextView) a.a(view2, R.id.logo_reg_compln);
                                                                            if (textView5 != null) {
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                                                                i10 = R.id.spn_state;
                                                                                AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) a.a(view2, R.id.spn_state);
                                                                                if (appCompatSpinner2 != null) {
                                                                                    i10 = R.id.traffic_progress;
                                                                                    ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.traffic_progress);
                                                                                    if (progressBar != null) {
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
                                                                                                                    i10 = R.id.tv_violation_type;
                                                                                                                    TextView textView13 = (TextView) a.a(view2, R.id.tv_violation_type);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i10 = R.id.video;
                                                                                                                        TextView textView14 = (TextView) a.a(view2, R.id.video);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i10 = R.id.video_Linear;
                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.video_Linear);
                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                return new q7(constraintLayout, appCompatSpinner, textView, appCompatButton, editText, textView2, editText2, editText3, appCompatEditText, a11, imageButton, imageButton2, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView3, textView4, textView5, constraintLayout, appCompatSpinner2, progressBar, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, linearLayout5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static q7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static q7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_report_traffic, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f28176a;
    }
}
