package xHA29AmDt6y96AnB3t;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class TCyPEKSzIyweCN5yp1 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f7251lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final NotificationManager f7252s3fjYDxWOUexjjVgyA;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object f7248HJFh0TGMpafqLE9haL = new Object();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static Set f7250zZKhbgvUfsK4AEX3r0 = new HashSet();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Object f7249husNiw3snxdgZPAGJm = new Object();

    public static class lEeR5KfoEr4xU5yHH7 {
        public static boolean lEeR5KfoEr4xU5yHH7(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int s3fjYDxWOUexjjVgyA(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public TCyPEKSzIyweCN5yp1(Context context) {
        this.f7251lEeR5KfoEr4xU5yHH7 = context;
        this.f7252s3fjYDxWOUexjjVgyA = (NotificationManager) context.getSystemService("notification");
    }

    public static TCyPEKSzIyweCN5yp1 s3fjYDxWOUexjjVgyA(Context context) {
        return new TCyPEKSzIyweCN5yp1(context);
    }

    public boolean lEeR5KfoEr4xU5yHH7() {
        return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f7252s3fjYDxWOUexjjVgyA);
    }
}
