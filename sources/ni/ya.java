package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class ya {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29552a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialCardView f29553b;

    /* renamed from: c  reason: collision with root package name */
    public final CardView f29554c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f29555d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f29556e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f29557f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f29558g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f29559h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageButton f29560i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageButton f29561j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f29562k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f29563l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f29564m;

    /* renamed from: n  reason: collision with root package name */
    public final MapView f29565n;

    /* renamed from: o  reason: collision with root package name */
    public final AppCompatButton f29566o;

    /* renamed from: p  reason: collision with root package name */
    public final ScrollView f29567p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f29568q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f29569r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f29570s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f29571t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f29572u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f29573v;

    private ya(LinearLayout linearLayout, MaterialCardView materialCardView, CardView cardView, EditText editText, TextView textView, EditText editText2, TextView textView2, EditText editText3, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, MapView mapView, AppCompatButton appCompatButton, ScrollView scrollView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f29552a = linearLayout;
        this.f29553b = materialCardView;
        this.f29554c = cardView;
        this.f29555d = editText;
        this.f29556e = textView;
        this.f29557f = editText2;
        this.f29558g = textView2;
        this.f29559h = editText3;
        this.f29560i = imageButton;
        this.f29561j = imageButton2;
        this.f29562k = linearLayout2;
        this.f29563l = linearLayout3;
        this.f29564m = linearLayout4;
        this.f29565n = mapView;
        this.f29566o = appCompatButton;
        this.f29567p = scrollView;
        this.f29568q = textView3;
        this.f29569r = textView4;
        this.f29570s = textView5;
        this.f29571t = textView6;
        this.f29572u = textView7;
        this.f29573v = textView8;
    }

    public static ya a(View view) {
        View view2 = view;
        int i10 = R.id.cv_complaint_status;
        MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_complaint_status);
        if (materialCardView != null) {
            i10 = R.id.cv_report_accident_page;
            CardView cardView = (CardView) a.a(view2, R.id.cv_report_accident_page);
            if (cardView != null) {
                i10 = R.id.editTextTextPersonName11;
                EditText editText = (EditText) a.a(view2, R.id.editTextTextPersonName11);
                if (editText != null) {
                    i10 = R.id.ev_calender_picker;
                    TextView textView = (TextView) a.a(view2, R.id.ev_calender_picker);
                    if (textView != null) {
                        i10 = R.id.ev_location;
                        EditText editText2 = (EditText) a.a(view2, R.id.ev_location);
                        if (editText2 != null) {
                            i10 = R.id.ev_time_picker;
                            TextView textView2 = (TextView) a.a(view2, R.id.ev_time_picker);
                            if (textView2 != null) {
                                i10 = R.id.ev_vehicle_no;
                                EditText editText3 = (EditText) a.a(view2, R.id.ev_vehicle_no);
                                if (editText3 != null) {
                                    i10 = R.id.ib_imagePicker;
                                    ImageButton imageButton = (ImageButton) a.a(view2, R.id.ib_imagePicker);
                                    if (imageButton != null) {
                                        i10 = R.id.ib_videoPicker;
                                        ImageButton imageButton2 = (ImageButton) a.a(view2, R.id.ib_videoPicker);
                                        if (imageButton2 != null) {
                                            i10 = R.id.ll_acc_report;
                                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.ll_acc_report);
                                            if (linearLayout != null) {
                                                i10 = R.id.ll_dashboard;
                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_dashboard);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.ll_report_accident_page;
                                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_report_accident_page);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.mapv_report_traffic_violation_page;
                                                        MapView mapView = (MapView) a.a(view2, R.id.mapv_report_traffic_violation_page);
                                                        if (mapView != null) {
                                                            i10 = R.id.submit_acc_report;
                                                            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.submit_acc_report);
                                                            if (appCompatButton != null) {
                                                                i10 = R.id.sv_report_accident_page;
                                                                ScrollView scrollView = (ScrollView) a.a(view2, R.id.sv_report_accident_page);
                                                                if (scrollView != null) {
                                                                    i10 = R.id.textView11111;
                                                                    TextView textView3 = (TextView) a.a(view2, R.id.textView11111);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.textView2;
                                                                        TextView textView4 = (TextView) a.a(view2, R.id.textView2);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.tv_date;
                                                                            TextView textView5 = (TextView) a.a(view2, R.id.tv_date);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.tv_location;
                                                                                TextView textView6 = (TextView) a.a(view2, R.id.tv_location);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.tv_report_accident_page;
                                                                                    TextView textView7 = (TextView) a.a(view2, R.id.tv_report_accident_page);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.tv_vehicle_no;
                                                                                        TextView textView8 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                        if (textView8 != null) {
                                                                                            return new ya((LinearLayout) view2, materialCardView, cardView, editText, textView, editText2, textView2, editText3, imageButton, imageButton2, linearLayout, linearLayout2, linearLayout3, mapView, appCompatButton, scrollView, textView3, textView4, textView5, textView6, textView7, textView8);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ya c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_report_accident, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29552a;
    }
}
