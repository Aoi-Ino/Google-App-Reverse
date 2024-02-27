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
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class za {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29741a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatSpinner f29742b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f29743c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialCardView f29744d;

    /* renamed from: e  reason: collision with root package name */
    public final CardView f29745e;

    /* renamed from: f  reason: collision with root package name */
    public final CardView f29746f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f29747g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f29748h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f29749i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f29750j;

    /* renamed from: k  reason: collision with root package name */
    public final EditText f29751k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageButton f29752l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageButton f29753m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f29754n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f29755o;

    /* renamed from: p  reason: collision with root package name */
    public final MapView f29756p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatSpinner f29757q;

    /* renamed from: r  reason: collision with root package name */
    public final ScrollView f29758r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f29759s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f29760t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f29761u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f29762v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f29763w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f29764x;

    private za(LinearLayout linearLayout, AppCompatSpinner appCompatSpinner, AppCompatButton appCompatButton, MaterialCardView materialCardView, CardView cardView, CardView cardView2, EditText editText, TextView textView, EditText editText2, EditText editText3, EditText editText4, ImageButton imageButton, ImageButton imageButton2, LinearLayout linearLayout2, LinearLayout linearLayout3, MapView mapView, AppCompatSpinner appCompatSpinner2, ScrollView scrollView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f29741a = linearLayout;
        this.f29742b = appCompatSpinner;
        this.f29743c = appCompatButton;
        this.f29744d = materialCardView;
        this.f29745e = cardView;
        this.f29746f = cardView2;
        this.f29747g = editText;
        this.f29748h = textView;
        this.f29749i = editText2;
        this.f29750j = editText3;
        this.f29751k = editText4;
        this.f29752l = imageButton;
        this.f29753m = imageButton2;
        this.f29754n = linearLayout2;
        this.f29755o = linearLayout3;
        this.f29756p = mapView;
        this.f29757q = appCompatSpinner2;
        this.f29758r = scrollView;
        this.f29759s = textView2;
        this.f29760t = textView3;
        this.f29761u = textView4;
        this.f29762v = textView5;
        this.f29763w = textView6;
        this.f29764x = textView7;
    }

    public static za a(View view) {
        View view2 = view;
        int i10 = R.id.app_option;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a.a(view2, R.id.app_option);
        if (appCompatSpinner != null) {
            i10 = R.id.complain_reg;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.complain_reg);
            if (appCompatButton != null) {
                i10 = R.id.cv_complaint_status;
                MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_complaint_status);
                if (materialCardView != null) {
                    i10 = R.id.cv_report_complaint;
                    CardView cardView = (CardView) a.a(view2, R.id.cv_report_complaint);
                    if (cardView != null) {
                        i10 = R.id.cv_report_traffic_violation_page;
                        CardView cardView2 = (CardView) a.a(view2, R.id.cv_report_traffic_violation_page);
                        if (cardView2 != null) {
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
                                        EditText editText3 = (EditText) a.a(view2, R.id.ev_time_picker);
                                        if (editText3 != null) {
                                            i10 = R.id.ev_vehicle_no;
                                            EditText editText4 = (EditText) a.a(view2, R.id.ev_vehicle_no);
                                            if (editText4 != null) {
                                                i10 = R.id.ib_imagePicker;
                                                ImageButton imageButton = (ImageButton) a.a(view2, R.id.ib_imagePicker);
                                                if (imageButton != null) {
                                                    i10 = R.id.ib_videoPicker;
                                                    ImageButton imageButton2 = (ImageButton) a.a(view2, R.id.ib_videoPicker);
                                                    if (imageButton2 != null) {
                                                        i10 = R.id.ll_dashboard;
                                                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.ll_dashboard);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.ll_report_traffic_violation_page;
                                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_report_traffic_violation_page);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.mapv_report_traffic_violation_page;
                                                                MapView mapView = (MapView) a.a(view2, R.id.mapv_report_traffic_violation_page);
                                                                if (mapView != null) {
                                                                    i10 = R.id.spn_state;
                                                                    AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) a.a(view2, R.id.spn_state);
                                                                    if (appCompatSpinner2 != null) {
                                                                        i10 = R.id.sv_report_traffic_violation_page;
                                                                        ScrollView scrollView = (ScrollView) a.a(view2, R.id.sv_report_traffic_violation_page);
                                                                        if (scrollView != null) {
                                                                            i10 = R.id.textView11111;
                                                                            TextView textView2 = (TextView) a.a(view2, R.id.textView11111);
                                                                            if (textView2 != null) {
                                                                                i10 = R.id.textView2;
                                                                                TextView textView3 = (TextView) a.a(view2, R.id.textView2);
                                                                                if (textView3 != null) {
                                                                                    i10 = R.id.tv_date;
                                                                                    TextView textView4 = (TextView) a.a(view2, R.id.tv_date);
                                                                                    if (textView4 != null) {
                                                                                        i10 = R.id.tv_location;
                                                                                        TextView textView5 = (TextView) a.a(view2, R.id.tv_location);
                                                                                        if (textView5 != null) {
                                                                                            i10 = R.id.tv_report_traffic_violation;
                                                                                            TextView textView6 = (TextView) a.a(view2, R.id.tv_report_traffic_violation);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.tv_vehicle_no;
                                                                                                TextView textView7 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                                if (textView7 != null) {
                                                                                                    return new za((LinearLayout) view2, appCompatSpinner, appCompatButton, materialCardView, cardView, cardView2, editText, textView, editText2, editText3, editText4, imageButton, imageButton2, linearLayout, linearLayout2, mapView, appCompatSpinner2, scrollView, textView2, textView3, textView4, textView5, textView6, textView7);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static za c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_report_traffic_violation, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29741a;
    }
}
