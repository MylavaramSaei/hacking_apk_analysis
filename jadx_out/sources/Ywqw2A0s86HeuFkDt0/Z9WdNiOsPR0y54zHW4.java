package Ywqw2A0s86HeuFkDt0;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Z9WdNiOsPR0y54zHW4 extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return e54J8UWNHWALQNixXM.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return e54J8UWNHWALQNixXM.class;
    }
}
