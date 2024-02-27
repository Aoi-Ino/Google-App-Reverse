package xk;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import uk.b;

public class g extends f {
    public g(b.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public PropertyValuesHolder n(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f32769g;
            i11 = (int) (((float) i10) * this.f32770h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i11 = this.f32769g;
            i10 = (int) (((float) i11) * this.f32770h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i11, i10});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
