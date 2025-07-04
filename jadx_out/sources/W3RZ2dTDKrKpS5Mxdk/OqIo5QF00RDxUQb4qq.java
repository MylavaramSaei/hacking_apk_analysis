package W3RZ2dTDKrKpS5Mxdk;

import W3RZ2dTDKrKpS5Mxdk.OqIo5QF00RDxUQb4qq;
import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class OqIo5QF00RDxUQb4qq {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f1830lEeR5KfoEr4xU5yHH7;

    public static class HJFh0TGMpafqLE9haL {
        public abstract void lEeR5KfoEr4xU5yHH7();
    }

    public static class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final View f1831lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(View view) {
            this.f1831lEeR5KfoEr4xU5yHH7 = view;
        }

        public static /* synthetic */ void HJFh0TGMpafqLE9haL(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OqIo5QF00RDxUQb4qq.HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7() {
            final View viewFindViewById = this.f1831lEeR5KfoEr4xU5yHH7;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f1831lEeR5KfoEr4xU5yHH7.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: W3RZ2dTDKrKpS5Mxdk.W3RZ2dTDKrKpS5Mxdk
                @Override // java.lang.Runnable
                public final void run() {
                    OqIo5QF00RDxUQb4qq.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(viewFindViewById);
                }
            });
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public WindowInsetsController f1832HJFh0TGMpafqLE9haL;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public View f1833s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(View view) {
            super(view);
            this.f1833s3fjYDxWOUexjjVgyA = view;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OqIo5QF00RDxUQb4qq.lEeR5KfoEr4xU5yHH7, W3RZ2dTDKrKpS5Mxdk.OqIo5QF00RDxUQb4qq.HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7() {
            View view = this.f1833s3fjYDxWOUexjjVgyA;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f1832HJFh0TGMpafqLE9haL;
            if (windowInsetsController == null) {
                View view2 = this.f1833s3fjYDxWOUexjjVgyA;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.lEeR5KfoEr4xU5yHH7();
            }
        }

        public s3fjYDxWOUexjjVgyA(WindowInsetsController windowInsetsController) {
            super(null);
            this.f1832HJFh0TGMpafqLE9haL = windowInsetsController;
        }
    }

    public OqIo5QF00RDxUQb4qq(View view) {
        this.f1830lEeR5KfoEr4xU5yHH7 = Build.VERSION.SDK_INT >= 30 ? new s3fjYDxWOUexjjVgyA(view) : new lEeR5KfoEr4xU5yHH7(view);
    }

    public void lEeR5KfoEr4xU5yHH7() {
        this.f1830lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
    }

    public OqIo5QF00RDxUQb4qq(WindowInsetsController windowInsetsController) {
        this.f1830lEeR5KfoEr4xU5yHH7 = new s3fjYDxWOUexjjVgyA(windowInsetsController);
    }
}
