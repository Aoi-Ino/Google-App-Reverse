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

public final class k7 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f27086a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f27087b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f27088c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f27089d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f27090e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27091f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f27092g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27093h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f27094i;

    /* renamed from: j  reason: collision with root package name */
    public final qd f27095j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f27096k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27097l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27098m;

    private k7(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, EditText editText, EditText editText2, TextView textView, MyTextView myTextView2, LinearLayout linearLayout, MyTextView myTextView3, qd qdVar, MyTextView myTextView4, TextView textView2, TextView textView3) {
        this.f27086a = scrollView;
        this.f27087b = myTextView;
        this.f27088c = appCompatButton;
        this.f27089d = editText;
        this.f27090e = editText2;
        this.f27091f = textView;
        this.f27092g = myTextView2;
        this.f27093h = linearLayout;
        this.f27094i = myTextView3;
        this.f27095j = qdVar;
        this.f27096k = myTextView4;
        this.f27097l = textView2;
        this.f27098m = textView3;
    }

    public static k7 a(View view) {
        View view2 = view;
        int i10 = R.id.approved_by;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.approved_by);
        if (myTextView != null) {
            i10 = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
            if (appCompatButton != null) {
                i10 = R.id.enter_approved_by;
                EditText editText = (EditText) a.a(view2, R.id.enter_approved_by);
                if (editText != null) {
                    i10 = R.id.enter_file_reference_no;
                    EditText editText2 = (EditText) a.a(view2, R.id.enter_file_reference_no);
                    if (editText2 != null) {
                        i10 = R.id.enter_release_date;
                        TextView textView = (TextView) a.a(view2, R.id.enter_release_date);
                        if (textView != null) {
                            i10 = R.id.file_refernce_no;
                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.file_refernce_no);
                            if (myTextView2 != null) {
                                i10 = R.id.rc_relesae_layout;
                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.rc_relesae_layout);
                                if (linearLayout != null) {
                                    i10 = R.id.release_date;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.release_date);
                                    if (myTextView3 != null) {
                                        i10 = R.id.topHolder;
                                        View a10 = a.a(view2, R.id.topHolder);
                                        if (a10 != null) {
                                            qd a11 = qd.a(a10);
                                            i10 = R.id.vahan_details_duplicate_rc;
                                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vahan_details_duplicate_rc);
                                            if (myTextView4 != null) {
                                                i10 = R.id.vehicleNumberTv;
                                                TextView textView2 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                if (textView2 != null) {
                                                    i10 = R.id.vehicle_view;
                                                    TextView textView3 = (TextView) a.a(view2, R.id.vehicle_view);
                                                    if (textView3 != null) {
                                                        return new k7((ScrollView) view2, myTextView, appCompatButton, editText, editText2, textView, myTextView2, linearLayout, myTextView3, a11, myTextView4, textView2, textView3);
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

    public static k7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static k7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_rcrelease, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f27086a;
    }
}
