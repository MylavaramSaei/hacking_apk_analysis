package PPkm9uUfOJHHYveeLT;

import XzJ1BS7H9Ilbkv4eVM.e54J8UWNHWALQNixXM;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class TCyPEKSzIyweCN5yp1 {

    public static class husNiw3snxdgZPAGJm implements ActionMode.Callback {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public Class f1275HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f1276KYHag8HRDlnO3X9zmZ = false;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f1277husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final ActionMode.Callback f1278lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final TextView f1279s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public Method f1280zZKhbgvUfsK4AEX3r0;

        public husNiw3snxdgZPAGJm(ActionMode.Callback callback, TextView textView) {
            this.f1278lEeR5KfoEr4xU5yHH7 = callback;
            this.f1279s3fjYDxWOUexjjVgyA = textView;
        }

        public final List HJFh0TGMpafqLE9haL(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(lEeR5KfoEr4xU5yHH7(), 0)) {
                if (KYHag8HRDlnO3X9zmZ(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        public final boolean KYHag8HRDlnO3X9zmZ(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void TCyPEKSzIyweCN5yp1(Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Context context = this.f1279s3fjYDxWOUexjjVgyA.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f1276KYHag8HRDlnO3X9zmZ) {
                this.f1276KYHag8HRDlnO3X9zmZ = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1275HJFh0TGMpafqLE9haL = cls;
                    this.f1280zZKhbgvUfsK4AEX3r0 = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f1277husNiw3snxdgZPAGJm = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1275HJFh0TGMpafqLE9haL = null;
                    this.f1280zZKhbgvUfsK4AEX3r0 = null;
                    this.f1277husNiw3snxdgZPAGJm = false;
                }
            }
            try {
                Method declaredMethod = (this.f1277husNiw3snxdgZPAGJm && this.f1275HJFh0TGMpafqLE9haL.isInstance(menu)) ? this.f1280zZKhbgvUfsK4AEX3r0 : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(context, packageManager);
                for (int i = 0; i < listHJFh0TGMpafqLE9haL.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listHJFh0TGMpafqLE9haL.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(s3fjYDxWOUexjjVgyA(resolveInfo, this.f1279s3fjYDxWOUexjjVgyA)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public final boolean husNiw3snxdgZPAGJm(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final Intent lEeR5KfoEr4xU5yHH7() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1278lEeR5KfoEr4xU5yHH7.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1278lEeR5KfoEr4xU5yHH7.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1278lEeR5KfoEr4xU5yHH7.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            TCyPEKSzIyweCN5yp1(menu);
            return this.f1278lEeR5KfoEr4xU5yHH7.onPrepareActionMode(actionMode, menu);
        }

        public final Intent s3fjYDxWOUexjjVgyA(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = lEeR5KfoEr4xU5yHH7().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !husNiw3snxdgZPAGJm(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public ActionMode.Callback zZKhbgvUfsK4AEX3r0() {
            return this.f1278lEeR5KfoEr4xU5yHH7;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static PorterDuff.Mode HJFh0TGMpafqLE9haL(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static void IPyIQcaNa8aB7drBED(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }

        public static void KYHag8HRDlnO3X9zmZ(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void TCyPEKSzIyweCN5yp1(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void husNiw3snxdgZPAGJm(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        public static int lEeR5KfoEr4xU5yHH7(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList s3fjYDxWOUexjjVgyA(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static int zZKhbgvUfsK4AEX3r0(TextView textView) {
            return textView.getHyphenationFrequency();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static DecimalFormatSymbols lEeR5KfoEr4xU5yHH7(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {
        public static void lEeR5KfoEr4xU5yHH7(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    public static void Acstmh57AKoSEkEFNJ(TextView textView, int i) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(i);
        if (Build.VERSION.SDK_INT >= 28) {
            HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static int HJFh0TGMpafqLE9haL(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void IPyIQcaNa8aB7drBED(TextView textView, PorterDuff.Mode mode) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(textView);
        lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(textView, mode);
    }

    public static e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7 KYHag8HRDlnO3X9zmZ(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(textView));
        }
        e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.C0028lEeR5KfoEr4xU5yHH7 c0028lEeR5KfoEr4xU5yHH7 = new e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7.C0028lEeR5KfoEr4xU5yHH7(new TextPaint(textView.getPaint()));
        c0028lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(textView));
        c0028lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(textView));
        c0028lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm(textView));
        return c0028lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
    }

    public static void OANkd3mP6AYvwbNLJM(TextView textView, e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        textView.setTextDirection(zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0()));
        textView.getPaint().set(leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm());
        lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(textView, leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA());
        lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(textView, leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL());
    }

    public static void T9PhQIpGRhE4yZDm1C(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(textView, i, f);
        } else {
            e54J8UWNHWALQNixXM(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void TCyPEKSzIyweCN5yp1(TextView textView, ColorStateList colorStateList) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(textView);
        lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(textView, colorStateList);
    }

    public static void Z9WdNiOsPR0y54zHW4(TextView textView, int i) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void aPyGSIylzVNKPT1Bls(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static void e54J8UWNHWALQNixXM(TextView textView, int i) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void hoXrIDAFrSwfShk8da(TextView textView, e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        KYHag8HRDlnO3X9zmZ(textView);
        throw null;
    }

    public static TextDirectionHeuristic husNiw3snxdgZPAGJm(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    public static Drawable[] lEeR5KfoEr4xU5yHH7(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void pbVGzGjWvY2LDXC8vo(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static int s3fjYDxWOUexjjVgyA(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static ActionMode.Callback sTkWmhpZ5b1ArQIw4K(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof husNiw3snxdgZPAGJm) || callback == null) ? callback : new husNiw3snxdgZPAGJm(callback, textView);
    }

    public static int zZKhbgvUfsK4AEX3r0(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static ActionMode.Callback zaq8hOURtfwbcX17cG(ActionMode.Callback callback) {
        return (!(callback instanceof husNiw3snxdgZPAGJm) || Build.VERSION.SDK_INT < 26) ? callback : ((husNiw3snxdgZPAGJm) callback).zZKhbgvUfsK4AEX3r0();
    }

    public static class HJFh0TGMpafqLE9haL {
        public static PrecomputedText.Params HJFh0TGMpafqLE9haL(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static String[] s3fjYDxWOUexjjVgyA(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static void zZKhbgvUfsK4AEX3r0(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }

        public static CharSequence lEeR5KfoEr4xU5yHH7(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
