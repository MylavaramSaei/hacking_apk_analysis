package OqIo5QF00RDxUQb4qq;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    public interface lEeR5KfoEr4xU5yHH7 {
        void onTouchExplorationStateChanged(boolean z);
    }

    public static final class s3fjYDxWOUexjjVgyA implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final lEeR5KfoEr4xU5yHH7 f1247lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f1247lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s3fjYDxWOUexjjVgyA) {
                return this.f1247lEeR5KfoEr4xU5yHH7.equals(((s3fjYDxWOUexjjVgyA) obj).f1247lEeR5KfoEr4xU5yHH7);
            }
            return false;
        }

        public int hashCode() {
            return this.f1247lEeR5KfoEr4xU5yHH7.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f1247lEeR5KfoEr4xU5yHH7.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean lEeR5KfoEr4xU5yHH7(AccessibilityManager accessibilityManager, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7));
    }

    public static boolean s3fjYDxWOUexjjVgyA(AccessibilityManager accessibilityManager, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7));
    }
}
