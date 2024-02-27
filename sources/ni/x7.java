package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class x7 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29340a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f29341b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f29342c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f29343d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f29344e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f29345f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f29346g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f29347h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f29348i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f29349j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f29350k;

    /* renamed from: l  reason: collision with root package name */
    public final CustomWegetLayout f29351l;

    /* renamed from: m  reason: collision with root package name */
    public final dc f29352m;

    /* renamed from: n  reason: collision with root package name */
    public final yb f29353n;

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView f29354o;

    /* renamed from: p  reason: collision with root package name */
    public final RadioButton f29355p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatEditText f29356q;

    /* renamed from: r  reason: collision with root package name */
    public final nc f29357r;

    /* renamed from: s  reason: collision with root package name */
    public final CustomWegetLayout f29358s;

    /* renamed from: t  reason: collision with root package name */
    public final Spinner f29359t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f29360u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f29361v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f29362w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f29363x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f29364y;

    /* renamed from: z  reason: collision with root package name */
    public final RadioButton f29365z;

    private x7(LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, MyTextView myTextView, TextView textView, TextView textView2, MyTextView myTextView2, LinearLayout linearLayout3, EditText editText, EditText editText2, LinearLayout linearLayout4, CustomWegetLayout customWegetLayout, dc dcVar, yb ybVar, RecyclerView recyclerView, RadioButton radioButton, AppCompatEditText appCompatEditText, nc ncVar, CustomWegetLayout customWegetLayout2, Spinner spinner, MyTextView myTextView3, MyTextView myTextView4, AppCompatTextView appCompatTextView, MyTextView myTextView5, TextView textView3, RadioButton radioButton2) {
        this.f29340a = linearLayout;
        this.f29341b = frameLayout;
        this.f29342c = linearLayout2;
        this.f29343d = myTextView;
        this.f29344e = textView;
        this.f29345f = textView2;
        this.f29346g = myTextView2;
        this.f29347h = linearLayout3;
        this.f29348i = editText;
        this.f29349j = editText2;
        this.f29350k = linearLayout4;
        this.f29351l = customWegetLayout;
        this.f29352m = dcVar;
        this.f29353n = ybVar;
        this.f29354o = recyclerView;
        this.f29355p = radioButton;
        this.f29356q = appCompatEditText;
        this.f29357r = ncVar;
        this.f29358s = customWegetLayout2;
        this.f29359t = spinner;
        this.f29360u = myTextView3;
        this.f29361v = myTextView4;
        this.f29362w = appCompatTextView;
        this.f29363x = myTextView5;
        this.f29364y = textView3;
        this.f29365z = radioButton2;
    }

    public static x7 a(View view) {
        View view2 = view;
        int i10 = R.id.app_cat_layout;
        FrameLayout frameLayout = (FrameLayout) a.a(view2, R.id.app_cat_layout);
        if (frameLayout != null) {
            i10 = R.id.bottomHolder;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.bottomHolder);
            if (linearLayout != null) {
                i10 = R.id.changeDobDlTv;
                MyTextView myTextView = (MyTextView) a.a(view2, R.id.changeDobDlTv);
                if (myTextView != null) {
                    i10 = R.id.dl_dob;
                    TextView textView = (TextView) a.a(view2, R.id.dl_dob);
                    if (textView != null) {
                        i10 = R.id.dl_no_txt;
                        TextView textView2 = (TextView) a.a(view2, R.id.dl_no_txt);
                        if (textView2 != null) {
                            i10 = R.id.dobTv;
                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.dobTv);
                            if (myTextView2 != null) {
                                i10 = R.id.donate_layout;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.donate_layout);
                                if (linearLayout2 != null) {
                                    i10 = R.id.dupdl_optional;
                                    EditText editText = (EditText) a.a(view2, R.id.dupdl_optional);
                                    if (editText != null) {
                                        i10 = R.id.id_change_dob_reason;
                                        EditText editText2 = (EditText) a.a(view2, R.id.id_change_dob_reason);
                                        if (editText2 != null) {
                                            i10 = R.id.id_dupdl;
                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.id_dupdl);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.id_next_service;
                                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.id_next_service);
                                                if (customWegetLayout != null) {
                                                    i10 = R.id.mHeader;
                                                    View a10 = a.a(view2, R.id.mHeader);
                                                    if (a10 != null) {
                                                        dc a11 = dc.a(a10);
                                                        i10 = R.id.multi_head;
                                                        View a12 = a.a(view2, R.id.multi_head);
                                                        if (a12 != null) {
                                                            yb a13 = yb.a(a12);
                                                            i10 = R.id.multi_steps;
                                                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.multi_steps);
                                                            if (recyclerView != null) {
                                                                i10 = R.id.not_willing_to_donate;
                                                                RadioButton radioButton = (RadioButton) a.a(view2, R.id.not_willing_to_donate);
                                                                if (radioButton != null) {
                                                                    i10 = R.id.org_mob_number;
                                                                    AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.org_mob_number);
                                                                    if (appCompatEditText != null) {
                                                                        i10 = R.id.psl;
                                                                        View a14 = a.a(view2, R.id.psl);
                                                                        if (a14 != null) {
                                                                            nc a15 = nc.a(a14);
                                                                            i10 = R.id.reset;
                                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view2, R.id.reset);
                                                                            if (customWegetLayout2 != null) {
                                                                                i10 = R.id.spn_app_cat;
                                                                                Spinner spinner = (Spinner) a.a(view2, R.id.spn_app_cat);
                                                                                if (spinner != null) {
                                                                                    i10 = R.id.tv_note_organ_donate;
                                                                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.tv_note_organ_donate);
                                                                                    if (myTextView3 != null) {
                                                                                        i10 = R.id.tv_reason;
                                                                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_reason);
                                                                                        if (myTextView4 != null) {
                                                                                            i10 = R.id.tv_reason_manually;
                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.tv_reason_manually);
                                                                                            if (appCompatTextView != null) {
                                                                                                i10 = R.id.txtAppCategory;
                                                                                                MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.txtAppCategory);
                                                                                                if (myTextView5 != null) {
                                                                                                    i10 = R.id.txt_view_details;
                                                                                                    TextView textView3 = (TextView) a.a(view2, R.id.txt_view_details);
                                                                                                    if (textView3 != null) {
                                                                                                        i10 = R.id.willing_to_donate;
                                                                                                        RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.willing_to_donate);
                                                                                                        if (radioButton2 != null) {
                                                                                                            return new x7((LinearLayout) view2, frameLayout, linearLayout, myTextView, textView, textView2, myTextView2, linearLayout2, editText, editText2, linearLayout3, customWegetLayout, a11, a13, recyclerView, radioButton, appCompatEditText, a15, customWegetLayout2, spinner, myTextView3, myTextView4, appCompatTextView, myTextView5, textView3, radioButton2);
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

    public static x7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static x7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_sarthi_dob_change, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29340a;
    }
}
