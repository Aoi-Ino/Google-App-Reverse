package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g7.h;
import java.util.Arrays;
import java.util.List;
import k6.c;
import k6.q;
import p6.a;
import y2.i;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<c> getComponents() {
        return Arrays.asList(new c[]{c.c(i.class).g(LIBRARY_NAME).b(q.i(Context.class)).e(new a()).d(), h.b(LIBRARY_NAME, "18.1.7")});
    }
}
