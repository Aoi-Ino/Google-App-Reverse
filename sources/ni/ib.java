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

public final class ib {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26825a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f26826b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26827c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26828d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26829e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26830f;

    /* renamed from: g  reason: collision with root package name */
    public final kb f26831g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f26832h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26833i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26834j;

    /* renamed from: k  reason: collision with root package name */
    public final zd f26835k;

    /* renamed from: l  reason: collision with root package name */
    public final qd f26836l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f26837m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26838n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f26839o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f26840p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f26841q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f26842r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f26843s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26844t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26845u;

    private ib(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, kb kbVar, Spinner spinner, EditText editText3, ImageView imageView, zd zdVar, qd qdVar, MyTextView myTextView, TextView textView2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView3, TextView textView4) {
        this.f26825a = scrollView;
        this.f26826b = appCompatButton;
        this.f26827c = textView;
        this.f26828d = editText;
        this.f26829e = linearLayout;
        this.f26830f = editText2;
        this.f26831g = kbVar;
        this.f26832h = spinner;
        this.f26833i = editText3;
        this.f26834j = imageView;
        this.f26835k = zdVar;
        this.f26836l = qdVar;
        this.f26837m = myTextView;
        this.f26838n = textView2;
        this.f26839o = myTextView2;
        this.f26840p = myTextView3;
        this.f26841q = myTextView4;
        this.f26842r = myTextView5;
        this.f26843s = myTextView6;
        this.f26844t = textView3;
        this.f26845u = textView4;
    }

    public static ib a(View view) {
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
                                            i10 = R.id.stepper_layout;
                                            View a12 = a.a(view2, R.id.stepper_layout);
                                            if (a12 != null) {
                                                zd a13 = zd.a(a12);
                                                i10 = R.id.topHolder;
                                                View a14 = a.a(view2, R.id.topHolder);
                                                if (a14 != null) {
                                                    qd a15 = qd.a(a14);
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
                                                                                        return new ib((ScrollView) view2, appCompatButton, textView, editText, linearLayout, editText2, a11, spinner, editText3, imageView, a13, a15, myTextView, textView2, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView3, textView4);
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

    public static ib c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ib d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.issueofduplicate_rc_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26825a;
    }
}
