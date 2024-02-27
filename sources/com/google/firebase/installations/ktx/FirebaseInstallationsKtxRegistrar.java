package com.google.firebase.installations.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    public List getComponents() {
        return q.i();
    }
}
