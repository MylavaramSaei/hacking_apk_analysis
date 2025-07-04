package OqIo5QF00RDxUQb4qq;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends ClickableSpan {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f1250HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f1251lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final A49QRPHynYLCBN0SqP f1252s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(int i, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP, int i2) {
        this.f1251lEeR5KfoEr4xU5yHH7 = i;
        this.f1252s3fjYDxWOUexjjVgyA = a49QRPHynYLCBN0SqP;
        this.f1250HJFh0TGMpafqLE9haL = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1251lEeR5KfoEr4xU5yHH7);
        this.f1252s3fjYDxWOUexjjVgyA.CSih7GetOUab1dYQjM(this.f1250HJFh0TGMpafqLE9haL, bundle);
    }
}
