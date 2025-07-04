package SF66oTSCsXABfwyWiU;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class LU0fFDMACqnfIfA1AZ {
    public static boolean HJFh0TGMpafqLE9haL(Context context) {
        return s3fjYDxWOUexjjVgyA(context).getBoolean("proxy_notification_initialized", false);
    }

    public static void IPyIQcaNa8aB7drBED(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = s3fjYDxWOUexjjVgyA(context).edit();
        editorEdit.putBoolean("proxy_retention", z);
        editorEdit.apply();
    }

    public static void KYHag8HRDlnO3X9zmZ(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = s3fjYDxWOUexjjVgyA(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z);
        editorEdit.apply();
    }

    public static void TCyPEKSzIyweCN5yp1(final Context context, XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM, final boolean z) {
        if (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.pbVGzGjWvY2LDXC8vo() && !zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA(context), z)) {
            xzJ1BS7H9Ilbkv4eVM.Z9WdNiOsPR0y54zHW4(z).TCyPEKSzIyweCN5yp1(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), new JXsqbvi9UKxeF3HXpU.KYHag8HRDlnO3X9zmZ() { // from class: SF66oTSCsXABfwyWiU.XdzLv4NdAtTYoEzVzB
                @Override // JXsqbvi9UKxeF3HXpU.KYHag8HRDlnO3X9zmZ
                public final void zZKhbgvUfsK4AEX3r0(Object obj) {
                    LU0fFDMACqnfIfA1AZ.IPyIQcaNa8aB7drBED(context, z);
                }
            });
        }
    }

    public static SharedPreferences s3fjYDxWOUexjjVgyA(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean zZKhbgvUfsK4AEX3r0(SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }
}
