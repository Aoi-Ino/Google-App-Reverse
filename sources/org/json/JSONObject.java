package org.json;

import f.j;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class JSONObject {
    public static final Object NULL = new Null();
    private Map map;

    private static final class Null {
        private Null() {
        }

        /* access modifiers changed from: protected */
        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return "null";
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public static String doubleToString(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            return "null";
        }
        String d11 = Double.toString(d10);
        if (d11.indexOf(46) <= 0 || d11.indexOf(101) >= 0 || d11.indexOf(69) >= 0) {
            return d11;
        }
        while (d11.endsWith("0")) {
            d11 = d11.substring(0, d11.length() - 1);
        }
        return d11.endsWith(".") ? d11.substring(0, d11.length() - 1) : d11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r4 = r4.getClass().getFields();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getNames(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class r4 = r4.getClass()
            java.lang.reflect.Field[] r4 = r4.getFields()
            int r1 = r4.length
            if (r1 != 0) goto L_0x0010
            return r0
        L_0x0010:
            java.lang.String[] r0 = new java.lang.String[r1]
            r2 = 0
        L_0x0013:
            if (r2 >= r1) goto L_0x0020
            r3 = r4[r2]
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONObject.getNames(java.lang.Object):java.lang.String[]");
    }

    public static String numberToString(Number number) throws JSONException {
        if (number != null) {
            testValidity(number);
            String obj = number.toString();
            if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
                return obj;
            }
            while (obj.endsWith("0")) {
                obj = obj.substring(0, obj.length() - 1);
            }
            return obj.endsWith(".") ? obj.substring(0, obj.length() - 1) : obj;
        }
        throw new JSONException("Null pointer");
    }

    private void populateMap(Object obj) {
        Class<?> cls = obj.getClass();
        Method[] methods = cls.getClassLoader() != null ? cls.getMethods() : cls.getDeclaredMethods();
        for (int i10 = 0; i10 < methods.length; i10++) {
            try {
                Method method = methods[i10];
                if (Modifier.isPublic(method.getModifiers())) {
                    String name = method.getName();
                    String str = "";
                    if (name.startsWith("get")) {
                        if (!name.equals("getClass")) {
                            if (!name.equals("getDeclaringClass")) {
                                str = name.substring(3);
                            }
                        }
                    } else if (name.startsWith("is")) {
                        str = name.substring(2);
                    }
                    if (str.length() > 0 && Character.isUpperCase(str.charAt(0)) && method.getParameterTypes().length == 0) {
                        if (str.length() == 1) {
                            str = str.toLowerCase();
                        } else if (!Character.isUpperCase(str.charAt(1))) {
                            str = str.substring(0, 1).toLowerCase() + str.substring(1);
                        }
                        Object invoke = method.invoke(obj, (Object[]) null);
                        if (invoke != null) {
                            this.map.put(str, wrap(invoke));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r4 == '<') goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String quote(java.lang.String r8) {
        /*
            if (r8 == 0) goto L_0x00a8
            int r0 = r8.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00a8
        L_0x000a:
            int r0 = r8.length()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            int r2 = r0 + 4
            r1.<init>(r2)
            r2 = 34
            r1.append(r2)
            r3 = 0
            r4 = r3
        L_0x001c:
            if (r3 >= r0) goto L_0x00a0
            char r5 = r8.charAt(r3)
            r6 = 12
            if (r5 == r6) goto L_0x0098
            r6 = 13
            if (r5 == r6) goto L_0x0095
            r6 = 92
            if (r5 == r2) goto L_0x0091
            r7 = 47
            if (r5 == r7) goto L_0x008d
            if (r5 == r6) goto L_0x0091
            switch(r5) {
                case 8: goto L_0x008a;
                case 9: goto L_0x0087;
                case 10: goto L_0x0084;
                default: goto L_0x0037;
            }
        L_0x0037:
            r4 = 32
            if (r5 < r4) goto L_0x0050
            r4 = 128(0x80, float:1.794E-43)
            if (r5 < r4) goto L_0x0043
            r4 = 160(0xa0, float:2.24E-43)
            if (r5 < r4) goto L_0x0050
        L_0x0043:
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r5 < r4) goto L_0x004c
            r4 = 8448(0x2100, float:1.1838E-41)
            if (r5 >= r4) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            r1.append(r5)
            goto L_0x009b
        L_0x0050:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "000"
            r4.append(r6)
            java.lang.String r6 = java.lang.Integer.toHexString(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "\\u"
            r6.append(r7)
            int r7 = r4.length()
            int r7 = r7 + -4
            java.lang.String r4 = r4.substring(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
        L_0x0080:
            r1.append(r4)
            goto L_0x009b
        L_0x0084:
            java.lang.String r4 = "\\n"
            goto L_0x0080
        L_0x0087:
            java.lang.String r4 = "\\t"
            goto L_0x0080
        L_0x008a:
            java.lang.String r4 = "\\b"
            goto L_0x0080
        L_0x008d:
            r7 = 60
            if (r4 != r7) goto L_0x004c
        L_0x0091:
            r1.append(r6)
            goto L_0x004c
        L_0x0095:
            java.lang.String r4 = "\\r"
            goto L_0x0080
        L_0x0098:
            java.lang.String r4 = "\\f"
            goto L_0x0080
        L_0x009b:
            int r3 = r3 + 1
            r4 = r5
            goto L_0x001c
        L_0x00a0:
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            return r8
        L_0x00a8:
            java.lang.String r8 = "\"\""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONObject.quote(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085 A[Catch:{ Exception -> 0x00a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object stringToValue(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            return r5
        L_0x0009:
            java.lang.String r0 = "true"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L_0x0014:
            java.lang.String r0 = "false"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x001f:
            java.lang.String r0 = "null"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r5 = NULL
            return r5
        L_0x002a:
            r0 = 0
            char r0 = r5.charAt(r0)
            r1 = 46
            r2 = 48
            if (r0 < r2) goto L_0x0039
            r3 = 57
            if (r0 <= r3) goto L_0x0043
        L_0x0039:
            if (r0 == r1) goto L_0x0043
            r3 = 45
            if (r0 == r3) goto L_0x0043
            r3 = 43
            if (r0 != r3) goto L_0x00a6
        L_0x0043:
            if (r0 != r2) goto L_0x006d
            int r0 = r5.length()
            r2 = 2
            if (r0 <= r2) goto L_0x006d
            r0 = 1
            char r3 = r5.charAt(r0)
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L_0x005d
            char r0 = r5.charAt(r0)
            r3 = 88
            if (r0 != r3) goto L_0x006d
        L_0x005d:
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ Exception -> 0x006d }
            java.lang.String r2 = r5.substring(r2)     // Catch:{ Exception -> 0x006d }
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch:{ Exception -> 0x006d }
            r0.<init>(r2)     // Catch:{ Exception -> 0x006d }
            return r0
        L_0x006d:
            int r0 = r5.indexOf(r1)     // Catch:{ Exception -> 0x00a6 }
            r1 = -1
            if (r0 > r1) goto L_0x00a2
            r0 = 101(0x65, float:1.42E-43)
            int r0 = r5.indexOf(r0)     // Catch:{ Exception -> 0x00a6 }
            if (r0 > r1) goto L_0x00a2
            r0 = 69
            int r0 = r5.indexOf(r0)     // Catch:{ Exception -> 0x00a6 }
            if (r0 <= r1) goto L_0x0085
            goto L_0x00a2
        L_0x0085:
            java.lang.Long r0 = new java.lang.Long     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x00a6 }
            long r1 = r0.longValue()     // Catch:{ Exception -> 0x00a6 }
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x00a6 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00a6 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00a1
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ Exception -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00a6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00a6 }
            return r1
        L_0x00a1:
            return r0
        L_0x00a2:
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONObject.stringToValue(java.lang.String):java.lang.Object");
    }

    public static void testValidity(Object obj) throws JSONException {
        if (obj == null) {
            return;
        }
        if (obj instanceof Double) {
            Double d10 = (Double) obj;
            if (d10.isInfinite() || d10.isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        } else if (obj instanceof Float) {
            Float f10 = (Float) obj;
            if (f10.isInfinite() || f10.isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }

    public static String valueToString(Object obj) throws JSONException {
        if (obj == null || obj.equals((Object) null)) {
            return "null";
        }
        if (obj instanceof JSONString) {
            try {
                String jSONString = ((JSONString) obj).toJSONString();
                if (jSONString instanceof String) {
                    return jSONString;
                }
                throw new JSONException("Bad value from toJSONString: " + jSONString);
            } catch (Exception e10) {
                throw new JSONException((Throwable) e10);
            }
        } else if (obj instanceof Number) {
            return numberToString((Number) obj);
        } else {
            if ((obj instanceof Boolean) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                return obj.toString();
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj).toString();
            }
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj).toString();
            }
            return obj.getClass().isArray() ? new JSONArray(obj).toString() : quote(obj.toString());
        }
    }

    public static Object wrap(Object obj) {
        if (obj == null) {
            try {
                return NULL;
            } catch (Exception unused) {
                return null;
            }
        } else if ((obj instanceof JSONObject) || (obj instanceof JSONArray) || NULL.equals(obj) || (obj instanceof JSONString) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double)) {
            return obj;
        } else {
            if (obj instanceof String) {
                return obj;
            }
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            Package packageR = obj.getClass().getPackage();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.startsWith("java.") && !name.startsWith("javax.")) {
                if (obj.getClass().getClassLoader() != null) {
                    return new JSONObject(obj);
                }
            }
            return obj.toString();
        }
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        JSONArray jSONArray;
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            if (obj instanceof JSONArray) {
                jSONArray = new JSONArray();
                obj = jSONArray.put(obj);
            }
        } else if (opt instanceof JSONArray) {
            ((JSONArray) opt).put(obj);
            return this;
        } else {
            jSONArray = new JSONArray().put(opt);
            obj = jSONArray.put(obj);
        }
        put(str, obj);
        return this;
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        JSONArray jSONArray;
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            jSONArray = new JSONArray();
        } else if (opt instanceof JSONArray) {
            jSONArray = (JSONArray) opt;
        } else {
            throw new JSONException("JSONObject[" + str + "] is not a JSONArray.");
        }
        put(str, (Object) jSONArray.put(obj));
        return this;
    }

    public Object get(String str) throws JSONException {
        if (str != null) {
            Object opt = opt(str);
            if (opt != null) {
                return opt;
            }
            throw new JSONException("JSONObject[" + quote(str) + "] not found.");
        }
        throw new JSONException("Null key.");
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z10 = obj instanceof String;
        if (z10 && ((String) obj).equalsIgnoreCase("false")) {
            return false;
        }
        if (obj.equals(Boolean.TRUE)) {
            return true;
        }
        if (z10 && ((String) obj).equalsIgnoreCase("true")) {
            return true;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a Boolean.");
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble((String) obj);
        } catch (Exception unused) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a number.");
        }
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt((String) obj);
        } catch (Exception unused) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not an int.");
        }
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONObject.");
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong((String) obj);
        } catch (Exception unused) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a long.");
        }
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] not a string.");
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public JSONObject increment(String str) throws JSONException {
        double floatValue;
        Object opt = opt(str);
        if (opt == null) {
            put(str, 1);
        } else if (opt instanceof Integer) {
            put(str, ((Integer) opt).intValue() + 1);
        } else if (opt instanceof Long) {
            put(str, ((Long) opt).longValue() + 1);
        } else {
            if (opt instanceof Double) {
                floatValue = ((Double) opt).doubleValue() + 1.0d;
            } else if (opt instanceof Float) {
                floatValue = (double) (((Float) opt).floatValue() + 1.0f);
            } else {
                throw new JSONException("Unable to increment [" + quote(str) + "].");
            }
            put(str, floatValue);
        }
        return this;
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Iterator keys() {
        return this.map.keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        JSONArray jSONArray = new JSONArray();
        Iterator keys = keys();
        while (keys.hasNext()) {
            jSONArray.put(keys.next());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public JSONArray optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public long optLong(String str) {
        return optLong(str, 0);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public JSONObject put(String str, double d10) throws JSONException {
        put(str, (Object) new Double(d10));
        return this;
    }

    public JSONObject putOnce(String str, Object obj) throws JSONException {
        if (!(str == null || obj == null)) {
            if (opt(str) == null) {
                put(str, obj);
            } else {
                throw new JSONException("Duplicate key \"" + str + "\"");
            }
        }
        return this;
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        if (!(str == null || obj == null)) {
            put(str, obj);
        }
        return this;
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONArray2.put(opt(jSONArray.getString(i10)));
        }
        return jSONArray2;
    }

    public String toString() {
        try {
            Iterator keys = keys();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (keys.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = keys.next();
                stringBuffer.append(quote(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(valueToString(this.map.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public Writer write(Writer writer) throws JSONException {
        try {
            Iterator keys = keys();
            writer.write(123);
            boolean z10 = false;
            while (keys.hasNext()) {
                if (z10) {
                    writer.write(44);
                }
                Object next = keys.next();
                writer.write(quote(next.toString()));
                writer.write(58);
                Object obj = this.map.get(next);
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).write(writer);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).write(writer);
                } else {
                    writer.write(valueToString(obj));
                }
                z10 = true;
            }
            writer.write(j.L0);
            return writer;
        } catch (IOException e10) {
            throw new JSONException((Throwable) e10);
        }
    }

    public JSONObject(Object obj) {
        this();
        populateMap(obj);
    }

    public static String[] getNames(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length == 0) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        String[] strArr = new String[length];
        int i10 = 0;
        while (keys.hasNext()) {
            strArr[i10] = (String) keys.next();
            i10++;
        }
        return strArr;
    }

    static String valueToString(Object obj, int i10, int i11) throws JSONException {
        if (obj == null || obj.equals((Object) null)) {
            return "null";
        }
        try {
            if (obj instanceof JSONString) {
                String jSONString = ((JSONString) obj).toJSONString();
                if (jSONString instanceof String) {
                    return jSONString;
                }
            }
        } catch (Exception unused) {
        }
        if (obj instanceof Number) {
            return numberToString((Number) obj);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).toString(i10, i11);
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).toString(i10, i11);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString(i10, i11);
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj).toString(i10, i11);
        }
        return obj.getClass().isArray() ? new JSONArray(obj).toString(i10, i11) : quote(obj.toString());
    }

    public boolean optBoolean(String str, boolean z10) {
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z10;
        }
    }

    public double optDouble(String str, double d10) {
        try {
            return getDouble(str);
        } catch (Exception unused) {
            return d10;
        }
    }

    public int optInt(String str, int i10) {
        try {
            return getInt(str);
        } catch (Exception unused) {
            return i10;
        }
    }

    public long optLong(String str, long j10) {
        try {
            return getLong(str);
        } catch (Exception unused) {
            return j10;
        }
    }

    public String optString(String str, String str2) {
        Object opt = opt(str);
        return NULL.equals(opt) ? str2 : opt.toString();
    }

    public JSONObject put(String str, int i10) throws JSONException {
        put(str, (Object) new Integer(i10));
        return this;
    }

    public String toString(int i10) throws JSONException {
        return toString(i10, 0);
    }

    public JSONObject(Object obj, String[] strArr) {
        this();
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject put(String str, long j10) throws JSONException {
        put(str, (Object) new Long(j10));
        return this;
    }

    /* access modifiers changed from: package-private */
    public String toString(int i10, int i11) throws JSONException {
        int i12;
        int length = length();
        if (length == 0) {
            return "{}";
        }
        Iterator keys = keys();
        int i13 = i11 + i10;
        StringBuffer stringBuffer = new StringBuffer("{");
        if (length == 1) {
            Object next = keys.next();
            stringBuffer.append(quote(next.toString()));
            stringBuffer.append(": ");
            stringBuffer.append(valueToString(this.map.get(next), i10, i11));
        } else {
            while (true) {
                i12 = 0;
                if (!keys.hasNext()) {
                    break;
                }
                Object next2 = keys.next();
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(",\n");
                } else {
                    stringBuffer.append(10);
                }
                while (i12 < i13) {
                    stringBuffer.append(' ');
                    i12++;
                }
                stringBuffer.append(quote(next2.toString()));
                stringBuffer.append(": ");
                stringBuffer.append(valueToString(this.map.get(next2), i10, i13));
            }
            if (stringBuffer.length() > 1) {
                stringBuffer.append(10);
                while (i12 < i11) {
                    stringBuffer.append(' ');
                    i12++;
                }
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str != null) {
            if (obj != null) {
                testValidity(obj);
                this.map.put(str, obj);
            } else {
                remove(str);
            }
            return this;
        }
        throw new JSONException("Null key.");
    }

    public JSONObject(String str, Locale locale) throws JSONException {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            if (nextElement instanceof String) {
                String str2 = nextElement;
                String[] split = str2.split("\\.");
                int length = split.length - 1;
                JSONObject jSONObject = this;
                for (int i10 = 0; i10 < length; i10++) {
                    String str3 = split[i10];
                    JSONObject optJSONObject = jSONObject.optJSONObject(str3);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(str3, (Object) optJSONObject);
                    }
                    jSONObject = optJSONObject;
                }
                jSONObject.put(split[length], (Object) bundle.getString(str2));
            }
        }
    }

    public JSONObject put(String str, Collection collection) throws JSONException {
        put(str, (Object) new JSONArray(collection));
        return this;
    }

    public JSONObject(Map map2) {
        this.map = new HashMap();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    this.map.put(entry.getKey(), wrap(value));
                }
            }
        }
    }

    public JSONObject put(String str, Map map2) throws JSONException {
        put(str, (Object) new JSONObject(map2));
        return this;
    }

    public JSONObject(JSONObject jSONObject, String[] strArr) {
        this();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                String str = strArr[i10];
                putOnce(str, jSONObject.opt(str));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject put(String str, boolean z10) throws JSONException {
        put(str, (Object) z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() == '{') {
            while (true) {
                char nextClean = jSONTokener.nextClean();
                if (nextClean == 0) {
                    throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
                } else if (nextClean != '}') {
                    jSONTokener.back();
                    String obj = jSONTokener.nextValue().toString();
                    char nextClean2 = jSONTokener.nextClean();
                    if (nextClean2 == '=') {
                        if (jSONTokener.next() != '>') {
                            jSONTokener.back();
                        }
                    } else if (nextClean2 != ':') {
                        throw jSONTokener.syntaxError("Expected a ':' after a key");
                    }
                    putOnce(obj, jSONTokener.nextValue());
                    char nextClean3 = jSONTokener.nextClean();
                    if (nextClean3 == ',' || nextClean3 == ';') {
                        if (jSONTokener.nextClean() != '}') {
                            jSONTokener.back();
                        } else {
                            return;
                        }
                    } else if (nextClean3 != '}') {
                        throw jSONTokener.syntaxError("Expected a ',' or '}'");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
        }
    }
}
