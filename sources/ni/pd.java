package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class pd {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28078a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f28079b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f28080c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f28081d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f28082e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f28083f;

    /* renamed from: g  reason: collision with root package name */
    public final kb f28084g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f28085h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f28086i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f28087j;

    /* renamed from: k  reason: collision with root package name */
    public final qd f28088k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f28089l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f28090m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f28091n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f28092o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f28093p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f28094q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f28095r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f28096s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f28097t;

    private pd(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, kb kbVar, Spinner spinner, EditText editText3, ImageView imageView, qd qdVar, MyTextView myTextView, TextView textView2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView3, TextView textView4) {
        this.f28078a = scrollView;
        this.f28079b = appCompatButton;
        this.f28080c = textView;
        this.f28081d = editText;
        this.f28082e = linearLayout;
        this.f28083f = editText2;
        this.f28084g = kbVar;
        this.f28085h = spinner;
        this.f28086i = editText3;
        this.f28087j = imageView;
        this.f28088k = qdVar;
        this.f28089l = myTextView;
        this.f28090m = textView2;
        this.f28091n = myTextView2;
        this.f28092o = myTextView3;
        this.f28093p = myTextView4;
        this.f28094q = myTextView5;
        this.f28095r = myTextView6;
        this.f28096s = textView3;
        this.f28097t = textView4;
    }

    public static pd a(View view) {
        View view2 = view;
        int i10 = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
        if (appCompatButton != null) {
            i10 = R.id.firDateTv;
            TextView textView = (TextView) a.a(view2, R.id.firDateTv);
            if (textView != null) {
                i10 = R.id.firNoTv;
                EditText editText = (EditText) a.a(view2, R.id.firNoTv);
                if (editText != null) {
                    i10 = R.id.police_fir_layout;
                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.police_fir_layout);
                    if (linearLayout != null) {
                        i10 = R.id.policeStationTv;
                        EditText editText2 = (EditText) a.a(view2, R.id.policeStationTv);
                        if (editText2 != null) {
                            i10 = R.id.rc_ind;
                            View a10 = a.a(view2, R.id.rc_ind);
                            if (a10 != null) {
                                kb a11 = kb.a(a10);
                                i10 = R.id.reasonSpinner;
                                Spinner spinner = (Spinner) a.a(view2, R.id.reasonSpinner);
                                if (spinner != null) {
                                    i10 = R.id.remarkTv;
                                    EditText editText3 = (EditText) a.a(view2, R.id.remarkTv);
                                    if (editText3 != null) {
                                        i10 = R.id.rightReasonPin;
                                        ImageView imageView = (ImageView) a.a(view2, R.id.rightReasonPin);
                                        if (imageView != null) {
                                            i10 = R.id.topHolder;
                                            View a12 = a.a(view2, R.id.topHolder);
                                            if (a12 != null) {
                                                qd a13 = qd.a(a12);
                                                i10 = R.id.vahan_details_duplicate_rc;
                                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.vahan_details_duplicate_rc);
                                                if (myTextView != null) {
                                                    i10 = R.id.vahan_duplicate_rc;
                                                    TextView textView2 = (TextView) a.a(view2, R.id.vahan_duplicate_rc);
                                                    if (textView2 != null) {
                                                        i10 = R.id.vahan_fir_date;
                                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.vahan_fir_date);
                                                        if (myTextView2 != null) {
                                                            i10 = R.id.vahan_police_station;
                                                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.vahan_police_station);
                                                            if (myTextView3 != null) {
                                                                i10 = R.id.vahan_reason;
                                                                MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vahan_reason);
                                                                if (myTextView4 != null) {
                                                                    i10 = R.id.vahan_remark;
                                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.vahan_remark);
                                                                    if (myTextView5 != null) {
                                                                        i10 = R.id.vahan_report_no;
                                                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.vahan_report_no);
                                                                        if (myTextView6 != null) {
                                                                            i10 = R.id.vehicleNumberTv;
                                                                            TextView textView3 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.vehicle_view;
                                                                                TextView textView4 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                if (textView4 != null) {
                                                                                    return new pd((ScrollView) view2, appCompatButton, textView, editText, linearLayout, editText2, a11, spinner, editText3, imageView, a13, myTextView, textView2, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView3, textView4);
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

    public static pd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static pd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_duplicate_rc, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28078a;
    }
}
