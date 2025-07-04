package HR5vAalpgOKVm2T0Gq;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class ao3wqKm5CXFuvC0q47 implements DialogInterface.OnClickListener {
    public static ao3wqKm5CXFuvC0q47 HJFh0TGMpafqLE9haL(aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, Intent intent, int i) {
        return new THTDvPxsHqMeGb512f(intent, tCyPEKSzIyweCN5yp1, 2);
    }

    public static ao3wqKm5CXFuvC0q47 s3fjYDxWOUexjjVgyA(Activity activity, Intent intent, int i) {
        return new WWC27LAMFqFFBzfbNw(intent, activity, i);
    }

    public abstract void lEeR5KfoEr4xU5yHH7();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            lEeR5KfoEr4xU5yHH7();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
