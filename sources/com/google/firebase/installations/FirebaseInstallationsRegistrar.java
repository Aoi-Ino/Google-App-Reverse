package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j6.a;
import j6.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k6.c;
import k6.d;
import k6.d0;
import k6.q;
import l6.j;
import w6.h;
import w6.i;
import z6.e;
import z6.f;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(d dVar) {
        return new c((h6.e) dVar.a(h6.e.class), dVar.d(i.class), (ExecutorService) dVar.b(d0.a(a.class, ExecutorService.class)), j.a((Executor) dVar.b(d0.a(b.class, Executor.class))));
    }

    public List<c> getComponents() {
        return Arrays.asList(new c[]{c.c(e.class).g(LIBRARY_NAME).b(q.i(h6.e.class)).b(q.h(i.class)).b(q.j(d0.a(a.class, ExecutorService.class))).b(q.j(d0.a(b.class, Executor.class))).e(new f()).d(), h.a(), g7.h.b(LIBRARY_NAME, "17.2.0")});
    }
}
