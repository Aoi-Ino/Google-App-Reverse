package r4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.g;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final g f15592a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final g f15593b = new g();

    private static void a(f fVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            fVar.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            fVar.h(objectAnimator.getPropertyName(), g.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static f b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static f c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    private static f d(List list) {
        f fVar = new f();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(fVar, (Animator) list.get(i10));
        }
        return fVar;
    }

    public g e(String str) {
        if (f(str)) {
            return (g) this.f15592a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f15592a.equals(((f) obj).f15592a);
    }

    public boolean f(String str) {
        return this.f15592a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f15593b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, g gVar) {
        this.f15592a.put(str, gVar);
    }

    public int hashCode() {
        return this.f15592a.hashCode();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15592a + "}\n";
    }
}
