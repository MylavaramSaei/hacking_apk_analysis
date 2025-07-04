package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: androidx.profileinstaller.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0049lEeR5KfoEr4xU5yHH7 {
        public static File lEeR5KfoEr4xU5yHH7(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean lEeR5KfoEr4xU5yHH7(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = lEeR5KfoEr4xU5yHH7(file2) && z;
        }
        return z;
    }

    public static void s3fjYDxWOUexjjVgyA(Context context, ProfileInstallReceiver.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7(C0049lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context)) ? 14 : 15, null);
    }
}
