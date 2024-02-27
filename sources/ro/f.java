package ro;

import fo.c;
import fo.d;
import fo.e;
import ho.g;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p000do.a;
import qn.z;
import vn.b;

public class f extends KeyFactorySpi implements a {
    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                b B = b.B(z.e0(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (e.f23628m.Y(B.E().y())) {
                        c E = c.E(B.T());
                        return new c(new ho.f(E.H(), E.F(), E.y(), E.B(), E.T(), E.Y(), E.e0()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e10) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e10);
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                wn.b B = wn.b.B(z.e0(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (e.f23628m.Y(B.y().y())) {
                        d B2 = d.B(B.F());
                        return new d(new g(B2.E(), B2.F(), B2.y()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e10) {
                    throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e10.getMessage());
                }
            } catch (IOException e11) {
                throw new InvalidKeySpecException(e11.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) {
        return null;
    }
}
