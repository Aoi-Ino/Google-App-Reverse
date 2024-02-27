package ni;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class jb {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f27013a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27014b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27015c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27016d;

    private jb(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f27013a = constraintLayout;
        this.f27014b = textView;
        this.f27015c = textView2;
        this.f27016d = textView3;
    }

    public static jb a(View view) {
        int i10 = R.id.availableTv;
        TextView textView = (TextView) a.a(view, R.id.availableTv);
        if (textView != null) {
            i10 = R.id.bookedTv;
            TextView textView2 = (TextView) a.a(view, R.id.bookedTv);
            if (textView2 != null) {
                i10 = R.id.holidayTv;
                TextView textView3 = (TextView) a.a(view, R.id.holidayTv);
                if (textView3 != null) {
                    return new jb((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
