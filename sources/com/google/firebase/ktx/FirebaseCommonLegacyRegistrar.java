package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g7.h;
import java.util.List;
import k6.c;

@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public List<c> getComponents() {
        return p.d(h.b("fire-core-ktx", "20.4.2"));
    }
}
