package lBAL39rPf03qYLFNNP;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Paint f6209HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final Paint f6210IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f6211KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Path f6212TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f6213husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Paint f6214lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Paint f6215s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f6216zZKhbgvUfsK4AEX3r0;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final int[] f6208pbVGzGjWvY2LDXC8vo = new int[3];

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final float[] f6205Acstmh57AKoSEkEFNJ = {0.0f, 0.5f, 1.0f};

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final int[] f6206Z9WdNiOsPR0y54zHW4 = new int[4];

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final float[] f6207e54J8UWNHWALQNixXM = {0.0f, 0.0f, 0.5f, 1.0f};

    public lEeR5KfoEr4xU5yHH7() {
        this(-16777216);
    }

    public Paint HJFh0TGMpafqLE9haL() {
        return this.f6214lEeR5KfoEr4xU5yHH7;
    }

    public void lEeR5KfoEr4xU5yHH7(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f6212TCyPEKSzIyweCN5yp1;
        if (z) {
            int[] iArr = f6206Z9WdNiOsPR0y54zHW4;
            iArr[0] = 0;
            iArr[1] = this.f6211KYHag8HRDlnO3X9zmZ;
            iArr[2] = this.f6213husNiw3snxdgZPAGJm;
            iArr[3] = this.f6216zZKhbgvUfsK4AEX3r0;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f6206Z9WdNiOsPR0y54zHW4;
            iArr2[0] = 0;
            iArr2[1] = this.f6216zZKhbgvUfsK4AEX3r0;
            iArr2[2] = this.f6213husNiw3snxdgZPAGJm;
            iArr2[3] = this.f6211KYHag8HRDlnO3X9zmZ;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = f6207e54J8UWNHWALQNixXM;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f6215s3fjYDxWOUexjjVgyA.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f6206Z9WdNiOsPR0y54zHW4, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f6210IPyIQcaNa8aB7drBED);
        }
        canvas.drawArc(rectF, f, f2, true, this.f6215s3fjYDxWOUexjjVgyA);
        canvas.restore();
    }

    public void s3fjYDxWOUexjjVgyA(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f6208pbVGzGjWvY2LDXC8vo;
        iArr[0] = this.f6211KYHag8HRDlnO3X9zmZ;
        iArr[1] = this.f6213husNiw3snxdgZPAGJm;
        iArr[2] = this.f6216zZKhbgvUfsK4AEX3r0;
        Paint paint = this.f6209HJFh0TGMpafqLE9haL;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f6205Acstmh57AKoSEkEFNJ, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f6209HJFh0TGMpafqLE9haL);
        canvas.restore();
    }

    public void zZKhbgvUfsK4AEX3r0(int i) {
        this.f6216zZKhbgvUfsK4AEX3r0 = VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i, 68);
        this.f6213husNiw3snxdgZPAGJm = VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i, 20);
        this.f6211KYHag8HRDlnO3X9zmZ = VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i, 0);
        this.f6214lEeR5KfoEr4xU5yHH7.setColor(this.f6216zZKhbgvUfsK4AEX3r0);
    }

    public lEeR5KfoEr4xU5yHH7(int i) {
        this.f6212TCyPEKSzIyweCN5yp1 = new Path();
        Paint paint = new Paint();
        this.f6210IPyIQcaNa8aB7drBED = paint;
        this.f6214lEeR5KfoEr4xU5yHH7 = new Paint();
        zZKhbgvUfsK4AEX3r0(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f6215s3fjYDxWOUexjjVgyA = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f6209HJFh0TGMpafqLE9haL = new Paint(paint2);
    }
}
