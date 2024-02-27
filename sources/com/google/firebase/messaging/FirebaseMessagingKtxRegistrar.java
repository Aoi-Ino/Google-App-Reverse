package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    public List getComponents() {
        return q.i();
    }
}
