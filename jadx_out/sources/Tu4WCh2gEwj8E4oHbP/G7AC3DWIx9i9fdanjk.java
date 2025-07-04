package Tu4WCh2gEwj8E4oHbP;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
public class G7AC3DWIx9i9fdanjk implements xHA29AmDt6y96AnB3t {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ViewGroupOverlay f1637lEeR5KfoEr4xU5yHH7;

    public G7AC3DWIx9i9fdanjk(ViewGroup viewGroup) {
        this.f1637lEeR5KfoEr4xU5yHH7 = viewGroup.getOverlay();
    }

    @Override // Tu4WCh2gEwj8E4oHbP.xHA29AmDt6y96AnB3t
    public void HJFh0TGMpafqLE9haL(View view) {
        this.f1637lEeR5KfoEr4xU5yHH7.remove(view);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.xHA29AmDt6y96AnB3t
    public void lEeR5KfoEr4xU5yHH7(View view) {
        this.f1637lEeR5KfoEr4xU5yHH7.add(view);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.WWC27LAMFqFFBzfbNw
    public void s3fjYDxWOUexjjVgyA(Drawable drawable) {
        this.f1637lEeR5KfoEr4xU5yHH7.add(drawable);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.WWC27LAMFqFFBzfbNw
    public void zZKhbgvUfsK4AEX3r0(Drawable drawable) {
        this.f1637lEeR5KfoEr4xU5yHH7.remove(drawable);
    }
}
