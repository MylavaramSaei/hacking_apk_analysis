package owCQzRKpGarpL4247z;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import android.os.IBinder;
import java.lang.reflect.Field;
import owCQzRKpGarpL4247z.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends lEeR5KfoEr4xU5yHH7.AbstractBinderC0102lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f6557lEeR5KfoEr4xU5yHH7;

    public s3fjYDxWOUexjjVgyA(Object obj) {
        this.f6557lEeR5KfoEr4xU5yHH7 = obj;
    }

    public static lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(Object obj) {
        return new s3fjYDxWOUexjjVgyA(obj);
    }

    public static Object s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) throws SecurityException {
        if (leer5kfoer4xu5yhh7 instanceof s3fjYDxWOUexjjVgyA) {
            return ((s3fjYDxWOUexjjVgyA) leer5kfoer4xu5yhh7).f6557lEeR5KfoEr4xU5yHH7;
        }
        IBinder iBinderAsBinder = leer5kfoer4xu5yhh7.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
