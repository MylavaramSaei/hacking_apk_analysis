package f2zPq7MOnQrtOlZ1Zg;

import HR5vAalpgOKVm2T0Gq.VItLRw50eXTZeEfGl0;
import HR5vAalpgOKVm2T0Gq.ao3wqKm5CXFuvC0q47;
import aRQ2M7vtRaPDEyvpdv.XzJ1BS7H9Ilbkv4eVM;
import aRQ2M7vtRaPDEyvpdv.jCtUeU2YI1poCxWcjm;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import xHA29AmDt6y96AnB3t.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public class TCyPEKSzIyweCN5yp1 extends IPyIQcaNa8aB7drBED {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public String f5810HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Object f5808husNiw3snxdgZPAGJm = new Object();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final TCyPEKSzIyweCN5yp1 f5807KYHag8HRDlnO3X9zmZ = new TCyPEKSzIyweCN5yp1();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final int f5809zZKhbgvUfsK4AEX3r0 = IPyIQcaNa8aB7drBED.f5801lEeR5KfoEr4xU5yHH7;

    public static TCyPEKSzIyweCN5yp1 e54J8UWNHWALQNixXM() {
        return f5807KYHag8HRDlnO3X9zmZ;
    }

    public Dialog Acstmh57AKoSEkEFNJ(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return aPyGSIylzVNKPT1Bls(activity, i, ao3wqKm5CXFuvC0q47.s3fjYDxWOUexjjVgyA(activity, lEeR5KfoEr4xU5yHH7(activity, i, "d"), i2), onCancelListener);
    }

    public final boolean G7AC3DWIx9i9fdanjk(Activity activity, aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(activity, i, ao3wqKm5CXFuvC0q47.HJFh0TGMpafqLE9haL(tCyPEKSzIyweCN5yp1, lEeR5KfoEr4xU5yHH7(activity, i, "d"), 2), onCancelListener);
        if (dialogAPyGSIylzVNKPT1Bls == null) {
            return false;
        }
        sTkWmhpZ5b1ArQIw4K(activity, dialogAPyGSIylzVNKPT1Bls, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED
    public int KYHag8HRDlnO3X9zmZ(Context context) {
        return super.KYHag8HRDlnO3X9zmZ(context);
    }

    public final Dialog OANkd3mP6AYvwbNLJM(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(VItLRw50eXTZeEfGl0.zZKhbgvUfsK4AEX3r0(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        sTkWmhpZ5b1ArQIw4K(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final void R9SAhYMerGybF9OAjL(Context context) {
        new T9PhQIpGRhE4yZDm1C(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public boolean T9PhQIpGRhE4yZDm1C(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(activity, i, i2, onCancelListener);
        if (dialogAcstmh57AKoSEkEFNJ == null) {
            return false;
        }
        sTkWmhpZ5b1ArQIw4K(activity, dialogAcstmh57AKoSEkEFNJ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED
    public int TCyPEKSzIyweCN5yp1(Context context, int i) {
        return super.TCyPEKSzIyweCN5yp1(context, i);
    }

    public final void Y43RdunnpKgpbny0lE(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            R9SAhYMerGybF9OAjL(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strKYHag8HRDlnO3X9zmZ = VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ(context, i);
        String strHusNiw3snxdgZPAGJm = VItLRw50eXTZeEfGl0.husNiw3snxdgZPAGJm(context, i);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context.getSystemService("notification"));
        zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm husniw3snxdgzpagjmXHA29AmDt6y96AnB3t = new zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(context).OANkd3mP6AYvwbNLJM(true).husNiw3snxdgZPAGJm(true).Acstmh57AKoSEkEFNJ(strKYHag8HRDlnO3X9zmZ).xHA29AmDt6y96AnB3t(new zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL().IPyIQcaNa8aB7drBED(strHusNiw3snxdgZPAGJm));
        if (fDXXEWvhMVO3O8mnuS.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(context)) {
            HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.e54J8UWNHWALQNixXM(fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0());
            husniw3snxdgzpagjmXHA29AmDt6y96AnB3t.R9SAhYMerGybF9OAjL(context.getApplicationInfo().icon).sTkWmhpZ5b1ArQIw4K(2);
            if (fDXXEWvhMVO3O8mnuS.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(context)) {
                husniw3snxdgzpagjmXHA29AmDt6y96AnB3t.lEeR5KfoEr4xU5yHH7(Er40JrQbOM51vCQI8w.lEeR5KfoEr4xU5yHH7.f89lEeR5KfoEr4xU5yHH7, resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f97aPyGSIylzVNKPT1Bls), pendingIntent);
            } else {
                husniw3snxdgzpagjmXHA29AmDt6y96AnB3t.IPyIQcaNa8aB7drBED(pendingIntent);
            }
        } else {
            husniw3snxdgzpagjmXHA29AmDt6y96AnB3t.R9SAhYMerGybF9OAjL(R.drawable.stat_sys_warning).LIMtzhnLwQyigzK0KO(resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f92IPyIQcaNa8aB7drBED)).WWC27LAMFqFFBzfbNw(System.currentTimeMillis()).IPyIQcaNa8aB7drBED(pendingIntent).pbVGzGjWvY2LDXC8vo(strHusNiw3snxdgZPAGJm);
        }
        if (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1()) {
            HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.e54J8UWNHWALQNixXM(fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1());
            synchronized (f5808husNiw3snxdgZPAGJm) {
                str2 = this.f5810HJFh0TGMpafqLE9haL;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strS3fjYDxWOUexjjVgyA = VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA(context);
                if (notificationChannel == null) {
                    com.example.fcmexpr.keepalive.OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7(notificationManager, com.example.fcmexpr.keepalive.zaq8hOURtfwbcX17cG.lEeR5KfoEr4xU5yHH7("com.google.android.gms.availability", strS3fjYDxWOUexjjVgyA, 4));
                } else if (!strS3fjYDxWOUexjjVgyA.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strS3fjYDxWOUexjjVgyA);
                    com.example.fcmexpr.keepalive.OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7(notificationManager, notificationChannel);
                }
            }
            husniw3snxdgzpagjmXHA29AmDt6y96AnB3t.KYHag8HRDlnO3X9zmZ(str2);
        }
        Notification notificationS3fjYDxWOUexjjVgyA = husniw3snxdgzpagjmXHA29AmDt6y96AnB3t.s3fjYDxWOUexjjVgyA();
        if (i == 1 || i == 2 || i == 3) {
            Acstmh57AKoSEkEFNJ.f5796s3fjYDxWOUexjjVgyA.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationS3fjYDxWOUexjjVgyA);
    }

    public PendingIntent Z9WdNiOsPR0y54zHW4(Context context, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ() ? leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm() : s3fjYDxWOUexjjVgyA(context, leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(), 0);
    }

    public final Dialog aPyGSIylzVNKPT1Bls(Context context, int i, ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(VItLRw50eXTZeEfGl0.zZKhbgvUfsK4AEX3r0(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strHJFh0TGMpafqLE9haL = VItLRw50eXTZeEfGl0.HJFh0TGMpafqLE9haL(context, i);
        if (strHJFh0TGMpafqLE9haL != null) {
            builder.setPositiveButton(strHJFh0TGMpafqLE9haL, ao3wqkm5cxfuvc0q47);
        }
        String strTCyPEKSzIyweCN5yp1 = VItLRw50eXTZeEfGl0.TCyPEKSzIyweCN5yp1(context, i);
        if (strTCyPEKSzIyweCN5yp1 != null) {
            builder.setTitle(strTCyPEKSzIyweCN5yp1);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public void hoXrIDAFrSwfShk8da(Context context, int i) {
        Y43RdunnpKgpbny0lE(context, i, null, HJFh0TGMpafqLE9haL(context, i, 0, "n"));
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED
    public Intent lEeR5KfoEr4xU5yHH7(Context context, int i, String str) {
        return super.lEeR5KfoEr4xU5yHH7(context, i, str);
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED
    public final boolean pbVGzGjWvY2LDXC8vo(int i) {
        return super.pbVGzGjWvY2LDXC8vo(i);
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED
    public PendingIntent s3fjYDxWOUexjjVgyA(Context context, int i, int i2) {
        return super.s3fjYDxWOUexjjVgyA(context, i, i2);
    }

    public final void sTkWmhpZ5b1ArQIw4K(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final boolean xHA29AmDt6y96AnB3t(Context context, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        PendingIntent pendingIntentZ9WdNiOsPR0y54zHW4;
        if (i8aHOwH04efS6lZ3Oa.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(context) || (pendingIntentZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(context, leer5kfoer4xu5yhh7)) == null) {
            return false;
        }
        Y43RdunnpKgpbny0lE(context, leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(), null, uAIIhSQWhOmxUb3Bqo.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(context, 0, GoogleApiActivity.lEeR5KfoEr4xU5yHH7(context, pendingIntentZ9WdNiOsPR0y54zHW4, i, true), uAIIhSQWhOmxUb3Bqo.husNiw3snxdgZPAGJm.f7185lEeR5KfoEr4xU5yHH7 | 134217728));
        return true;
    }

    @Override // f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED
    public final String zZKhbgvUfsK4AEX3r0(int i) {
        return super.zZKhbgvUfsK4AEX3r0(i);
    }

    public final XzJ1BS7H9Ilbkv4eVM zaq8hOURtfwbcX17cG(Context context, jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM = new XzJ1BS7H9Ilbkv4eVM(jctueu2yi1pocxwcjm);
        context.registerReceiver(xzJ1BS7H9Ilbkv4eVM, intentFilter);
        xzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7(context);
        if (IPyIQcaNa8aB7drBED(context, "com.google.android.gms")) {
            return xzJ1BS7H9Ilbkv4eVM;
        }
        jctueu2yi1pocxwcjm.lEeR5KfoEr4xU5yHH7();
        xzJ1BS7H9Ilbkv4eVM.s3fjYDxWOUexjjVgyA();
        return null;
    }
}
