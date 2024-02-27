package ro;

import ho.c;
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

public class e extends KeyFactorySpi implements a {
    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                b B = b.B(z.e0(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (fo.e.f23629n.Y(B.E().y())) {
                        fo.a F = fo.a.F(B.T());
                        return new a(new ho.b(F.T(), F.H(), F.B(), F.E(), F.Y(), g.b(F.y()).b()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
                    if (fo.e.f23629n.Y(B.y().y())) {
                        fo.b E = fo.b.E(B.F());
                        return new b(new c(E.F(), E.H(), E.B(), g.b(E.y()).b()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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
