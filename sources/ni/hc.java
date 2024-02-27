package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.nic.mparivahan.R;
import k1.a;

public final class hc {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26705a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f26706b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f26707c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26708d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f26709e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26710f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f26711g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f26712h;

    /* renamed from: i  reason: collision with root package name */
    public final NestedScrollView f26713i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26714j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26715k;

    /* renamed from: l  reason: collision with root package name */
    public final Spinner f26716l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26717m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26718n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f26719o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26720p;

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f26721q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26722r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f26723s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26724t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26725u;

    private hc(CoordinatorLayout coordinatorLayout, ImageView imageView, EditText editText, ImageView imageView2, EditText editText2, EditText editText3, EditText editText4, EditText editText5, NestedScrollView nestedScrollView, LinearLayout linearLayout, LinearLayout linearLayout2, Spinner spinner, ImageView imageView3, TextView textView, LinearLayout linearLayout3, TextView textView2, LinearLayout linearLayout4, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f26705a = coordinatorLayout;
        this.f26706b = imageView;
        this.f26707c = editText;
        this.f26708d = imageView2;
        this.f26709e = editText2;
        this.f26710f = editText3;
        this.f26711g = editText4;
        this.f26712h = editText5;
        this.f26713i = nestedScrollView;
        this.f26714j = linearLayout;
        this.f26715k = linearLayout2;
        this.f26716l = spinner;
        this.f26717m = imageView3;
        this.f26718n = textView;
        this.f26719o = linearLayout3;
        this.f26720p = textView2;
        this.f26721q = linearLayout4;
        this.f26722r = textView3;
        this.f26723s = textView4;
        this.f26724t = textView5;
        this.f26725u = textView6;
    }

    public static hc a(View view) {
        View view2 = view;
        int i10 = R.id.backButton;
        ImageView imageView = (ImageView) a.a(view2, R.id.backButton);
        if (imageView != null) {
            i10 = R.id.confirmMpin;
            EditText editText = (EditText) a.a(view2, R.id.confirmMpin);
            if (editText != null) {
                i10 = R.id.confirmShowMpin;
                ImageView imageView2 = (ImageView) a.a(view2, R.id.confirmShowMpin);
                if (imageView2 != null) {
                    i10 = R.id.email;
                    EditText editText2 = (EditText) a.a(view2, R.id.email);
                    if (editText2 != null) {
                        i10 = R.id.full_name;
                        EditText editText3 = (EditText) a.a(view2, R.id.full_name);
                        if (editText3 != null) {
                            i10 = R.id.mobile_number;
                            EditText editText4 = (EditText) a.a(view2, R.id.mobile_number);
                            if (editText4 != null) {
                                i10 = R.id.mpin;
                                EditText editText5 = (EditText) a.a(view2, R.id.mpin);
                                if (editText5 != null) {
                                    i10 = R.id.nestedScrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) a.a(view2, R.id.nestedScrollView);
                                    if (nestedScrollView != null) {
                                        i10 = R.id.nexgenarrow;
                                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                        if (linearLayout != null) {
                                            i10 = R.id.nexgenlogo;
                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.select_spinner;
                                                Spinner spinner = (Spinner) a.a(view2, R.id.select_spinner);
                                                if (spinner != null) {
                                                    i10 = R.id.showmpin;
                                                    ImageView imageView3 = (ImageView) a.a(view2, R.id.showmpin);
                                                    if (imageView3 != null) {
                                                        i10 = R.id.sign_in;
                                                        TextView textView = (TextView) a.a(view2, R.id.sign_in);
                                                        if (textView != null) {
                                                            i10 = R.id.sign_up;
                                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.sign_up);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.signUpTermCond;
                                                                TextView textView2 = (TextView) a.a(view2, R.id.signUpTermCond);
                                                                if (textView2 != null) {
                                                                    i10 = R.id.submit;
                                                                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.submit);
                                                                    if (linearLayout4 != null) {
                                                                        i10 = R.id.tv_already_account;
                                                                        TextView textView3 = (TextView) a.a(view2, R.id.tv_already_account);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tv_create_account;
                                                                            TextView textView4 = (TextView) a.a(view2, R.id.tv_create_account);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.tv_fast_easy;
                                                                                TextView textView5 = (TextView) a.a(view2, R.id.tv_fast_easy);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.tv_submit;
                                                                                    TextView textView6 = (TextView) a.a(view2, R.id.tv_submit);
                                                                                    if (textView6 != null) {
                                                                                        return new hc((CoordinatorLayout) view2, imageView, editText, imageView2, editText2, editText3, editText4, editText5, nestedScrollView, linearLayout, linearLayout2, spinner, imageView3, textView, linearLayout3, textView2, linearLayout4, textView3, textView4, textView5, textView6);
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

    public static hc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static hc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mvvm_sign_up, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26705a;
    }
}
