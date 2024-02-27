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

public final class f4 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26214a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f26215b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26216c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26217d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26218e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26219f;

    /* renamed from: g  reason: collision with root package name */
    public final Spinner f26220g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f26221h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f26222i;

    /* renamed from: j  reason: collision with root package name */
    public final qd f26223j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f26224k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f26225l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f26226m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f26227n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f26228o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f26229p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26230q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26231r;

    private f4(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, EditText editText, LinearLayout linearLayout, EditText editText2, Spinner spinner, EditText editText3, ImageView imageView, qd qdVar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView2, TextView textView3) {
        this.f26214a = scrollView;
        this.f26215b = appCompatButton;
        this.f26216c = textView;
        this.f26217d = editText;
        this.f26218e = linearLayout;
        this.f26219f = editText2;
        this.f26220g = spinner;
        this.f26221h = editText3;
        this.f26222i = imageView;
        this.f26223j = qdVar;
        this.f26224k = myTextView;
        this.f26225l = myTextView2;
        this.f26226m = myTextView3;
        this.f26227n = myTextView4;
        this.f26228o = myTextView5;
        this.f26229p = myTextView6;
        this.f26230q = textView2;
        this.f26231r = textView3;
    }

    public static f4 a(View view) {
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
                                        View a10 = a.a(view2, R.id.topHolder);
                                        if (a10 != null) {
                                            qd a11 = qd.a(a10);
                                            i10 = R.id.vahan_details_duplicate_rc;
                                            MyTextView myTextView = (MyTextView) a.a(view2, R.id.vahan_details_duplicate_rc);
                                            if (myTextView != null) {
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
                                                                    TextView textView2 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.vehicle_view;
                                                                        TextView textView3 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                        if (textView3 != null) {
                                                                            return new f4((ScrollView) view2, appCompatButton, textView, editText, linearLayout, editText2, spinner, editText3, imageView, a11, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView2, textView3);
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

    public static f4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static f4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_duplicate_fitness_certificate, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26214a;
    }
}
