package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g7.h;
import g7.i;
import h6.e;
import java.util.Arrays;
import java.util.List;
import k6.c;
import k6.q;
import v6.d;
import w6.j;
import x6.a;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Keep
    public List<c> getComponents() {
        return Arrays.asList(new c[]{c.c(FirebaseMessaging.class).g(LIBRARY_NAME).b(q.i(e.class)).b(q.g(a.class)).b(q.h(i.class)).b(q.h(j.class)).b(q.g(y2.i.class)).b(q.i(z6.e.class)).b(q.i(d.class)).e(new y()).c().d(), h.b(LIBRARY_NAME, "23.4.0")});
    }
}
