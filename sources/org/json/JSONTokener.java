package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class JSONTokener {
    private int character;
    private boolean eof;
    private int index;
    private int line;
    private char previous;
    private Reader reader;
    private boolean usePrevious;

    public JSONTokener(InputStream inputStream) throws JSONException {
        this((Reader) new InputStreamReader(inputStream));
    }

    public static int dehexchar(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    public void back() throws JSONException {
        int i10;
        if (this.usePrevious || (i10 = this.index) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.index = i10 - 1;
        this.character--;
        this.usePrevious = true;
        this.eof = false;
    }

    public boolean end() {
        return this.eof && !this.usePrevious;
    }

    public boolean more() throws JSONException {
        next();
        if (end()) {
            return false;
        }
        back();
        return true;
    }

    public char next() throws JSONException {
        int i10;
        int i11 = 0;
        if (this.usePrevious) {
            this.usePrevious = false;
            i10 = this.previous;
        } else {
            try {
                i10 = this.reader.read();
                if (i10 <= 0) {
                    this.eof = true;
                    i10 = 0;
                }
            } catch (IOException e10) {
                throw new JSONException((Throwable) e10);
            }
        }
        this.index++;
        if (this.previous == 13) {
            this.line++;
            if (i10 != 10) {
                i11 = 1;
            }
        } else if (i10 == 10) {
            this.line++;
        } else {
            i11 = this.character + 1;
        }
        this.character = i11;
        char c10 = (char) i10;
        this.previous = c10;
        return c10;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public char nextClean() throws org.json.JSONException {
        /*
            r2 = this;
        L_0x0000:
            char r0 = r2.next()
            if (r0 == 0) goto L_0x000a
            r1 = 32
            if (r0 <= r1) goto L_0x0000
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONTokener.nextClean():char");
    }

    public String nextString(char c10) throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            char next = next();
            if (next != 0 && next != 10 && next != 13) {
                if (next == '\\') {
                    next = next();
                    if (!(next == '\"' || next == '\'' || next == '/' || next == '\\')) {
                        if (next == 'b') {
                            next = 8;
                        } else if (next == 'f') {
                            next = 12;
                        } else if (next == 'n') {
                            stringBuffer.append(10);
                        } else if (next == 'r') {
                            stringBuffer.append(13);
                        } else if (next == 't') {
                            next = 9;
                        } else if (next == 'u') {
                            next = (char) Integer.parseInt(next(4), 16);
                        } else {
                            throw syntaxError("Illegal escape.");
                        }
                    }
                } else if (next == c10) {
                    return stringBuffer.toString();
                }
                stringBuffer.append(next);
            }
        }
        throw syntaxError("Unterminated string");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String nextTo(char r4) throws org.json.JSONException {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            char r1 = r3.next()
            if (r1 == r4) goto L_0x001a
            if (r1 == 0) goto L_0x001a
            r2 = 10
            if (r1 == r2) goto L_0x001a
            r2 = 13
            if (r1 != r2) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            r0.append(r1)
            goto L_0x0005
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            r3.back()
        L_0x001f:
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.trim()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONTokener.nextTo(char):java.lang.String");
    }

    public Object nextValue() throws JSONException {
        char nextClean = nextClean();
        if (nextClean == '\"' || nextClean == '\'') {
            return nextString(nextClean);
        }
        if (nextClean == '[') {
            back();
            return new JSONArray(this);
        } else if (nextClean != '{') {
            StringBuffer stringBuffer = new StringBuffer();
            while (nextClean >= ' ' && ",:]}/\\\"[{;=#".indexOf(nextClean) < 0) {
                stringBuffer.append(nextClean);
                nextClean = next();
            }
            back();
            String trim = stringBuffer.toString().trim();
            if (!trim.equals("")) {
                return JSONObject.stringToValue(trim);
            }
            throw syntaxError("Missing value");
        } else {
            back();
            return new JSONObject(this);
        }
    }

    public char skipTo(char c10) throws JSONException {
        char next;
        try {
            int i10 = this.index;
            int i11 = this.character;
            int i12 = this.line;
            this.reader.mark(Integer.MAX_VALUE);
            do {
                next = next();
                if (next == 0) {
                    this.reader.reset();
                    this.index = i10;
                    this.character = i11;
                    this.line = i12;
                    return next;
                }
            } while (next != c10);
            back();
            return next;
        } catch (IOException e10) {
            throw new JSONException((Throwable) e10);
        }
    }

    public JSONException syntaxError(String str) {
        return new JSONException(str + toString());
    }

    public String toString() {
        return " at " + this.index + " [character " + this.character + " line " + this.line + "]";
    }

    public JSONTokener(Reader reader2) {
        this.reader = !reader2.markSupported() ? new BufferedReader(reader2) : reader2;
        this.eof = false;
        this.usePrevious = false;
        this.previous = 0;
        this.index = 0;
        this.character = 1;
        this.line = 1;
    }

    public char next(char c10) throws JSONException {
        char next = next();
        if (next == c10) {
            return next;
        }
        throw syntaxError("Expected '" + c10 + "' and instead saw '" + next + "'");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String nextTo(java.lang.String r4) throws org.json.JSONException {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            char r1 = r3.next()
            int r2 = r4.indexOf(r1)
            if (r2 >= 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            r2 = 10
            if (r1 == r2) goto L_0x001e
            r2 = 13
            if (r1 != r2) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            r0.append(r1)
            goto L_0x0005
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r3.back()
        L_0x0023:
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.trim()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONTokener.nextTo(java.lang.String):java.lang.String");
    }

    public JSONTokener(String str) {
        this((Reader) new StringReader(str));
    }

    public String next(int i10) throws JSONException {
        if (i10 == 0) {
            return "";
        }
        char[] cArr = new char[i10];
        int i11 = 0;
        while (i11 < i10) {
            cArr[i11] = next();
            if (!end()) {
                i11++;
            } else {
                throw syntaxError("Substring bounds error");
            }
        }
        return new String(cArr);
    }
}
