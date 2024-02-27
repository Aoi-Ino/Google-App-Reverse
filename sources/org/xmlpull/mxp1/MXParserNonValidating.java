package org.xmlpull.mxp1;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MXParserNonValidating extends MXParserCachingStrings {
    private boolean processDocDecl;

    public boolean getFeature(String str) {
        return XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str) ? this.processDocDecl : super.getFeature(str);
    }

    /* access modifiers changed from: protected */
    public char[] lookuEntityReplacement(int i10) throws XmlPullParserException, IOException {
        if (!this.allStringsInterned) {
            char[] cArr = this.buf;
            int i11 = this.posStart;
            int fastHash = MXParser.fastHash(cArr, i11, this.posEnd - i11);
            for (int i12 = this.entityEnd - 1; i12 >= 0; i12--) {
                if (fastHash == this.entityNameHash[i12]) {
                    char[] cArr2 = this.entityNameBuf[i12];
                    if (i10 == cArr2.length) {
                        int i13 = 0;
                        while (i13 < i10) {
                            if (this.buf[this.posStart + i13] == cArr2[i13]) {
                                i13++;
                            }
                        }
                        if (this.tokenize) {
                            this.text = this.entityReplacement[i12];
                        }
                        return this.entityReplacementBuf[i12];
                    }
                    continue;
                }
            }
            return null;
        }
        char[] cArr3 = this.buf;
        int i14 = this.posStart;
        this.entityRefName = newString(cArr3, i14, this.posEnd - i14);
        for (int i15 = this.entityEnd - 1; i15 >= 0; i15--) {
            if (this.entityRefName == this.entityName[i15]) {
                if (this.tokenize) {
                    this.text = this.entityReplacement[i15];
                }
                return this.entityReplacementBuf[i15];
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public char more() throws IOException, XmlPullParserException {
        return super.more();
    }

    /* access modifiers changed from: protected */
    public void parseDocdecl() throws XmlPullParserException, IOException {
        boolean z10 = this.tokenize;
        try {
            if (more() != 'O') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
            } else if (more() != 'C') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
            } else if (more() != 'T') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
            } else if (more() != 'Y') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
            } else if (more() != 'P') {
                throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
            } else if (more() == 'E') {
                this.posStart = this.pos;
                char skipS = skipS(readName(requireNextS()));
                if (skipS == 'S' || skipS == 'P') {
                    skipS = skipS(processExternalId(skipS));
                }
                if (skipS == '[') {
                    processInternalSubset();
                }
                char skipS2 = skipS(skipS);
                if (skipS2 == '>') {
                    this.posEnd = this.pos - 1;
                    this.tokenize = z10;
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected > to finish <[DOCTYPE but got ");
                stringBuffer.append(printable(skipS2));
                throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
            } else {
                throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
            }
        } catch (Throwable th2) {
            this.tokenize = z10;
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void processAttlistDecl(char c10) throws XmlPullParserException, IOException {
    }

    /* access modifiers changed from: protected */
    public void processElementDecl(char c10) throws XmlPullParserException, IOException {
        readName(requireNextS());
        requireNextS();
    }

    /* access modifiers changed from: protected */
    public void processEntityDecl(char c10) throws XmlPullParserException, IOException {
    }

    /* access modifiers changed from: protected */
    public char processExternalId(char c10) throws XmlPullParserException, IOException {
        return c10;
    }

    /* access modifiers changed from: protected */
    public void processInternalSubset() throws XmlPullParserException, IOException {
        while (true) {
            char more = more();
            if (more != ']') {
                if (more == '%') {
                    processPEReference();
                } else if (isS(more)) {
                    skipS(more);
                } else {
                    processMarkupDecl(more);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void processMarkupDecl(char c10) throws XmlPullParserException, IOException {
        if (c10 == '<') {
            char more = more();
            if (more == '?') {
                parsePI();
            } else if (more != '!') {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected markupdecl in DTD not ");
                stringBuffer.append(printable(more));
                throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
            } else if (more() == '-') {
                parseComment();
            } else {
                char more2 = more();
                if (more2 == 'A') {
                    processAttlistDecl(more2);
                } else if (more2 == 'E') {
                    char more3 = more();
                    if (more3 == 'L') {
                        processElementDecl(more3);
                    } else if (more3 == 'N') {
                        processEntityDecl(more3);
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("expected ELEMENT or ENTITY after <! in DTD not ");
                        stringBuffer2.append(printable(more3));
                        throw new XmlPullParserException(stringBuffer2.toString(), this, (Throwable) null);
                    }
                } else if (more2 == 'N') {
                    processNotationDecl(more2);
                } else {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("expected markupdecl after <! in DTD not ");
                    stringBuffer3.append(printable(more2));
                    throw new XmlPullParserException(stringBuffer3.toString(), this, (Throwable) null);
                }
            }
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("expected < for markupdecl in DTD not ");
            stringBuffer4.append(printable(c10));
            throw new XmlPullParserException(stringBuffer4.toString(), this, (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public void processNotationDecl(char c10) throws XmlPullParserException, IOException {
    }

    /* access modifiers changed from: protected */
    public void processPEReference() throws XmlPullParserException, IOException {
    }

    /* access modifiers changed from: protected */
    public char readName(char c10) throws XmlPullParserException, IOException {
        if (!isNameStartChar(c10)) {
            while (isNameChar(c10)) {
                c10 = more();
            }
            return c10;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("XML name must start with name start character not ");
        stringBuffer.append(printable(c10));
        throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
    }

    public void setFeature(String str, boolean z10) throws XmlPullParserException {
        if (!XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str)) {
            super.setFeature(str, z10);
        } else if (this.eventType == 0) {
            this.processDocDecl = z10;
        } else {
            throw new XmlPullParserException("process DOCDECL feature can only be changed before parsing", this, (Throwable) null);
        }
    }
}
