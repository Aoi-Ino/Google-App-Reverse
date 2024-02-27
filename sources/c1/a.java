package c1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import c6.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import y5.g;
import y5.i;
import z5.f;

public final class a implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f4596a;

    /* renamed from: b  reason: collision with root package name */
    final List f4597b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final String f4598c;

    /* renamed from: d  reason: collision with root package name */
    final String f4599d;

    /* renamed from: e  reason: collision with root package name */
    final y5.a f4600e;

    /* renamed from: f  reason: collision with root package name */
    final y5.d f4601f;

    /* renamed from: c1.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0090a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c1.a$c[] r0 = c1.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4602a = r0
                c1.a$c r1 = c1.a.c.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4602a     // Catch:{ NoSuchFieldError -> 0x001d }
                c1.a$c r1 = c1.a.c.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4602a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c1.a$c r1 = c1.a.c.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4602a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c1.a$c r1 = c1.a.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4602a     // Catch:{ NoSuchFieldError -> 0x003e }
                c1.a$c r1 = c1.a.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4602a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c1.a$c r1 = c1.a.c.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c1.a.C0090a.<clinit>():void");
        }
    }

    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        private final a f4603a;

        /* renamed from: b  reason: collision with root package name */
        private final SharedPreferences.Editor f4604b;

        /* renamed from: c  reason: collision with root package name */
        private final List f4605c;

        /* renamed from: d  reason: collision with root package name */
        private AtomicBoolean f4606d = new AtomicBoolean(false);

        b(a aVar, SharedPreferences.Editor editor) {
            this.f4603a = aVar;
            this.f4604b = editor;
            this.f4605c = new CopyOnWriteArrayList();
        }

        private void a() {
            if (this.f4606d.getAndSet(false)) {
                for (String str : this.f4603a.getAll().keySet()) {
                    if (!this.f4605c.contains(str) && !this.f4603a.f(str)) {
                        this.f4604b.remove(this.f4603a.c(str));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f4603a.f4597b) {
                for (String onSharedPreferenceChanged : this.f4605c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f4603a, onSharedPreferenceChanged);
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (!this.f4603a.f(str)) {
                this.f4605c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair d10 = this.f4603a.d(str, bArr);
                    this.f4604b.putString((String) d10.first, (String) d10.second);
                } catch (GeneralSecurityException e10) {
                    throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
                }
            } else {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
        }

        public void apply() {
            a();
            this.f4604b.apply();
            b();
            this.f4605c.clear();
        }

        public SharedPreferences.Editor clear() {
            this.f4606d.set(true);
            return this;
        }

        public boolean commit() {
            a();
            try {
                return this.f4604b.commit();
            } finally {
                b();
                this.f4605c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.b());
            allocate.put(z10 ? (byte) 1 : 0);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.b());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.b());
            allocate.putInt(i10);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.b());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.b());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList<>(set.size());
            int size = set.size() * 4;
            for (String bytes : set) {
                byte[] bytes2 = bytes.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes2);
                size += bytes2.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.b());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.f4603a.f(str)) {
                this.f4604b.remove(this.f4603a.c(str));
                this.f4605c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    private enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f4614e;

        private c(int i10) {
            this.f4614e = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int b() {
            return this.f4614e;
        }
    }

    public enum d {
        AES256_SIV(b6.a.j());
        

        /* renamed from: e  reason: collision with root package name */
        private final g f4617e;

        private d(g gVar) {
            this.f4617e = gVar;
        }

        /* access modifiers changed from: package-private */
        public g a() {
            return this.f4617e;
        }
    }

    public enum e {
        AES256_GCM(f.j());
        

        /* renamed from: e  reason: collision with root package name */
        private final g f4620e;

        private e(g gVar) {
            this.f4620e = gVar;
        }

        /* access modifiers changed from: package-private */
        public g a() {
            return this.f4620e;
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, y5.a aVar, y5.d dVar) {
        this.f4598c = str;
        this.f4596a = sharedPreferences;
        this.f4599d = str2;
        this.f4600e = aVar;
        this.f4601f = dVar;
    }

    public static SharedPreferences a(String str, String str2, Context context, d dVar, e eVar) {
        b6.b.b();
        z5.a.b();
        a.b j10 = new a.b().h(dVar.a()).j(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        i c10 = j10.i("android-keystore://" + str2).d().c();
        a.b j11 = new a.b().h(eVar.a()).j(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        y5.a aVar = (y5.a) j11.i("android-keystore://" + str2).d().c().h(y5.a.class);
        return new a(str, str2, context.getSharedPreferences(str, 0), aVar, (y5.d) c10.h(y5.d.class));
    }

    private Object e(String str) {
        if (!f(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String c10 = c(str);
                String string = this.f4596a.getString(c10, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z10 = false;
                byte[] a10 = g6.f.a(string, 0);
                y5.a aVar = this.f4600e;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a10, c10.getBytes(charset)));
                wrap.position(0);
                switch (C0090a.f4602a[c.a(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i10 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i10);
                        String charBuffer = charset.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        if (wrap.get() != 0) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    case 6:
                        ArraySet arraySet = new ArraySet();
                        while (wrap.hasRemaining()) {
                            int i11 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i11);
                            wrap.position(wrap.position() + i11);
                            arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                            return arraySet;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        try {
            String str2 = new String(this.f4601f.b(g6.f.a(str, 0), this.f4598c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public String c(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return g6.f.d(this.f4601f.a(str.getBytes(StandardCharsets.UTF_8), this.f4598c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    public boolean contains(String str) {
        if (!f(str)) {
            return this.f4596a.contains(c(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* access modifiers changed from: package-private */
    public Pair d(String str, byte[] bArr) {
        String c10 = c(str);
        return new Pair(c10, g6.f.d(this.f4600e.a(bArr, c10.getBytes(StandardCharsets.UTF_8))));
    }

    public SharedPreferences.Editor edit() {
        return new b(this, this.f4596a.edit());
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f4596a.getAll().entrySet()) {
            if (!f((String) next.getKey())) {
                String b10 = b((String) next.getKey());
                hashMap.put(b10, e(b10));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z10) {
        Object e10 = e(str);
        return (e10 == null || !(e10 instanceof Boolean)) ? z10 : ((Boolean) e10).booleanValue();
    }

    public float getFloat(String str, float f10) {
        Object e10 = e(str);
        return (e10 == null || !(e10 instanceof Float)) ? f10 : ((Float) e10).floatValue();
    }

    public int getInt(String str, int i10) {
        Object e10 = e(str);
        return (e10 == null || !(e10 instanceof Integer)) ? i10 : ((Integer) e10).intValue();
    }

    public long getLong(String str, long j10) {
        Object e10 = e(str);
        return (e10 == null || !(e10 instanceof Long)) ? j10 : ((Long) e10).longValue();
    }

    public String getString(String str, String str2) {
        Object e10 = e(str);
        return (e10 == null || !(e10 instanceof String)) ? str2 : (String) e10;
    }

    public Set getStringSet(String str, Set set) {
        Object e10 = e(str);
        Set arraySet = e10 instanceof Set ? (Set) e10 : new ArraySet();
        return arraySet.size() > 0 ? arraySet : set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4597b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4597b.remove(onSharedPreferenceChangeListener);
    }
}
