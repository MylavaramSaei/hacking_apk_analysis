package W3RZ2dTDKrKpS5Mxdk;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class KqgKJKIWne3kz1AdHk {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static Map f1828lEeR5KfoEr4xU5yHH7 = Collections.synchronizedMap(new WeakHashMap());

    public static class lEeR5KfoEr4xU5yHH7 {
        public static boolean HJFh0TGMpafqLE9haL(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }

        public static float lEeR5KfoEr4xU5yHH7(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static float s3fjYDxWOUexjjVgyA(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }
    }

    public static void HJFh0TGMpafqLE9haL(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(velocityTracker);
        if (pPkm9uUfOJHHYveeLTHusNiw3snxdgZPAGJm != null) {
            pPkm9uUfOJHHYveeLTHusNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(i, f);
        }
    }

    public static PPkm9uUfOJHHYveeLT husNiw3snxdgZPAGJm(VelocityTracker velocityTracker) {
        return (PPkm9uUfOJHHYveeLT) f1828lEeR5KfoEr4xU5yHH7.get(velocityTracker);
    }

    public static void lEeR5KfoEr4xU5yHH7(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f1828lEeR5KfoEr4xU5yHH7.containsKey(velocityTracker)) {
                f1828lEeR5KfoEr4xU5yHH7.put(velocityTracker, new PPkm9uUfOJHHYveeLT());
            }
            ((PPkm9uUfOJHHYveeLT) f1828lEeR5KfoEr4xU5yHH7.get(velocityTracker)).lEeR5KfoEr4xU5yHH7(motionEvent);
        }
    }

    public static void s3fjYDxWOUexjjVgyA(VelocityTracker velocityTracker, int i) {
        HJFh0TGMpafqLE9haL(velocityTracker, i, Float.MAX_VALUE);
    }

    public static float zZKhbgvUfsK4AEX3r0(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(velocityTracker);
        if (pPkm9uUfOJHHYveeLTHusNiw3snxdgZPAGJm != null) {
            return pPkm9uUfOJHHYveeLTHusNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(i);
        }
        return 0.0f;
    }
}
