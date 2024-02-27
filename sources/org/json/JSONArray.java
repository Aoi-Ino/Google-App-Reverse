package org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class JSONArray {
    private ArrayList myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList();
    }

    public Object get(int i10) throws JSONException {
        Object opt = opt(i10);
        if (opt != null) {
            return opt;
        }
        throw new JSONException("JSONArray[" + i10 + "] not found.");
    }

    public boolean getBoolean(int i10) throws JSONException {
        Object obj = get(i10);
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
        throw new JSONException("JSONArray[" + i10 + "] is not a boolean.");
    }

    public double getDouble(int i10) throws JSONException {
        Object obj = get(i10);
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble((String) obj);
        } catch (Exception unused) {
            throw new JSONException("JSONArray[" + i10 + "] is not a number.");
        }
    }

    public int getInt(int i10) throws JSONException {
        Object obj = get(i10);
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt((String) obj);
        } catch (Exception unused) {
            throw new JSONException("JSONArray[" + i10 + "] is not a number.");
        }
    }

    public JSONArray getJSONArray(int i10) throws JSONException {
        Object obj = get(i10);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONArray[" + i10 + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(int i10) throws JSONException {
        Object obj = get(i10);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONArray[" + i10 + "] is not a JSONObject.");
    }

    public long getLong(int i10) throws JSONException {
        Object obj = get(i10);
        try {
            return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong((String) obj);
        } catch (Exception unused) {
            throw new JSONException("JSONArray[" + i10 + "] is not a number.");
        }
    }

    public String getString(int i10) throws JSONException {
        Object obj = get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new JSONException("JSONArray[" + i10 + "] not a string.");
    }

    public boolean isNull(int i10) {
        return JSONObject.NULL.equals(opt(i10));
    }

    public String join(String str) throws JSONException {
        int length = length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(i10)));
        }
        return stringBuffer.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            return null;
        }
        return this.myArrayList.get(i10);
    }

    public boolean optBoolean(int i10) {
        return optBoolean(i10, false);
    }

    public double optDouble(int i10) {
        return optDouble(i10, Double.NaN);
    }

    public int optInt(int i10) {
        return optInt(i10, 0);
    }

    public JSONArray optJSONArray(int i10) {
        Object opt = opt(i10);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i10) {
        Object opt = opt(i10);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public long optLong(int i10) {
        return optLong(i10, 0);
    }

    public String optString(int i10) {
        return optString(i10, "");
    }

    public JSONArray put(double d10) throws JSONException {
        Double d11 = new Double(d10);
        JSONObject.testValidity(d11);
        put((Object) d11);
        return this;
    }

    public Object remove(int i10) {
        Object opt = opt(i10);
        this.myArrayList.remove(i10);
        return opt;
    }

    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0 || length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONObject.put(jSONArray.getString(i10), opt(i10));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return '[' + join(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public Writer write(Writer writer) throws JSONException {
        try {
            int length = length();
            writer.write(91);
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                if (z10) {
                    writer.write(44);
                }
                Object obj = this.myArrayList.get(i10);
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).write(writer);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).write(writer);
                } else {
                    writer.write(JSONObject.valueToString(obj));
                }
                i10++;
                z10 = true;
            }
            writer.write(93);
            return writer;
        } catch (IOException e10) {
            throw new JSONException((Throwable) e10);
        }
    }

    public JSONArray(Object obj) throws JSONException {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                put(JSONObject.wrap(Array.get(obj, i10)));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }

    public boolean optBoolean(int i10, boolean z10) {
        try {
            return getBoolean(i10);
        } catch (Exception unused) {
            return z10;
        }
    }

    public double optDouble(int i10, double d10) {
        try {
            return getDouble(i10);
        } catch (Exception unused) {
            return d10;
        }
    }

    public int optInt(int i10, int i11) {
        try {
            return getInt(i10);
        } catch (Exception unused) {
            return i11;
        }
    }

    public long optLong(int i10, long j10) {
        try {
            return getLong(i10);
        } catch (Exception unused) {
            return j10;
        }
    }

    public String optString(int i10, String str) {
        Object opt = opt(i10);
        return opt != null ? opt.toString() : str;
    }

    public JSONArray put(int i10) {
        put((Object) new Integer(i10));
        return this;
    }

    public String toString(int i10) throws JSONException {
        return toString(i10, 0);
    }

    public JSONArray(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONArray put(int i10, double d10) throws JSONException {
        put(i10, (Object) new Double(d10));
        return this;
    }

    /* access modifiers changed from: package-private */
    public String toString(int i10, int i11) throws JSONException {
        int length = length();
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        if (length == 1) {
            stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(0), i10, i11));
        } else {
            int i12 = i11 + i10;
            stringBuffer.append(10);
            for (int i13 = 0; i13 < length; i13++) {
                if (i13 > 0) {
                    stringBuffer.append(",\n");
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    stringBuffer.append(' ');
                }
                stringBuffer.append(JSONObject.valueToString(this.myArrayList.get(i13), i10, i12));
            }
            stringBuffer.append(10);
            for (int i15 = 0; i15 < i11; i15++) {
                stringBuffer.append(' ');
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public JSONArray(Collection collection) {
        this.myArrayList = new ArrayList();
        if (collection != null) {
            for (Object wrap : collection) {
                this.myArrayList.add(JSONObject.wrap(wrap));
            }
        }
    }

    public JSONArray put(int i10, int i11) throws JSONException {
        put(i10, (Object) new Integer(i11));
        return this;
    }

    public JSONArray(JSONTokener jSONTokener) throws JSONException {
        this();
        ArrayList arrayList;
        Object nextValue;
        if (jSONTokener.nextClean() != '[') {
            throw jSONTokener.syntaxError("A JSONArray text must start with '['");
        } else if (jSONTokener.nextClean() != ']') {
            do {
                jSONTokener.back();
                char nextClean = jSONTokener.nextClean();
                jSONTokener.back();
                if (nextClean == ',') {
                    arrayList = this.myArrayList;
                    nextValue = JSONObject.NULL;
                } else {
                    arrayList = this.myArrayList;
                    nextValue = jSONTokener.nextValue();
                }
                arrayList.add(nextValue);
                char nextClean2 = jSONTokener.nextClean();
                if (nextClean2 != ',' && nextClean2 != ';') {
                    if (nextClean2 != ']') {
                        throw jSONTokener.syntaxError("Expected a ',' or ']'");
                    }
                    return;
                }
            } while (jSONTokener.nextClean() != ']');
        }
    }

    public JSONArray put(int i10, long j10) throws JSONException {
        put(i10, (Object) new Long(j10));
        return this;
    }

    public JSONArray put(int i10, Object obj) throws JSONException {
        JSONObject.testValidity(obj);
        if (i10 >= 0) {
            if (i10 < length()) {
                this.myArrayList.set(i10, obj);
            } else {
                while (i10 != length()) {
                    put(JSONObject.NULL);
                }
                put(obj);
            }
            return this;
        }
        throw new JSONException("JSONArray[" + i10 + "] not found.");
    }

    public JSONArray put(int i10, Collection collection) throws JSONException {
        put(i10, (Object) new JSONArray(collection));
        return this;
    }

    public JSONArray put(int i10, Map map) throws JSONException {
        put(i10, (Object) new JSONObject(map));
        return this;
    }

    public JSONArray put(int i10, boolean z10) throws JSONException {
        put(i10, (Object) z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONArray put(long j10) {
        put((Object) new Long(j10));
        return this;
    }

    public JSONArray put(Object obj) {
        this.myArrayList.add(obj);
        return this;
    }

    public JSONArray put(Collection collection) {
        put((Object) new JSONArray(collection));
        return this;
    }

    public JSONArray put(Map map) {
        put((Object) new JSONObject(map));
        return this;
    }

    public JSONArray put(boolean z10) {
        put((Object) z10 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }
}
