package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import osrHU7fvDp2EgxZPfM.lEeR5KfoEr4xU5yHH7;
import osrHU7fvDp2EgxZPfM.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new zZKhbgvUfsK4AEX3r0("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(context).lEeR5KfoEr4xU5yHH7();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
