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

public final class y8 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f29505a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f29506b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f29507c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29508d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f29509e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f29510f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f29511g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f29512h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f29513i;

    /* renamed from: j  reason: collision with root package name */
    public final Spinner f29514j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f29515k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f29516l;

    /* renamed from: m  reason: collision with root package name */
    public final qd f29517m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f29518n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f29519o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f29520p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f29521q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f29522r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f29523s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f29524t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f29525u;

    private y8(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, Spinner spinner, EditText editText3, Spinner spinner2, ImageView imageView, ImageView imageView2, qd qdVar, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, TextView textView2, TextView textView3) {
        this.f29505a = scrollView;
        this.f29506b = myTextView;
        this.f29507c = appCompatButton;
        this.f29508d = textView;
        this.f29509e = editText;
        this.f29510f = linearLayout;
        this.f29511g = editText2;
        this.f29512h = spinner;
        this.f29513i = editText3;
        this.f29514j = spinner2;
        this.f29515k = imageView;
        this.f29516l = imageView2;
        this.f29517m = qdVar;
        this.f29518n = myTextView2;
        this.f29519o = myTextView3;
        this.f29520p = myTextView4;
        this.f29521q = myTextView5;
        this.f29522r = myTextView6;
        this.f29523s = myTextView7;
        this.f29524t = textView2;
        this.f29525u = textView3;
    }

    public static y8 a(View view) {
        View view2 = view;
        int i10 = R.id.ApplyForDupPermit;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.ApplyForDupPermit);
        if (myTextView != null) {
            i10 = R.id.btnSubmit;
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
                                i10 = R.id.reasonSpinner;
                                Spinner spinner = (Spinner) a.a(view2, R.id.reasonSpinner);
                                if (spinner != null) {
                                    i10 = R.id.remarkTv;
                                    EditText editText3 = (EditText) a.a(view2, R.id.remarkTv);
                                    if (editText3 != null) {
                                        i10 = R.id.required_document_Spinner;
                                        Spinner spinner2 = (Spinner) a.a(view2, R.id.required_document_Spinner);
                                        if (spinner2 != null) {
                                            i10 = R.id.rightReasonPin;
                                            ImageView imageView = (ImageView) a.a(view2, R.id.rightReasonPin);
                                            if (imageView != null) {
                                                i10 = R.id.rightrequired_documentPin;
                                                ImageView imageView2 = (ImageView) a.a(view2, R.id.rightrequired_documentPin);
                                                if (imageView2 != null) {
                                                    i10 = R.id.topHoldermenu;
                                                    View a10 = a.a(view2, R.id.topHoldermenu);
                                                    if (a10 != null) {
                                                        qd a11 = qd.a(a10);
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
                                                                            i10 = R.id.vahan_required_document;
                                                                            MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.vahan_required_document);
                                                                            if (myTextView7 != null) {
                                                                                i10 = R.id.vehicleNumberTv;
                                                                                TextView textView2 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.vehicle_view;
                                                                                    TextView textView3 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                    if (textView3 != null) {
                                                                                        return new y8((ScrollView) view2, myTextView, appCompatButton, textView, editText, linearLayout, editText2, spinner, editText3, spinner2, imageView, imageView2, a11, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, textView2, textView3);
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

    public static y8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static y8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_duplicate_permit_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f29505a;
    }
}
