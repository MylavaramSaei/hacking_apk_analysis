package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class zaq8hOURtfwbcX17cG extends Acstmh57AKoSEkEFNJ {

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static Paint f3393TCyPEKSzIyweCN5yp1;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public TextPaint f3394KYHag8HRDlnO3X9zmZ;

    public zaq8hOURtfwbcX17cG(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        super(oANkd3mP6AYvwbNLJM);
    }

    public static Paint husNiw3snxdgZPAGJm() {
        if (f3393TCyPEKSzIyweCN5yp1 == null) {
            TextPaint textPaint = new TextPaint();
            f3393TCyPEKSzIyweCN5yp1 = textPaint;
            textPaint.setColor(KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().zZKhbgvUfsK4AEX3r0());
            f3393TCyPEKSzIyweCN5yp1.setStyle(Paint.Style.FILL);
        }
        return f3393TCyPEKSzIyweCN5yp1;
    }

    public final TextPaint HJFh0TGMpafqLE9haL(CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f3394KYHag8HRDlnO3X9zmZ;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f3394KYHag8HRDlnO3X9zmZ = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaintHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(charSequence, i, i2, paint2);
        if (textPaintHJFh0TGMpafqLE9haL != null && textPaintHJFh0TGMpafqLE9haL.bgColor != 0) {
            zZKhbgvUfsK4AEX3r0(canvas, textPaintHJFh0TGMpafqLE9haL, f, f + s3fjYDxWOUexjjVgyA(), i3, i5);
        }
        if (KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().Acstmh57AKoSEkEFNJ()) {
            canvas.drawRect(f, i3, f + s3fjYDxWOUexjjVgyA(), i5, husNiw3snxdgZPAGJm());
        }
        OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJMLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7();
        float f2 = i4;
        if (textPaintHJFh0TGMpafqLE9haL != null) {
            paint2 = textPaintHJFh0TGMpafqLE9haL;
        }
        oANkd3mP6AYvwbNLJMLEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(canvas, f, f2, paint2);
    }

    public void zZKhbgvUfsK4AEX3r0(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
