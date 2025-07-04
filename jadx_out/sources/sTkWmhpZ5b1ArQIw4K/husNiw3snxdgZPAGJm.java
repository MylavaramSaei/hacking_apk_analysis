package sTkWmhpZ5b1ArQIw4K;

import OANkd3mP6AYvwbNLJM.e54J8UWNHWALQNixXM;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm extends androidx.constraintlayout.widget.HJFh0TGMpafqLE9haL {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f6649Acstmh57AKoSEkEFNJ;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f6650pbVGzGjWvY2LDXC8vo;

    public husNiw3snxdgZPAGJm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.HJFh0TGMpafqLE9haL
    public void TCyPEKSzIyweCN5yp1(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.TCyPEKSzIyweCN5yp1(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zZKhbgvUfsK4AEX3r0.f6697LFGi8lLul9XOP250o9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == zZKhbgvUfsK4AEX3r0.f6728WaWv1mJ1ya3uoEaKqz) {
                    this.f6650pbVGzGjWvY2LDXC8vo = true;
                } else if (index == zZKhbgvUfsK4AEX3r0.f6713R6kEk3zZuOluTikhN3) {
                    this.f6649Acstmh57AKoSEkEFNJ = true;
                }
            }
        }
    }

    public abstract void hoXrIDAFrSwfShk8da(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, int i, int i2);

    @Override // androidx.constraintlayout.widget.HJFh0TGMpafqLE9haL, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f6650pbVGzGjWvY2LDXC8vo || this.f6649Acstmh57AKoSEkEFNJ) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f3075s3fjYDxWOUexjjVgyA; i++) {
                View viewIPyIQcaNa8aB7drBED = constraintLayout.IPyIQcaNa8aB7drBED(this.f3074lEeR5KfoEr4xU5yHH7[i]);
                if (viewIPyIQcaNa8aB7drBED != null) {
                    if (this.f6650pbVGzGjWvY2LDXC8vo) {
                        viewIPyIQcaNa8aB7drBED.setVisibility(visibility);
                    }
                    if (this.f6649Acstmh57AKoSEkEFNJ && elevation > 0.0f) {
                        viewIPyIQcaNa8aB7drBED.setTranslationZ(viewIPyIQcaNa8aB7drBED.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        HJFh0TGMpafqLE9haL();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        HJFh0TGMpafqLE9haL();
    }
}
