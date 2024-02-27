package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class ec {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26141a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f26142b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f26143c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26144d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f26145e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26146f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26147g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26148h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26149i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26150j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26151k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26152l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26153m;

    private ec(LinearLayout linearLayout, ImageView imageView, EditText editText, ImageView imageView2, EditText editText2, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f26141a = linearLayout;
        this.f26142b = imageView;
        this.f26143c = editText;
        this.f26144d = imageView2;
        this.f26145e = editText2;
        this.f26146f = linearLayout2;
        this.f26147g = linearLayout3;
        this.f26148h = imageView3;
        this.f26149i = linearLayout4;
        this.f26150j = textView;
        this.f26151k = textView2;
        this.f26152l = textView3;
        this.f26153m = textView4;
    }

    public static ec a(View view) {
        View view2 = view;
        int i10 = R.id.backButton;
        ImageView imageView = (ImageView) a.a(view2, R.id.backButton);
        if (imageView != null) {
            i10 = R.id.confirmMpinEt;
            EditText editText = (EditText) a.a(view2, R.id.confirmMpinEt);
            if (editText != null) {
                i10 = R.id.confirmShowmpin;
                ImageView imageView2 = (ImageView) a.a(view2, R.id.confirmShowmpin);
                if (imageView2 != null) {
                    i10 = R.id.mpinEditText;
                    EditText editText2 = (EditText) a.a(view2, R.id.mpinEditText);
                    if (editText2 != null) {
                        i10 = R.id.nexgenarrow;
                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                        if (linearLayout != null) {
                            i10 = R.id.nexgenlogo;
                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                            if (linearLayout2 != null) {
                                i10 = R.id.showmpin;
                                ImageView imageView3 = (ImageView) a.a(view2, R.id.showmpin);
                                if (imageView3 != null) {
                                    i10 = R.id.submit;
                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.submit);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.tv_create_new;
                                        TextView textView = (TextView) a.a(view2, R.id.tv_create_new);
                                        if (textView != null) {
                                            i10 = R.id.tv_enter_mpin;
                                            TextView textView2 = (TextView) a.a(view2, R.id.tv_enter_mpin);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_sec_mpin;
                                                TextView textView3 = (TextView) a.a(view2, R.id.tv_sec_mpin);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_submit;
                                                    TextView textView4 = (TextView) a.a(view2, R.id.tv_submit);
                                                    if (textView4 != null) {
                                                        return new ec((LinearLayout) view2, imageView, editText, imageView2, editText2, linearLayout, linearLayout2, imageView3, linearLayout3, textView, textView2, textView3, textView4);
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

    public static ec c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ec d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mvvm_new_pin, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26141a;
    }
}
