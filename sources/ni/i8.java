package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class i8 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f26816a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f26817b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatImageView f26818c;

    /* renamed from: d  reason: collision with root package name */
    public final dc f26819d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f26820e;

    private i8(RelativeLayout relativeLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, dc dcVar, MyTextView myTextView) {
        this.f26816a = relativeLayout;
        this.f26817b = appCompatButton;
        this.f26818c = appCompatImageView;
        this.f26819d = dcVar;
        this.f26820e = myTextView;
    }

    public static i8 a(View view) {
        int i10 = R.id.btnOkay;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.btnOkay);
        if (appCompatButton != null) {
            i10 = R.id.imgWithdrawAccepted;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a.a(view, R.id.imgWithdrawAccepted);
            if (appCompatImageView != null) {
                i10 = R.id.mHeader;
                View a10 = a.a(view, R.id.mHeader);
                if (a10 != null) {
                    dc a11 = dc.a(a10);
                    i10 = R.id.txtServiceWithdrawnAccepted;
                    MyTextView myTextView = (MyTextView) a.a(view, R.id.txtServiceWithdrawnAccepted);
                    if (myTextView != null) {
                        return new i8((RelativeLayout) view, appCompatButton, appCompatImageView, a11, myTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static i8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_service_withdrawn_accepted, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f26816a;
    }
}
