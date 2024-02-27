package ol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30143a = false;

    /* renamed from: b  reason: collision with root package name */
    static /* synthetic */ Class f30144b;

    static {
        try {
            f30143a = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    private static void b(String str) {
        if (f30143a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    static Object c(String str, String str2) {
        return d(str, str2, e());
    }

    static Object d(String str, String str2, ClassLoader classLoader) {
        InputStream inputStream;
        try {
            String property = System.getProperty(str);
            if (property != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("found system property");
                stringBuffer.append(property);
                b(stringBuffer.toString());
                return f(property, classLoader);
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(property2);
            String str3 = File.separator;
            stringBuffer2.append(str3);
            stringBuffer2.append("lib");
            stringBuffer2.append(str3);
            stringBuffer2.append("jaxp.properties");
            File file = new File(stringBuffer2.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty(str);
                if (property3 != null && property3.length() > 0) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("found java.home property ");
                    stringBuffer3.append(property3);
                    b(stringBuffer3.toString());
                    return f(property3, classLoader);
                }
            }
        } catch (Exception e10) {
            if (f30143a) {
                e10.printStackTrace();
            }
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("META-INF/services/");
        stringBuffer4.append(str);
        String stringBuffer5 = stringBuffer4.toString();
        if (classLoader == null) {
            try {
                inputStream = ClassLoader.getSystemResourceAsStream(stringBuffer5);
            } catch (Exception e11) {
                if (f30143a) {
                    e11.printStackTrace();
                }
            }
        } else {
            inputStream = classLoader.getResourceAsStream(stringBuffer5);
        }
        if (inputStream != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("found ");
            stringBuffer6.append(stringBuffer5);
            b(stringBuffer6.toString());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null && !"".equals(readLine)) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("loaded from services: ");
                stringBuffer7.append(readLine);
                b(stringBuffer7.toString());
                return f(readLine, classLoader);
            }
        }
        if (str2 != null) {
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("loaded from fallback value: ");
            stringBuffer8.append(str2);
            b(stringBuffer8.toString());
            return f(str2, classLoader);
        }
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("Provider for ");
        stringBuffer9.append(str);
        stringBuffer9.append(" cannot be found");
        throw new a(stringBuffer9.toString(), (Exception) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = a("javax.xml.stream.FactoryFinder");
        f30144b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return r1.getClassLoader();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.ClassLoader e() {
        /*
            java.lang.String r0 = "javax.xml.stream.FactoryFinder"
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            r1.<init>()     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            java.lang.Class r2 = f30144b     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            if (r2 != 0) goto L_0x0014
            java.lang.Class r2 = a(r0)     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            f30144b = r2     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            goto L_0x0014
        L_0x0012:
            r0 = move-exception
            goto L_0x0031
        L_0x0014:
            java.lang.String r2 = r2.getName()     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            r1.append(r2)     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            java.lang.String r2 = "$ClassLoaderFinderConcrete"
            r1.append(r2)     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            java.lang.String r1 = r1.toString()     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            android.support.v4.media.session.b.a(r1)     // Catch:{ LinkageError -> 0x004a, ClassNotFoundException -> 0x003b }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x0012 }
        L_0x0031:
            ol.a r1 = new ol.a
            java.lang.String r2 = r0.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x003b:
            java.lang.Class r1 = f30144b
            if (r1 != 0) goto L_0x0045
        L_0x003f:
            java.lang.Class r1 = a(r0)
            f30144b = r1
        L_0x0045:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            goto L_0x004f
        L_0x004a:
            java.lang.Class r1 = f30144b
            if (r1 != 0) goto L_0x0045
            goto L_0x003f
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.b.e():java.lang.ClassLoader");
    }

    private static Object f(String str, ClassLoader classLoader) {
        Class<?> cls;
        if (classLoader == null) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e10) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Provider ");
                stringBuffer.append(str);
                stringBuffer.append(" not found");
                throw new a(stringBuffer.toString(), e10);
            } catch (Exception e11) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Provider ");
                stringBuffer2.append(str);
                stringBuffer2.append(" could not be instantiated: ");
                stringBuffer2.append(e11);
                throw new a(stringBuffer2.toString(), e11);
            }
        } else {
            cls = classLoader.loadClass(str);
        }
        return cls.newInstance();
    }
}
