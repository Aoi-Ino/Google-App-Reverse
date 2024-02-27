package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class qc {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28289a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28290b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f28291c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f28292d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f28293e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f28294f;

    /* renamed from: g  reason: collision with root package name */
    public final qd f28295g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f28296h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28297i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f28298j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f28299k;

    private qc(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, TextView textView, LinearLayout linearLayout, EditText editText, qd qdVar, MyTextView myTextView2, MyTextView myTextView3, TextView textView2, TextView textView3) {
        this.f28289a = scrollView;
        this.f28290b = myTextView;
        this.f28291c = appCompatButton;
        this.f28292d = textView;
        this.f28293e = linearLayout;
        this.f28294f = editText;
        this.f28295g = qdVar;
        this.f28296h = myTextView2;
        this.f28297i = myTextView3;
        this.f28298j = textView2;
        this.f28299k = textView3;
    }

    public static qc a(View view) {
        int i10 = R.id.appForRcCancellayion;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.appForRcCancellayion);
        if (myTextView != null) {
            i10 = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i10 = R.id.firDateTv;
                TextView textView = (TextView) a.a(view, R.id.firDateTv);
                if (textView != null) {
                    i10 = R.id.police_fir_layout;
                    LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.police_fir_layout);
                    if (linearLayout != null) {
                        i10 = R.id.remarkTv;
                        EditText editText = (EditText) a.a(view, R.id.remarkTv);
                        if (editText != null) {
                            i10 = R.id.topHolder;
                            View a10 = a.a(view, R.id.topHolder);
                            if (a10 != null) {
                                qd a11 = qd.a(a10);
                                i10 = R.id.vahan_fir_date;
                                MyTextView myTextView2 = (MyTextView) a.a(view, R.id.vahan_fir_date);
                                if (myTextView2 != null) {
                                    i10 = R.id.vahan_remark;
                                    MyTextView myTextView3 = (MyTextView) a.a(view, R.id.vahan_remark);
                                    if (myTextView3 != null) {
                                        i10 = R.id.vehicleNumberTv;
                                        TextView textView2 = (TextView) a.a(view, R.id.vehicleNumberTv);
                                        if (textView2 != null) {
                                            i10 = R.id.vehicle_view;
                                            TextView textView3 = (TextView) a.a(view, R.id.vehicle_view);
                                            if (textView3 != null) {
                                                return new qc((ScrollView) view, myTextView, appCompatButton, textView, linearLayout, editText, a11, myTextView2, myTextView3, textView2, textView3);
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

    public static qc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static qc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.rccanceltion, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28289a;
    }
}
