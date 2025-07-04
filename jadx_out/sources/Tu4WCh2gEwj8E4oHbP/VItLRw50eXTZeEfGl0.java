package Tu4WCh2gEwj8E4oHbP;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
public class VItLRw50eXTZeEfGl0 implements WWC27LAMFqFFBzfbNw {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ViewOverlay f1693lEeR5KfoEr4xU5yHH7;

    public VItLRw50eXTZeEfGl0(View view) {
        this.f1693lEeR5KfoEr4xU5yHH7 = view.getOverlay();
    }

    @Override // Tu4WCh2gEwj8E4oHbP.WWC27LAMFqFFBzfbNw
    public void s3fjYDxWOUexjjVgyA(Drawable drawable) {
        this.f1693lEeR5KfoEr4xU5yHH7.add(drawable);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.WWC27LAMFqFFBzfbNw
    public void zZKhbgvUfsK4AEX3r0(Drawable drawable) {
        this.f1693lEeR5KfoEr4xU5yHH7.remove(drawable);
    }
}
