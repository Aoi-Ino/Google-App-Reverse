package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class j8 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26978a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f26979b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatSpinner f26980c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26981d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26982e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26983f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26984g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26985h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26986i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26987j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26988k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26989l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26990m;

    private j8(CoordinatorLayout coordinatorLayout, ImageView imageView, AppCompatSpinner appCompatSpinner, LinearLayout linearLayout, ImageView imageView2, EditText editText, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, LinearLayout linearLayout4, TextView textView3, TextView textView4) {
        this.f26978a = coordinatorLayout;
        this.f26979b = imageView;
        this.f26980c = appCompatSpinner;
        this.f26981d = linearLayout;
        this.f26982e = imageView2;
        this.f26983f = editText;
        this.f26984g = linearLayout2;
        this.f26985h = linearLayout3;
        this.f26986i = textView;
        this.f26987j = textView2;
        this.f26988k = linearLayout4;
        this.f26989l = textView3;
        this.f26990m = textView4;
    }

    public static j8 a(View view) {
        View view2 = view;
        int i10 = R.id.down_arrow;
        ImageView imageView = (ImageView) a.a(view2, R.id.down_arrow);
        if (imageView != null) {
            i10 = R.id.duration_spinner;
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a.a(view2, R.id.duration_spinner);
            if (appCompatSpinner != null) {
                i10 = R.id.edit_text_container;
                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.edit_text_container);
                if (linearLayout != null) {
                    i10 = R.id.head_img;
                    ImageView imageView2 = (ImageView) a.a(view2, R.id.head_img);
                    if (imageView2 != null) {
                        i10 = R.id.mobile_number;
                        EditText editText = (EditText) a.a(view2, R.id.mobile_number);
                        if (editText != null) {
                            i10 = R.id.nexgenarrow;
                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                            if (linearLayout2 != null) {
                                i10 = R.id.nexgenlogo;
                                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                if (linearLayout3 != null) {
                                    i10 = R.id.rc_no_txt;
                                    TextView textView = (TextView) a.a(view2, R.id.rc_no_txt);
                                    if (textView != null) {
                                        i10 = R.id.shared_button;
                                        TextView textView2 = (TextView) a.a(view2, R.id.shared_button);
                                        if (textView2 != null) {
                                            i10 = R.id.spinner_body;
                                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.spinner_body);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.tv_share_rc;
                                                TextView textView3 = (TextView) a.a(view2, R.id.tv_share_rc);
                                                if (textView3 != null) {
                                                    i10 = R.id.vahan_service_lable;
                                                    TextView textView4 = (TextView) a.a(view2, R.id.vahan_service_lable);
                                                    if (textView4 != null) {
                                                        return new j8((CoordinatorLayout) view2, imageView, appCompatSpinner, linearLayout, imageView2, editText, linearLayout2, linearLayout3, textView, textView2, linearLayout4, textView3, textView4);
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

    public static j8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static j8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_shared_rc_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26978a;
    }
}
