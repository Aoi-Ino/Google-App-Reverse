package eo;

import android.support.v4.media.session.b;
import fo.e;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import qn.u;
import vo.c;
import xo.f;
import xo.g;

public final class a extends Provider {

    /* renamed from: e  reason: collision with root package name */
    private static String f23082e = "BouncyCastle Security Provider v1.70";

    /* renamed from: f  reason: collision with root package name */
    public static final bo.a f23083f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final Map f23084g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private static final Class f23085h = co.a.a(a.class, "java.security.cert.PKIXRevocationChecker");

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f23086i = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f23087j = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f23088k = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f23089l = {"X509", "IES", "COMPOSITE"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f23090m = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f23091n = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f23092o = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f23093p = {"DRBG"};

    /* renamed from: eo.a$a  reason: collision with other inner class name */
    class C0290a implements PrivilegedAction {
        C0290a() {
        }

        public Object run() {
            a.this.e();
            return null;
        }
    }

    public a() {
        super("BC", 1.7d, f23082e);
        AccessController.doPrivileged(new C0290a());
    }

    private void c(String str, String[] strArr) {
        int i10 = 0;
        while (i10 != strArr.length) {
            Class a10 = co.a.a(a.class, str + strArr[i10] + "$Mappings");
            if (a10 == null) {
                i10++;
            } else {
                try {
                    b.a(a10.newInstance());
                    throw null;
                } catch (Exception e10) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e10);
                }
            }
        }
    }

    private void d() {
        b(e.f23633r, new c());
        b(e.f23637v, new so.c());
        b(e.f23638w, new f());
        b(sn.a.f31326a, new f());
        b(e.F, new g());
        b(sn.a.f31327b, new g());
        b(e.f23628m, new ro.f());
        b(e.f23629n, new ro.e());
        b(e.f23616a, new uo.c());
        b(e.X, new to.c());
        b(e.Y, new to.c());
        b(vn.a.I0, new qo.c());
    }

    /* access modifiers changed from: private */
    public void e() {
        String str;
        String str2;
        c("org.bouncycastle.jcajce.provider.digest.", f23091n);
        c("org.bouncycastle.jcajce.provider.symmetric.", f23086i);
        c("org.bouncycastle.jcajce.provider.symmetric.", f23087j);
        c("org.bouncycastle.jcajce.provider.symmetric.", f23088k);
        c("org.bouncycastle.jcajce.provider.asymmetric.", f23089l);
        c("org.bouncycastle.jcajce.provider.asymmetric.", f23090m);
        c("org.bouncycastle.jcajce.provider.keystore.", f23092o);
        c("org.bouncycastle.jcajce.provider.drbg.", f23093p);
        d();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = f23085h;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", str);
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", str);
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public void b(u uVar, p000do.a aVar) {
        Map map = f23084g;
        synchronized (map) {
            map.put(uVar, aVar);
        }
    }
}
