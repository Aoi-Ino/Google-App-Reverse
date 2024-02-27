package m;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.core.hardware.fingerprint.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import m.q;

abstract class t {

    private static class a {
        static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static KeyGenParameterSpec.Builder b(String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes(new String[]{"CBC"});
        }

        static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
        }
    }

    private static class b {
        static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    private static class c {
        static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    private static class d {
        static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    static q.c a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder b10 = a.b("androidxBiometric", 3);
            a.d(b10);
            a.e(b10);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(instance2, a.a(b10));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new q.c(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e10);
            return null;
        }
    }

    static q.c b(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession b10;
        IdentityCredential b11;
        if (cryptoObject == null) {
            return null;
        }
        Cipher d10 = b.d(cryptoObject);
        if (d10 != null) {
            return new q.c(d10);
        }
        Signature f10 = b.f(cryptoObject);
        if (f10 != null) {
            return new q.c(f10);
        }
        Mac e10 = b.e(cryptoObject);
        if (e10 != null) {
            return new q.c(e10);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && (b11 = c.b(cryptoObject)) != null) {
            return new q.c(b11);
        }
        if (i10 < 33 || (b10 = d.b(cryptoObject)) == null) {
            return null;
        }
        return new q.c(b10);
    }

    static q.c c(a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher a10 = eVar.a();
        if (a10 != null) {
            return new q.c(a10);
        }
        Signature c10 = eVar.c();
        if (c10 != null) {
            return new q.c(c10);
        }
        Mac b10 = eVar.b();
        if (b10 != null) {
            return new q.c(b10);
        }
        return null;
    }

    static BiometricPrompt.CryptoObject d(q.c cVar) {
        PresentationSession d10;
        IdentityCredential b10;
        if (cVar == null) {
            return null;
        }
        Cipher a10 = cVar.a();
        if (a10 != null) {
            return b.b(a10);
        }
        Signature e10 = cVar.e();
        if (e10 != null) {
            return b.a(e10);
        }
        Mac c10 = cVar.c();
        if (c10 != null) {
            return b.c(c10);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && (b10 = cVar.b()) != null) {
            return c.a(b10);
        }
        if (i10 < 33 || (d10 = cVar.d()) == null) {
            return null;
        }
        return d.a(d10);
    }

    static a.e e(q.c cVar) {
        String str;
        if (cVar == null) {
            return null;
        }
        Cipher a10 = cVar.a();
        if (a10 != null) {
            return new a.e(a10);
        }
        Signature e10 = cVar.e();
        if (e10 != null) {
            return new a.e(e10);
        }
        Mac c10 = cVar.c();
        if (c10 != null) {
            return new a.e(c10);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && cVar.b() != null) {
            str = "Identity credential is not supported by FingerprintManager.";
        } else if (i10 < 33 || cVar.d() == null) {
            return null;
        } else {
            str = "Presentation session is not supported by FingerprintManager.";
        }
        Log.e("CryptoObjectUtils", str);
        return null;
    }
}
