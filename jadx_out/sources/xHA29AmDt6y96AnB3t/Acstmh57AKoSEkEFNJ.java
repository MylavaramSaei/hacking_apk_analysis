package xHA29AmDt6y96AnB3t;

import android.app.Notification;
import android.app.Service;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class Acstmh57AKoSEkEFNJ {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(Service service, int i, Notification notification, int i2) {
            if (i2 != 0 && i2 != -1) {
                i2 &= 255;
            }
            service.startForeground(i, notification, i2);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static void lEeR5KfoEr4xU5yHH7(Service service, int i, Notification notification, int i2) {
            if (i2 != 0 && i2 != -1) {
                i2 &= 1073745919;
            }
            service.startForeground(i, notification, i2);
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(Service service, int i, Notification notification, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(service, i, notification, i2);
        } else if (i3 >= 29) {
            lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }
}
