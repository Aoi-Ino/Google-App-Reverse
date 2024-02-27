package i1;

import android.support.v4.media.session.b;
import android.view.ViewGroup;

public abstract class k {
    public static k a(ViewGroup viewGroup) {
        b.a(viewGroup.getTag(i.transition_current_scene));
        return null;
    }

    static void b(ViewGroup viewGroup, k kVar) {
        viewGroup.setTag(i.transition_current_scene, kVar);
    }
}
