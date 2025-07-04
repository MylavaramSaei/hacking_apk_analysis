package PPkm9uUfOJHHYveeLT;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class KYHag8HRDlnO3X9zmZ {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void HJFh0TGMpafqLE9haL(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public static boolean lEeR5KfoEr4xU5yHH7(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int s3fjYDxWOUexjjVgyA(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void zZKhbgvUfsK4AEX3r0(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static void HJFh0TGMpafqLE9haL(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static void lEeR5KfoEr4xU5yHH7(PopupWindow popupWindow, boolean z) {
        lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(popupWindow, z);
    }

    public static void s3fjYDxWOUexjjVgyA(PopupWindow popupWindow, int i) {
        lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(popupWindow, i);
    }
}
