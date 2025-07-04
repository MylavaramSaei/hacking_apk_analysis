package IPyIQcaNa8aB7drBED;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA extends Drawable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ActionBarContainer f709lEeR5KfoEr4xU5yHH7;

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public s3fjYDxWOUexjjVgyA(ActionBarContainer actionBarContainer) {
        this.f709lEeR5KfoEr4xU5yHH7 = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f709lEeR5KfoEr4xU5yHH7;
        if (actionBarContainer.f2758IPyIQcaNa8aB7drBED) {
            Drawable drawable = actionBarContainer.f2760TCyPEKSzIyweCN5yp1;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2761husNiw3snxdgZPAGJm;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f709lEeR5KfoEr4xU5yHH7;
        Drawable drawable3 = actionBarContainer2.f2759KYHag8HRDlnO3X9zmZ;
        if (drawable3 == null || !actionBarContainer2.f2763pbVGzGjWvY2LDXC8vo) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f709lEeR5KfoEr4xU5yHH7;
        if (!actionBarContainer.f2758IPyIQcaNa8aB7drBED) {
            drawable = actionBarContainer.f2761husNiw3snxdgZPAGJm;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f2760TCyPEKSzIyweCN5yp1 == null) {
            return;
        } else {
            drawable = actionBarContainer.f2761husNiw3snxdgZPAGJm;
        }
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
