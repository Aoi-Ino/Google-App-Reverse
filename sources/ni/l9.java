package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class l9 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27306a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27307b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27308c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f27309d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f27310e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f27311f;

    /* renamed from: g  reason: collision with root package name */
    public final dc f27312g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27313h;

    /* renamed from: i  reason: collision with root package name */
    public final RadioButton f27314i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f27315j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f27316k;

    /* renamed from: l  reason: collision with root package name */
    public final RadioButton f27317l;

    private l9(RelativeLayout relativeLayout, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, EditText editText, EditText editText2, dc dcVar, LinearLayout linearLayout, RadioButton radioButton, AppCompatTextView appCompatTextView2, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.f27306a = relativeLayout;
        this.f27307b = textView;
        this.f27308c = textView2;
        this.f27309d = appCompatTextView;
        this.f27310e = editText;
        this.f27311f = editText2;
        this.f27312g = dcVar;
        this.f27313h = linearLayout;
        this.f27314i = radioButton;
        this.f27315j = appCompatTextView2;
        this.f27316k = linearLayout2;
        this.f27317l = radioButton2;
    }

    public static l9 a(View view) {
        int i10 = R.id.chassisTv;
        TextView textView = (TextView) a.a(view, R.id.chassisTv);
        if (textView != null) {
            i10 = R.id.firstInputTv;
            TextView textView2 = (TextView) a.a(view, R.id.firstInputTv);
            if (textView2 != null) {
                i10 = R.id.getDetailsTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.getDetailsTv);
                if (appCompatTextView != null) {
                    i10 = R.id.inputChasisEt;
                    EditText editText = (EditText) a.a(view, R.id.inputChasisEt);
                    if (editText != null) {
                        i10 = R.id.inputEt;
                        EditText editText2 = (EditText) a.a(view, R.id.inputEt);
                        if (editText2 != null) {
                            i10 = R.id.mHeader;
                            View a10 = a.a(view, R.id.mHeader);
                            if (a10 != null) {
                                dc a11 = dc.a(a10);
                                i10 = R.id.rcNoLl;
                                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.rcNoLl);
                                if (linearLayout != null) {
                                    i10 = R.id.rcNoRb;
                                    RadioButton radioButton = (RadioButton) a.a(view, R.id.rcNoRb);
                                    if (radioButton != null) {
                                        i10 = R.id.topTitleTv;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view, R.id.topTitleTv);
                                        if (appCompatTextView2 != null) {
                                            i10 = R.id.transactionNoLl;
                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.transactionNoLl);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.transactionNoRb;
                                                RadioButton radioButton2 = (RadioButton) a.a(view, R.id.transactionNoRb);
                                                if (radioButton2 != null) {
                                                    return new l9((RelativeLayout) view, textView, textView2, appCompatTextView, editText, editText2, a11, linearLayout, radioButton, appCompatTextView2, linearLayout2, radioButton2);
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

    public static l9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static l9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_verify_pending_transaction, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27306a;
    }
}
