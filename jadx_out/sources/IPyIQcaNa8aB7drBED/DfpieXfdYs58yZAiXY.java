package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DfpieXfdYs58yZAiXY extends ContextWrapper {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object f473HJFh0TGMpafqLE9haL = new Object();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static ArrayList f474zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Resources f475lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Resources.Theme f476s3fjYDxWOUexjjVgyA;

    public DfpieXfdYs58yZAiXY(Context context) {
        super(context);
        if (!udcVtCzLTM1Loe9KrX.HJFh0TGMpafqLE9haL()) {
            this.f475lEeR5KfoEr4xU5yHH7 = new KqgKJKIWne3kz1AdHk(this, context.getResources());
            this.f476s3fjYDxWOUexjjVgyA = null;
            return;
        }
        udcVtCzLTM1Loe9KrX udcvtczltm1loe9krx = new udcVtCzLTM1Loe9KrX(this, context.getResources());
        this.f475lEeR5KfoEr4xU5yHH7 = udcvtczltm1loe9krx;
        Resources.Theme themeNewTheme = udcvtczltm1loe9krx.newTheme();
        this.f476s3fjYDxWOUexjjVgyA = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean lEeR5KfoEr4xU5yHH7(Context context) {
        if ((context instanceof DfpieXfdYs58yZAiXY) || (context.getResources() instanceof KqgKJKIWne3kz1AdHk) || (context.getResources() instanceof udcVtCzLTM1Loe9KrX)) {
            return false;
        }
        return udcVtCzLTM1Loe9KrX.HJFh0TGMpafqLE9haL();
    }

    public static Context s3fjYDxWOUexjjVgyA(Context context) {
        if (!lEeR5KfoEr4xU5yHH7(context)) {
            return context;
        }
        synchronized (f473HJFh0TGMpafqLE9haL) {
            try {
                ArrayList arrayList = f474zZKhbgvUfsK4AEX3r0;
                if (arrayList == null) {
                    f474zZKhbgvUfsK4AEX3r0 = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f474zZKhbgvUfsK4AEX3r0.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f474zZKhbgvUfsK4AEX3r0.remove(size);
                        }
                    }
                    for (int size2 = f474zZKhbgvUfsK4AEX3r0.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f474zZKhbgvUfsK4AEX3r0.get(size2);
                        DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY = weakReference2 != null ? (DfpieXfdYs58yZAiXY) weakReference2.get() : null;
                        if (dfpieXfdYs58yZAiXY != null && dfpieXfdYs58yZAiXY.getBaseContext() == context) {
                            return dfpieXfdYs58yZAiXY;
                        }
                    }
                }
                DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY2 = new DfpieXfdYs58yZAiXY(context);
                f474zZKhbgvUfsK4AEX3r0.add(new WeakReference(dfpieXfdYs58yZAiXY2));
                return dfpieXfdYs58yZAiXY2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f475lEeR5KfoEr4xU5yHH7.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f475lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f476s3fjYDxWOUexjjVgyA;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f476s3fjYDxWOUexjjVgyA;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
