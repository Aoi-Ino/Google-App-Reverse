package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class jc {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27017a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27018b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f27019c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f27020d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27021e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f27022f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27023g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f27024h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatEditText f27025i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f27026j;

    /* renamed from: k  reason: collision with root package name */
    public final qd f27027k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f27028l;

    private jc(RelativeLayout relativeLayout, TextView textView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView2, AppCompatTextView appCompatTextView, TextView textView3, Spinner spinner, AppCompatEditText appCompatEditText, ImageView imageView, qd qdVar, MyTextView myTextView) {
        this.f27017a = relativeLayout;
        this.f27018b = textView;
        this.f27019c = appCompatButton;
        this.f27020d = appCompatButton2;
        this.f27021e = textView2;
        this.f27022f = appCompatTextView;
        this.f27023g = textView3;
        this.f27024h = spinner;
        this.f27025i = appCompatEditText;
        this.f27026j = imageView;
        this.f27027k = qdVar;
        this.f27028l = myTextView;
    }

    public static jc a(View view) {
        int i10 = R.id.chassis_no;
        TextView textView = (TextView) a.a(view, R.id.chassis_no);
        if (textView != null) {
            i10 = R.id.idCancel;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.idCancel);
            if (appCompatButton != null) {
                i10 = R.id.idSubmit;
                AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.idSubmit);
                if (appCompatButton2 != null) {
                    i10 = R.id.nomination_date;
                    TextView textView2 = (TextView) a.a(view, R.id.nomination_date);
                    if (textView2 != null) {
                        i10 = R.id.nominationdate_selection;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.nominationdate_selection);
                        if (appCompatTextView != null) {
                            i10 = R.id.nominee_name;
                            TextView textView3 = (TextView) a.a(view, R.id.nominee_name);
                            if (textView3 != null) {
                                i10 = R.id.periodmodespin;
                                Spinner spinner = (Spinner) a.a(view, R.id.periodmodespin);
                                if (spinner != null) {
                                    i10 = R.id.regNoEt;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.regNoEt);
                                    if (appCompatEditText != null) {
                                        i10 = R.id.rightReasonPin;
                                        ImageView imageView = (ImageView) a.a(view, R.id.rightReasonPin);
                                        if (imageView != null) {
                                            i10 = R.id.topHolder;
                                            View a10 = a.a(view, R.id.topHolder);
                                            if (a10 != null) {
                                                qd a11 = qd.a(a10);
                                                i10 = R.id.update_mobile_no;
                                                MyTextView myTextView = (MyTextView) a.a(view, R.id.update_mobile_no);
                                                if (myTextView != null) {
                                                    return new jc((RelativeLayout) view, textView, appCompatButton, appCompatButton2, textView2, appCompatTextView, textView3, spinner, appCompatEditText, imageView, a11, myTextView);
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

    public static jc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static jc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.nominee_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27017a;
    }
}
