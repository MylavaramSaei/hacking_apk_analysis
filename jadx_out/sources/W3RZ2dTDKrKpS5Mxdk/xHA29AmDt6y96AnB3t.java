package W3RZ2dTDKrKpS5Mxdk;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class xHA29AmDt6y96AnB3t {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static MenuItem Acstmh57AKoSEkEFNJ(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static ColorStateList HJFh0TGMpafqLE9haL(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static MenuItem IPyIQcaNa8aB7drBED(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static CharSequence KYHag8HRDlnO3X9zmZ(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem T9PhQIpGRhE4yZDm1C(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        public static MenuItem TCyPEKSzIyweCN5yp1(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        public static MenuItem Z9WdNiOsPR0y54zHW4(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        public static MenuItem e54J8UWNHWALQNixXM(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        public static int husNiw3snxdgZPAGJm(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static int lEeR5KfoEr4xU5yHH7(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static MenuItem pbVGzGjWvY2LDXC8vo(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static CharSequence s3fjYDxWOUexjjVgyA(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static PorterDuff.Mode zZKhbgvUfsK4AEX3r0(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }
    }

    public static void HJFh0TGMpafqLE9haL(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) {
            ((THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(menuItem, colorStateList);
        }
    }

    public static void KYHag8HRDlnO3X9zmZ(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) {
            ((THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(menuItem, charSequence);
        }
    }

    public static void husNiw3snxdgZPAGJm(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) {
            ((THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(menuItem, c, i);
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) {
            ((THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(menuItem, c, i);
        }
    }

    public static void s3fjYDxWOUexjjVgyA(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) {
            ((THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(menuItem, charSequence);
        }
    }

    public static void zZKhbgvUfsK4AEX3r0(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) {
            ((THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(menuItem, mode);
        }
    }
}
