package Tu4WCh2gEwj8E4oHbP;

import android.view.View;

/* loaded from: classes.dex */
public abstract class jCtUeU2YI1poCxWcjm extends PPkm9uUfOJHHYveeLT {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static boolean f1782HJFh0TGMpafqLE9haL = true;

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public void husNiw3snxdgZPAGJm(View view, float f) {
        if (f1782HJFh0TGMpafqLE9haL) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f1782HJFh0TGMpafqLE9haL = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public float s3fjYDxWOUexjjVgyA(View view) {
        if (f1782HJFh0TGMpafqLE9haL) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1782HJFh0TGMpafqLE9haL = false;
            }
        }
        return view.getAlpha();
    }

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public void HJFh0TGMpafqLE9haL(View view) {
    }

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public void lEeR5KfoEr4xU5yHH7(View view) {
    }
}
