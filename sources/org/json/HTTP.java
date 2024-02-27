package org.json;

import java.util.Iterator;

public class HTTP {
    public static final String CRLF = "\r\n";

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject toJSONObject(java.lang.String r5) throws org.json.JSONException {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.HTTPTokener r1 = new org.json.HTTPTokener
            r1.<init>(r5)
            java.lang.String r5 = r1.nextToken()
            java.lang.String r2 = r5.toUpperCase()
            java.lang.String r3 = "HTTP"
            boolean r2 = r2.startsWith(r3)
            r3 = 0
            java.lang.String r4 = "HTTP-Version"
            if (r2 == 0) goto L_0x0036
            r0.put((java.lang.String) r4, (java.lang.Object) r5)
            java.lang.String r5 = "Status-Code"
            java.lang.String r2 = r1.nextToken()
            r0.put((java.lang.String) r5, (java.lang.Object) r2)
            java.lang.String r5 = "Reason-Phrase"
            java.lang.String r2 = r1.nextTo((char) r3)
            r0.put((java.lang.String) r5, (java.lang.Object) r2)
        L_0x0032:
            r1.next()
            goto L_0x004b
        L_0x0036:
            java.lang.String r2 = "Method"
            r0.put((java.lang.String) r2, (java.lang.Object) r5)
            java.lang.String r5 = "Request-URI"
            java.lang.String r2 = r1.nextToken()
            r0.put((java.lang.String) r5, (java.lang.Object) r2)
            java.lang.String r5 = r1.nextToken()
            r0.put((java.lang.String) r4, (java.lang.Object) r5)
        L_0x004b:
            boolean r5 = r1.more()
            if (r5 == 0) goto L_0x0062
            r5 = 58
            java.lang.String r2 = r1.nextTo((char) r5)
            r1.next((char) r5)
            java.lang.String r5 = r1.nextTo((char) r3)
            r0.put((java.lang.String) r2, (java.lang.Object) r5)
            goto L_0x0032
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.HTTP.toJSONObject(java.lang.String):org.json.JSONObject");
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        String string;
        Iterator keys = jSONObject.keys();
        StringBuffer stringBuffer = new StringBuffer();
        if (jSONObject.has("Status-Code") && jSONObject.has("Reason-Phrase")) {
            stringBuffer.append(jSONObject.getString("HTTP-Version"));
            stringBuffer.append(' ');
            stringBuffer.append(jSONObject.getString("Status-Code"));
            stringBuffer.append(' ');
            string = jSONObject.getString("Reason-Phrase");
        } else if (!jSONObject.has("Method") || !jSONObject.has("Request-URI")) {
            throw new JSONException("Not enough material for an HTTP header.");
        } else {
            stringBuffer.append(jSONObject.getString("Method"));
            stringBuffer.append(' ');
            stringBuffer.append('\"');
            stringBuffer.append(jSONObject.getString("Request-URI"));
            stringBuffer.append('\"');
            stringBuffer.append(' ');
            string = jSONObject.getString("HTTP-Version");
        }
        stringBuffer.append(string);
        while (true) {
            stringBuffer.append(CRLF);
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                if (!obj.equals("HTTP-Version") && !obj.equals("Status-Code") && !obj.equals("Reason-Phrase") && !obj.equals("Method") && !obj.equals("Request-URI") && !jSONObject.isNull(obj)) {
                    stringBuffer.append(obj);
                    stringBuffer.append(": ");
                    stringBuffer.append(jSONObject.getString(obj));
                }
            }
            stringBuffer.append(CRLF);
            return stringBuffer.toString();
        }
    }
}
