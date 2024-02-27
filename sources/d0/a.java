package d0;

import android.widget.CompoundButton;
import androidx.databinding.g;

public abstract class a {

    /* renamed from: d0.a$a  reason: collision with other inner class name */
    class C0124a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f9657e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f9658f;

        C0124a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, g gVar) {
            this.f9657e = onCheckedChangeListener;
            this.f9658f = gVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f9657e;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
            }
            this.f9658f.a();
        }
    }

    public static void a(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isChecked() != z10) {
            compoundButton.setChecked(z10);
        }
    }

    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, g gVar) {
        if (gVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C0124a(onCheckedChangeListener, gVar));
        }
    }
}
