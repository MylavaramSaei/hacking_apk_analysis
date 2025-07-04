package W3RZ2dTDKrKpS5Mxdk;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public final class sTkWmhpZ5b1ArQIw4K {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final DisplayCutout f1909lEeR5KfoEr4xU5yHH7;

    public static class lEeR5KfoEr4xU5yHH7 {
        public static int HJFh0TGMpafqLE9haL(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int KYHag8HRDlnO3X9zmZ(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        public static int husNiw3snxdgZPAGJm(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static DisplayCutout lEeR5KfoEr4xU5yHH7(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> s3fjYDxWOUexjjVgyA(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int zZKhbgvUfsK4AEX3r0(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }
    }

    public sTkWmhpZ5b1ArQIw4K(DisplayCutout displayCutout) {
        this.f1909lEeR5KfoEr4xU5yHH7 = displayCutout;
    }

    public static sTkWmhpZ5b1ArQIw4K husNiw3snxdgZPAGJm(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new sTkWmhpZ5b1ArQIw4K(displayCutout);
    }

    public int HJFh0TGMpafqLE9haL() {
        if (Build.VERSION.SDK_INT >= 28) {
            return lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(this.f1909lEeR5KfoEr4xU5yHH7);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sTkWmhpZ5b1ArQIw4K.class != obj.getClass()) {
            return false;
        }
        return tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f1909lEeR5KfoEr4xU5yHH7, ((sTkWmhpZ5b1ArQIw4K) obj).f1909lEeR5KfoEr4xU5yHH7);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f1909lEeR5KfoEr4xU5yHH7;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public int lEeR5KfoEr4xU5yHH7() {
        if (Build.VERSION.SDK_INT >= 28) {
            return lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this.f1909lEeR5KfoEr4xU5yHH7);
        }
        return 0;
    }

    public int s3fjYDxWOUexjjVgyA() {
        if (Build.VERSION.SDK_INT >= 28) {
            return lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f1909lEeR5KfoEr4xU5yHH7);
        }
        return 0;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1909lEeR5KfoEr4xU5yHH7 + "}";
    }

    public int zZKhbgvUfsK4AEX3r0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(this.f1909lEeR5KfoEr4xU5yHH7);
        }
        return 0;
    }
}
