package hgxXdWVkE1CPHCTwpz;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class Acstmh57AKoSEkEFNJ {
    public static Typeface lEeR5KfoEr4xU5yHH7(Context context, Typeface typeface) {
        return s3fjYDxWOUexjjVgyA(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface s3fjYDxWOUexjjVgyA(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
