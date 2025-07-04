package KYHag8HRDlnO3X9zmZ;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA extends ContextWrapper {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static Configuration f880KYHag8HRDlnO3X9zmZ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public LayoutInflater f881HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Resources f882husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f883lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Resources.Theme f884s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Configuration f885zZKhbgvUfsK4AEX3r0;

    public s3fjYDxWOUexjjVgyA(Context context, int i) {
        super(context);
        this.f883lEeR5KfoEr4xU5yHH7 = i;
    }

    public static boolean zZKhbgvUfsK4AEX3r0(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f880KYHag8HRDlnO3X9zmZ == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f880KYHag8HRDlnO3X9zmZ = configuration2;
        }
        return configuration.equals(f880KYHag8HRDlnO3X9zmZ);
    }

    public final void HJFh0TGMpafqLE9haL() {
        boolean z = this.f884s3fjYDxWOUexjjVgyA == null;
        if (z) {
            this.f884s3fjYDxWOUexjjVgyA = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f884s3fjYDxWOUexjjVgyA.setTo(theme);
            }
        }
        husNiw3snxdgZPAGJm(this.f884s3fjYDxWOUexjjVgyA, this.f883lEeR5KfoEr4xU5yHH7, z);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return lEeR5KfoEr4xU5yHH7();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f881HJFh0TGMpafqLE9haL == null) {
            this.f881HJFh0TGMpafqLE9haL = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f881HJFh0TGMpafqLE9haL;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f884s3fjYDxWOUexjjVgyA;
        if (theme != null) {
            return theme;
        }
        if (this.f883lEeR5KfoEr4xU5yHH7 == 0) {
            this.f883lEeR5KfoEr4xU5yHH7 = IPyIQcaNa8aB7drBED.f6227s3fjYDxWOUexjjVgyA;
        }
        HJFh0TGMpafqLE9haL();
        return this.f884s3fjYDxWOUexjjVgyA;
    }

    public void husNiw3snxdgZPAGJm(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public final Resources lEeR5KfoEr4xU5yHH7() {
        if (this.f882husNiw3snxdgZPAGJm == null) {
            Configuration configuration = this.f885zZKhbgvUfsK4AEX3r0;
            this.f882husNiw3snxdgZPAGJm = (configuration == null || (Build.VERSION.SDK_INT >= 26 && zZKhbgvUfsK4AEX3r0(configuration))) ? super.getResources() : createConfigurationContext(this.f885zZKhbgvUfsK4AEX3r0).getResources();
        }
        return this.f882husNiw3snxdgZPAGJm;
    }

    public int s3fjYDxWOUexjjVgyA() {
        return this.f883lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f883lEeR5KfoEr4xU5yHH7 != i) {
            this.f883lEeR5KfoEr4xU5yHH7 = i;
            HJFh0TGMpafqLE9haL();
        }
    }
}
