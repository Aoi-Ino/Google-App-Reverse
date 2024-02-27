package gl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import gl.t;
import gl.y;
import java.io.InputStream;

class f extends y {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f23830b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f23831a;

    private static class a {
        static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f23830b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    f(Context context) {
        this.f23831a = context;
    }

    private InputStream j(w wVar) {
        ContentResolver contentResolver = this.f23831a.getContentResolver();
        Uri uri = wVar.f23945d;
        int match = f23830b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return a.a(contentResolver, uri);
    }

    public boolean c(w wVar) {
        Uri uri = wVar.f23945d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f23830b.match(wVar.f23945d) != -1;
    }

    public y.a f(w wVar, int i10) {
        InputStream j10 = j(wVar);
        if (j10 != null) {
            return new y.a(j10, t.e.DISK);
        }
        return null;
    }
}
