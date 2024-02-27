package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import k1.a;

public final class x3 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f29291a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f29292b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f29293c;

    /* renamed from: d  reason: collision with root package name */
    public final CustomWegetLayout f29294d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f29295e;

    /* renamed from: f  reason: collision with root package name */
    public final CustomWegetLayout f29296f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f29297g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f29298h;

    /* renamed from: i  reason: collision with root package name */
    public final Spinner f29299i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f29300j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatEditText f29301k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f29302l;

    private x3(ScrollView scrollView, qd qdVar, MyTextView myTextView, CustomWegetLayout customWegetLayout, MyTextView myTextView2, CustomWegetLayout customWegetLayout2, ImageView imageView, MyTextView myTextView3, Spinner spinner, MyTextView myTextView4, AppCompatEditText appCompatEditText, MyTextView myTextView5) {
        this.f29291a = scrollView;
        this.f29292b = qdVar;
        this.f29293c = myTextView;
        this.f29294d = customWegetLayout;
        this.f29295e = myTextView2;
        this.f29296f = customWegetLayout2;
        this.f29297g = imageView;
        this.f29298h = myTextView3;
        this.f29299i = spinner;
        this.f29300j = myTextView4;
        this.f29301k = appCompatEditText;
        this.f29302l = myTextView5;
    }

    public static x3 a(View view) {
        int i10 = R.id.applicationStatusHeader;
        View a10 = a.a(view, R.id.applicationStatusHeader);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            i10 = R.id.forstateTv;
            MyTextView myTextView = (MyTextView) a.a(view, R.id.forstateTv);
            if (myTextView != null) {
                i10 = R.id.id_get_details_service;
                CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view, R.id.id_get_details_service);
                if (customWegetLayout != null) {
                    i10 = R.id.idLayoutTitle;
                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.idLayoutTitle);
                    if (myTextView2 != null) {
                        i10 = R.id.reset;
                        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view, R.id.reset);
                        if (customWegetLayout2 != null) {
                            i10 = R.id.rightStatePin;
                            ImageView imageView = (ImageView) a.a(view, R.id.rightStatePin);
                            if (imageView != null) {
                                i10 = R.id.select_state_name;
                                MyTextView myTextView3 = (MyTextView) a.a(view, R.id.select_state_name);
                                if (myTextView3 != null) {
                                    i10 = R.id.stateSpinner;
                                    Spinner spinner = (Spinner) a.a(view, R.id.stateSpinner);
                                    if (spinner != null) {
                                        i10 = R.id.time_text;
                                        MyTextView myTextView4 = (MyTextView) a.a(view, R.id.time_text);
                                        if (myTextView4 != null) {
                                            i10 = R.id.txt_vehicle_no;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.txt_vehicle_no);
                                            if (appCompatEditText != null) {
                                                i10 = R.id.vehicleTv;
                                                MyTextView myTextView5 = (MyTextView) a.a(view, R.id.vehicleTv);
                                                if (myTextView5 != null) {
                                                    return new x3((ScrollView) view, a11, myTextView, customWegetLayout, myTextView2, customWegetLayout2, imageView, myTextView3, spinner, myTextView4, appCompatEditText, myTextView5);
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

    public static x3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static x3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_download_check_post_receipt2, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f29291a;
    }
}
