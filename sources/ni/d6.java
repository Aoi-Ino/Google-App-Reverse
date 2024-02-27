package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class d6 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25862a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f25863b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f25864c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f25865d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f25866e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f25867f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25868g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25869h;

    /* renamed from: i  reason: collision with root package name */
    public final qd f25870i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25871j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f25872k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25873l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25874m;

    private d6(ScrollView scrollView, AppCompatButton appCompatButton, EditText editText, MyTextView myTextView, EditText editText2, MyTextView myTextView2, TextView textView, TextView textView2, qd qdVar, TextView textView3, MyTextView myTextView3, TextView textView4, TextView textView5) {
        this.f25862a = scrollView;
        this.f25863b = appCompatButton;
        this.f25864c = editText;
        this.f25865d = myTextView;
        this.f25866e = editText2;
        this.f25867f = myTextView2;
        this.f25868g = textView;
        this.f25869h = textView2;
        this.f25870i = qdVar;
        this.f25871j = textView3;
        this.f25872k = myTextView3;
        this.f25873l = textView4;
        this.f25874m = textView5;
    }

    public static d6 a(View view) {
        View view2 = view;
        int i10 = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
        if (appCompatButton != null) {
            i10 = R.id.fee_amount;
            EditText editText = (EditText) a.a(view2, R.id.fee_amount);
            if (editText != null) {
                i10 = R.id.fee_amount_txt;
                MyTextView myTextView = (MyTextView) a.a(view2, R.id.fee_amount_txt);
                if (myTextView != null) {
                    i10 = R.id.fine_amount;
                    EditText editText2 = (EditText) a.a(view2, R.id.fine_amount);
                    if (editText2 != null) {
                        i10 = R.id.fine_amount_txt;
                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.fine_amount_txt);
                        if (myTextView2 != null) {
                            i10 = R.id.missfeetobepaid;
                            TextView textView = (TextView) a.a(view2, R.id.missfeetobepaid);
                            if (textView != null) {
                                i10 = R.id.notes;
                                TextView textView2 = (TextView) a.a(view2, R.id.notes);
                                if (textView2 != null) {
                                    i10 = R.id.topHolder;
                                    View a10 = a.a(view2, R.id.topHolder);
                                    if (a10 != null) {
                                        qd a11 = qd.a(a10);
                                        i10 = R.id.total_amount;
                                        TextView textView3 = (TextView) a.a(view2, R.id.total_amount);
                                        if (textView3 != null) {
                                            i10 = R.id.total_amount_txt;
                                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.total_amount_txt);
                                            if (myTextView3 != null) {
                                                i10 = R.id.vehicleNumberTv;
                                                TextView textView4 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                if (textView4 != null) {
                                                    i10 = R.id.vehicle_view;
                                                    TextView textView5 = (TextView) a.a(view2, R.id.vehicle_view);
                                                    if (textView5 != null) {
                                                        return new d6((ScrollView) view2, appCompatButton, editText, myTextView, editText2, myTextView2, textView, textView2, a11, textView3, myTextView3, textView4, textView5);
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

    public static d6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static d6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_miscellaneous_fee_payment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25862a;
    }
}
