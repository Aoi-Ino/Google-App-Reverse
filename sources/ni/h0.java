package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class h0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final EditText D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26572a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f26573b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26574c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26575d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f26576e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26577f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26578g;

    /* renamed from: h  reason: collision with root package name */
    public final CustomWegetLayout f26579h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26580i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26581j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26582k;

    /* renamed from: l  reason: collision with root package name */
    public final dc f26583l;

    /* renamed from: m  reason: collision with root package name */
    public final EditText f26584m;

    /* renamed from: n  reason: collision with root package name */
    public final yb f26585n;

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView f26586o;

    /* renamed from: p  reason: collision with root package name */
    public final nc f26587p;

    /* renamed from: q  reason: collision with root package name */
    public final CustomWegetLayout f26588q;

    /* renamed from: r  reason: collision with root package name */
    public final EditText f26589r;

    /* renamed from: s  reason: collision with root package name */
    public final EditText f26590s;

    /* renamed from: t  reason: collision with root package name */
    public final EditText f26591t;

    /* renamed from: u  reason: collision with root package name */
    public final Spinner f26592u;

    /* renamed from: v  reason: collision with root package name */
    public final Spinner f26593v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f26594w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f26595x;

    /* renamed from: y  reason: collision with root package name */
    public final AppCompatTextView f26596y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f26597z;

    private h0(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, EditText editText, EditText editText2, EditText editText3, LinearLayout linearLayout2, CustomWegetLayout customWegetLayout, EditText editText4, LinearLayout linearLayout3, LinearLayout linearLayout4, dc dcVar, EditText editText5, yb ybVar, RecyclerView recyclerView, nc ncVar, CustomWegetLayout customWegetLayout2, EditText editText6, EditText editText7, EditText editText8, Spinner spinner, Spinner spinner2, TextView textView2, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, TextView textView3, TextView textView4, TextView textView5, EditText editText9, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.f26572a = linearLayout;
        this.f26573b = frameLayout;
        this.f26574c = textView;
        this.f26575d = editText;
        this.f26576e = editText2;
        this.f26577f = editText3;
        this.f26578g = linearLayout2;
        this.f26579h = customWegetLayout;
        this.f26580i = editText4;
        this.f26581j = linearLayout3;
        this.f26582k = linearLayout4;
        this.f26583l = dcVar;
        this.f26584m = editText5;
        this.f26585n = ybVar;
        this.f26586o = recyclerView;
        this.f26587p = ncVar;
        this.f26588q = customWegetLayout2;
        this.f26589r = editText6;
        this.f26590s = editText7;
        this.f26591t = editText8;
        this.f26592u = spinner;
        this.f26593v = spinner2;
        this.f26594w = textView2;
        this.f26595x = myTextView;
        this.f26596y = appCompatTextView;
        this.f26597z = myTextView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
        this.D = editText9;
        this.E = textView6;
        this.F = textView7;
        this.G = textView8;
        this.H = textView9;
        this.I = textView10;
        this.J = textView11;
    }

    public static h0 a(View view) {
        View view2 = view;
        int i10 = R.id.app_cat_layout;
        FrameLayout frameLayout = (FrameLayout) a.a(view2, R.id.app_cat_layout);
        if (frameLayout != null) {
            i10 = R.id.dl_no_txt;
            TextView textView = (TextView) a.a(view2, R.id.dl_no_txt);
            if (textView != null) {
                i10 = R.id.dupdl_optional;
                EditText editText = (EditText) a.a(view2, R.id.dupdl_optional);
                if (editText != null) {
                    i10 = R.id.fnameVal;
                    EditText editText2 = (EditText) a.a(view2, R.id.fnameVal);
                    if (editText2 != null) {
                        i10 = R.id.id_change_dob_reason;
                        EditText editText3 = (EditText) a.a(view2, R.id.id_change_dob_reason);
                        if (editText3 != null) {
                            i10 = R.id.id_dupdl;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.id_dupdl);
                            if (linearLayout != null) {
                                i10 = R.id.id_next_service;
                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.id_next_service);
                                if (customWegetLayout != null) {
                                    i10 = R.id.lNameVal;
                                    EditText editText4 = (EditText) a.a(view2, R.id.lNameVal);
                                    if (editText4 != null) {
                                        i10 = R.id.ll_details;
                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_details);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.ll_relation;
                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_relation);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.mHeader;
                                                View a10 = a.a(view2, R.id.mHeader);
                                                if (a10 != null) {
                                                    dc a11 = dc.a(a10);
                                                    i10 = R.id.mNameVal;
                                                    EditText editText5 = (EditText) a.a(view2, R.id.mNameVal);
                                                    if (editText5 != null) {
                                                        i10 = R.id.multi_head;
                                                        View a12 = a.a(view2, R.id.multi_head);
                                                        if (a12 != null) {
                                                            yb a13 = yb.a(a12);
                                                            i10 = R.id.multi_steps;
                                                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.multi_steps);
                                                            if (recyclerView != null) {
                                                                i10 = R.id.psl;
                                                                View a14 = a.a(view2, R.id.psl);
                                                                if (a14 != null) {
                                                                    nc a15 = nc.a(a14);
                                                                    i10 = R.id.reset;
                                                                    CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view2, R.id.reset);
                                                                    if (customWegetLayout2 != null) {
                                                                        i10 = R.id.rfnameVal;
                                                                        EditText editText6 = (EditText) a.a(view2, R.id.rfnameVal);
                                                                        if (editText6 != null) {
                                                                            i10 = R.id.rlNameVal;
                                                                            EditText editText7 = (EditText) a.a(view2, R.id.rlNameVal);
                                                                            if (editText7 != null) {
                                                                                i10 = R.id.rmNameVal;
                                                                                EditText editText8 = (EditText) a.a(view2, R.id.rmNameVal);
                                                                                if (editText8 != null) {
                                                                                    i10 = R.id.spn_app_cat;
                                                                                    Spinner spinner = (Spinner) a.a(view2, R.id.spn_app_cat);
                                                                                    if (spinner != null) {
                                                                                        i10 = R.id.spn_rel_Status;
                                                                                        Spinner spinner2 = (Spinner) a.a(view2, R.id.spn_rel_Status);
                                                                                        if (spinner2 != null) {
                                                                                            i10 = R.id.tv_lic_detail;
                                                                                            TextView textView2 = (TextView) a.a(view2, R.id.tv_lic_detail);
                                                                                            if (textView2 != null) {
                                                                                                i10 = R.id.tv_reason;
                                                                                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.tv_reason);
                                                                                                if (myTextView != null) {
                                                                                                    i10 = R.id.tv_reason_manually;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.tv_reason_manually);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i10 = R.id.txtAppCategory;
                                                                                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.txtAppCategory);
                                                                                                        if (myTextView2 != null) {
                                                                                                            i10 = R.id.txt_ffname;
                                                                                                            TextView textView3 = (TextView) a.a(view2, R.id.txt_ffname);
                                                                                                            if (textView3 != null) {
                                                                                                                i10 = R.id.txt_fname;
                                                                                                                TextView textView4 = (TextView) a.a(view2, R.id.txt_fname);
                                                                                                                if (textView4 != null) {
                                                                                                                    i10 = R.id.txt_full_name;
                                                                                                                    TextView textView5 = (TextView) a.a(view2, R.id.txt_full_name);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i10 = R.id.txt_full_name_val;
                                                                                                                        EditText editText9 = (EditText) a.a(view2, R.id.txt_full_name_val);
                                                                                                                        if (editText9 != null) {
                                                                                                                            i10 = R.id.txt_last_name;
                                                                                                                            TextView textView6 = (TextView) a.a(view2, R.id.txt_last_name);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i10 = R.id.txt_lname;
                                                                                                                                TextView textView7 = (TextView) a.a(view2, R.id.txt_lname);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i10 = R.id.txt_md_name;
                                                                                                                                    TextView textView8 = (TextView) a.a(view2, R.id.txt_md_name);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i10 = R.id.txt_mname;
                                                                                                                                        TextView textView9 = (TextView) a.a(view2, R.id.txt_mname);
                                                                                                                                        if (textView9 != null) {
                                                                                                                                            i10 = R.id.txt_relation;
                                                                                                                                            TextView textView10 = (TextView) a.a(view2, R.id.txt_relation);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i10 = R.id.txt_view_details;
                                                                                                                                                TextView textView11 = (TextView) a.a(view2, R.id.txt_view_details);
                                                                                                                                                if (textView11 != null) {
                                                                                                                                                    return new h0((LinearLayout) view2, frameLayout, textView, editText, editText2, editText3, linearLayout, customWegetLayout, editText4, linearLayout2, linearLayout3, a11, editText5, a13, recyclerView, a15, customWegetLayout2, editText6, editText7, editText8, spinner, spinner2, textView2, myTextView, appCompatTextView, myTextView2, textView3, textView4, textView5, editText9, textView6, textView7, textView8, textView9, textView10, textView11);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static h0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_change_of_name, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26572a;
    }
}
